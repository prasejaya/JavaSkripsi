/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Have
 */
public class MenuFold extends javax.swing.JFrame {
    
    String line;
    List<String[]> listdata = new ArrayList<>();    
    List<String[]> listdatafuzzy = new ArrayList<>();
    private float age,kelas,direct_bilirubin, albumin, albumin_globulin_ratio, total_protiens, total_bilirubin, alamine_aminotransferase, aspartate_aminotransferase, alkaline_phosphotase;
    private String gender;
    Fuzzy c = new Fuzzy();
    /**
     * Creates new form MenuFold
     */
    public MenuFold() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fold 1");

        jLabel2.setText("Fold 2");

        jLabel3.setText("Fold 3");

        jLabel4.setText("Fold 4");

        jLabel5.setText("Fold 5");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Training", "Testing" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Training", "Testing" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Training", "Testing" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Training", "Testing" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Training", "Testing" }));

        jLabel6.setText("Fold 6");

        jLabel7.setText("Fold 7");

        jLabel8.setText(" Fold 8");

        jLabel9.setText("Fold 9");

        jLabel10.setText("Fold 10");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Training", "Testing" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Training", "Testing" }));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Training", "Testing" }));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Training", "Testing" }));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Training", "Testing" }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });

        jLabel12.setText("?r :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel13.setText("?n :");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jButton1)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        inputTeta();
        updateFold1();
        updateFold2();
        updateFold3();
        updateFold4();
        updateFold5();
        updateFold6();
        updateFold7();
        updateFold8();
        updateFold9();
        updateFold10();
        fuzzyTraining();
        entropy();
        gain();
        rule();
        hitungakurasiperfold();
        Menu2 page=new Menu2();
        page.setBounds(400, 400, 600, 600);
        page.setVisible(true);
    }                                        

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           
    private void updateFold1(){
        if(jComboBox1.getSelectedIndex() == 0){
            String fold = "1";
            String status = "Training";
            updateDataFold(fold,status);
        }else{
            String fold = "1";            
            String status = "Testing";
            updateDataFold(fold,status);
        }
    }
   private void updateFold2(){
        if(jComboBox2.getSelectedIndex() == 0){
            String fold = "2";
            String status = "Training";
            updateDataFold(fold,status);
        }else{
            String fold = "2";            
            String status = "Testing";
            updateDataFold(fold,status);
        }
    }
   private void updateFold3(){
        if(jComboBox3.getSelectedIndex() == 0){
            String fold = "3";
            String status = "Training";
            updateDataFold(fold,status);
        }else{
            String fold = "3";            
            String status = "Testing";
            updateDataFold(fold,status);
        }
    }
   
   private void updateFold4(){
        if(jComboBox4.getSelectedIndex() == 0){
            String fold = "4";
            String status = "Training";
            updateDataFold(fold,status);
        }else{
            String fold = "4";            
            String status = "Testing";
            updateDataFold(fold,status);
        }
    }
   
   private void updateFold5(){
        if(jComboBox5.getSelectedIndex() == 0){
            String fold = "5";
            String status = "Training";
            updateDataFold(fold,status);
        }else{
            String fold = "5";            
            String status = "Testing";
            updateDataFold(fold,status);
        }
    }
   
   private void updateFold6(){
        if(jComboBox6.getSelectedIndex() == 0){
            String fold = "6";
            String status = "Training";
            updateDataFold(fold,status);
        }else{
            String fold = "6";            
            String status = "Testing";
            updateDataFold(fold,status);
        }
    }
   
   private void updateFold7(){
        if(jComboBox7.getSelectedIndex() == 0){
            String fold = "7";
            String status = "Training";
            updateDataFold(fold,status);
        }else{
            String fold = "7";            
            String status = "Testing";
            updateDataFold(fold,status);
        }
    }
   
   private void updateFold8(){
        if(jComboBox8.getSelectedIndex() == 0){
            String fold = "8";
            String status = "Training";
            updateDataFold(fold,status);
        }else{
            String fold = "8";            
            String status = "Testing";
            updateDataFold(fold,status);
        }
    }
   
   private void updateFold9(){
        if(jComboBox9.getSelectedIndex() == 0){
            String fold = "9";
            String status = "Training";
            updateDataFold(fold,status);
        }else{
            String fold = "9";            
            String status = "Testing";
            updateDataFold(fold,status);
        }
    }
   
   private void updateFold10(){
        if(jComboBox10.getSelectedIndex() == 0){
            String fold = "10";
            String status = "Training";
            updateDataFold(fold,status);
        }else{
            String fold = "10";            
            String status = "Testing";
            updateDataFold(fold,status);
        }
    }
    public void updateDataFold(String fold, String status){
        try {
            String sql ="UPDATE prosesfold SET status = '"+status+"' WHERE fold = '"+fold+"'";
            
            java.sql.Connection conn=(Connection)Koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            conn.close();
        } catch (Exception e) {
        }
    }
    private void inputTeta(){
         java.sql.Connection conn=(Connection)Koneksi.configDB();
       try{
           Integer tetar,tetan ;
           tetar = Integer.parseInt(jTextField1.getText());
           tetan = Integer.parseInt(jTextField2.getText());
           String sql = "Insert into result(type,keytable,`value`) values ('teta','tetar','"+tetar+"'),('teta','tetan','"+tetan+"')";
            java.sql.PreparedStatement run=conn.prepareStatement(sql);
            run.execute();
       }catch (Exception e) {
        }finally{
            try {
                if (conn !=null)
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(MenuFold.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
  
    private void simpan(String[] a){
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("simpan.txt"));
            for(int i=0; i<a.length; i++) {
                out.write(a[i]);
                out.newLine();
            }
            out.close();
        }
        catch (IOException ex) {
            System.out.println("");
        }
    }
     private void hitungakurasiperfold(){
        java.sql.Connection conn=(Connection)Koneksi.configDB();
        Integer number;
        Menu2 me = new Menu2();
        number = me.numProses();
          try {
            String sql = "select distinct(fold) from prosesfold where status = 'Testing' and prosespenelitian = "+number+"";
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            
            while(res.next()){ 
               akurasi(conn, Integer.parseInt(res.getString(0)));
            }
            
        } catch (Exception e) {
        }finally{
            try {
                if (conn !=null)
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(MenuFold.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     }
     private void fuzzyTraining(){
         java.sql.Connection conn=(Connection)Koneksi.configDB();
         Integer number;
        Menu2 me = new Menu2();
        number = me.numProses();
         try {
            String sql = "select idprosesfold,age,total_bilirubin,direct_bilirubin,alkaline_phosphotase,alamine_aminotransferase,aspartate_aminotransferase,total_protiens,albumin,albumin_and_globulin_ratio from prosesfold where status = 'Training' and prosespenelitian = "+number+"";
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            Fuzzy c = new Fuzzy();
            while(res.next()){ 
                fuzzyAge(conn,Float.parseFloat(res.getString(2)),Integer.parseInt(res.getString(1)));
                fuzzyTotalBilirubin(conn,Float.parseFloat(res.getString(3)),Integer.parseInt(res.getString(1)));
                fuzzyDirectBilirubin(conn,Float.parseFloat(res.getString(4)),Integer.parseInt(res.getString(1)));
                fuzzyAlkalinePhosphotase(conn,Float.parseFloat(res.getString(5)),Integer.parseInt(res.getString(1)));
                fuzzyAlamineAminotransferase(conn,Float.parseFloat(res.getString(6)),Integer.parseInt(res.getString(1)));
                fuzzyAspartateAminotransferase(conn,Float.parseFloat(res.getString(7)),Integer.parseInt(res.getString(1)));
                fuzzyTotalProtiens(conn,Float.parseFloat(res.getString(8)),Integer.parseInt(res.getString(1)));
                fuzzyAlbumin(conn,Float.parseFloat(res.getString(9)),Integer.parseInt(res.getString(1)));
                fuzzyAlbuminAndGlobulinRatio(conn,Float.parseFloat(res.getString(10)),Integer.parseInt(res.getString(1)));
            }
         }catch(Exception e){
         JOptionPane.showMessageDialog(this,e.getMessage());
         }finally{
            try {
                if (conn !=null)
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(MenuFold.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     }
     private void fuzzyAge(Connection conn,float age,int id){
          try{
           float age1,age2,age3;
            age1 = c.fuzzy(age, 15, 25);
            age2 = c.fuzzy1(age, 15, 25, 45, 55);
            age3 = c.fuzzy2(age, 45, 55);
           String sql = "Insert into fuzzy(label,`key`,category,idprosesfold,`value`) values ('Anak','Age','Fuzzy','"+id+"','"+age1+"'),('Muda','Age','Fuzzy','"+id+"','"+age2+"'),('Dewasa','Age','Fuzzy','"+id+"','"+age3+"')";
            java.sql.PreparedStatement run=conn.prepareStatement(sql);
            run.execute();
       }catch (Exception e) {
        }
     }
     private void fuzzyTotalBilirubin(Connection conn,float total_bilirubin,int id){
          try{
           float tb1,tb2;
            tb1 = c.fuzzy(total_bilirubin, 0.5f, 1.5f);
            tb2 = c.fuzzy2(total_bilirubin, 0.5f, 1.5f);
           String sql = "Insert into fuzzy(label,`key`,category,idprosesfold,`value`) values ('Normal','Total Bilirubin','Fuzzy','"+id+"','"+tb1+"'),('Abnormal','Total Bilirubin','Fuzzy','"+id+"','"+tb2+"')";
            java.sql.PreparedStatement run=conn.prepareStatement(sql);
            run.execute();
       }catch (Exception e) {
        }
     }
     private void fuzzyDirectBilirubin(Connection conn,float direct_bilirubin,int id){
          try{
           float tb1,tb2;
            tb1 = c.fuzzy(direct_bilirubin, 0.15f, 0.25f);
            tb2 = c.fuzzy2(direct_bilirubin, 0.15f, 0.25f);
           String sql = "Insert into fuzzy(label,`key`,category,idprosesfold,`value`) values ('Normal','Direct Bilirubin','Fuzzy','"+id+"','"+tb1+"'),('Abnormal','Direct Bilirubin','Fuzzy','"+id+"','"+tb2+"')";
            java.sql.PreparedStatement run=conn.prepareStatement(sql);
            run.execute();
       }catch (Exception e) {
        }
     }
     private void fuzzyAlkalinePhosphotase(Connection conn,float alkaline_phosphotase,int id){
          try{
           float ap1,ap2;
            ap1 = c.fuzzy1(alkaline_phosphotase, 25, 35,115,125);
            ap2 = c.fuzzy2(alkaline_phosphotase, 115, 125);
           String sql = "Insert into fuzzy(label,`key`,category,idprosesfold,`value`) values ('Normal','Alkaline Phosphotase','Fuzzy','"+id+"','"+ap1+"'),('Tinggi','Alkaline Phosphotase','Fuzzy','"+id+"','"+ap2+"')";
            java.sql.PreparedStatement run=conn.prepareStatement(sql);
            run.execute();
       }catch (Exception e) {
        }
     }
      private void fuzzyAlamineAminotransferase(Connection conn,float alamine_phosphotase,int id){
          try{
           float al1,al2;
            al1 = c.fuzzy(alamine_phosphotase, 42,52);
            al2 = c.fuzzy2(alamine_phosphotase, 42, 52);
           String sql = "Insert into fuzzy(label,`key`,category,idprosesfold,`value`) values ('Normal','Alamine Phosphotase','Fuzzy','"+id+"','"+al1+"'),('Tinggi','Alamine Phosphotase','Fuzzy','"+id+"','"+al2+"')";
            java.sql.PreparedStatement run=conn.prepareStatement(sql);
            run.execute();
       }catch (Exception e) {
        }
     }
      private void fuzzyAspartateAminotransferase(Connection conn,float taspartate_aminotransferase,int id){
          try{
           float as1,as2;
            as1 = c.fuzzy(aspartate_aminotransferase, 32, 42);
            as2 = c.fuzzy2(aspartate_aminotransferase, 32, 42);
           String sql = "Insert into fuzzy(label,`key`,category,idprosesfold,`value`) values ('Normal','Aspartate Aminotransferas','Fuzzy','"+id+"','"+as1+"'),('Abnormal','Aspartate Aminotransferase','Fuzzy','"+id+"','"+as2+"')";
            java.sql.PreparedStatement run=conn.prepareStatement(sql);
            run.execute();
       }catch (Exception e) {
        }
     }
      
     private void fuzzyTotalProtiens(Connection conn,float total_protiens,int id){
          try{
           float tp1,tp2,tp3;
            tp1 = c.fuzzy(total_protiens, 5.5f, 6.5f);
            tp2 = c.fuzzy1(total_protiens, 5.5f, 6.5f,7.5f,8.5f);
            tp3 = c.fuzzy2(total_protiens,  5.5f, 6.5f);
           String sql = "Insert into fuzzy(label,`key`,category,idprosesfold,`value`) values ('Rendah','Total Protiens','Fuzzy','"+id+"','"+tp1+"'),('Normal','Total Protiens','Fuzzy','"+id+"','"+tp2+"'),('Tinggi','Total Protiens','Fuzzy','"+id+"','"+tp2+"')";
            java.sql.PreparedStatement run=conn.prepareStatement(sql);
            run.execute();
       }catch (Exception e) {
        }
     }
     private void fuzzyAlbumin(Connection conn,float albumin,int id){
          try{
           float ab1,ab2,ab3;
            ab1 = c.fuzzy(albumin, 2.9f,3.9f);
            ab2 = c.fuzzy1(albumin, 2.9f,3.9f,4.3f,5.3f);
            ab3 = c.fuzzy2(albumin, 2.9f,3.9f);
           String sql = "Insert into fuzzy(label,`key`,category,idprosesfold,`value`) values ('Rendah','Albumin','Fuzzy','"+id+"','"+ab1+"'),('Normal','Albumin','Fuzzy','"+id+"','"+ab2+"'),('Tinggi','Albumin','Fuzzy','"+id+"','"+ab3+"')";
            java.sql.PreparedStatement run=conn.prepareStatement(sql);
            run.execute();
       }catch (Exception e) {
        }
     }
      private void fuzzyAlbuminAndGlobulinRatio(Connection conn,float albumin_and_globulin_ratio,int id){
          try{
           float abg1,abg2;
            abg1 = c.fuzzy(albumin_and_globulin_ratio, 0.5f,1.5f);
            abg2 = c.fuzzy2(albumin_and_globulin_ratio,0.5f,1.5f);
           String sql = "Insert into fuzzy(label,`key`,category,idprosesfold,`value`) values ('Normal','Albumin and Global Ratio','Fuzzy','"+id+"','"+abg1+"'),('Abnormal','Albumin and Global Ratio,Fuzzy,'"+id+"','"+abg2+"')";
            java.sql.PreparedStatement run=conn.prepareStatement(sql);
            run.execute();
       }catch (Exception e) {
        }
     }
     private void gain(){
          try {
            String sql = "select sum() where status = 'Testing' ";
            java.sql.Connection conn=(Connection)Koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
          }catch (Exception e) {
              
        }
     }
     private void entropy(){
          try {
            String sql = "select sum() where status = 'Testing' ";
            java.sql.Connection conn=(Connection)Koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
          }catch (Exception e) {
              
        }
     }
     private void rule(){
         try {
            String sql = "select max(value) as rule from result where type = 'Gain'";
            java.sql.Connection conn=(Connection)Koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                
            }
          }catch (Exception e) {
              
        }
     }
     private void akurasi(Connection conn, Integer fold){
          try {
            Integer kelas,prediksi;
            Float tp,tn,fp,fn,akurasidata;
            kelas = 0;
            tp = null;
            tn = null;
            fp = null;
            fn = null;
            prediksi = 0;
            String sql = "select dataset,prediksi from prosesfold where fold ='"+fold+"'";
//            java.sql.Connection conn=(Connection)Koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                kelas = Integer.parseInt(res.getString(1));
                prediksi = Integer.parseInt(res.getString(2));
                if (kelas == 1 && prediksi == 1){
                    tp = tp + 1;
                }else if (kelas == 2 && prediksi == 1){
                    fp  = tn + 1;
                }else if (kelas == 1 && prediksi == 2){
                    fn = fn + 1;
                } else if (kelas == 2 && prediksi == 2){
                    tn = tn + 1;
                }
            }
                akurasidata = ((tn + tp) / (fp + fn))*100;
            String sql1 = "Insert into result(type,value,keytable) values ('akurasi','"+akurasidata+"','fold ke','"+fold+"')";
            java.sql.PreparedStatement pst;
             pst = conn.prepareStatement(sql1);
            pst.execute();      
        } catch (Exception e) {
        }
     }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuFold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFold().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}