package db;

//data hiding
import java.util.HashMap;

public class Browser {
    private String url;
    private String ipAddress;
    private String htmlpage;
    private String domainName;
    private HashMap<String, String> domainMatch = new HashMap<String, String>();
    private HashMap<String, String> ipMatch = new HashMap<String, String>();

    public void setUrl(String url) throws Wrongurl {
        if (url.startsWith("www.") && url.endsWith(".com")) {
            this.url = url;
        } else {
            throw new Wrongurl("Invalid url");
        }
    }

    private void dns() {
        domainMatch.put("facebook", "127.128.128.127");
        findIp();
    }

    private void ipmatch() {
        ipMatch.put("127.128.128.127", "fb_index.html");
        findhtml();
    }

    private void findIp() {
        this.domainName = url.split("\\.")[1];
        this.ipAddress = domainMatch.get(domainName);
    }

    private void findhtml() {
        this.htmlpage = ipMatch.get(ipAddress);
    }

    public String getpage() {
        dns();
        ipmatch();

        return htmlpage;
    }

}

class Wrongurl extends Exception {
    Wrongurl(String err) {
        super(err);
    }

}
