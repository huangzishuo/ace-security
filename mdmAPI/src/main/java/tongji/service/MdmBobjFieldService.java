package tongji.service;

import java.io.IOException;
import java.util.List;

import tongji.domain.mdm.MdmBobjField;


public interface MdmBobjFieldService {
	List<MdmBobjField> getMdmBobjField(String str1);

	String getPersonByJSONFromMDM(List<MdmBobjField> mdmBobjFieldList, String msg) throws IOException;

	String postOffice365Api();

	void getRestApi(String url);
}
