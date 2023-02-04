package com.service;

import com.bean.ReferralBean;

public interface ReferralService {

    public void displayReferral();

    public void addReferral(ReferralBean referral) ;

    public void deleteReferral(int Referral_id);
    public void updateReferral(int Referral_id);
    public void dummyData();
}
