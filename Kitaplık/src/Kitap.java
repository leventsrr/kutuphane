public class Kitap {
    
    private int id ;
    private String ad ;
    private String yazar ;
    private String yayin ;
    private String alan ;
    private String iletisim;
    private String tarih;
    
    public Kitap(int id, String ad, String yazar, String yayin , String alan , String iletisim ,String tarih) {
        this.id = id;
        this.ad = ad;
        this.yazar = yazar;
        this.yayin = yayin;
        this.alan = alan;
        this.iletisim = iletisim;
        this.tarih = tarih;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getYayin() {
        return yayin;
    }

    public void setYayin(String yayin) {
        this.yayin = yayin;
    }
    
    public String getAlan(){
        return alan;
    }
    
    public void setAlan(String alan){
        this.alan = alan;
    }
    
    public String getIletisim(){
        return iletisim;
    }
    
    public void setIletisim(String iletisim){
        this.iletisim = iletisim;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
    
    
    
    
}   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*public Kitap(String id, String ad, String yazar, String yayin) {
        this.id = id;
        this.ad = ad;
        this.yazar = yazar;
        this.yayin = yayin;
    }

    Kitap(int id, String ad, String yazar, String yayin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getYayin() {
        return yayin;
    }

    public void setYayin(String yayin) {
        this.yayin = yayin;
    }
    
    
}*/
