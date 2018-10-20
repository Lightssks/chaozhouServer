package com.po;

public class Tbmap {
    private Long mid;

    private Double mlongitude;

    private Double mlatitude;

    private String marea;

    private String mroad;

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Double getMlongitude() {
        return mlongitude;
    }

    public void setMlongitude(Double mlongitude) {
        this.mlongitude = mlongitude;
    }

    public Double getMlatitude() {
        return mlatitude;
    }

    public void setMlatitude(Double mlatitude) {
        this.mlatitude = mlatitude;
    }

    public String getMarea() {
        return marea;
    }

    public void setMarea(String marea) {
        this.marea = marea == null ? null : marea.trim();
    }

    public String getMroad() {
        return mroad;
    }

    public void setMroad(String mroad) {
        this.mroad = mroad == null ? null : mroad.trim();
    }
}