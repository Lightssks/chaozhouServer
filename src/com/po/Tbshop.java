package com.po;

import java.util.Date;

public class Tbshop {
    private String shossthhId;

    private String shoname;

    private String shotype;

    private String shophone;

    private String shopicture;

    private String shostate;

    private Date shochangeTime;

    private String shochanger;

    private Long shomid;

    private String shodescribe;

    public String getShossthhId() {
        return shossthhId;
    }

    public void setShossthhId(String shossthhId) {
        this.shossthhId = shossthhId == null ? null : shossthhId.trim();
    }

    public String getShoname() {
        return shoname;
    }

    public void setShoname(String shoname) {
        this.shoname = shoname == null ? null : shoname.trim();
    }

    public String getShotype() {
        return shotype;
    }

    public void setShotype(String shotype) {
        this.shotype = shotype == null ? null : shotype.trim();
    }

    public String getShophone() {
        return shophone;
    }

    public void setShophone(String shophone) {
        this.shophone = shophone == null ? null : shophone.trim();
    }

    public String getShopicture() {
        return shopicture;
    }

    public void setShopicture(String shopicture) {
        this.shopicture = shopicture == null ? null : shopicture.trim();
    }

    public String getShostate() {
        return shostate;
    }

    public void setShostate(String shostate) {
        this.shostate = shostate == null ? null : shostate.trim();
    }

    public Date getShochangeTime() {
        return shochangeTime;
    }

    public void setShochangeTime(Date shochangeTime) {
        this.shochangeTime = shochangeTime;
    }

    public String getShochanger() {
        return shochanger;
    }

    public void setShochanger(String shochanger) {
        this.shochanger = shochanger == null ? null : shochanger.trim();
    }

    public Long getShomid() {
        return shomid;
    }

    public void setShomid(Long shomid) {
        this.shomid = shomid;
    }

    public String getShodescribe() {
        return shodescribe;
    }

    public void setShodescribe(String shodescribe) {
        this.shodescribe = shodescribe == null ? null : shodescribe.trim();
    }
}