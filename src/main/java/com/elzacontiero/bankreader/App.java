package com.elzacontiero.bankreader;

import java.io.File;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        solution1();
    }

    public static void solution1() throws Exception {
        System.out.println("Creating scanner for CSV file.");
        Scanner scan = new Scanner(new File("transactions.csv"));

        String firstLine = scan.nextLine();
        System.out.println("Throwing away 1st line: " + firstLine);

        String date;
        String details;
        String transactionType;
        double in = 0.0;
        double out = 0.0;
        double balance = 0.0;

        double totalExpenses = 0.0;
        double totalIncome = 0.0;

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] fields = line.split(",");

            date = fields[0];
            details = fields[1];
            transactionType = fields[2];
            if (fields[3].isEmpty()) {
                in = 0.0;
            } else {
                in = Double.parseDouble(fields[3]);
            }

            if (fields[4].isEmpty()) {
                out = 0.0;
            } else {
                out = Double.parseDouble(fields[4]);
            }

          
            if (fields[5].isEmpty()) {
                balance = 0.0;
            } else {
                balance = Double.parseDouble(fields[5]);
            }

            
            System.out.println("date: " + date +
                              " details: " + details +
                              " tranType: " + transactionType +
                              " in: " + in +
                              " out: " + out +
                              " balance: " + balance);

            
            totalExpenses += out;
            totalIncome += in;
        }

        System.out.println("totalExpenses:" + (int)totalExpenses);
        System.out.println("totalIncome:" + (int)totalIncome);
        System.out.println("totalDifference:" + (int)(totalIncome-totalExpenses));

          

    }


}
