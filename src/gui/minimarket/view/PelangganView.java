package gui.minimarket.view;

import gui.minimarket.controller.PelangganController;
import gui.minimarket.event.PelangganListener;
import gui.minimarket.model.PelangganModel;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ilham Kelas GUI untuk menampilkan form pelanggan.
 */
public class PelangganView  extends javax.swing.JFrame implements PelangganListener{

    /**
     * Creates new form pelangganView
     */
    private PelangganController controller;
    private PelangganModel model;
    public PelangganView() {
        model = new PelangganModel();
        controller = new PelangganController();
        
        model.setPelangganListener(this);
        controller.setModel(model);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelNotelepon = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        simpanBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        txtNama = new javax.swing.JTextField();
        txtNotelp = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Minimarket");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Heading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("Form Data Pelanggan Minimarket");
        Heading.setToolTipText("");
        Heading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Heading.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(Heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        labelEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelEmail.setText("Email:");
        jPanel1.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        labelNotelepon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNotelepon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelNotelepon.setText("No Telepon:");
        jPanel1.add(labelNotelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        labelNama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelNama.setText("Nama :");
        jPanel1.add(labelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        labelAlamat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelAlamat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelAlamat.setText("Alamat:");
        jPanel1.add(labelAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        resetBtn.setText("Reset");
        resetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetBtnMouseClicked(evt);
            }
        });
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jPanel1.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        simpanBtn.setText("Simpan");
        simpanBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simpanBtnMouseClicked(evt);
            }
        });
        simpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBtnActionPerformed(evt);
            }
        });
        jPanel1.add(simpanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 440, -1));
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 440, -1));
        jPanel1.add(txtNotelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 440, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 440, -1));

        getContentPane().add(jPanel1, "card2");

        setBounds(0, 0, 600, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void simpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_simpanBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetBtnActionPerformed

    private void simpanBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpanBtnMouseClicked
        // TODO add your handling code here:
        controller.simpanForm(this);
    }//GEN-LAST:event_simpanBtnMouseClicked

    private void resetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetBtnMouseClicked
        // TODO add your handling code here:
        controller.resetForm(this);
    }//GEN-LAST:event_resetBtnMouseClicked

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
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PelangganView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNotelepon;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton simpanBtn;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNotelp;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the txtAlamat
     */
    public JTextArea getTxtAlamat() {
        return txtAlamat;
    }

    /**
     * @return the txtEmail
     */
    public JTextField getTxtEmail() {
        return getTxtNotelp();
    }

    /**
     * @return the txtNama
     */
    public JTextField getTxtNama() {
        return txtNama;
    }

    /**
     * @return the txtNotelp
     */
    public JTextField getTxtNotelp() {
        return txtNotelp;
    }

    /**
     *
     * @param pelanggan
     */
    @Override
    public void onChange(PelangganModel pelanggan) {
        txtNama.setText(pelanggan.getNama());
        txtEmail.setText(pelanggan.getEmail());
        txtNotelp.setText(pelanggan.getNoTelepon());
        txtAlamat.setText(pelanggan.getAlamat());
    }

 
}
