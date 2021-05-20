package db;

import java.util.Scanner;
import java.util.UUID;

public class Signup {
    Scanner sc = new Scanner(System.in);

    public void signup(String mobile) {
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Password : ");
        String password = encryption(sc.nextLine());
        String userid = UUID.randomUUID().toString();
        Register reg = new Register(userid, name, mobile, password);
        InsertDataToDb insert = new InsertDataToDb(reg);
        insert.insertdata();
        System.out.println("policies..............................");
        System.out.print("Do you agree with our terms and conditions - YES or NO : ");
        String responce = sc.nextLine().toUpperCase();
        boolean declaration = responce.equals("YES");
        if (!declaration) {
            System.out.println("______Thank you_______");
            System.exit(0);
        }
        System.out.println("Successfully Signed up....Please do sign in to continue...");
        SignInOrsignup signInOrsignup = new SignInOrsignup();
        Declaration declare = new Declaration(name, mobile, declaration);
        Showdemo demo = new Showdemo();
        Survey survey = new Survey(reg);
    }

    private String encryption(String pass) {
        String encrypt = "";
        for (int i = 0; i < pass.length(); i++) {
            encrypt += (char) (pass.charAt(i) + 1);
        }
        return encrypt;
    }
}
