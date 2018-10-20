package com.po;

public class Tbss {
    private Long ssid;

    private String speid;

    private String shoid;

    public Long getSsid() {
        return ssid;
    }

    public void setSsid(Long ssid) {
        this.ssid = ssid;
    }

    public String getSpeid() {
        return speid;
    }

    public void setSpeid(String speid) {
        this.speid = speid == null ? null : speid.trim();
    }

    public String getShoid() {
        return shoid;
    }

    public void setShoid(String shoid) {
        this.shoid = shoid == null ? null : shoid.trim();
    }
}