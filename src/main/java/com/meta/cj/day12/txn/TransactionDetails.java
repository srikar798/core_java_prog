package com.meta.cj.day12.txn;

public class TransactionDetails {

    private long txnId;
    private String fromMobile;
    private String toMobile;
    private double amount;
    private String status;

    public TransactionDetails(long txnId, String fromMobile, String toMobile, double amount, String status) {
        this.txnId = txnId;
        this.fromMobile = fromMobile;
        this.toMobile = toMobile;
        this.amount = amount;
        this.status = status;
    }

    public long getTxnId() {
        return txnId;
    }

    public void setTxnId(long txnId) {
        this.txnId = txnId;
    }

    public String getFromMobile() {
        return fromMobile;
    }

    public void setFromMobile(String fromMobile) {
        this.fromMobile = fromMobile;
    }

    public String getToMobile() {
        return toMobile;
    }

    public void setToMobile(String toMobile) {
        this.toMobile = toMobile;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
