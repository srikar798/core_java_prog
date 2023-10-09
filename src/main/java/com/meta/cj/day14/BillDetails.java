package com.meta.cj.day14;

import com.meta.cj.day15.Days;

public class BillDetails {

    private String billNo;
    private double amount;
    private Days day;
    private double discount = 0;
    private double netAmount;
    private double extraCharge = 0;

    public BillDetails(String billNo, double amount, Days day) {
        this.billNo = billNo;
        this.amount = amount;
        this.day = day;
        calculateNetAmount();
    }

    public String getBillNo() {
        return billNo;
    }

    public double getAmount() {
        return amount;
    }

    public Days getDay() {
        return day;
    }

    public double getDiscount() {
        return discount;
    }

    public double getNetAmount() {
        return netAmount = amount - discount + extraCharge;
    }

    public double getExtraCharge() {
        return extraCharge;
    }

    public void calculateNetAmount(){
        netAmount = amount - discount + extraCharge;
    }

    public void setDiscount(double discount){
        this.discount = (discount * amount)/100;
    }

    public void setExtraCharge(double extraCharge){
        this.extraCharge = (extraCharge * amount)/100;
    }
}
