package com.meta.cj.day12.txn;

public class  TransactionManager {

    public static void main(String[] args) {

            TransactionService service = new TransactionService();
            service.showTransactions("9876543210");
            service.showSuccessTransactions();
            service.showFailedTransactions();
            service.showTransactionStats();
    }
}
