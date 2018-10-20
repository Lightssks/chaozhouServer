package com.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.common.vo.InfoVo;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class JsonUtil {
	private JsonObject jsonObj = null;
	private Gson gson = null;
	
	public String toJson(Object obj) {
		if(gson == null) {
			gson = new Gson();
		}
		return gson.toJson(obj);
	}
	
	public <T>List<T> toList(String json, Class beanType) {
		System.out.println(beanType);
		beanType.getComponentType();
		return gson.fromJson(json, new TypeToken<List<T>>() {}.getType());
	}
	
	
	public void setJsonObject(String json) {
		JsonElement  jsonEl  = new JsonParser().parse(json);
		//转换成Json对象
		jsonObj = jsonEl.getAsJsonObject();
	}
	
	//从json中获取某个字段的值
	public String getParameter(String getParam) {
		if(jsonObj!=null && jsonObj.get(getParam)!=null) {
			return jsonObj.get(getParam).getAsString();
		}
		return null;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Gson gson = new Gson();
		List<InfoVo> fromJson = gson.fromJson(gson.toJson(""), new TypeToken<ArrayList<InfoVo>>() {}.getType());
		Collections.sort(fromJson, new Comparator<InfoVo>(){

			@Override
			public int compare(InfoVo o1, InfoVo o2) {
				//time为空的设为最小值
				if(o1.getTime() == null) {
					return -1;
				}  else if (o2.getTime() == null) {
					return 1;
				}
				return  o1.getTime().compareTo(o2.getTime());
			}
		});
		System.out.println(gson.toJson(fromJson));
		for(InfoVo vo : fromJson) {
			System.out.println(vo.getShareId() + "  "  +vo.getSentId());
		}
		
	
	}
}
