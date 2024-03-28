package org.example;
import java.time.LocalDate;

public class Transaction
{
    private LocalDate date;
    private double amount;
    private String category;

    public Transaction(LocalDate date, double amount, String category, double v) {
        this.date = date;
        this.amount = amount;
        this.category = category;
    }

    // Getters for date, amount, and category
    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }
}
