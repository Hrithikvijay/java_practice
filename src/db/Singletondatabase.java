package db;

import java.sql.*;

public class Singletondatabase implements Database {
    private static Singletondatabase single = null;

    private Singletondatabase() {
    }

    public static Singletondatabase getInstance() {
        if (single == null) {
            single = new Singletondatabase();
        }
        return single;
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {

        Connection connection = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_details", "root", "password");
        return connection;

    }

    public String checkuserexistsandgetpass(String mobile) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String password = "";
        try {
            connection = Singletondatabase.getConnection();
            ps = connection.prepareStatement("select * from user where Mobile_number=(?)");
            ps.setString(1, mobile);
            rs = ps.executeQuery();
            if (rs.next()) {
                password = rs.getString(4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        connection.close();
        return password;
    }

    public void insertUserDetails(String userid, String name, String mobile, String pass) throws SQLException {

        Connection connection = null;

        PreparedStatement ps = null;

        try {

            connection = Singletondatabase.getConnection();
            ps = connection.prepareStatement("insert into user(user_id,Name,Mobile_number,password)values(?,?,?,?)");
            ps.setString(1, userid);
            ps.setString(2, name);
            ps.setString(3, mobile);
            ps.setString(4, pass);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        connection.close();
    }

    public void insertSurveyDetails(String userid, String name, String mobile, String sport) throws SQLException {

        Connection connection = null;

        PreparedStatement ps = null;

        try {

            connection = Singletondatabase.getConnection();
            ps = connection.prepareStatement("insert into survey(user_id,Name,mobile,sports)values(?,?,?,?)");
            ps.setString(1, userid);
            ps.setString(2, name);
            ps.setString(3, mobile);
            ps.setString(4, sport);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        connection.close();
    }
}
