package com.meta.cj.day14;


import com.meta.cj.day15.Days;

import java.util.List;

public class AssignmentQuestion2 {

    public static void main(String[] args) {


        BillDetails bill1 = new BillDetails("1001", 350, Days.FRIDAY);
        BillDetails bill2 = new BillDetails("1002", 450, Days.SATURDAY);
        BillDetails bill3 = new BillDetails("1003", 275, Days.SUNDAY);
        BillDetails bill4 = new BillDetails("1004", 600, Days.MONDAY);
        BillDetails bill5 = new BillDetails("1005", 200, Days.TUESDAY);
        BillDetails bill6 = new BillDetails("1006", 800, Days.WEDNESDAY);
        BillDetails bill7 = new BillDetails("1007", 350, Days.THURSDAY);
        BillDetails bill8 = new BillDetails("1008", 550, Days.FRIDAY);
        BillDetails bill9 = new BillDetails("1009", 725, Days.SATURDAY);
        BillDetails bill10 = new BillDetails("1010", 375, Days.SUNDAY);

        List<BillDetails> billList = List.of(bill1, bill2, bill3, bill4, bill5, bill6, bill7, bill8, bill9, bill10);
        getBillDetails(billList);

    }

    private static void getBillDetails(List<BillDetails> bills){
        for(BillDetails bill : bills){
            Days d = bill.getDay();

            switch(d){
                case MONDAY , TUESDAY, WEDNESDAY -> {
                    bill.setDiscount(10);
                    bill.setExtraCharge(0);
                    System.out.println(bill.getNetAmount());
                }
                case THURSDAY , FRIDAY-> {
                    bill.setDiscount(5);
                    bill.setExtraCharge(0);
                    System.out.println(bill.getNetAmount());
                }
                case SATURDAY ,SUNDAY-> {
                    bill.setDiscount(0);
                    bill.setExtraCharge(15);
                    System.out.println(bill.getNetAmount());
                }
            }
        }

    }
}
