package db;

import java.sql.SQLException;

public interface Database {
    public String checkuserexistsandgetpass(String mobile) throws SQLException;

    public void insertUserDetails(String userid, String name, String mobile, String pass) throws SQLException;

    public void insertSurveyDetails(String userid, String name, String mobile, String sport) throws SQLException;
    
}
