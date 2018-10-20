package com.po;

import java.util.Date;

public class Tbshare {
    private String shassthhId;

    private Long shauid;

    private String shapicture;

    private Integer shahit;

    private Date shatime;

    private String shaaddress;

    private String shapower;

    private String shatext;

    public String getShassthhId() {
        return shassthhId;
    }

    public void setShassthhId(String shassthhId) {
        this.shassthhId = shassthhId == null ? null : shassthhId.trim();
    }

    public Long getShauid() {
        return shauid;
    }

    public void setShauid(Long shauid) {
        this.shauid = shauid;
    }

    public String getShapicture() {
        return shapicture;
    }

    public void setShapicture(String shapicture) {
        this.shapicture = shapicture == null ? null : shapicture.trim();
    }

    public Integer getShahit() {
        return shahit;
    }

    public void setShahit(Integer shahit) {
        this.shahit = shahit;
    }

    public Date getShatime() {
        return shatime;
    }

    public void setShatime(Date shatime) {
        this.shatime = shatime;
    }

    public String getShaaddress() {
        return shaaddress;
    }

    public void setShaaddress(String shaaddress) {
        this.shaaddress = shaaddress == null ? null : shaaddress.trim();
    }

    public String getShapower() {
        return shapower;
    }

    public void setShapower(String shapower) {
        this.shapower = shapower == null ? null : shapower.trim();
    }

    public String getShatext() {
        return shatext;
    }

    public void setShatext(String shatext) {
        this.shatext = shatext == null ? null : shatext.trim();
    }
}