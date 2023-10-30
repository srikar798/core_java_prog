package com.meta.cj.day27;


import lombok.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

enum PaymentType{
    DR,CR
}
enum PaymentStatus{
    SUCCESS,FAILED
}
enum PaymentMode{
    UPI,NETBANKING,DEBITCARD,CREDITCARD
}

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
class PaymentDetails{
    private String txnId;
    private double amount;
    private PaymentType paymentType;
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
    private String fromAccNumber;
    private String toAccNumber;
}

public class AssignmentQuestion {

    public static void main(String[] args) {

        List<PaymentDetails> paymentDetails = new AssignmentQuestion().getPaymentDetails();

        // Get all Failed transactions
        List<PaymentDetails> failed = paymentDetails.stream().filter(e->e.getPaymentStatus().equals(PaymentStatus.FAILED)).toList();
        failed.forEach(System.out::println);

        System.out.println("-".repeat(60));
        // Get all transactions which are made by UPI


        List<PaymentDetails> upi = paymentDetails.stream().filter(e->e.getPaymentMode().equals(PaymentMode.UPI)).toList();
        upi.forEach(System.out::println);

        System.out.println("-".repeat(60));

        // Get failed transactions which are made by UPI and amount <= 2000

        List<PaymentDetails> upiWithAmount = paymentDetails.stream().filter(e->e.getPaymentMode().equals(PaymentMode.UPI)).filter(e-> e.getAmount() > 2000).toList();
        upiWithAmount.forEach(System.out::println);
        System.out.println("-".repeat(60));

        // Get all account numbers which are involved in transactions

        Set<String> accounts = paymentDetails.stream().map(PaymentDetails::getToAccNumber).collect(Collectors.toSet());
        System.out.println(accounts.size());
        accounts.addAll(paymentDetails.stream().map(PaymentDetails::getFromAccNumber).collect(Collectors.toSet()));
        System.out.println(accounts.size());
        accounts.forEach(System.out::println);

    }

    private List<PaymentDetails> getPaymentDetails(){
        return List.of(
                new PaymentDetails("TXN1001", 5000, PaymentType.DR, PaymentStatus.SUCCESS, PaymentMode.UPI, "SB1001", "SB1002"),
                new PaymentDetails("TXN1002", 5000, PaymentType.DR, PaymentStatus.SUCCESS, PaymentMode.NETBANKING, "SB1002", "SB1003"),
                new PaymentDetails("TXN1003", 5000, PaymentType.DR, PaymentStatus.SUCCESS, PaymentMode.DEBITCARD, "SB1003", "SB1004"),
                new PaymentDetails("TXN1004", 5000, PaymentType.CR, PaymentStatus.FAILED, PaymentMode.CREDITCARD, "SB1004", "SB1005"),
                new PaymentDetails("TXN1005", 5000, PaymentType.DR, PaymentStatus.SUCCESS, PaymentMode.UPI, "SB1005", "SB1006"),
                new PaymentDetails("TXN1006", 5000, PaymentType.DR, PaymentStatus.SUCCESS, PaymentMode.NETBANKING, "SB1006", "SB1007"),
                new PaymentDetails("TXN1007", 1000, PaymentType.CR, PaymentStatus.SUCCESS, PaymentMode.DEBITCARD, "SB1007", "SB1008"),
                new PaymentDetails("TXN1008", 5000, PaymentType.DR, PaymentStatus.SUCCESS, PaymentMode.CREDITCARD, "SB1008", "SB1009"),
                new PaymentDetails("TXN1009", 1000, PaymentType.DR, PaymentStatus.SUCCESS, PaymentMode.UPI, "SB1009", "SB1010"),
                new PaymentDetails("TXN1010", 5000, PaymentType.DR, PaymentStatus.SUCCESS, PaymentMode.NETBANKING, "SB1010", "SB1011"),
                new PaymentDetails("TXN1011", 5000, PaymentType.DR, PaymentStatus.SUCCESS, PaymentMode.DEBITCARD, "SB1011", "SB1012"),
                new PaymentDetails("TXN1012", 5000, PaymentType.DR, PaymentStatus.SUCCESS, PaymentMode.CREDITCARD, "SB1012", "SB1013"),
                new PaymentDetails("TXN1013", 1000, PaymentType.DR, PaymentStatus.FAILED, PaymentMode.UPI, "SB1013", "SB1014")
        );
    }
}
