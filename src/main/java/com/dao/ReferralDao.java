package com.dao;

import com.bean.ReferralBean;
import com.service.ReferralServiceImpl;

public interface ReferralDao {
    public void displayReferral();
    public void addReferral(ReferralBean referral);
    public void deleteReferral(int refid);
    public void updateData(int refId);
    void dummyData();
}
