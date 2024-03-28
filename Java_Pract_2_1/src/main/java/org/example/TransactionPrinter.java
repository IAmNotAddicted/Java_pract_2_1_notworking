package org.example;
import java.util.List;

public class TransactionPrinter
{
    public void printTransactions(List<Transaction> transactions) {
        for (Transaction transaction : transactions) {
            System.out.println(transaction.toString());
        }
    }
}
