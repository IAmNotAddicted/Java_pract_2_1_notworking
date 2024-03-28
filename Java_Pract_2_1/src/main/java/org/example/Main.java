package org.example;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        CSVFileReader fileReader = new CSVFileReader();
        List<String[]> records = fileReader.read("path/to/your/file.csv");

        TransactionProcessor processor = new TransactionProcessor();

        System.out.println("Total balance: " + processor.calculateTotalBalance(records));

        System.out.println("\nTransactions count per month:");
        for (Month month : Month.values()) {
            System.out.printf("%-9s %d%n", month.name(), processor.countTransactionsByMonth(records), month.getValue());
        }

        System.out.println("\nTop 10 expenses:");
        List<Transaction> topExpenses = processor.findTopExpenses(records, 10);
        for (Transaction expense : topExpenses) {
            System.out.println(processor.formatTransaction(expense) + " - " + processor.formatSymbolicAmount(expense.getAmount()));
        }

        System.out.println("\nAnalysis report:");

        // Create a LocalDate object
        LocalDate date = LocalDate.of(2022, 10, 23);

        // Get the month value
        int monthValue = date.getMonthValue();

        // Print the month value
        System.out.println("Month value: " + monthValue);
    }



}