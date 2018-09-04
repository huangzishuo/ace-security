package tongji.until;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

@Component
public class HttpClientUntil {

	 private static PoolingHttpClientConnectionManager connectionManager = null;  
	    private static HttpClientBuilder httpBuilder = null;  
	    private static RequestConfig requestConfig = null;  
	    
	    private static int MAXCONNECTION = 10;  
	    
	    private static int DEFAULTMAXCONNECTION = 5;  
	    
	    private static String IP = "cnivi.com.cn";  
	    private static int PORT = 80;  
	    
	    static {  
	        //设置http的状态参数  
	        requestConfig = RequestConfig.custom()  
	                .setSocketTimeout(5000)  
	                .setConnectTimeout(5000)  
	                .setConnectionRequestTimeout(5000)  
	                .build();  
	    
	        HttpHost target = new HttpHost(IP, PORT);  
	        connectionManager = new PoolingHttpClientConnectionManager();  
	        connectionManager.setMaxTotal(MAXCONNECTION);//客户端总并行链接最大数  
	        connectionManager.setDefaultMaxPerRoute(DEFAULTMAXCONNECTION);//每个主机的最大并行链接数  
	        connectionManager.setMaxPerRoute(new HttpRoute(target), 20);  
	        httpBuilder = HttpClients.custom();  
	        httpBuilder.setConnectionManager(connectionManager);  
	    }  
	    
	    /*public static CloseableHttpClient getConnection() {  
	        CloseableHttpClient httpClient = httpBuilder.build();  
	        return httpClient;  
	    }*/  
	    
	    public static CloseableHttpClient SslHttpClientBuild() {  
	    	// 设置协议http和https对应的处理socket链接工厂的对象  
	        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create().register("http", PlainConnectionSocketFactory.INSTANCE).register("https", trustAllHttpsCertificates()).build();  
	        //创建ConnectionManager，添加Connection配置信息  
	        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);  
	        //创建自定义的httpclient对象
	        CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(connectionManager).build();  
	        return httpClient;  
	    }  
	      
	    private static SSLConnectionSocketFactory trustAllHttpsCertificates() {  
	        SSLConnectionSocketFactory socketFactory = null;  
	        TrustManager[] trustAllCerts = new TrustManager[1];  
	        TrustManager tm = new miTM();  
	        trustAllCerts[0] = tm;  
	        SSLContext sc = null;  
	        try {  
	            sc = SSLContext.getInstance("TLS");//sc = SSLContext.getInstance("TLS")  
	            sc.init(null, trustAllCerts, null);  
	            socketFactory = new SSLConnectionSocketFactory(sc, NoopHostnameVerifier.INSTANCE);  
	            //HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());  
	        } catch (NoSuchAlgorithmException e) {  
	            e.printStackTrace();  
	        } catch (KeyManagementException e) {  
	            e.printStackTrace();  
	        }  
	        return socketFactory;  
	    } 
	    
	    // 实现一个X509TrustManager接口，用于绕过验证，不用修改里面的方法 
	    static class miTM implements TrustManager, X509TrustManager {  
	          
	        public X509Certificate[] getAcceptedIssuers() {  
	            return null;  
	        }  
	          
	        public void checkServerTrusted(X509Certificate[] certs, String authType) {  
	            //don't check  
	        }  
	          
	        public void checkClientTrusted(X509Certificate[] certs, String authType) {  
	            //don't check  
	        }  
	    }  
	    
	    public static HttpUriRequest getRequestMethod(Map<String, String> map, String url, String method) {  
	        List<NameValuePair> params = new ArrayList<NameValuePair>();  
	        Set<Map.Entry<String, String>> entrySet = map.entrySet();  
	        for (Map.Entry<String, String> e : entrySet) {  
	            String name = e.getKey();  
	            String value = e.getValue();  
	            NameValuePair pair = new BasicNameValuePair(name, value);  
	            params.add(pair);  
	        }  
	        HttpUriRequest reqMethod = null;  
	        if ("post".equals(method)) {  
	            reqMethod = RequestBuilder.post().setUri(url)  
	                    .addParameters(params.toArray(new BasicNameValuePair[params.size()]))  
	                    .setConfig(requestConfig).build();  
	        } else if ("get".equals(method)) {  
	            reqMethod = RequestBuilder.get().setUri(url)  
	                    .addParameters(params.toArray(new BasicNameValuePair[params.size()]))  
	                    .setConfig(requestConfig).build();  
	        }  
	        return reqMethod;  
	    } 
	    public static HttpUriRequest getNoParamMethod(String url, String method) {  
	        HttpUriRequest reqMethod = null;  
	        if ("post".equals(method)) {  
	            reqMethod = RequestBuilder.post().setUri(url)  
	                    .setConfig(requestConfig).build();  
	        } else if ("get".equals(method)) {  
	            reqMethod = RequestBuilder.get().setUri(url)  
	                    .setConfig(requestConfig).build();  
	        }  
	        return reqMethod;  
	    } 
	    
	    //有参post请求http实例
	    /*public static void main(String[] args) throws IOException{
	    	String method = "post";
	    	String url = "https://192.168.51.52:8001/api/v1/user/user-status-control";
	    	Map<String, String> mm = new HashMap<String, String>();
	    	mm.put("access_token", "61TBHi77QwqoS522OFpvGJmZoqf7tIwW");
	    	mm.put("user_name", "09666549");
	    	mm.put("user_available", "1");
	    	HttpClient client = SslHttpClientBuild();
	    	HttpUriRequest post = getRequestMethod(mm, url, method);
	    	HttpResponse response = client.execute(post);
	    	if (response.getStatusLine().getStatusCode() == 200) {  
	            HttpEntity entity = response.getEntity();  
	            String message = EntityUtils.toString(entity, "utf-8");  
	            System.out.println(message);  
	        } else {  
	            System.out.println("请求失败");  
	        }
	    }*/
	    
	  //无参post请求http实例
	    /*public static void main(String[] args) throws IOException{
	    	String method = "get";
	    	String url = "https://192.168.51.52:8001/api/v1/auth/get-access-token";
	    	HttpClient client = SslHttpClientBuild();
	    	HttpUriRequest get = getNoParamMethod(url, method);
	    	HttpResponse response = client.execute(get);
	    	String accessToken = null;
	    	if (response.getStatusLine().getStatusCode() == 200) {  
	            HttpEntity entity = response.getEntity();  
	            String message = EntityUtils.toString(entity, "utf-8");
	            JSONObject jsonObject = JSON.parseObject(message);
	            JSONObject json = JSON.parseObject(jsonObject.getString("data"));
	            accessToken = json.getString("access_token"); 
	            System.out.println(accessToken);  
	        } else {  
	            System.out.println("请求失败");  
	        }
	    }*/
  
}
