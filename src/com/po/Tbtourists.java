package com.po;

import java.util.Date;

public class Tbtourists {
    private String toussthhId;

    private String toutitle;

    private String toupicture;

    private Date touchangeTime;

    private String touchanger;

    private String toustate;

    private Long toumid;

    public String getToussthhId() {
        return toussthhId;
    }

    public void setToussthhId(String toussthhId) {
        this.toussthhId = toussthhId == null ? null : toussthhId.trim();
    }

    public String getToutitle() {
        return toutitle;
    }

    public void setToutitle(String toutitle) {
        this.toutitle = toutitle == null ? null : toutitle.trim();
    }

    public String getToupicture() {
        return toupicture;
    }

    public void setToupicture(String toupicture) {
        this.toupicture = toupicture == null ? null : toupicture.trim();
    }

    public Date getTouchangeTime() {
        return touchangeTime;
    }

    public void setTouchangeTime(Date touchangeTime) {
        this.touchangeTime = touchangeTime;
    }

    public String getTouchanger() {
        return touchanger;
    }

    public void setTouchanger(String touchanger) {
        this.touchanger = touchanger == null ? null : touchanger.trim();
    }

    public String getToustate() {
        return toustate;
    }

    public void setToustate(String toustate) {
        this.toustate = toustate == null ? null : toustate.trim();
    }

    public Long getToumid() {
        return toumid;
    }

    public void setToumid(Long toumid) {
        this.toumid = toumid;
    }
}