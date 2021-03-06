
import com.sun.imageio.plugins.png.RowFilter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class KitapEkrani extends javax.swing.JDialog {
    
    DefaultTableModel model ;
    DefaultTableModel model2;
    DefaultTableModel model3;
    KitapIslemleri islemler = new KitapIslemleri() {} ;
    
    public KitapEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel)kitap_tablosu.getModel();
        model2 = (DefaultTableModel)kullanici_tablosu.getModel();
        model3 = (DefaultTableModel)yonetici_tablosu.getModel();
        kullaniciGoruntule();
        kitapGoruntule();
        yoneticiGoruntule();
        
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        kitap_tablosu = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ad_alani = new javax.swing.JTextField();
        yazar_alani = new javax.swing.JTextField();
        yayin_alani = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        kitapekle = new javax.swing.JButton();
        guncelle = new javax.swing.JButton();
        sil = new javax.swing.JButton();
        temizle = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kitabi_alan = new javax.swing.JTextField();
        alanin_bilgisi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        alinan_tarih = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        kullanici_tablosu = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kullanici_adi_degistir = new javax.swing.JTextField();
        kullanici_sifre_degistir = new javax.swing.JTextField();
        kullanici_guncelle = new javax.swing.JButton();
        kullanici_sil = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        yonetici_tablosu = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        yonetici_isim_degistir = new javax.swing.JTextField();
        yonetici_sifre_degistir = new javax.swing.JTextField();
        yonetici_bilgi_degistir = new javax.swing.JButton();
        yonetici_sil = new javax.swing.JButton();
        yonetici_ekle_butonu = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kitaplar");
        setLocation(new java.awt.Point(100, 10));
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1100, 707));
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kitap_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Ad", "Yazar", "Yay??n", "Alan Ki??i", "??leti??im", "Tarih"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kitap_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kitap_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kitap_tablosu);
        if (kitap_tablosu.getColumnModel().getColumnCount() > 0) {
            kitap_tablosu.getColumnModel().getColumn(0).setResizable(false);
            kitap_tablosu.getColumnModel().getColumn(1).setResizable(false);
            kitap_tablosu.getColumnModel().getColumn(2).setResizable(false);
            kitap_tablosu.getColumnModel().getColumn(3).setResizable(false);
            kitap_tablosu.getColumnModel().getColumn(4).setResizable(false);
            kitap_tablosu.getColumnModel().getColumn(5).setResizable(false);
            kitap_tablosu.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 203, 556, 303));

        arama_cubugu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arama_cubuguActionPerformed(evt);
            }
        });
        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });
        getContentPane().add(arama_cubugu, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 533, 235, -1));

        jTextField1.setEditable(false);
        jTextField1.setText("              Kitap Arama B??l??m??");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 533, 246, -1));

        jLabel1.setText("Kitap Ad??");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 60, 28));

        jLabel2.setText("Kitap Yazar??");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 41, -1, 21));

        jLabel3.setText("Yay??n evi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 69, 56, 19));

        ad_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad_alaniActionPerformed(evt);
            }
        });
        getContentPane().add(ad_alani, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 18, 183, -1));
        getContentPane().add(yazar_alani, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 41, 183, 21));
        getContentPane().add(yayin_alani, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 69, 183, -1));

        mesaj_yazisi.setBackground(new java.awt.Color(0, 0, 204));
        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(mesaj_yazisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1051, 203, 299, 21));

        kitapekle.setBackground(java.awt.Color.blue);
        kitapekle.setForeground(new java.awt.Color(255, 255, 255));
        kitapekle.setText("Yeni Kitap Ekle");
        kitapekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapekleActionPerformed(evt);
            }
        });
        getContentPane().add(kitapekle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 95, 255, -1));

        guncelle.setBackground(java.awt.Color.blue);
        guncelle.setForeground(new java.awt.Color(255, 255, 255));
        guncelle.setText("Se??ili Kitap Bilgilerini G??ncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });
        getContentPane().add(guncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 173, 183, 23));

        sil.setBackground(java.awt.Color.blue);
        sil.setForeground(new java.awt.Color(255, 255, 255));
        sil.setText("Se??ili Kitab?? Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });
        getContentPane().add(sil, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 174, 278, -1));

        temizle.setBackground(java.awt.Color.red);
        temizle.setForeground(new java.awt.Color(255, 255, 255));
        temizle.setText("Temizle");
        temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleActionPerformed(evt);
            }
        });
        getContentPane().add(temizle, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 134, 282, -1));

        jLabel4.setText("Kitab?? Alan Ki??i");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 13, 124, 28));

        jLabel5.setText("Alan Ki??inin ??leti??im Bilgileri");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 41, -1, 20));
        getContentPane().add(kitabi_alan, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 22, 133, -1));
        getContentPane().add(alanin_bilgisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 42, 133, -1));

        jLabel6.setText("Al??m Tarihi");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 72, 124, -1));
        getContentPane().add(alinan_tarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 69, 133, -1));

        kullanici_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kullan??c?? ID", "Kullan??c?? Ad??", "Kullan??c?? Parolas??"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kullanici_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullanici_tablosuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(kullanici_tablosu);
        if (kullanici_tablosu.getColumnModel().getColumnCount() > 0) {
            kullanici_tablosu.getColumnModel().getColumn(0).setResizable(false);
            kullanici_tablosu.getColumnModel().getColumn(1).setResizable(false);
            kullanici_tablosu.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 13, 346, 170));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 0, -1, 686));

        jLabel7.setText("Kullan??c?? Ad??");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 138, -1));

        jLabel8.setText("Kullan??c?? ??ifresi");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 129, -1));
        getContentPane().add(kullanici_adi_degistir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 188, -1));
        getContentPane().add(kullanici_sifre_degistir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 188, -1));

        kullanici_guncelle.setBackground(new java.awt.Color(51, 51, 255));
        kullanici_guncelle.setForeground(new java.awt.Color(255, 255, 255));
        kullanici_guncelle.setText("Se??ili Kullan??c?? Bilgilerini G??ncelle");
        kullanici_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_guncelleActionPerformed(evt);
            }
        });
        getContentPane().add(kullanici_guncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 210, -1));

        kullanici_sil.setBackground(new java.awt.Color(51, 51, 255));
        kullanici_sil.setForeground(new java.awt.Color(255, 255, 255));
        kullanici_sil.setText("Se??ili Kullan??c??y?? Sil");
        kullanici_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_silActionPerformed(evt);
            }
        });
        getContentPane().add(kullanici_sil, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 160, -1));

        yonetici_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Y??netici ID", "Y??netici Ad??", "Y??netici ????fresi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        yonetici_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yonetici_tablosuMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(yonetici_tablosu);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 360, 120));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, -1, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 400, 10));

        jLabel9.setText("Y??netici Ad??");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 70, 20));

        jLabel10.setText("Y??netici ??ifresi");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 70, 20));

        yonetici_isim_degistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yonetici_isim_degistirActionPerformed(evt);
            }
        });
        getContentPane().add(yonetici_isim_degistir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, 180, -1));
        getContentPane().add(yonetici_sifre_degistir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, 180, -1));

        yonetici_bilgi_degistir.setText("Se??ili Y??netici Bilgilerini G??ncelle");
        yonetici_bilgi_degistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yonetici_bilgi_degistirActionPerformed(evt);
            }
        });
        getContentPane().add(yonetici_bilgi_degistir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, -1, -1));

        yonetici_sil.setText("Se??ili Y??neticiyi Sil");
        yonetici_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yonetici_silActionPerformed(evt);
            }
        });
        getContentPane().add(yonetici_sil, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, 180, -1));

        yonetici_ekle_butonu.setText("Yonetici Ekle");
        yonetici_ekle_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yonetici_ekle_butonuActionPerformed(evt);
            }
        });
        getContentPane().add(yonetici_ekle_butonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 530, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arama_cubuguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arama_cubuguActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_cubuguActionPerformed
    public void dinamikAra(String ara){
    
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        kitap_tablosu.setRowSorter(tr);
        
        tr.setRowFilter(javax.swing.RowFilter.regexFilter(ara));
    }
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        
        String ara = arama_cubugu.getText();
        dinamikAra(ara);
       
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void ad_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad_alaniActionPerformed

    private void kitapekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapekleActionPerformed
        mesaj_yazisi.setText("");
        String ad = ad_alani.getText();
        String yazar = yazar_alani.getText();
        String yayin = yayin_alani.getText();
        String alan = kitabi_alan.getText();
        String iletisim = alanin_bilgisi.getText();
        String tarih =alinan_tarih.getText();
        
        islemler.kitapEkle(ad,yazar,yayin,alan,iletisim,tarih);
        kitapGoruntule();
        Kitap kitap = new Kitap(1, ad, yazar, yayin, alan, iletisim, tarih);
        mesaj_yazisi.setText(kitap.getAd() +" Adl?? Kitab??n Bilgileri Ba??ar??yla Eklendi");
    }//GEN-LAST:event_kitapekleActionPerformed

    private void kitap_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kitap_tablosuMouseClicked
        int selectedrow = kitap_tablosu.getSelectedRow();
        ad_alani.setText(model.getValueAt(selectedrow,1).toString());
        yazar_alani.setText(model.getValueAt(selectedrow,2).toString());
        yayin_alani.setText(model.getValueAt(selectedrow,3).toString());
        kitabi_alan.setText(model.getValueAt(selectedrow,4).toString());
        alanin_bilgisi.setText(model.getValueAt(selectedrow,5).toString());
        alinan_tarih.setText(model.getValueAt(selectedrow,6).toString());
        
    }//GEN-LAST:event_kitap_tablosuMouseClicked

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
        String ad = ad_alani.getText();
        String yazar = yazar_alani.getText();
        String yayin = yayin_alani.getText();
        String alan = kitabi_alan.getText();
        String alan_bilgisi = alanin_bilgisi.getText();
        String tarih = alinan_tarih.getText();
        
        int selectedrow = kitap_tablosu.getSelectedRow();
        if(selectedrow == -1){
            if(model.getRowCount() == 0){
                mesaj_yazisi.setText("Kitap Tablosu ??uanda Bo??");
            }
            else{
                mesaj_yazisi.setText("G??ncellenecek Kitab?? Se??in");
            }
        }
        int id = (int)model.getValueAt(selectedrow, 0);
        islemler.kitapGuncelle(id,ad,yazar,yayin,alan,alan_bilgisi,tarih);
        kitapGoruntule();
        mesaj_yazisi.setText("Kitap Bilgileri G??ncellendi");
    }//GEN-LAST:event_guncelleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
       mesaj_yazisi.setText("");
       int selectedrow = kitap_tablosu.getSelectedRow();
       if(selectedrow == -1){
           if(model.getRowCount() == 0){
               mesaj_yazisi.setText("Kitap Tablosu ??uanda Bo??");
           }
           else{
               mesaj_yazisi.setText("L??tfen Silinecek Kitab?? Se??in");
           }
       }
       else{
           int id = (int)model.getValueAt(selectedrow, 0);
           islemler.kitapSil(id);
           kitapGoruntule();
           mesaj_yazisi.setText("Kitap Silindi");
       }
    }//GEN-LAST:event_silActionPerformed

    private void temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleActionPerformed
        ad_alani.setText("");
        yazar_alani.setText("");
        yayin_alani.setText("");
        kitabi_alan.setText("");
        alanin_bilgisi.setText("");
        alinan_tarih.setText("");
    }//GEN-LAST:event_temizleActionPerformed

    private void kullanici_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullanici_tablosuMouseClicked
        int selectedrow = kullanici_tablosu.getSelectedRow();
        kullanici_adi_degistir.setText(model2.getValueAt(selectedrow,1).toString());
        kullanici_sifre_degistir.setText(model2.getValueAt(selectedrow,2).toString());
    }//GEN-LAST:event_kullanici_tablosuMouseClicked

    private void kullanici_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_silActionPerformed
       mesaj_yazisi.setText("");
       int selectedrow = kullanici_tablosu.getSelectedRow();
       if(selectedrow == -1){
           if(model.getRowCount() == 0){
               mesaj_yazisi.setText("Kullanici Tablosu ??uanda Bo??");
           }
           else{
               mesaj_yazisi.setText("L??tfen Silinecek Kullan??c??y?? Se??in");
           }
       }
       else{
           int id = (int)model2.getValueAt(selectedrow, 0);
           islemler.kullaniciSil(id);
           kullaniciGoruntule();
           mesaj_yazisi.setText("Kullanici Silindi");
       }
    }//GEN-LAST:event_kullanici_silActionPerformed

    private void kullanici_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_guncelleActionPerformed
        String ad = kullanici_adi_degistir.getText();
        String sifre = kullanici_sifre_degistir.getText();
        
        int selectedrow = kullanici_tablosu.getSelectedRow();
        if(selectedrow == -1){
            if(model2.getRowCount() == 0){
                mesaj_yazisi.setText("Kullan??c?? Tablosu ??uanda Bo??");
            }
            else{
                mesaj_yazisi.setText("G??ncellenecek Kullan??c??y?? Se??in");
            }
        }
        int id = (int)model2.getValueAt(selectedrow, 0);
        islemler.kullaniciGuncelle(id,ad,sifre);
        kullaniciGoruntule();
        mesaj_yazisi.setText("Kullan??c?? Bilgileri G??ncellendi");
    }//GEN-LAST:event_kullanici_guncelleActionPerformed

    private void yonetici_isim_degistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yonetici_isim_degistirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yonetici_isim_degistirActionPerformed

    private void yonetici_ekle_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yonetici_ekle_butonuActionPerformed
        mesaj_yazisi.setText("");
        String ad = yonetici_isim_degistir.getText();
        String sifre = yonetici_sifre_degistir.getText();
        
        islemler.yoneticiEkle(ad,sifre);
        yoneticiGoruntule();
        Yonetici yonetici = new Yonetici(1, ad, sifre);
        mesaj_yazisi.setText(yonetici.getAd() +" Adl?? Y??neticinin Bilgileri Ba??ar??yla Eklendi");
    }//GEN-LAST:event_yonetici_ekle_butonuActionPerformed

    private void yonetici_bilgi_degistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yonetici_bilgi_degistirActionPerformed
        String ad = yonetici_isim_degistir.getText();
        String sifre = yonetici_sifre_degistir.getText();
        
        int selectedrow = yonetici_tablosu.getSelectedRow();
        if(selectedrow == -1){
            if(model3.getRowCount() == 0){
                mesaj_yazisi.setText("Y??netici Tablosu ??uanda Bo??");
            }
            else{
                mesaj_yazisi.setText("Y??netici Kullan??c??y?? Se??in");
            }
        }
        int id = (int)model3.getValueAt(selectedrow, 0);
        islemler.yoneticiGuncelle(id,ad,sifre);
        yoneticiGoruntule();
        mesaj_yazisi.setText("Yonetici Bilgileri G??ncellendi");
    }//GEN-LAST:event_yonetici_bilgi_degistirActionPerformed

    private void yonetici_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yonetici_tablosuMouseClicked
        int selectedrow = yonetici_tablosu.getSelectedRow();
        yonetici_isim_degistir.setText(model3.getValueAt(selectedrow,1).toString());
        yonetici_sifre_degistir.setText(model3.getValueAt(selectedrow,2).toString());
    }//GEN-LAST:event_yonetici_tablosuMouseClicked

    private void yonetici_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yonetici_silActionPerformed
       mesaj_yazisi.setText("");
       int selectedrow = yonetici_tablosu.getSelectedRow();
       if(selectedrow == -1){
           if(model3.getRowCount() == 0){
               mesaj_yazisi.setText("Y??netici Tablosu ??uanda Bo??");
           }
           else{
               mesaj_yazisi.setText("L??tfen Silinecek Y??neticiyi Se??in");
           }
       }
       else{
           int id = (int)model3.getValueAt(selectedrow, 0);
           islemler.yoneticiSil(id);
           yoneticiGoruntule();
           mesaj_yazisi.setText("Yonetici Silindi");
       }
    }//GEN-LAST:event_yonetici_silActionPerformed
    public void yoneticiGoruntule(){
        model3.setRowCount(0);
        ArrayList<Yonetici> yoneticiler = new ArrayList<Yonetici>();
        
        yoneticiler = islemler.yoneticileriGetir();
        if(yoneticiler != null){
            for(Yonetici yonetici : yoneticiler){
                Object[] eklenecek = {yonetici.getId(),yonetici.getAd(),yonetici.getPassword()} ;
                model3.addRow(eklenecek);
            }
        }
    
    }
    
    
    
    public void kullaniciGoruntule(){
        model2.setRowCount(0);
        ArrayList<Kullanici> kullanicilar = new ArrayList<Kullanici>();
        
        kullanicilar = islemler.kullanicilariGetir();
        if(kullanicilar != null){
            for(Kullanici kullanici : kullanicilar){
                Object[] eklenecek = {kullanici.getId(),kullanici.getAd(),kullanici.getPassword()} ;
                model2.addRow(eklenecek);
            }
        }
    
    }
    public void kitapGoruntule(){
        
        model.setRowCount(0);
        ArrayList<Kitap> kitaplar = new ArrayList<Kitap>();
        
        kitaplar = islemler.kitaplariGetir();
        if(kitaplar != null){
            for(Kitap kitap : kitaplar){
                Object[] eklenecek = {kitap.getId(),kitap.getAd(),kitap.getYazar(),kitap.getYayin(),kitap.getAlan(),kitap.getIletisim(),kitap.getTarih()} ;
                model.addRow(eklenecek);
            }
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KitapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KitapEkrani dialog = new KitapEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alani;
    private javax.swing.JTextField alanin_bilgisi;
    private javax.swing.JTextField alinan_tarih;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JButton guncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField kitabi_alan;
    private javax.swing.JTable kitap_tablosu;
    private javax.swing.JButton kitapekle;
    private javax.swing.JTextField kullanici_adi_degistir;
    private javax.swing.JButton kullanici_guncelle;
    private javax.swing.JTextField kullanici_sifre_degistir;
    private javax.swing.JButton kullanici_sil;
    private javax.swing.JTable kullanici_tablosu;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JButton sil;
    private javax.swing.JButton temizle;
    private javax.swing.JTextField yayin_alani;
    private javax.swing.JTextField yazar_alani;
    private javax.swing.JButton yonetici_bilgi_degistir;
    private javax.swing.JButton yonetici_ekle_butonu;
    private javax.swing.JTextField yonetici_isim_degistir;
    private javax.swing.JTextField yonetici_sifre_degistir;
    private javax.swing.JButton yonetici_sil;
    private javax.swing.JTable yonetici_tablosu;
    // End of variables declaration//GEN-END:variables
}
