/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsi;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.floor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Have
 */
public class Menu extends javax.swing.JFrame {
    String line;
    List<String[]> listdata = new ArrayList<>();    
    List<String[]> listdatafuzzy = new ArrayList<>();
    String[] tbHeader = {"Age", "Gender", "Total Bilirubin", "Direct Bilirubin", "Alkaline Phosphotase", "Alamine Aminotransferase", "Aspartate Aminotransferase", "Total Protiens", "Albumin", "Albumin and Globulin Ratio", "Class"};
    String teta_r, teta_n;
    String[] dataArray;
    private Object conn;
    private Object pst;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        jButton1.setVisible(false);
       //jButton2.setOpaque(true);
        deleteData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose File (*.csv).......");

        jButton2.setText("Upload");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Dibagi 10 Fold");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(72, 72, 72)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //ini untuk memasukkan ke tiap foldnya
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      insertData();
      this.setVisible(false);
      MenuFold page=new MenuFold();
      page.setBounds(400, 400, 400, 400);
      page.setVisible(true);
      
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser open = new JFileChooser();
        open.setMultiSelectionEnabled(true);
        int option = open.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = open.getSelectedFile();
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                while((line=br.readLine())!=null){
                    String[] dataaArray=line.split(",");
                    getDataTrain a = new getDataTrain();
                    a.setage(Integer.parseInt(dataaArray[0]));
                    a.setgender(dataaArray[1]);
                    a.settotal_bilirubin(Float.parseFloat(dataaArray[2]));
                     a.setdirect_bilirubin(Float.parseFloat(dataaArray[3]));
                     a.setalkaline_phosphotase(Integer.parseInt(dataaArray[4]));
                    a.setalamine_aminotransferase(Integer.parseInt(dataaArray[5]));
                    a.setaspartate_aminotransferase(Integer.parseInt(dataaArray[6]));
                    a.settotal_protiens(Float.parseFloat(dataaArray[7]));
                    a.setalbumin(Float.parseFloat(dataaArray[8]));
                    a.setalbumin_globulin_ratio(Float.parseFloat(dataaArray[9]));
                    a.setkelas(Integer.parseInt(dataaArray[10]));
                    listdata.add(dataaArray);
                } 
            }catch (IOException ex) {
                System.out.println("problem accessing file" + file.getAbsolutePath());
            }
            setupTabel1();
            jButton1.setVisible(true);
            jButton2.setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
     public int setFold(int number1, double number2){
         Integer angka = 0;
         if ( number1 <= number2 ) {
                angka = 1;
         }else if (number1 > number2 && number1 <= (number2*2)){
               angka = 2;
         }else if (number1 > (number2*2) && number1 <= (number2*3)){
               angka = 3;
         }else if (number1 > (number2*3) && number1 <= (number2*4)){
               angka = 4;
         }else if (number1 > (number2*4) && number1 <= (number2*5)){
               angka = 5;
         }else if (number1 > (number2*5) && number1 <= (number2*6)){
               angka = 6;
         }else if (number1 > (number2*6) && number1 <= (number2*7)){
               angka = 7;
         }else if (number1 > (number2*7) && number1 <= (number2*8)){
               angka = 8;
         }else if (number1 > (number2*8) && number1 <= (number2*9)){
               angka = 9;
         }else if (number1 > (number2*9) && number1 <= (number2*10)){
                angka = 10;
         }
         return angka;
     }
     public void deleteData(){
          java.sql.Connection conn=(Connection)Koneksi.configDB();
       try{
           truncate(conn,"prosesfold");
           truncate(conn,"fuzzy");
           truncate(conn,"result");
           truncate(conn,"bahanmentah");
           truncate(conn,"temp1");
           truncate(conn,"temp2");
           truncate(conn,"temp3");
           truncate(conn,"temp4");
           truncate(conn,"temp5");
           truncate(conn,"temp6");
           truncate(conn,"temp7");
           truncate(conn,"temp8");
           truncate(conn,"temp9");
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
     
     private void truncate(Connection conn,String table){
         try{
            String sql = "truncate "+table;
            java.sql.PreparedStatement pst;
             pst = conn.prepareStatement(sql);
            pst.execute();
         }catch(Exception e){
         }
     }
     
     public void insertData(){
         java.sql.Connection conn=(Connection)Koneksi.configDB();
       try{
           Integer jk ;
            //int rows= jTable1.getRowCount();
         double rows=Math.floor(jTable1.getRowCount()/10)*10;
       
         double col = rows/10;
//         for (int j = 1;j>=10;j++) {
         int angka = 0;
         int num = 0;
         for(int row = 0; row<rows; row++)
         { 
           String JK = jTable1.getValueAt(row, 1).toString();   
           if(JK.equals("Female")){
             jk = 1;
           }else{
             jk = 0;
           }
           angka++;
           num = setFold(angka,col);
           Integer age = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
           Integer gender= jk;
           Float total_bilirubin = Float.parseFloat(jTable1.getValueAt(row, 2).toString());
           Float directbilirubin = Float.parseFloat(jTable1.getValueAt(row, 3).toString());
           Float alkalinephosphotase = Float.parseFloat(jTable1.getValueAt(row, 4).toString());
           Float alamineaminotransferase = Float.parseFloat(jTable1.getValueAt(row, 5).toString());
           Float aspartateaminotransferase= Float.parseFloat(jTable1.getValueAt(row,6).toString());
           Float totalprotien = Float.parseFloat(jTable1.getValueAt(row, 7).toString());
           Float albumin = Float.parseFloat(jTable1.getValueAt(row, 8).toString());
           Float albuminandglobulinratio = Float.parseFloat(jTable1.getValueAt(row, 9).toString());
           Integer kelas = Integer.parseInt(jTable1.getValueAt(row, 10).toString());
           String sql = "Insert into bahanmentah(age,gender,direct_bilirubin,alkaline_phosphotase,alamine_aminotransferase,aspartate_aminotransferase,total_protiens,total_bilirubin,albumin,albumin_and_globulin_ratio,fold,dataset) values ('"+age+"','"+gender+"','"+directbilirubin+"','"+alkalinephosphotase+"','"+alamineaminotransferase+"','"+aspartateaminotransferase+"','"+totalprotien+"','"+total_bilirubin+"','"+albumin+"','"+albuminandglobulinratio+"','"+num+"','"+kelas+"')";
           
           java.sql.PreparedStatement run=conn.prepareStatement(sql);
           run.execute();
          
        
         }
           JOptionPane.showMessageDialog(null, "Proses Peyimpanan berhasil. Silahkan tentukan fold");
         //}
       }
       catch(Exception e){
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
     
     public void insertProsesFold(){
          java.sql.Connection conn=(Connection)Koneksi.configDB();
       try{
           
       } catch(Exception e){
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
     
     private void setupTabel1() {
        Object[][] data = new Object[listdata.size()][11];
        int i = 0;
        for (String[] baris : listdata) {
            for (int j=0; j<11; j++) {
                data[i][j] = baris[j];
            }
            i++;
        }
        DefaultTableModel tableModel = new DefaultTableModel(data, tbHeader);
        jTable1.setModel(tableModel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void If(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}