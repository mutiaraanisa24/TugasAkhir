/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pembayaranlistrik;

/**
 *
 * @author Administrator
 */
import java.sql.*;
import javax.swing.*;
import java.util.Date;
import javax.swing.table.*;
public class FrmTransaksi extends javax.swing.JFrame {

    /**
     * Creates new form FrmTransaksi
     */
    public Connection conn;
    public Statement cn;
    public FrmTransaksi() {
        initComponents();
        bersih();
        tampildata();
    }
    
    public void koneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/listrikdb","root","");
            cn=conn.createStatement();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"koneksi gagal");
           System.out.println(e.getMessage());
        }
        
    }
    
    public void bersih(){
       jTextField1.setText("");
       jTextField2.setText("");
       jTextField3.setText("");
       jTextField4.setText("");
       jTextField5.setText("");
       jTextField6.setText("");
       jTextField7.setText("");
       jTextField8.setText("");
    }

        public void tampildata(){
        DefaultTableModel tablenya = new DefaultTableModel();
        tablenya.addColumn("no_pembayaran");
        tablenya.addColumn("id_petugas");
        tablenya.addColumn("tanggal_pembayaran");
        tablenya.addColumn("id_pel");
        tablenya.addColumn("kode_daya");
        tablenya.addColumn("tagihan");
        tablenya.addColumn("administrasi");
        tablenya.addColumn("total_bayar");
        try{
            koneksi();
            String sql = "Select*from pembayarantb";
            ResultSet rs =cn.executeQuery(sql);
            while (rs.next())
            {
                tablenya.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
            }jTable1.setModel(tablenya);
            
            }
            catch(Exception e){
           JOptionPane.showMessageDialog(null,"pak angga anda salah");
                
        }
        }
        
        


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("No Pembayaran");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 113, 76, 14);

        jLabel2.setText("ID Petugas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 139, 53, 14);

        jLabel3.setText("Tanggal Pembayaran");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 159, 101, 14);

        jLabel4.setText("ID Pelanggan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 185, 64, 14);

        jLabel5.setText("Kode Daya");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 216, 52, 14);

        jLabel6.setText("Tagihan");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 242, 38, 14);

        jLabel7.setText("Administrasi");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 268, 57, 14);

        jLabel8.setText("Total Bayar");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 294, 55, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(197, 110, 161, 20);

        jTextField2.setText("01VP");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(197, 136, 161, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(197, 156, 161, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(197, 182, 161, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(197, 213, 161, 20);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(197, 239, 161, 20);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(197, 265, 161, 20);

        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(197, 291, 161, 20);

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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(580, 53, 711, 338);

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(422, 54, 67, 45);

        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(422, 100, 67, 45);

        jButton3.setText("Tutup");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(422, 148, 67, 41);

        jLabel9.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel9.setText("Transaksi pembayaran");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 54, 315, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        koneksi();
        String sql ="insert into pembayarantb values('"+jTextField1.getText()+"','"+jTextField2.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"','"+jTextField5.getText()+"','"+jTextField6.getText()+"','"+jTextField7.getText()+"','"+jTextField8.getText()+"')";
        cn.executeUpdate(sql);
        conn.close();
        
        tampildata();
        bersih();
        JOptionPane.showMessageDialog(null, "owhhh yesss berhasilll");
        }
    catch (Exception e){
        JOptionPane.showMessageDialog(null, "koneksi ne gagal");
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
        koneksi();
        String sql ="delete from pembayarantb where no_pembayaran = ('"+jTextField1.getText()+"')";
        cn.executeUpdate(sql);
        conn.close();
        
        tampildata();
        bersih();
        JOptionPane.showMessageDialog(null, "owhhh yesss berhasilll");
        }
    catch (Exception e){
        JOptionPane.showMessageDialog(null, "koneksi ne gagal");
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
        // TODO add your handling code here:
        int text6 = Integer.parseInt(jTextField6.getText());
        int text7 = Integer.parseInt(jTextField7.getText());
        int hasil = text6+text7;
        jTextField8.setText(String.valueOf(hasil));
    }//GEN-LAST:event_jTextField8MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmTransaksi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
