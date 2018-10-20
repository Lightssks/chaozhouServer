package com.po;

import java.util.Date;

public class Tbhotel {
    private String hotssthhId;

    private String hotname;

    private String hottype;

    private String hotphone;

    private String hotpicture;

    private String hotstate;

    private Date hotchangeTime;

    private String hotchanger;

    private Long hotmid;

    private String hotroom;

    private String hotdevice;

    private String hotdescribe;

    public String getHotssthhId() {
        return hotssthhId;
    }

    public void setHotssthhId(String hotssthhId) {
        this.hotssthhId = hotssthhId == null ? null : hotssthhId.trim();
    }

    public String getHotname() {
        return hotname;
    }

    public void setHotname(String hotname) {
        this.hotname = hotname == null ? null : hotname.trim();
    }

    public String getHottype() {
        return hottype;
    }

    public void setHottype(String hottype) {
        this.hottype = hottype == null ? null : hottype.trim();
    }

    public String getHotphone() {
        return hotphone;
    }

    public void setHotphone(String hotphone) {
        this.hotphone = hotphone == null ? null : hotphone.trim();
    }

    public String getHotpicture() {
        return hotpicture;
    }

    public void setHotpicture(String hotpicture) {
        this.hotpicture = hotpicture == null ? null : hotpicture.trim();
    }

    public String getHotstate() {
        return hotstate;
    }

    public void setHotstate(String hotstate) {
        this.hotstate = hotstate == null ? null : hotstate.trim();
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
        this.hotchanger = hotchanger == null ? null : hotchanger.trim();
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
        this.hotroom = hotroom == null ? null : hotroom.trim();
    }

    public String getHotdevice() {
        return hotdevice;
    }

    public void setHotdevice(String hotdevice) {
        this.hotdevice = hotdevice == null ? null : hotdevice.trim();
    }

    public String getHotdescribe() {
        return hotdescribe;
    }

    public void setHotdescribe(String hotdescribe) {
        this.hotdescribe = hotdescribe == null ? null : hotdescribe.trim();
    }
}