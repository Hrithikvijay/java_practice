package db;

import java.util.Scanner;

public class Signin {

    public void signin(String pass) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Password : ");
            String password = sc.nextLine();
            if (password.equals(decryption(pass))) {
                System.out.println("Successfully signed in....Please start using the application..");
                // first page 
                break;
            } else {
                System.out.println("Wrong password .....please re-enter the correct password....");
            }
        }
    }

    private String decryption(String pass) {
        String decrypt = "";
        for (int i = 0; i < pass.length(); i++) {
            decrypt += (char) (pass.charAt(i) - 1);
        }
        return decrypt;
    }

}
