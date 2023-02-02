package com.service;

public interface ReferralService {

    public void displayReferral();

    public void addReferral(ReferralServiceImpl referral) ;

    public void deleteReferral(int refid);
    public void updateData(int refId);

    public void dummyData();
}
