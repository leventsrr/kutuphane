
//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class KitapIslemleri implements degisiklik{
    private Connection con = null ;
    private Statement satatement = null ;
    private PreparedStatement preparedStatement = null ;
    private java.sql.Statement statement;

    
    public ArrayList<Yonetici> yoneticileriGetir() {
        ArrayList<Yonetici> cikti = new ArrayList<Yonetici>() ;
        try {
            statement = con.createStatement();
            String sorgu = "Select * From ADMINLER" ;
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int id = rs.getInt("ID");
                String ad = rs.getString("USERNAME");
                String password = rs.getString("PASSWORD");
                cikti.add(new Yonetici(id, ad, password)) ;
            }
            return cikti ;
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null ;
        }
    }
    
    
    
    @Override
    public ArrayList<Kullanici> kullanicilariGetir() {
        ArrayList<Kullanici> cikti = new ArrayList<Kullanici>() ;
        try {
            statement = con.createStatement();
            String sorgu = "Select * From KULLANICILAR" ;
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int id = rs.getInt("ID");
                String ad = rs.getString("USERNAME");
                String password = rs.getString("PASSWORD");
                cikti.add(new Kullanici(id, ad, password)) ;
            }
            return cikti ;
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null ;
        }
    }
    @Override
    public ArrayList<Kitap> kitaplariGetir() {
        ArrayList<Kitap> cikti = new ArrayList<Kitap>() ;
        try {
            statement = con.createStatement();
            String sorgu = "Select * From KITAPLAR" ;
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int id = rs.getInt("ID");
                String ad = rs.getString("AD");
                String yazar = rs.getString("YAZAR") ;
                String yayin = rs.getString("YAYIN") ;
                String alan = rs.getString("ALAN") ;
                String iletisim = rs.getString("ILETISIM") ;
                String tarih = rs.getString("TARIH") ;
                cikti.add(new Kitap(id, ad, yazar, yayin,alan,iletisim,tarih)) ;
            }
            return cikti ;
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null ;
        }
    }
    
    
    
    public final void  kullaniciGuncelle(int id, String yeni_ad, String yeni_sifre) {
        String sorgu = "Update KULLANICILAR set USERNAME = ? , PASSWORD = ? where ID = ?" ;
        
        try {
            preparedStatement = (PreparedStatement) con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, yeni_sifre);
            preparedStatement.setInt(3, id);
            
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public final void  yoneticiGuncelle(int id, String yeni_ad, String yeni_sifre) {
        String sorgu = "Update ADMINLER set USERNAME = ? , PASSWORD = ? where ID = ?" ;
        
        try {
            preparedStatement = (PreparedStatement) con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, yeni_sifre);
            preparedStatement.setInt(3, id);
            
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    @Override
    public final void  kitapGuncelle(int id, String yeni_ad, String yeni_yazar, String yeni_yayin, String alan, String iletisim, String tarih) {
        String sorgu = "Update KITAPLAR set AD = ? , YAZAR = ? , YAYIN = ? , ALAN = ? , ILETISIM = ? , TARIH = ? where ID = ?" ;
        
        try {
            preparedStatement = (PreparedStatement) con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, yeni_yazar);
            preparedStatement.setString(3, yeni_yayin);
            preparedStatement.setString(4, alan);
            preparedStatement.setString(5, iletisim);
            preparedStatement.setString(6, tarih);
            preparedStatement.setInt(7, id);
            
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public final void kitapSil(int id) {
        String sorgu = "Delete from KITAPLAR where ID = ? ";
        try {
            preparedStatement=(PreparedStatement) con.prepareCall(sorgu);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public final void kullaniciSil(int id) {
        String sorgu = "Delete from KULLANICILAR where ID = ? ";
        try {
            preparedStatement=(PreparedStatement) con.prepareCall(sorgu);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public final void yoneticiSil(int id) {
        String sorgu = "Delete from ADMINLER where ID = ? ";
        try {
            preparedStatement=(PreparedStatement) con.prepareCall(sorgu);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public final void yoneticiEkle(String ad, String sifre) {
        String sorgu = "Insert Into ADMINLER (USERNAME,PASSWORD) VALUES (?,?)" ;
        try {
            preparedStatement = (PreparedStatement) con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, sifre);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    @Override
    public final void kitapEkle(String ad, String yazar, String yayin, String alan, String iletisim, String tarih) {
        String sorgu = "Insert Into KITAPLAR (AD,YAZAR,YAYIN,ALAN,ILETISIM,TARIH) VALUES (?,?,?,?,?,?)" ;
        try {
            preparedStatement = (PreparedStatement) con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, yazar);
            preparedStatement.setString(3, yayin);
            preparedStatement.setString(4, alan);
            preparedStatement.setString(5, iletisim);
            preparedStatement.setString(6, tarih);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public final void kullaniciEkle(String ad, String parola){
        String sorgu = "Insert Into kullanıcılar (username,password) VALUES (?,?)" ;
        try {
            preparedStatement = (PreparedStatement) con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, parola);
            
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public boolean girisYap(String kullanici_adi, String parola) {
        String sorgu = "Select * From ADMINLER where username = ? and password = ?";
        try {
            preparedStatement = (PreparedStatement) con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, parola);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false ;
        }
    }

    @Override
    public boolean girisYap2(String kullanici_adi, String parola) {
        String sorgu = "Select * From kullanıcılar where username = ? and password = ?";
        try {
            preparedStatement = (PreparedStatement) con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, parola);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false ;
        }
    }

    //@Override
    public KitapIslemleri() {
        //String url = "jdbc:mysql://" + DataBase.host + ":" + DataBase.port + "/" + DataBase.db_ismi + "?useUnicode=true&characterEncoding=utf8" ;
        
        String url="jdbc:oracle:thin:@localhost:1521:XE";
     /*   try{
            Class.forName("com.mysql.jdbc.Driver") ;

        }catch(ClassNotFoundException ex){
            System.out.println("Driver Bulunamadı....");
        }
        */
        try{
            con = DriverManager.getConnection(url,DataBase.kullanici_adi,DataBase.parola);
            System.out.println("Bağlantı Başarılı....");
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        KitapIslemleri islemler = new KitapIslemleri() {};
    }

    
    
    
    
}
