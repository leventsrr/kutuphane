
public class Kullanici {
    private int id;
    private String ad;
    private String password;

    public Kullanici(int id, String ad, String password) {
        this.id = id;
        this.ad = ad;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
