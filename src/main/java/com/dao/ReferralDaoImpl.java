package com.dao;

import com.service.ReferralServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class ReferralDaoImpl implements ReferralDao{

    public static HashMap<Integer, ReferralServiceImpl> referralData = new HashMap<>();

    public void dummyData() {
        referralData.put(101, new ReferralServiceImpl(101, "Sumit", 1000));
        referralData.put(102, new ReferralServiceImpl(102, "Abhishom", 2000));
        referralData.put(103, new ReferralServiceImpl(103, "Utkarsh", 3000));
    }

    public void displayReferral() {
        System.out.println("Referral list are :");
        for (int key: referralData.keySet()) {
            System.out.println(referralData.get(key).toString());
        }
    }

    public void addReferral(ReferralServiceImpl referralImp) {

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
        for(Map.Entry<Integer, ReferralServiceImpl> referralEntry : referralData.entrySet()) {

            int currRefId = referralEntry.getKey();

            if (currRefId == refid) {

                ReferralServiceImpl referral = referralEntry.getValue();

                referral.setReferral_points(referral.getReferral_points() + referralPoints);
            }
        }

    }

}
