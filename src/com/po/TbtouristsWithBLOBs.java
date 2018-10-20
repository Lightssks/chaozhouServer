package com.po;

public class TbtouristsWithBLOBs extends Tbtourists {
    private String toudescribe;

    private String touintroduce;

    public String getToudescribe() {
        return toudescribe;
    }

    public void setToudescribe(String toudescribe) {
        this.toudescribe = toudescribe == null ? null : toudescribe.trim();
    }

    public String getTouintroduce() {
        return touintroduce;
    }

    public void setTouintroduce(String touintroduce) {
        this.touintroduce = touintroduce == null ? null : touintroduce.trim();
    }
}