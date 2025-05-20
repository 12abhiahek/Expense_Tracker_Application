package src.com.alephy.app;

import src.com.alephy.model.Transaction;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


    public  class ExpenseTracker {
        private static final Scanner scanner = new Scanner(System.in);
        private static final List<Transaction> transactions = new ArrayList<>();

        public static void main(String[] args) {
            System.out.println("Welcome to the Expense Tracker!");

            while (true) {
                System.out.println("\n1. Add income and expenses \n2. View Monthly Summary\n3. Load from File\n4. Save to File\n5. Exit");
                System.out.print("Choose an option: ");
                int choice = Integer.parseInt(scanner.nextLine());

    //            switch (choice) {
    //                case 1 -> addTransaction();
    //                case 2 -> viewMonthlySummary();
    //                case 3 -> loadFromFile();
    //                case 4 -> saveToFile();
    //                case 5 -> {
    //                    System.out.println("Goodbye!");
    //                    return;
    //                }
    //                default -> System.out.println("Invalid option!");
    //            }


                switch (choice) {
                    case 1:
                        addTransaction();
                        break;
                    case 2:
                        viewMonthlySummary();
                        break;
                    case 3:
                        loadFromFile();
                        break;
                    case 4:
                        saveToFile();
                        break;
                    case 5:
                        System.out.println(" Thank you for visiting !!");
                        return;
                    default:
                        System.out.println("Invalid option!");
                        break;
                }

            }
        }

        private static void addTransaction() {
            System.out.print("Enter date (yyyy-MM-dd): ");
            LocalDate date = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            System.out.print("Enter type (Income/Expense): ");
            String type = scanner.nextLine().trim();

            String category;
            if (type.equalsIgnoreCase("Income")) {
                System.out.print("Enter category (Salary/Business): ");
                category = scanner.nextLine().trim();
            } else {
                System.out.print("Enter category (Food/Rent/Travel): ");
                category = scanner.nextLine().trim();
            }

            System.out.print("Enter amount: ");
            double amount = Double.parseDouble(scanner.nextLine());

            transactions.add(new Transaction(date, type, category, amount));
            System.out.println("Transaction added successfully.");
        }

        private static void viewMonthlySummary() {
            Map<String, Double> incomeMap = new HashMap<>();
            Map<String, Double> expenseMap = new HashMap<>();
            double totalIncome = 0, totalExpense = 0;

            for (Transaction t : transactions) {
                if (t.getType().equalsIgnoreCase("Income")) {
                    totalIncome += t.getAmount();
                    incomeMap.merge(t.getCategory(), t.getAmount(), Double::sum);
                } else {
                    totalExpense += t.getAmount();
                    expenseMap.merge(t.getCategory(), t.getAmount(), Double::sum);
                }
            }

            System.out.println("\n===== Monthly Summary =====");
            System.out.println("Total Income: " + totalIncome);
            incomeMap.forEach((cat, amt) -> System.out.println(" - " + cat + ": " + amt));

            System.out.println("\nTotal Expense: " + totalExpense);
            expenseMap.forEach((cat, amt) -> System.out.println(" - " + cat + ": " + amt));

            System.out.println("\nNet Savings: " + (totalIncome - totalExpense));
        }

        private static void loadFromFile() {
            System.out.print("Enter file name to load: ");
            String filename = scanner.nextLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    transactions.add(Transaction.fromString(line));
                }
                System.out.println("Data loaded successfully.");
            } catch (IOException e) {
                System.out.println("Error loading file: " + e.getMessage());
            }
        }

        private static void saveToFile() {
            System.out.print("Enter file name to save: ");
            String filename = scanner.nextLine();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                for (Transaction t : transactions) {
                    writer.write(t.toString());
                    writer.newLine();
                }
                System.out.println("Data saved successfully.");
            } catch (IOException e) {
                System.out.println("Error saving file: " + e.getMessage());
            }
        }
    }

