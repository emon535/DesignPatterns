package com.emon535;

public class Main {

    public static void main(String[] args) {
	// write your code here

        User user = new User("Emon");
        System.out.println(user.name);
        user.sayHello();

        var account = new Account();
        account.deposit(10);
        account.setBalance((100));

    }

}

