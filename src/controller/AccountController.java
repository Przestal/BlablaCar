package controller;

import model.Account;
import view.AccountView;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountController {


    AccountView accountView = new AccountView();


    public void showPanel() {

        accountView.printPanelDetails();

    }

    public static void createNewAccount() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your login: ");
        String login = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        ArrayList<String> loginAndPasswordHolder = new ArrayList<>();
        loginAndPasswordHolder.add(0,login);
        loginAndPasswordHolder.add(0,password);

    }


    public static void sendLoginAndPasswordFromFile(String login, String password) {

        try {
            Scanner scanner = new Scanner(new File("base.txt"));
            login = scanner.next();
            password = scanner.next();
            scanner.close();
            if (login != null && password != null) {
                System.out.println("You are log in!");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File is not found, check path or name");
        }


    }


    public static String panelChoser() {

        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();

            do {
                switch (number) {
                    case 1: {
                        System.out.println("Sorry, this option is not ready yet");
                        return null;
                    }
                    case 2: {
                        System.out.println("Sorry, this option is not ready yet");
                        createNewAccount();
                        return null;

                    }
                    case 3: {
                        return null;


                    }
                    default: {
                        System.out.println("Please select number: 1, 2 or 3");
                        break;
                    }


                }
            } while (number > 0 && number <= 2);


        } catch (InputMismatchException e) {
            System.out.println("Requires only numbers");
            return panelChoser();

        }


        return panelChoser();
    }

}


