package com.bean;

public class ReferralBean {

    private int Referral_id;
    private String Referral_name;
    private int Referral_points;

    @Override
    public String toString() {
        return "ReferralBean{" +
                "Referral_id=" + Referral_id +
                ", Referral_name='" + Referral_name + '\'' +
                ", Referral_points=" + Referral_points +
                '}';
    }

    public int getReferral_id() {
        return Referral_id;
    }

    public void setReferral_id(int referral_id) {
        Referral_id = referral_id;
    }

    public String getReferral_name() {
        return Referral_name;
    }

    public void setReferral_name(String referral_name) {
        Referral_name = referral_name;
    }

    public int getReferral_points() {
        return Referral_points;
    }

    public void setReferral_points(int referral_points) {
        Referral_points = referral_points;
    }

    public ReferralBean(int referral_id, String referral_name, int referral_points) {
        Referral_id = referral_id;
        Referral_name = referral_name;
        Referral_points = referral_points;
    }

    public ReferralBean() {
    }
}
