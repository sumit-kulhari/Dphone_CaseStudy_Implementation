package com.dao;

import com.bean.ReferralBean;
import com.service.ReferralServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class ReferralDaoImpl implements ReferralDao{

    public static HashMap<Integer, ReferralBean> referralData = new HashMap<>();

    public void dummyData() {
        referralData.put(101, new ReferralBean(101, "Sumit", 1000));
        referralData.put(102, new ReferralBean(102, "Abhishom", 2000));
        referralData.put(103, new ReferralBean(103, "Utkarsh", 3000));
    }

    public void displayReferral() {
        System.out.println("Referral list are :");
        for (int key: referralData.keySet()) {
            System.out.println(referralData.get(key).toString());
        }
    }

    public void addReferral(ReferralBean referralImp) {

        int key = referralImp.getReferral_id();

        if(!referralData.containsKey(key)){
            referralData.put(key,referralImp);
        }else {
            System.out.println("Record already present");
        }
    }

    public void deleteReferral(int refid) {
        if(!referralData.containsKey(refid)){
            System.out.println("Data with this Id is not present");
        }
        referralData.remove(refid);
    }

    public void updateData(int refid) {
        int referralPoints = 1000;
        for(Map.Entry<Integer, ReferralBean> referralEntry : referralData.entrySet()) {

            int currRefId = referralEntry.getKey();

            if (currRefId == refid) {

                ReferralBean referral = referralEntry.getValue();

                referral.setReferral_points(referral.getReferral_points() + referralPoints);
            }
        }

    }

}
