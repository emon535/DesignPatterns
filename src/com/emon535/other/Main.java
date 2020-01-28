package com.emon535.other;

import com.emon535.State.Canvas;
import com.emon535.State.CircleTool;
import com.emon535.State.SelectionTools;
import com.emon535.other.UI.CheckBox;
import com.emon535.other.UI.TextBox;
import com.emon535.other.User.User;
import com.emon535.Memento.Editor;
import com.emon535.Memento.History;

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

        var editor= new Editor();
        var history = new History();

        editor.setContent("A");
        history.push(editor.createState());

        editor.setContent("B");
        history.push(editor.createState());

        editor.setContent("C");

        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());

        // Canvas:

        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTools());
        canvas.mouseDown();

        canvas.setCurrentTool(new CircleTool());
        canvas.mouseDown();


    }

}

