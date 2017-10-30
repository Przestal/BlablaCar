package view;

import controller.AccountController;

import java.util.Scanner;

public class AccountView {

    public void printPanelDetails() {

        System.out.println("Please login or create new account:");
        System.out.println("1. Login\n2. Sign up\n3. Exit");

    }


    public void printSignUpDetails(String login, String password){

        System.out.println(" Write your name: "+ login);
        System.out.println(" Write your password: "+ password);
    }

}
