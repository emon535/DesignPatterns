package com.emon535;

import com.emon535.UI.CheckBox;
import com.emon535.UI.TextBox;
import com.emon535.User.User;

public class Main {

    public static void main(String[] args) {
	// write your code here

        User user = new User("Emon");
        System.out.println(user.name);
        user.sayHello();

        var account = new Account();
        account.deposit(10);
        account.setBalance((100));

        // Mail Service : Abstruction :

        MailService mailService = new MailService();
        mailService.sendEmail();

        // UI Textbos:

        TextBox textBox = new TextBox();
        textBox.enable();

        textBox.draw();
        CheckBox checkBox = new CheckBox();

        checkBox.draw();

    }

}

