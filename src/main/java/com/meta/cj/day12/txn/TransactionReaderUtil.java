package com.meta.cj.day12.txn;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TransactionReaderUtil {

    public static List<TransactionDetails> loadTransactionDetails() {
        List<TransactionDetails> txnList = new ArrayList<>();
        try {
            File file = new File(TransactionReaderUtil.class.getResource("/transactions.csv").getFile());
            List<String> list = Files.readAllLines(file.toPath());
            for (int i = 1; i < list.size(); i++) {
                String data = list.get(i);
                String[] arr = data.split(",");
                long txnId = Long.parseLong(arr[0]);
                String fromMobile = arr[1];
                String toMobile = arr[2];
                double amount = Double.parseDouble(arr[3]);
                String status = arr[4];
                TransactionDetails obj = new TransactionDetails(txnId, fromMobile, toMobile, amount, status);
                txnList.add(obj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return txnList;
    }
}
