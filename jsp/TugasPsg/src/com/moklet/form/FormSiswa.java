/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moklet.form;
import com.moklet.model.siswa;
import com.moklet.query.SiswaQuery;
import com.moklet.utils.DBConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Intan
 */
public class FormSiswa extends javax.swing.JFrame {

    private List<siswa> records = new ArrayList<siswa>();
    private int row = 0;
    private boolean status;
    public FormSiswa() {
        
        initComponents();
        loadRecords();
        updateRow();
    }
    public void loadRecords() {
    try {
        DBConnection conn = DBConnection.getInstance();
        SiswaQuery daoSiswa = new SiswaQuery(conn.getCon());
        records = daoSiswa.getAll();
        } catch (SQLException ex) {
        Logger.getLogger(FormSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateRow() {
        if (this.records.size() > 0) {
            if (row < 0) {
            row = 0;
            }
            siswa sw = records.get(row);
            txtnis.setText(sw.getNis());
            txtnama.setText(sw.getNama());
            txtalamat.setText(sw.getAlamat());
            txtnotelp.setText(sw.getIDtelp());
        } else {
        bersihkanForm();
        editForm(false);
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

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnis = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtnotelp = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhps = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data Siswa");

        jLabel2.setText("Nis Siswa");

        jLabel3.setText("Nama Siswa");

        jLabel4.setText("Alamat Siswa");

        jLabel5.setText("No. Telp");

        jLabel6.setText("Proses Data");

        jLabel7.setText("Untuk mancari data ketikan nis siswa pada kolom lalu -> enter");

        jLabel8.setText("masukkan nis yang sudah ada");

        txtnis.setName("");
        txtnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnisActionPerformed(evt);
            }
        });

        txtnama.setName("");
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        txtalamat.setName("");

        txtnotelp.setName("");

        btnadd.setText("Tambah Data");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnedit.setText("Edit Data");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhps.setText("Hapus Data");
        btnhps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhpsActionPerformed(evt);
            }
        });

        btnsimpan.setText("Simpan Data");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnexit.setText("Keluar");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jButton1.setText("Bersihkan");
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnadd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnedit)
                                .addGap(102, 102, 102))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(btnhps)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnsimpan)))
                                .addGap(87, 87, 87)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtalamat))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3))
                                    .addGap(23, 23, 23)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtnis, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(jLabel8))
                                        .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnedit)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnhps)
                    .addComponent(btnsimpan)
                    .addComponent(btnexit))
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnisActionPerformed
        loadRecords2();
        updateRow2();
    }//GEN-LAST:event_txtnisActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        status = true;
        editForm(true);
        bersihkanForm();
        txtnis.requestFocus();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        if (status == true) {
        try {
            siswa sw = new siswa();
            sw.setNis(txtnis.getText());
            sw.setNama(txtnama.getText());
            sw.setAlamat(txtalamat.getText());
            sw.setIDtelp(txtnotelp.getText());
            DBConnection conn = DBConnection.getInstance();
            SiswaQuery dao = new SiswaQuery(conn.getCon());
            dao.insert(sw);
            JOptionPane.showMessageDialog(this, "Data Saved");
            loadRecords();
            updateRow();
        } catch (SQLException ex) {
        Logger.getLogger(FormSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        } else {
        try {
        siswa sw = new siswa();
        sw.setNis(txtnis.getText());
        sw.setNama(txtnama.getText());
        sw.setAlamat(txtalamat.getText());
        sw.setIDtelp(txtnotelp.getText());
        DBConnection conn = DBConnection.getInstance();
        SiswaQuery dao = new SiswaQuery(conn.getCon());
        dao.update(sw.getNis(), sw);
        JOptionPane.showMessageDialog(this, "Data Update");
        loadRecords();
        updateRow();
        } catch (SQLException ex) {
        Logger.getLogger(FormSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        status = false;
    }//GEN-LAST:event_btneditActionPerformed

    private void btnhpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhpsActionPerformed
        try {
            siswa sw = new siswa();
            sw.setNis(txtnis.getText());
            DBConnection conn = DBConnection.getInstance();
            SiswaQuery dao = new SiswaQuery(conn.getCon());
            dao.delete(txtnis.getText());
            JOptionPane.showMessageDialog(this, "Data Delete");
            loadRecords();
            updateRow();
        } catch (SQLException ex) {
        Logger.getLogger(FormSiswa.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnhpsActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.dispose();
    }
        public void loadRecords2() {
        try {
            DBConnection conn =
            DBConnection.getInstance();
            SiswaQuery daoSiswa = new SiswaQuery(conn.getCon());
            records = daoSiswa.getAllNis(txtnis.getText());
        } catch (SQLException ex) {
        Logger.getLogger(FormSiswa.class.getName()).log(Level.SEVERE, null,
        ex);
        }
    }//GEN-LAST:event_btnexitActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bersihkanForm();
    }//GEN-LAST:event_jButton1ActionPerformed

     public void updateRow2() {
        if (this.records.size() > 0) {
            if (row < 0) {
            row = 0;
            }
        siswa sw = records.get(row);
        txtnis.setText(sw.getNis());
        txtnama.setText(sw.getNama());
        txtalamat.setText(sw.getAlamat());
        txtnotelp.setText(sw.getIDtelp());
        } else {
        JOptionPane.showMessageDialog(this, "Not Found");
        loadRecords();
        updateRow();
        }
    }
     
     void bersihkanForm() {
        txtnis.setText("");
        txtnama.setText("");
        txtalamat.setText("");
        txtnotelp.setText("");
    }
void editForm(boolean x) {
txtnis.setEditable(x);
txtnama.setEditable(x);
txtalamat.setEditable(x);
txtnotelp.setEditable(x);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                 
                new FormSiswa().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnhps;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnis;
    private javax.swing.JTextField txtnotelp;
    // End of variables declaration//GEN-END:variables
}
