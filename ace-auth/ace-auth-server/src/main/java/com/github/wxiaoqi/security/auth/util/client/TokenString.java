package com.github.wxiaoqi.security.auth.util.client;

import java.io.DataInputStream;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

@Configuration
public class TokenString {

	// 非对称密钥算法
	public static final String KEY_ALGORITHM = "RSA";

	// 公钥
	private static final String PUBLIC_KEY = "publicKey";

	// 私钥
	private static final String PRIVATE_KEY = "privateKey";

	/**
	 * 初始化密钥对
	 *
	 * @return Map 甲方密钥的Map
	 */
	public static Map<String, Key> initKey() throws Exception {
		
		PublicKey publicKey = loadPublicKey("rsa/public-key.pem");
		PrivateKey privateKey = loadPrivateKey("rsa/private-key.pem");
		
		// 将密钥存储在map中
		Map<String, Key> keyMap = new HashMap<String, Key>();
		keyMap.put(PUBLIC_KEY, publicKey);
		keyMap.put(PRIVATE_KEY, privateKey);
		return keyMap;
	}

	private static byte[] replaceAndBase64Decode(final String file, final String headReplace, final String tailReplace)
			throws Exception {
		// 从 classpath:resources/ 中加载资源
		final ResourceLoader loader = new DefaultResourceLoader();
		final Resource resource = loader.getResource(file);
		InputStream is = resource.getInputStream();
		final DataInputStream dis = new DataInputStream(is);
		final byte[] keyBytes = new byte[is.available()];
		dis.readFully(keyBytes);
		dis.close();

		final String temp = new String(keyBytes);
		String publicKeyPEM = temp.replace(headReplace, "");
		publicKeyPEM = publicKeyPEM.replace(tailReplace, "");

		return org.apache.commons.codec.binary.Base64.decodeBase64(publicKeyPEM);
	}

	/**
	 * 加载pem格式的公钥
	 *
	 * @param pem
	 *            公钥文件路径
	 * @return 公钥
	 * @throws Exception
	 */
	public static PublicKey loadPublicKey(final String pem) throws Exception {

		final byte[] decoded = replaceAndBase64Decode(pem, "-----BEGIN PUBLIC KEY-----",
				"-----END PUBLIC KEY-----");
		final X509EncodedKeySpec spec = new X509EncodedKeySpec(decoded);
		final KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		return keyFactory.generatePublic(spec);

	}

	/**
	 * 加载pem格式PKCS8编码的私钥
	 *
	 * @param pem
	 *            私钥文件路径
	 * @return 私钥
	 */
	public static PrivateKey loadPrivateKey(final String pem) throws Exception {

		final byte[] decoded = replaceAndBase64Decode(pem, "-----BEGIN PRIVATE KEY-----",
				"-----END PRIVATE KEY-----");
		final PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(decoded);
		final KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		return keyFactory.generatePrivate(spec);

	}

	/**
	 * 公钥加密
	 *
	 * @param data
	 *            待加密数据
	 * @param key
	 *            密钥
	 * @return byte[] 加密数据
	 */
	public static String encryptByPublicKey(byte[] data, byte[] key) throws Exception {

		// 实例化密钥工厂
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		// 初始化公钥
		// 密钥材料转换
		X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(key);
		// 产生公钥
		PublicKey publicKey = keyFactory.generatePublic(x509KeySpec);

		// 数据加密
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		return encode(cipher.doFinal(data));
	}

	/**
	 * 私钥解密
	 *
	 * @param data
	 *            待解密数据
	 * @param key
	 *            密钥
	 * @return byte[] 解密数据
	 */
	public static String decryptByPrivateKey(String data, byte[] key) throws Exception {
		// 取得私钥
		PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(key);
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		// 生成私钥
		PrivateKey privateKey = keyFactory.generatePrivate(pkcs8KeySpec);
		// 数据解密
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		return new String(cipher.doFinal(decode(data.getBytes())));
	}

	public static String encode(byte[] bytes) throws Exception {
		return new String(Base64.getEncoder().encode(bytes));
	}

	public static byte[] decode(byte[] bytes) throws Exception {
		return Base64.getDecoder().decode(bytes);
	}

	public static void main(String[] args) throws Exception {
		
	}

}
