package tongji.service.oracle.impl;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.wink.client.ClientConfig;
import org.apache.wink.client.ClientWebException;
import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;
import org.apache.wink.client.handlers.BasicAuthSecurityHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import tongji.dao.oracle.MdmBobjFieldDao;
import tongji.domain.oracle.MdmBobjField;
import tongji.domain.oracle.PersonExtensionBObjExtType;
import tongji.domain.oracle.TCRMPersonBObjType;
import tongji.service.oracle.MdmBobjFieldService;
import tongji.until.JsonFormater;

@Service
public class MdmBobjFieldServiceImpl implements MdmBobjFieldService {
	@Autowired
	private MdmBobjFieldDao mdmBobjFieldDao;

	public List<MdmBobjField> getMdmBobjField(String str1) {
		return mdmBobjFieldDao.getMdmBobjField(str1);

	}

	public String getPersonByJSONFromMDM(List<MdmBobjField> mdmBobjFieldList, String msg) throws IOException {
		// simple getPerson request
		String payload = getRequestByFile();
		System.out.println("payload:" + payload);
		String json = null;
		try {
			ClientConfig config = new ClientConfig();
			// setup basic authentication
			BasicAuthSecurityHandler basicAuthHandler = new BasicAuthSecurityHandler();
			basicAuthHandler.setUserName("mdmadmin");
			basicAuthHandler.setPassword("mdmadmin");
			// basicAuthHandler.setSSLRequired(false);
			config.handlers(basicAuthHandler);

			RestClient rc = new RestClient(config);

			Resource r = rc.resource("http://192.168.124.3:9081/com.ibm.mdm.server.ws.restful/resources/MDMWSRESTful");

			// optional MDM headers
			r.header("TargetApplication", "");
			r.header("RequestType", "");
			r.header("Parser", "");
			r.header("ResponseType", "");
			r.header("Constructor", "");
			r.header("OperationType", "");
			r.header("ASI_Request", "");
			r.header("ASI_Response", "");

			// submit put request of the xml payload.
			// String response =
			// r.contentType("application/xml").accept("application/xml").put(String.class,
			// payload);
			// submit put request of the json payload.
			String response = r.contentType("application/json").accept("application/json").put(String.class, payload);

			JSONObject jsonObject = JSONObject.parseObject(response);
			// String result = jsonObject.getString("ResponseControl");

			JSONObject serviceObject = jsonObject.getJSONObject("TCRMService");

			// JSONObject responseControl = serviceObject.getJSONObject("ResponseControl");

			// JSONObject DWLControl = responseControl.getJSONObject("DWLControl");

			JSONObject TxResponse = serviceObject.getJSONObject("TxResponse");
			JSONObject responseObject = TxResponse.getJSONObject("ResponseObject");
			JSONObject personBObj = responseObject.getJSONObject("TCRMPersonBObj");
			JSONObject tcrmExtension = personBObj.getJSONObject("TCRMExtension");
			JSONObject personExtensionBObjExt = tcrmExtension.getJSONObject("PersonExtensionBObjExt");
			TCRMPersonBObjType personBObjType = JSON.parseObject(personBObj.toJSONString(),
					new TypeReference<TCRMPersonBObjType>() {
					});

			System.out.println(personExtensionBObjExt);
			if (personExtensionBObjExt != null) {
				PersonExtensionBObjExtType personExtensionBObjExtType = JSON.parseObject(
						personExtensionBObjExt.toJSONString(), new TypeReference<PersonExtensionBObjExtType>() {
						});
				personBObjType.setTCRMExtension(personExtensionBObjExtType);

			}
			// String resultCode = personExtensionBObjExt.getString("DisplayName");
			// System.out.println(courseName);
			System.out.println(response);

			Boolean isexists = null;

			// 获取personBObjType所有成员变量
			Field[] fields = personBObjType.getClass().getDeclaredFields();

			for (Field field : fields) {

				// 判断字段是否存在
				if (!field.getType().equals(String.class) && !field.getType().toString().equals("boolean")) {
					isexists = isTypeExists(field.getName(), personBObjType, mdmBobjFieldList);

				} else {
					isexists = isExists(field.getName(), mdmBobjFieldList);

				}

				if (!isexists && !field.getType().toString().equals("boolean")) {

					field = personBObjType.getClass().getDeclaredField(field.getName());

					field.setAccessible(true);
					field.set(personBObjType, null);
					isexists = false;

				}

			}

			// Field f = personBObjType.getClass().getDeclaredField("partyId");
			// f.setAccessible(true);
			// f.set(personBObjType, null);
			// Object object =
			// personBObjType.getClass().getMethod("getPersonExtensionBObjExt", new Class[]
			// {});

			// f = personBObjType.getClass().getDeclaredField("PersonExtensionBObjExt");
			// Object object = getValue(personBObjType,"TCRMPartyContactMethodBObj");
			// System.out.println(object);
			// Object object = getValue(personBObjType,"TCRMPartyContactMethodBObj");

			// aaa(personBObjType);

			json = JSON.toJSONString(personBObjType);
			System.out.println(json);

		} catch (ClientWebException ce) {
			System.out.println(ce.getResponse().getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}

	public void aaa(TCRMPersonBObjType obj) throws Exception {
		Object object = getValue(obj, "TCRMPartyContactMethodBObj");

		System.out.println(object);

		// Field f2 = object.getClass().getDeclaredField("contactMethodUsageValue");
		// f2.setAccessible(true);
		// f2.set(object, null);
		// return f2;

	}

	public String getRequestByFile() throws IOException {

		String str = "{\"TCRMService\": {\r\n"
				+ "\"@schemaLocation\": \"http:\\/\\/www.ibm.com\\/mdm\\/schema MDMDomains.xsd\",\r\n"
				+ "\"RequestControl\": {\r\n" + "\"requestID\": 604157,\r\n"
				+ "\"DWLControl\": {\"requesterName\": \"cusadmin\",\"requesterLanguage\": \"400\"}},\r\n"
				+ "\"TCRMInquiry\": {\"InquiryType\": \"getParty\",\"InquiryParam\": {\"tcrmParam\": [{\"@name\": \"PartyId\",\r\n"
				+ " \"$\": \"915249966247227501\"},\r\n" + "{\"@name\": \"PartyType\",\"$\": \"P\"},\r\n"
				+ "{\"@name\": \"InquiryLevel\",\"$\": \"1\"}]}}}}";
		return str;
		/*
		 * String path =
		 * "src\\main\\resources\\soapxml\\request.json";//getClass().getResource(
		 * "request.json").toString();
		 * 
		 * InputStream is = new FileInputStream(path); BufferedReader in = new
		 * BufferedReader(new InputStreamReader(is)); StringBuffer buffer = new
		 * StringBuffer(); String line = ""; while ((line = in.readLine()) != null){
		 * buffer.append(line); } in.close(); is.close(); return buffer.toString();
		 */
	}

	public Object[] getObject(Object obj, String str) throws Exception {

		String[] strArray = str.split("\\.");
		Object[] returnObj = null;
		String name = null;
		for (int i = 0; i < strArray.length; i++) {
			name = strArray[i].toString();

			if (obj == null) {
				return null;
			}
			if (!obj.getClass().getName().endsWith(name)) {

				if (obj.getClass().isArray()) {
					Object[] obj2 = (Object[]) obj;
					returnObj = new Object[obj2.length];

					for (int j = 0; j < obj2.length; j++) {
						obj = getValue(obj2[j], name);
						returnObj[j] = obj;
					}

				} else {

					obj = getValue(obj, name);
					returnObj = new Object[1];
					returnObj[0] = obj;

				}

			}
		}
		return returnObj;

	}

	public Object getValue(Object dto, String name) throws Exception {

		Method[] m = dto.getClass().getMethods();
		for (int i = 0; i < m.length; i++) {
			if (("get" + name).toLowerCase().equals(m[i].getName().toLowerCase())) {
				// System.out.println(name);
				return m[i].invoke(dto);
			}
		}
		return null;
	}

	public Boolean isExists(String str1, List<MdmBobjField> mdmBobjFieldList) {
		for (int i = 0; i < mdmBobjFieldList.size(); i++) {
			MdmBobjField mdmBobjField = new MdmBobjField();
			mdmBobjField = (MdmBobjField) mdmBobjFieldList.get(i);

			if (str1.endsWith(mdmBobjField.getField().toString())) {
				System.out.println("ffsdf:" + mdmBobjField.getField().toString());

				return true;

			}
		}

		return false;

	}

	public Boolean isBojectExists(String str, List<String> typeList) {

		for (int i = 0; i < typeList.size(); i++) {

			String[] strArray = typeList.get(i).toString().split("\\.");
			for (int j = 0; j < strArray.length; j++) {
				if (str.endsWith(strArray[j].toString())) {
					return true;
				}
			}

		}

		return false;

	}

	public static List<String> copyList(List<MdmBobjField> mdmBobjFieldList) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < mdmBobjFieldList.size(); i++) {

			MdmBobjField mdmBobjField = new MdmBobjField();
			mdmBobjField = (MdmBobjField) mdmBobjFieldList.get(i);
			list.add(mdmBobjField.getBobjType());

		}

		return list;
	}

	public static List<String> removeDuplicate(List<MdmBobjField> mdmBobjFieldList) {
		List<String> list = copyList(mdmBobjFieldList);
		Set<String> set = new HashSet<>(list);
		list.clear();
		list.addAll(set);
		/*
		 * for (int i = 0; i < list.size() - 1; i++) { for (int j = list.size() - 1; j >
		 * i; j--) { if (list.get(j).equals(list.get(i))) { list.remove(j); } } }
		 */
		return list;
	}

	public Boolean isTypeExists(String str1, Object obj, List<MdmBobjField> mdmBobjFieldList) throws Exception {

		int num = 0;
		List<String> typeList = removeDuplicate(mdmBobjFieldList);

		for (int i = 0; i < mdmBobjFieldList.size(); i++) {
			MdmBobjField mdmBobjField = new MdmBobjField();
			mdmBobjField = (MdmBobjField) mdmBobjFieldList.get(i);

			if (mdmBobjField.getBobjType().toString().indexOf(str1) != -1) {

				num++;
				Object[] object = getObject(obj, mdmBobjField.getBobjType().toString());
				if (object == null || object[0] == null) {
					return false;
				}

				if (object.length == 1) {

					if (object[0].getClass().isArray()) {
						Object[] obj2 = (Object[]) object[0];

						for (int j = 0; j < obj2.length; j++) {
							Field[] fields = obj2[j].getClass().getDeclaredFields();
							for (Field field : fields) {

								// System.out.println("field.getName():"+field.getName());

								if (!field.getName().endsWith(mdmBobjField.getField())
										&& !isBojectExists(field.getName(), typeList)) {

									if (!field.getType().toString().equals("boolean")) {
										field = obj2[j].getClass().getDeclaredField(field.getName());
										field.setAccessible(true);
										field.set(obj2[j], null);
									}
								}
							}
						}
					} else {

						Field[] fields = object[0].getClass().getDeclaredFields();
						for (Field field : fields) {
							if (!field.getName().endsWith(mdmBobjField.getField())) {
								if (!field.getType().toString().equals("boolean")) {
									System.out.println("gggg:" + field.getName());
									field = object[0].getClass().getDeclaredField(field.getName());
									field.setAccessible(true);
									field.set(object[0], null);
								}
							}
						}
					}
				} else {
					// field.setAccessible(true);
					// field.set(object[0], null);
					for (int j = 0; j < object.length; j++) {
						Field[] fields = object[j].getClass().getDeclaredFields();
						for (Field field : fields) {
							if (!field.getName().endsWith(mdmBobjField.getField())) {
								if (!field.getType().toString().equals("boolean")) {
									field = object[j].getClass().getDeclaredField(field.getName());
									field.setAccessible(true);
									field.set(object[j], null);
								}
							}
						}
					}
				}
			}
		}
		if (num > 0) {
			return true;
		} else {
			return false;

		}

	}

	public String postOffice365Api() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/demo/mdm/test";

		HttpHeaders headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		String result = restTemplate.postForObject(url, entity, String.class);
		return result;

	}

	public void getRestApi(String url) {
		url = "http://localhost:8080/demo/mdm/test";

		RestTemplate restTemplate = new RestTemplate();
		//Map<String, Object> params = new HashMap<>();

		String ff = restTemplate.getForObject(url, String.class);
		System.out.println("json:" + JsonFormater.format(ff));

	}

}
