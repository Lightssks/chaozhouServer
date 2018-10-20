package com.po;

public class Tbsetup {
    private Long setuid;

    private String setpropelling;

    private String setupgrade;

    private String setwarn;

    public Long getSetuid() {
        return setuid;
    }

    public void setSetuid(Long setuid) {
        this.setuid = setuid;
    }

    public String getSetpropelling() {
        return setpropelling;
    }

    public void setSetpropelling(String setpropelling) {
        this.setpropelling = setpropelling == null ? null : setpropelling.trim();
    }

    public String getSetupgrade() {
        return setupgrade;
    }

    public void setSetupgrade(String setupgrade) {
        this.setupgrade = setupgrade == null ? null : setupgrade.trim();
    }

    public String getSetwarn() {
        return setwarn;
    }

    public void setSetwarn(String setwarn) {
        this.setwarn = setwarn == null ? null : setwarn.trim();
    }
}