package com.utils;

import java.util.ArrayList;
import java.util.List;

import com.common.vo.RoomVo;

//对hotel获取的数据进行处理
public class HotelUtils {
	public static List<RoomVo> getRoomVoList(String str) {
		String str2 = str.replace("\\", "");
		String[] split = str2.split(",|，|n");
		List<RoomVo> list = new ArrayList<RoomVo>();
		RoomVo room = null;
		int i = 1;
		for(String str3 : split) {
			if(i%4 == 1) {
				room = new RoomVo();
				room.setRoomName(str3);
			} else if (i%4 == 2 ) {
				room.setRoomType(str3);
			} else if (i%4 == 3) {
				room.setSatisfaction(str3);
			} else { 
				i = 0;
				str3 = str3.replace("<url=\"", "");
				str3 = str3.replace("\">", "");
				room.setRoomImg(str3);
				list.add(room);
			}
			i++;
		}
		return list;
	}
	
	public static List<String> getDeviceVoList(String str) {
		String[] split = str.split(" +");
		List<String> list = new ArrayList<String> ();
		for(String str2 : split) {
			list.add(str2);
		}
		if(list.isEmpty()) {
			return null;
		}
		return list;
	}
}
