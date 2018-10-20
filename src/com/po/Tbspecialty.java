package com.po;

import java.util.Date;

public class Tbspecialty {
    private String spessthhId;

    private String spename;

    private String speprice;

    private String spepicture;

    private Date spechangeTime;

    private String spestate;

    private String spechanger;

    private String spetype;

    private Long spemid;

    private String spedescribe;

    public String getSpessthhId() {
        return spessthhId;
    }

    public void setSpessthhId(String spessthhId) {
        this.spessthhId = spessthhId == null ? null : spessthhId.trim();
    }

    public String getSpename() {
        return spename;
    }

    public void setSpename(String spename) {
        this.spename = spename == null ? null : spename.trim();
    }

    public String getSpeprice() {
        return speprice;
    }

    public void setSpeprice(String speprice) {
        this.speprice = speprice == null ? null : speprice.trim();
    }

    public String getSpepicture() {
        return spepicture;
    }

    public void setSpepicture(String spepicture) {
        this.spepicture = spepicture == null ? null : spepicture.trim();
    }

    public Date getSpechangeTime() {
        return spechangeTime;
    }

    public void setSpechangeTime(Date spechangeTime) {
        this.spechangeTime = spechangeTime;
    }

    public String getSpestate() {
        return spestate;
    }

    public void setSpestate(String spestate) {
        this.spestate = spestate == null ? null : spestate.trim();
    }

    public String getSpechanger() {
        return spechanger;
    }

    public void setSpechanger(String spechanger) {
        this.spechanger = spechanger == null ? null : spechanger.trim();
    }

    public String getSpetype() {
        return spetype;
    }

    public void setSpetype(String spetype) {
        this.spetype = spetype == null ? null : spetype.trim();
    }

    public Long getSpemid() {
        return spemid;
    }

    public void setSpemid(Long spemid) {
        this.spemid = spemid;
    }

    public String getSpedescribe() {
        return spedescribe;
    }

    public void setSpedescribe(String spedescribe) {
        this.spedescribe = spedescribe == null ? null : spedescribe.trim();
    }
}