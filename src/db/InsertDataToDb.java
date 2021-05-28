package db;

public class InsertDataToDb {
    Database database = Singletondatabase.getInstance();
    private String name;
    private String mobile;
    private String password;
    private String userid;

    public InsertDataToDb(Register reg) {
        name = reg.getName();
        mobile = reg.getMobileNum();
        password = reg.getPassword();
        userid = reg.getUserid();
    }

    public void insertdata() {
        try {
            database.insertUserDetails(userid, name, mobile, password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
