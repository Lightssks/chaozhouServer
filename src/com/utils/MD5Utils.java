package com.utils;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;

//md5散列加密
public class MD5Utils {
	private static final int hashIterations = 1;
	public static String encrypt(String password, String salt) {
		//明文	盐	散列次数
		Md5Hash md5Hash = new Md5Hash(password, salt, hashIterations);
		return md5Hash.toString();
	}
	
	public static String encrypt(String password) {
		Md5Hash md5Hash = new Md5Hash(password);
		return md5Hash.toString();
	}
	
	public static String getSalt() {
		return new SecureRandomNumberGenerator().nextBytes().toHex();
	}
	
	public static void main(String[] args) {
		String slat = "ec69fa1fd75804eee9c0a80678f11120";
		encrypt(slat, "cdd5a9f7c802c610cb9b07c2f6bccb78");
		System.out.println(encrypt("cdd5a9f7c802c610cb9b07c2f6bccb78", slat));
		//b66c13e220275d8c219de6c1d3732604

		//30b237dab571fd542e307d70332bb890
		//cdd5a9f7c802c610cb9b07c2f6bccb78
	}
}
