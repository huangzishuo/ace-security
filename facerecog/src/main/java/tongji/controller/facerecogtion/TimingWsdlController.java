package tongji.controller.facerecogtion;


import java.rmi.RemoteException;
import java.util.List;

import javax.annotation.Resource;
import javax.jms.Destination;

import org.quartz.DisallowConcurrentExecution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import anding.monitor.webservice.InputSnapshot;
import anding.monitor.webservice.OutputSnapshot;
import anding.monitor.webservice.SnapshotClientServiceProxy;
import tongji.domain.facerecogtion.ClassAttendance;
import tongji.service.facerecogtion.ClassAttendanceService;
import tongji.until.ActiveMqSender;
import tongji.until.BaseEnDe;
import tongji.until.DownloadPhoto;

@Controller
@DisallowConcurrentExecution
public class TimingWsdlController{
	
	@Resource
	SnapshotClientServiceProxy snapshotClientServiceProxy;
	
	@Resource
	InputSnapshot inputSnapshot;
	
	@Resource 
	BaseEnDe baseEnDe;
	
	@Resource
	ActiveMqSender activeMqSender;
	
	@Resource(name = "queueDestination")
	Destination destination;
	
	@Resource
	DownloadPhoto downloadPhoto;
	
	@Autowired
	ClassAttendanceService classAttendanceService;
			
	@Scheduled(cron="* */5 7-22 * * *")
	public void timingJob(){
		List<ClassAttendance> classAttendances = classAttendanceService.getClassAttendances();
		for(ClassAttendance classAttendance : classAttendances) {
			long t1 = System.currentTimeMillis();
			//System.out.println(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
			String deviceID = classAttendance.getDeviceId();
			String sourceID = classAttendance.getSourceId();
			System.out.println(sourceID);
			System.out.println(classAttendance.getClassNo());
			String domainID = "55000000000000000050000000000000";
			String type = "1";
			inputSnapshot.setDeviceID(deviceID);
			inputSnapshot.setSourceID(sourceID);
			inputSnapshot.setDomainID(domainID);
			inputSnapshot.setType(type);
			OutputSnapshot outsnapshot;
			String urlName = null;
			try {
				outsnapshot = snapshotClientServiceProxy.insertSnapshot(inputSnapshot);
				String capturePosition = outsnapshot.getCapturePosition();
				urlName = "http://202.120.165.51/snapshot/Img_link/" + capturePosition;
				
			}catch (RemoteException e) {
				e.printStackTrace();
			}
			try {	
				byte[] bytes = downloadPhoto.getPicture(urlName);
				
				String stringPirecture = baseEnDe.casePhoto(classAttendance.getClassNo(), bytes);
				
				activeMqSender.sendMessage(destination, stringPirecture);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			long t2 = System.currentTimeMillis();
			//System.out.println("一次花费时间：" + (t2-t1));
		}
		
	}
		
}
