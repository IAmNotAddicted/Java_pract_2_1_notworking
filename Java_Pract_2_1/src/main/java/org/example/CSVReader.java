package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader implements AutoCloseable {

    private BufferedReader reader;

    public CSVReader(FileReader fileReader) {
        this.reader = new BufferedReader(fileReader);
    }

    public List<String> readAll() throws IOException {
        List<String> allLines = new ArrayList<>();
        String line;

        while ((line = readLine()) != null) {
            allLines.add(line);
        }

        return allLines;
    }

    private String readLine() throws IOException {
        return reader.readLine();
    }

    @Override
    public void close() throws IOException {
        if (reader != null) {
            reader.close();
        }
    }

    public static void main(String[] args) {
        String filePath = "path/to/your/csv.file";

        try (CSVReader csvReader = new CSVReader(new FileReader(new File(filePath)))) {
            // Use the CSVReader
        } catch (IOException e) {
            System.err.println("Error reading the CSV file: " + e.getMessage());
        }
    }

}