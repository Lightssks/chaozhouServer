package com.po;

import java.util.Date;

public class Tbcomment {
    private Long cid;

    private Long cuid;

    private Date ctime;

    private String cssthhId;

    private String ctext;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCuid() {
        return cuid;
    }

    public void setCuid(Long cuid) {
        this.cuid = cuid;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getCssthhId() {
        return cssthhId;
    }

    public void setCssthhId(String cssthhId) {
        this.cssthhId = cssthhId == null ? null : cssthhId.trim();
    }

    public String getCtext() {
        return ctext;
    }

    public void setCtext(String ctext) {
        this.ctext = ctext == null ? null : ctext.trim();
    }
}