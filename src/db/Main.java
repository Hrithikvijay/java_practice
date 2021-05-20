package db;

import java.util.Scanner;

public class Main {
    static void welcome() {
        System.out.println("Welcome  to the browser...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        welcome();
        System.out.print("Enter URL : ");
        String url = sc.nextLine();
        Browser browser = new Browser();
        try {
            browser.setUrl(url);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(browser.getpage());
        System.out.println("Welcome to the index page:-");
        SignInOrsignup signInOrsignup = new SignInOrsignup();
    }
}
