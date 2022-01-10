//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public interface degisiklik {
    
    public ArrayList<Kullanici> kullanicilariGetir();
    public ArrayList<Kitap> kitaplariGetir();
    public void kitapGuncelle(int id,String yeni_ad,String yeni_yazar,String yeni_yayin,String alan ,String iletisim ,String tarih);
    public void kitapSil(int id);
    public void kitapEkle(String ad,String yazar ,String yayin, String alan ,String iletisim,String tarih);
    public boolean girisYap(String kullanici_adi,String parola);
    public boolean girisYap2(String kullanici_adi,String parola);
    /*public KitapIslemleri(){
        
        String url = "jdbc:mysql://" + DataBase.host + ":" + DataBase.port + "/" + DataBase.db_ismi + "?useUnicode=true&characterEncoding=utf8" ;
        
        try{
            Class.forName("com.mysql.jdbc.Driver") ;
            
        }catch(ClassNotFoundException ex){
            System.out.println("Driver Bulunamadı....");
        }
        
        try{
            con = DriverManager.getConnection(url,DataBase.kullanici_adi,DataBase.parola);
            System.out.println("Bağlantı Başarılı....");
        }catch(SQLException ex){
            System.out.println("Bağlantı Başarısız....");
        }
        
        
    }*/
}
