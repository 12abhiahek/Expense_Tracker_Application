# Expense_Tracker_Application

#  Expense Tracker Application (Java CLI)

This is a simple command-line based **Expense Tracker** built using **Java**. It allows users to:

- Add income and expenses
- Categorize transactions (e.g., Salary, Rent, Travel)
- View monthly financial summaries
- Save and load transactions from a file

---

##  Project Structure

Expense_Tracker_Application/
├── src/
│ └── com/
│ └── alephys/
│ ├── app/
│ │ └── ExpenseTracker.java
│ └── model/
│ └── Transaction.java
├── out/ # Contains compiled .class files
├── data.txt # Example file to load/save transactions
└── README.md # This file

## Compile the source files

javac -d out src/com/alephy/model/Transaction.java src/com/alephy/app/ExpenseTracker.java

This compiles .java files and stores .class files in the out/ directory.

 ## Run the application
 java -cp out com.alephy.app.ExpenseTracker


You should now see a menu in the terminal:
Welcome to the Expense Tracker!

1. Add income and expenses
2. View Monthly Summary
3. Load from File
4. Save to File
5. Exit
Choose an option:


## Data File Format (data.txt)
Each transaction in the file should be on a new line in the format:
ex:
2024-05-01,Income,Salary,5000
2024-05-02,Expense,Food,150
2024-05-03,Expense,Rent,1000

## Format:
<yyyy-MM-dd>,<Income/Expense>,<Category>,<Amount>

## Requirements
Java 8 or above
Any IDE (e.g., IntelliJ, VS Code) or terminal

## Contact
If you have questions or want to contribute, feel free to contact the developer.

 Thank you for checking out this project!
