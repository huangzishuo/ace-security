package anding.monitor.webservice;

import org.springframework.stereotype.Service;

@Service
public class SnapshotClientServiceProxy implements anding.monitor.webservice.SnapshotClientService {
  private String _endpoint = null;
  private anding.monitor.webservice.SnapshotClientService snapshotClientService = null;
  
  public SnapshotClientServiceProxy() {
    _initSnapshotClientServiceProxy();
  }
  
  public SnapshotClientServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSnapshotClientServiceProxy();
  }
  
  private void _initSnapshotClientServiceProxy() {
    try {
      snapshotClientService = (new anding.monitor.webservice.SnapshotServiceImplServiceLocator()).getSnapshotServiceImplPort();
      if (snapshotClientService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)snapshotClientService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)snapshotClientService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (snapshotClientService != null)
      ((javax.xml.rpc.Stub)snapshotClientService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public anding.monitor.webservice.SnapshotClientService getSnapshotClientService() {
    if (snapshotClientService == null)
      _initSnapshotClientServiceProxy();
    return snapshotClientService;
  }
  
  public anding.monitor.webservice.OutputSnapshot insertSnapshot(anding.monitor.webservice.InputSnapshot inputSnapshot) throws java.rmi.RemoteException{
    if (snapshotClientService == null)
      _initSnapshotClientServiceProxy();
    return snapshotClientService.insertSnapshot(inputSnapshot);
  }
  
  
}