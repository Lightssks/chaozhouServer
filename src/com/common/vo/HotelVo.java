package com.common.vo;

import java.util.Date;
import java.util.List;

import com.po.Tbmap;

public class HotelVo{
	private String hotssthhId;

    private String hotname;

    private String hotphone;

    private String hotpicture;
    
    private String hotstate;
    
    private Tbmap map;
    //=======================

    private String hottype;

    private Date hotchangeTime;

    private String hotchanger;

    private Long hotmid;

    private String hotroom;

    private String hotdevice;

    private String hotdescribe;
    
    private List<RoomVo> room;
    
    private List<String> devices;

    

	public Tbmap getMap() {
		return map;
	}

	public void setMap(Tbmap map) {
		this.map = map;
	}

	public List<RoomVo> getRoom() {
		return room;
	}

	public void setRoom(List<RoomVo> room) {
		this.room = room;
	}

	public List<String> getDevices() {
		return devices;
	}

	public void setDevices(List<String> devices) {
		this.devices = devices;
	}

	public String getHotssthhId() {
		return hotssthhId;
	}

	public void setHotssthhId(String hotssthhId) {
		this.hotssthhId = hotssthhId;
	}

	public String getHotname() {
		return hotname;
	}

	public void setHotname(String hotname) {
		this.hotname = hotname;
	}

	public String getHotphone() {
		return hotphone;
	}

	public void setHotphone(String hotphone) {
		this.hotphone = hotphone;
	}

	public String getHotpicture() {
		return hotpicture;
	}

	public void setHotpicture(String hotpicture) {
		this.hotpicture = hotpicture;
	}

	public String getHotstate() {
		return hotstate;
	}

	public void setHotstate(String hotstate) {
		this.hotstate = hotstate;
	}

	public String getHottype() {
		return hottype;
	}

	public void setHottype(String hottype) {
		this.hottype = hottype;
	}

	public Date getHotchangeTime() {
		return hotchangeTime;
	}

	public void setHotchangeTime(Date hotchangeTime) {
		this.hotchangeTime = hotchangeTime;
	}

	public String getHotchanger() {
		return hotchanger;
	}

	public void setHotchanger(String hotchanger) {
		this.hotchanger = hotchanger;
	}

	public Long getHotmid() {
		return hotmid;
	}

	public void setHotmid(Long hotmid) {
		this.hotmid = hotmid;
	}

	public String getHotroom() {
		return hotroom;
	}

	public void setHotroom(String hotroom) {
		this.hotroom = hotroom;
	}

	public String getHotdevice() {
		return hotdevice;
	}

	public void setHotdevice(String hotdevice) {
		this.hotdevice = hotdevice;
	}

	public String getHotdescribe() {
		return hotdescribe;
	}

	public void setHotdescribe(String hotdescribe) {
		this.hotdescribe = hotdescribe;
	}
    
    
    
	
}
