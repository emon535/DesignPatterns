package com.emon535;

public class Account {
    private  float balance;

    public  void deposit(float amount){
        if(amount>0){
            balance+= amount;
        }
    }

    public  void setBalance( float value){
        this.balance = value;
    }

    public  float getBalance(){
        return balance;
    }





}
