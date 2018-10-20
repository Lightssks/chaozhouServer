package com.utils;

import java.util.Random;

//各种随机数的生成
public class RandomNumUtils {
	
	public static String getRalt() {
		//随机产生的字符串
		String randString = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 //生成4位数随机数
        String randomString = "";
        Random random = new Random();
        for(int i=1;i<=4;i++){
        	//随机获得字符的下标
        	int index = random.nextInt(randString.length());
        	randomString += String.valueOf(randString.charAt(index));
        }
		return randomString;
	}
	
	//id生成
	public static String getId() {
		//取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		//long millis = System.nanoTime();
		//加上两位随机数
		Random random = new Random();
		int end2 = random.nextInt(99);
		//如果不足两位前面补0
		String str = String.valueOf(millis).substring(0, 12);
		return str;
	}
	
	public static void main(String[] args) {
		System.out.println("100000000001");
        System.out.println(getId());

	}
}
