package com.meta.cj.day12.txn;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {

    private List<TransactionDetails> txnList;

    public TransactionService() {
        txnList = TransactionReaderUtil.loadTransactionDetails();
    }

    public void showTransactions(String mobile) {
        List<TransactionDetails> list = new ArrayList<>();
        for (TransactionDetails txn : txnList) {
            if (txn.getFromMobile().equals(mobile) || txn.getToMobile().equals(mobile)) {
                list.add(txn);
            }
        }
        displayTransactions(list);
    }

    public void showSuccessTransactions() {
        List<TransactionDetails> list = new ArrayList<>();
        for (TransactionDetails txn : txnList) {
            if (txn.getStatus().equalsIgnoreCase("SUCCESS")) {
                list.add(txn);
            }
        }
        displayTransactions(list);
    }

    public void showFailedTransactions() {
        List<TransactionDetails> list = new ArrayList<>();
        for (TransactionDetails txn : txnList) {
            if (txn.getStatus().equalsIgnoreCase("failure")) {
                list.add(txn);
            }
        }
        displayTransactions(list);
    }

    public void showTransactionStats() {
        // how many transactions are success and how many are failed
        int failureCount = 0;
       for (TransactionDetails txn : txnList) {
            if (txn.getStatus().equalsIgnoreCase("failure")) {
                failureCount++;
            }
        }
        int successCount = txnList.size() - failureCount;
        System.out.println("Total transactions   : "+txnList.size());
        System.out.println("Success transactions : "+successCount);
        System.out.println("Failure transactions : "+failureCount);
    }

    private void displayTransactions(List<TransactionDetails> list) {
        if (list.isEmpty()) {
            System.out.println("No transactions found");
        } else {
            for (TransactionDetails txn : list) {
                System.out.println(txn.getTxnId() + "," + txn.getFromMobile() + "," + txn.getToMobile() + "," + txn.getAmount() + "," + txn.getStatus());
            }
        }
    }

}
