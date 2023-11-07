package com.meta.cj.day15;

import java.security.PrivateKey;

public class Invoice {

    private String invoiceNo;
    private String customerName;
    private double amount;
    private ApprovalStatus approvalStatus;

    public Invoice(String invoiceNo, String customerName, double amount, ApprovalStatus approvalStatus) {
        this.invoiceNo = invoiceNo;
        this.customerName = customerName;
        this.amount = amount;
        this.approvalStatus = approvalStatus;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNo='" + invoiceNo + '\'' +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                ", approvalStatus=" + approvalStatus +
                '}';
    }
}
