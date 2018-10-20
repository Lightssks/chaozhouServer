package com.common.sms;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.utils.JsonUtil;



public class IndustrySMS {
	private static String operation = "/industrySMS/sendSMS";

	private static String accountSid = Config.ACCOUNT_SID;
	//平台短信模板id
	private static String templateid = "208966403";


	// 验证码通知短信
	public static String execute(String toNum, String verCode) {
	    String url = Config.BASE_URL + operation;
	    String body = "accountSid=" + accountSid + "&templateid=" + templateid + 
	    		"&param=" + verCode + ",5" + "&to=" + toNum + HttpUtil.createCommonParam();

	    // 提交请求
	    String result = HttpUtil.post(url, body);
	//    System.out.println("result:" + System.lineSeparator() + result);
	    return result;
	}
	
	public static void main(String[] args) {
//	 	Integer num = (int)((Math.random()*9+1)*100000);  
//		execute("18320453780", num.toString());
		String result = "{\"respCode\":\"00000\",\"respDesc\":\"请求成功。\",\"failCount\":\"0\",\"failList\":[],\"smsId\":\"9d278c382d87475690239d4e5109209c\"}";
		
		JsonUtil util = new JsonUtil();
		util.setJsonObject(result);
		String param = util.getParameter("respCode");
		System.out.println(param);

	}
}
