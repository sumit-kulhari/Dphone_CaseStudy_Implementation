package com.tester;

import com.dao.ReferralDao;
import com.dao.ReferralDaoImpl;
import com.service.ReferralServiceImpl;

import java.util.Scanner;

public class TestReferral {
    public static void main(String[] args){

        ReferralServiceImpl referral = new ReferralServiceImpl();
        referral.dummyData();
        System.out.println("Enter you Choice: ");
        System.out.println("Enter 1 for Displaying Data");
        System.out.println("Enter 2 for Adding Data");
        System.out.println("Enter 3 for Updating Data");
        System.out.println("Enter 4 for Deleting Data");
        System.out.println("Enter 5 to Exit");
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            n = scanner.nextInt();


            switch (n) {
                //Case statements
                case 1:
                    referral.displayReferral();
                    break;
                case 2:
                    ReferralServiceImpl referral1 = new ReferralServiceImpl(103,"Abhi",4000);
                    referral.addReferral(referral1);
                    referral.displayReferral();
                    break;
                case 3:
                    referral.updateData(103);
                    break;
                case 4:
                    referral.deleteReferral(105);
                    break;
                case 5:
                    System.exit(0);
                    //Default case statement
                default:
                    System.out.println("Wrong option chosen");
            }

        }

    }
}
