package com;

public class AccountTest {
    public boolean checkBalance(int totalBalance, int debitAmount){
        if(totalBalance >= debitAmount){
            return true;
        }
        return false;
    }
}
