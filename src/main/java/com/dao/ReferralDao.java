package com.dao;

import com.service.ReferralServiceImpl;

public interface ReferralDao {
    public void displayReferral();
    public void addReferral(ReferralServiceImpl referral);
    public void deleteReferral(int refid);
    public void updateData(int refId);
    void dummyData();
}
