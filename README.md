# Expense_Tracker_Application

##  Table of Contents

-  Expense Tracker Application (Java CLI)
-  Project Structure
-  Compile the Source Files
-  Run the Application
-  Menu Show on Console
-  Data File Format (`data.txt`)
-  Format
-  Requirements
-  Screen short
-  Contact

##  Expense Tracker Application (Java CLI)

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


## You should now see a menu in the terminal:
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
1. 2024-05-01,Income,Salary,5000
2. 2024-05-02,Expense,Food,150
3. 2024-05-03,Expense,Rent,1000

## Format:
1. yyyy-MM-dd
2. Income/Expense
3. Category
4. Amount

## Requirements
Java 8 or above
Any IDE (e.g., IntelliJ, VS Code) or terminal

## ScreenShort
  Menu Console
- ![image](https://github.com/user-attachments/assets/1645234d-fd0a-46cf-bcf0-98bd0ffa9015)
  Monthly Summary
- ![image](https://github.com/user-attachments/assets/e5b21059-4669-4718-8b87-68ce7963441e)
  
  Data format
- ![image](https://github.com/user-attachments/assets/a38cf491-fbac-46a7-8c49-cf6a40da88ff)




## Contact
If you have questions or want to contribute, feel free to contact the developer.
- Email: Abhishek184april@gmail.com

 Thank you for checking out this project!
