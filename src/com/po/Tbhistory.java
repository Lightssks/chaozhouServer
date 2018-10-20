package com.po;

import java.util.Date;

public class Tbhistory {
    private String hisssthhId;

    private String histitle;

    private String hispicture;

    private Date hischangeTime;

    private String hischanger;

    private String hisstate;

    private String hisdescribe;

    public String getHisssthhId() {
        return hisssthhId;
    }

    public void setHisssthhId(String hisssthhId) {
        this.hisssthhId = hisssthhId == null ? null : hisssthhId.trim();
    }

    public String getHistitle() {
        return histitle;
    }

    public void setHistitle(String histitle) {
        this.histitle = histitle == null ? null : histitle.trim();
    }

    public String getHispicture() {
        return hispicture;
    }

    public void setHispicture(String hispicture) {
        this.hispicture = hispicture == null ? null : hispicture.trim();
    }

    public Date getHischangeTime() {
        return hischangeTime;
    }

    public void setHischangeTime(Date hischangeTime) {
        this.hischangeTime = hischangeTime;
    }

    public String getHischanger() {
        return hischanger;
    }

    public void setHischanger(String hischanger) {
        this.hischanger = hischanger == null ? null : hischanger.trim();
    }

    public String getHisstate() {
        return hisstate;
    }

    public void setHisstate(String hisstate) {
        this.hisstate = hisstate == null ? null : hisstate.trim();
    }

    public String getHisdescribe() {
        return hisdescribe;
    }

    public void setHisdescribe(String hisdescribe) {
        this.hisdescribe = hisdescribe == null ? null : hisdescribe.trim();
    }
}