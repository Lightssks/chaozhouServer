package com;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.common.vo.RoomVo;

import junit.framework.TestCase;

public class MyTest extends TestCase {
	
//	@Test
//	public void test() {
//	
//		String str = "t5<url=\"pic.jpg\"/>ssste";
//		String regex ="<url=\".*\"/>";
//				
//        Pattern p = Pattern.compile( regex );
//        Matcher m = p.matcher(str);
//        System.out.println(str);
//        System.out.println(regex);
//        while( m.find() ) {
//            System.out.println( "匹配项：" + m.group() ); //group方法返回由以前匹配操作所匹配的输入子序列。
//        }
//		System.out.println(str);
//		
//	}
	
//	@Test
//	public void test2() {
//		String str = "凤台时雨，单人床，预订满意度 96%\\n<url=\"/img/hotel/1_0010.jpg\">\\n" +
//	            "北阁佛灯(无窗),单人床,预订满意度 96%\\n<url=\"/img/hotel/1_0011.jpg\">\\n" +
//	            "鳄渡秋风,单人床,预订满意度 96%\\n<url=\"/img/hotel/1_0012.jpg\">\\n" +
//	            "韩鉰橡木(无窗),双床,预订满意度 96%\\n<url=\"/img/hotel/1_0013.jpg\">\\n" +
//	            "龙湫宝塔,双床,预订满意度 99%\\n<url=\"/img/hotel/1_0014.jpg\">\\n" +
//	            "金山古松,双床,预订满意度 96%\\n<url=\"/img/hotel/1_0015.jpg\">\\n" +
//	            "西湖渔筏,双床,预订满意度 96%\\n<url=\"/img/hotel/1_0016.jpg\">\\n" +
//	            "湘桥春涨(无窗),单人床,预订满意度 96%\\n<url=\"/img/hotel/1_0017.jpg\">\\n" +
//	            "坊街亭韵(无窗),多床,预订满意度 96%\\n<url=\"/img/hotel/1_0018.jpg\">\\n" +
//	            "凤凰天池,双床,预订满意度 96%\\n<url=\"/img/hotel/1_0019.jpg\">\\n" +
//	            "潮州房,双床,预订满意度 96%\\n<url=\"/img/hotel/1_0020.jpg\">\\n";
//		
//		String str2 = str.replace("\\", "");
//		String[] split = str2.split(",|，|n");
//		List<RoomVo> list = new ArrayList();
//		RoomVo room = null;
//		int i = 1;
//		for(String str3 : split) {
//			if(i%4 == 1) {
//				room = new RoomVo();
//				room.setRoomName(str3);
//			} else if (i%4 == 2 ) {
//				room.setRoomType(str3);
//			} else if (i%4 == 3) {
//				room.setSatisfaction(str3);
//			} else { 
//				i = 0;
//				str3 = str3.replace("<url=\"", "");
//				str3 = str3.replace("\">", "");
//				room.setRoomImg(str3);
//				list.add(room);
//			}
//			i++;
//		}
//		for(RoomVo room2 : list) {
//			System.out.println(room2.getRoomName() + " " + room2.getRoomType() + " " + room2.getSatisfaction()
//							+ " "  + room2.getRoomImg());
//		}
//	}
/*	@Test
	public void test3() {
		String str = "客房WIFI免费 免费停车场 非经营性休息区";
		String[] split = str.split(" ");
		for(String str2 : split) {
			System.out.println(str2);
		}
		
	}
	*/
	@Test
	public void test4() {
		String str = "ddddd<img src=\"https://chouzhou-1256247322.cos.ap-guangzhou.myqcloud.com/2018-04-19/539427b3aef84fa9a590c62ec52dcf34.jpeg\" alt=\"\" />ss<br />dddd";
		String str2 = str.replaceAll("<.+>", "");
		System.out.println(str2);
		System.out.println(str2.substring(0, 100));
	}
}
