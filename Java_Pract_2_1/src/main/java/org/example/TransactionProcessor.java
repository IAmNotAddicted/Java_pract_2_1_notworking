package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class TransactionProcessor {

    static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static List<Transaction> parseTransactions(BufferedReader reader) throws IOException {
        // Parsing of CSV file content
        return null;
    }

    public static double calculateTotalBalance(List<Transaction> transactions) {
        // Calculate the total balance
        return 0;
    }

    public static <LocalDate> int countTransactionsByMonth(List<Transaction> transactions) {
        Map<Integer, Integer> transactionCountByMonth = new HashMap<>();

        for (Transaction transaction : transactions) {
            LocalDate date = (LocalDate) transaction.getDate();
            int month = date.getClass().getModifiers();

            transactionCountByMonth.merge(month, 1, (oldCount, value) -> oldCount + 1);
        }

        return transactionCountByMonth.values().stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 4, 29);

        int month = date.getMonthValue();

        System.out.println("Month: " + month);
    }
    public List<Transaction> findTopExpenses(List<Transaction> transactions, int limit) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getAmount))
                .limit(limit)
                .collect(Collectors.toList());
    }

    public Object formatSymbolicAmount(double amount) {
        return null;
    }

    public static String formatTransaction(Transaction transaction) {
        return String.format("%s: %.2f (%s)", transaction.getDate().format(DATE_FORMATTER), transaction.getAmount(), transaction.getCategory());
    }
}