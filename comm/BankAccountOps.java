package comm;

import java.util.Scanner;

public class BankAccountOps {
    String accountHoldersName;
    double balance;

    BankAccountOps(){}

    BankAccountOps (String accountHoldersName, double balance){
        this.accountHoldersName=accountHoldersName;
        this.balance=balance;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the account holders name ");
        String accountHoldersName=scanner.next();
        System.out.println("Enter the initial balance ");
        double initialBalance=scanner.nextDouble();
        BankAccountOps bankAccountOps=new BankAccountOps(accountHoldersName,initialBalance);
        int choice;
        do {
            System.out.println("Enter the operation you want to perform  ");
            System.out.println("\n 1. Press 1 for Balance Check   ");
            System.out.println("\n 2. Press 2 for amount deposit ");
            System.out.println("\n 3. Press 3 for amount withdrawal ");
            System.out.println("\n 4. Exit");
            System.out.println("Enter the correct operation number from above list ");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    bankAccountOps.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit  ");
                    double amount=scanner.nextDouble();
                    bankAccountOps.deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw ");
                    double amountToWithdraw=scanner.nextDouble();
                    bankAccountOps.withdraw(amountToWithdraw);
                    break;
                case 4:
                    System.out.println("Thank you for banking with us ");
                    break;
                default:
                    System.out.println("Invalid key is pressed baby press from 1 to 4 only ");
            }


        }
        while(choice!=4);



    }
    void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Rupees "+amount+" deposited successsfully. ");
        }
        else
            System.out.println("Cannot deposit negative amount ");

    }

    void withdraw(double amount){
        if (amount>0){
            if (balance>0){
                balance= balance-amount;
            }
            else System.out.println("Nikal fatichar paisa nahi hai tere pas ");
        }
        else System.out.println("Amount sahi daal chotee ");
    }

    void checkBalance(){
        System.out.println("Chote itnahi paisa baki hai tere paaasss  "+balance);
    }








}
