package com.service;

import com.bean.ReferralBean;
import com.dao.ReferralDao;
import com.dao.ReferralDaoImpl;

public class ReferralServiceImpl implements ReferralService {

    ReferralDao referralDao = new ReferralDaoImpl();

    @Override
    public void displayReferral() {

        referralDao.displayReferral();
    }

    @Override
    public void addReferral(ReferralBean referral) {
        referralDao.addReferral(referral);
    }

    @Override
    public void deleteReferral(int refid) {
       referralDao.deleteReferral(refid);

    }
    @Override
    public void updateReferral(int refId) {
        referralDao.updateData(refId);
    }

    @Override
    public void dummyData() {
        referralDao.dummyData();
    }
}
