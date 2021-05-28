package db;

import java.sql.SQLException;
import java.util.Scanner;

public class Survey {
    public Survey(Register reg){
        String name=reg.getName();
        String mobile=reg.getMobileNum();
        String userid=reg.getUserid();
        Scanner sc =new Scanner(System.in);
        Database database = Singletondatabase.getInstance();
        System.out.print("This is an survey which is conducted for our advertisement purpose...\nIt takes less than half a minute to respond..\nwhould you like to respond... Yes/No : ");
        Boolean respond=(sc.nextLine()).toUpperCase().equals("YES");
        if(respond){
            System.out.println("*\n*\n*");
            System.out.print("Would you play Cricket....Yes/No : ");
            Boolean survey1 = (sc.nextLine()).toUpperCase().equals("YES");
            if(survey1){
                try {
                    database.insertSurveyDetails(userid, name, mobile, "Cricket");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("*\n*\n*");
            System.out.print("Would you play Football....Yes/No : ");
            Boolean survey2 = (sc.nextLine()).toUpperCase().equals("YES");
            if (survey2) {
                try {
                    database.insertSurveyDetails(userid, name, mobile, "Football");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Thank you for your responce");
    }
    

}
