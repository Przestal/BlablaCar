import controller.AccountController;
import view.AccountView;

import java.security.AccessController;
import java.util.Scanner;

public class Main {





    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AccountController ac = new AccountController();
        ac.showPanel();
        AccountController.panelChoser();

    }


}
