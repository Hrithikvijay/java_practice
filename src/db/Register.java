package db;

//pojo
public class Register {
    private String name;
    private String mobileNum;
    private String password;
    private String userid;

    public Register(String userid, String name, String mobile, String password) {
        this.name = name;
        this.mobileNum = mobile;
        this.password = password;
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public String getPassword() {
        return password;
    }

    public String getUserid() {
        return userid;
    }

}
