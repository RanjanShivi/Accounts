package com;

import java.util.Scanner;

public class Account {
    AccountTest accountTest = new AccountTest();
    int totalBalance = 5000;

    public void debit(int moneyWithdraw) {
        if (accountTest.checkBalance(totalBalance, moneyWithdraw)) {
            totalBalance = totalBalance - moneyWithdraw;
            System.out.println("INR " + moneyWithdraw + " debited from your account");
            System.out.println("Your available balance is INR " + totalBalance);
        } else
            System.out.println("Debit amount exceeded account balance.");
    }

    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("Welcome in Bank");
        System.out.println("Your balance is " + account.totalBalance);
        System.out.println("Enter debit amount");
        Scanner scanner = new Scanner(System.in);
        int withdrawsMoney = scanner.nextInt();

        account.debit(withdrawsMoney);
    }
}
