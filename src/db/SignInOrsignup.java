package db;

import java.util.Scanner;

public class SignInOrsignup {
    public SignInOrsignup() {
        String mobile;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Mobile Number : ");
            mobile = sc.nextLine();
            Boolean isDigit=true;
            for(int i=0;i<mobile.length();i++){
                char digit=mobile.charAt(i);
                if(!Character.isDigit(digit)){
                    isDigit=false;
                    break;
                }
            }
            if (mobile.length() == 10 && isDigit) {
                break;
            } else {
                System.out.println("Invalid mobile number.....Please do enter a valid mobile number..");
            }
        }
        Singletondatabase database = Singletondatabase.getInstance();
        try {
            String pass = database.checkuserexistsandgetpass(mobile);
            if (pass.equals("")) {
                System.out.println("Number does not exixts.If you would like to continue....please do sign up");
                Signup signup = new Signup();
                signup.signup(mobile);
            } else {
                System.out.println("Number exixts please do signin by entering password.....");
                Signin signin = new Signin();
                signin.signin(pass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
