package main;

import java.io.File;
import koneksi.koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author anfau
 */
public class pengembalian extends javax.swing.JFrame {

    /**
     * Creates new form pengembalian
     */
    public pengembalian() {
        initComponents();
        tampilan();
        clear();
    }

    public final Connection conn = new koneksi().getConnection();
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    DefaultTableModel tabMode;
    
     public void tampilan(){
        Object [] baris = {"id_pengembalian", "id_penyewa","id_transaksi","konfirmasi"};
        tabMode = new DefaultTableModel(null, baris);
        tbpengem.setModel(tabMode);
        try {
                String sql = "SELECT * FROM tabel_pengembalian";
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()){
                        String ipe = rs.getString("id_pengembalian");
                        String ip = rs.getString("id_penyewa");
                        String it = rs.getString("id_transaksi");
                        String ks = rs.getString("konfirmasi");
  

                        Object [] data = {ipe,ip,it,ks};
                        tabMode.addRow(data);
                }
        } catch (Exception e){
                System.out.println(e.toString());
        }
    }
    
    public void clear(){
         txtidpengem.setText(null);
        txtidpeny.setText(null);
        txtidtrans.setText(null);
        cmbkom.setSelectedItem("Pilih");
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtidpengem = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtidpeny = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtidtrans = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnkembali = new javax.swing.JButton();
        cmbkom = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbpengem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pengembalian Mobil"));

        txtidpengem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpengemActionPerformed(evt);
            }
        });

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Pengembalian");

        txtidpeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpenyActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Penyewa");

        jLabel3.setText("ID Transaksi");

        jLabel4.setText("Konfirmasi");

        btnkembali.setText("Kembali");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });

        cmbkom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "KONFIRMASI", "TIDAK KONFIRMASI" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btnsimpan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtidpeny, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtidpengem))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtidtrans, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(cmbkom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnhapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnedit)
                        .addGap(18, 18, 18)
                        .addComponent(btnclear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnkembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(btnkeluar)
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidpengem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtidtrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidpeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(cmbkom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnhapus)
                    .addComponent(btnedit)
                    .addComponent(btnclear)
                    .addComponent(btnkeluar)
                    .addComponent(btnkembali)))
        );

        tbpengem.setModel(new javax.swing.table.DefaultTableModel(
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
        tbpengem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbpengemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbpengem);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidpengemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpengemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpengemActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        if (txtidpengem.getText().equals("") || txtidpeny.getText().equals("") || txtidtrans.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Field Tidak Boleh Kosong");
        } else {
            try {
                int s;
                String sql = "INSERT INTO tabel_pengembalian VALUES ('"+txtidpengem.getText()+"', '"+txtidpeny.getText()+"', '"+txtidtrans.getText()+"', '"+cmbkom.getSelectedItem()+"')";
                st = conn.createStatement();
                s = st.executeUpdate(sql);
                if (s == 1){
                    JOptionPane.showMessageDialog(null, "Sukses");
                    clear();
                    tampilan();
                }
            } catch (Exception e){
                System.out.println(e.toString());
            }
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        int c = JOptionPane.showConfirmDialog(null, "Ingin Menghapus Data?","Informasi", JOptionPane.YES_NO_OPTION);
        if (c == JOptionPane.YES_OPTION){
            try {
                int s;
                String sql = "DELETE FROM tabel_pengembalian WHERE id_pengembalian = '"+txtidpengem.getText()+"' ";
                st = conn.createStatement();
                s = st.executeUpdate(sql);
                if (s == 1){
                    JOptionPane.showMessageDialog(null, "Sukses");
                    clear();
                    tampilan();
                }
            } catch (Exception e){
                System.out.println(e.toString());
            }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        int c = JOptionPane.showConfirmDialog(null, "Ingin Mengubah Data?","Informasi", JOptionPane.YES_NO_OPTION);
        if (c == JOptionPane.YES_OPTION){
            if (txtidpengem.getText().equals("") || txtidpeny.getText().equals("") || txtidtrans.getText().equals("")  ){
                JOptionPane.showMessageDialog(null, "Field Tidak Boleh Kosong");
            } else {
                try {
                    int s;
                    String sql = "UPDATE tabel_Pengembalian SET id_penyewa = '"+txtidpeny.getText()+"', id_transaksi = '"+txtidtrans.getText()+"', konfirmasi = '"+cmbkom.getSelectedItem()+"' WHERE id_pengembalian = '"+txtidpengem.getText()+"' ";
                    st = conn.createStatement();
                    s = st.executeUpdate(sql);
                    if (s == 1){
                        JOptionPane.showMessageDialog(null, "Sukses");
                        clear();
                        tampilan();
                    }
                } catch (Exception e){
                    System.out.println(e.toString());
                }
            }
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clear();        // TODO add your handling code here:
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        int c = JOptionPane.showConfirmDialog(null, "Yakin Ingin Keluar?", null, JOptionPane.YES_NO_OPTION);
        if (c == JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void txtidpenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpenyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpenyActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        new menu_utama().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void tbpengemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbpengemMouseClicked
       int baris = tbpengem.getSelectedRow();
	txtidpengem.setText(tbpengem.getValueAt(baris, 0).toString());
	txtidpeny.setText(tbpengem.getValueAt(baris, 1).toString());
	txtidtrans.setText(tbpengem.getValueAt(baris, 2).toString());
        cmbkom.setSelectedItem(tbpengem.getValueAt(baris, 3).toString());
    }//GEN-LAST:event_tbpengemMouseClicked

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
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btnsimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbkom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbpengem;
    private javax.swing.JTextField txtidpengem;
    private javax.swing.JTextField txtidpeny;
    private javax.swing.JTextField txtidtrans;
    // End of variables declaration//GEN-END:variables
}
