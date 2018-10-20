package com.po;

import java.util.Date;

public class Tbinformation {
    private Long intid;

    private Long otherId;

    private String intstate;

    private Date inttime;

    private Long intuid;

    private String inttext;

    public Long getIntid() {
        return intid;
    }

    public void setIntid(Long intid) {
        this.intid = intid;
    }

    public Long getOtherId() {
        return otherId;
    }

    public void setOtherId(Long otherId) {
        this.otherId = otherId;
    }

    public String getIntstate() {
        return intstate;
    }

    public void setIntstate(String intstate) {
        this.intstate = intstate == null ? null : intstate.trim();
    }

    public Date getInttime() {
        return inttime;
    }

    public void setInttime(Date inttime) {
        this.inttime = inttime;
    }

    public Long getIntuid() {
        return intuid;
    }

    public void setIntuid(Long intuid) {
        this.intuid = intuid;
    }

    public String getInttext() {
        return inttext;
    }

    public void setInttext(String inttext) {
        this.inttext = inttext == null ? null : inttext.trim();
    }
}