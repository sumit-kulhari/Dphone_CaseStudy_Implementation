package com.service;

import com.dao.ReferralDao;
import com.dao.ReferralDaoImpl;

public class ReferralServiceImpl implements ReferralService {
    private int Referral_id;
    private String Referral_name;
    private int Referral_points;


    public ReferralServiceImpl(int referral_id, String referral_name, int referral_points) {
        Referral_id = referral_id;
        Referral_name = referral_name;
        Referral_points = referral_points;
    }

    ReferralDao referralDao = new ReferralDaoImpl();

    public ReferralServiceImpl() {

    }

    @Override
    public String toString() {
        return "ReferralImpl{" +
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

    @Override
    public void displayReferral() {
      referralDao.displayReferral();
    }

    @Override
    public void addReferral(ReferralServiceImpl referral) {

        referralDao.addReferral(referral);
    }

    @Override
    public void deleteReferral(int refid) {
       referralDao.deleteReferral(refid);
    }

    @Override
    public void updateData(int refId) {

        referralDao.updateData(refId);
    }

    @Override
    public void dummyData() {

    }
}
