
import TugasATM.setor;
import TugasATM.tarik;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ridjal Fathoni
 */
public class Transaksi extends javax.swing.JFrame {
String str, str1;
int choice,z,pin=1234,counter=0,a=3;
int t,s,tab=50000;
    /**
     * Creates new form Transaksi
     */
    public Transaksi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        btPilih = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfPilih = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btPilih.setText("PILIH");
        btPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPilihActionPerformed(evt);
            }
        });
        getContentPane().add(btPilih);
        btPilih.setBounds(130, 220, 70, 33);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PILIHAN MENU");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 0, 100, 38);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("[5] KELUAR");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 160, 160, 38);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("[1] INFORMASI SALDO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 40, 160, 38);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("[2] PENYETORAN");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 70, 160, 38);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("[3] PENARIKAN");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 100, 160, 38);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("[4] PETUNJUK");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 130, 160, 38);
        getContentPane().add(tfPilih);
        tfPilih.setBounds(50, 190, 110, 30);

        setSize(new java.awt.Dimension(232, 301));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPilihActionPerformed
        // TODO add your handling code here:
        int iPil;
        iPil = Integer.parseInt(tfPilih.getText().toString());
        if (iPil == 1)
        {
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar : " + tab); //informasi saldo
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain ?","ATM BNI SYARIAH-BOJONEGORO",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BNI SYARIAH - BOJONEGORO, ambil kartu ATM Anda.");
                System.exit(0);
            }
        }
        else if (iPil == 2)
        {
            this.setVisible(false);
            str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah penyetoran : " ); //menabung
            s = Integer.parseInt(str1);
            setor hasil = new setor();
            hasil.menabung(tab, s);
            tab =hasil.getsaldo();
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain ?","ATM BNI SYARIAH-BOJONEGORO",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BNI SYARIAH - BOJONEGORO, ambil kartu ATM Anda.");
                System.exit(0);
            }
        }
        else if (iPil == 3)
        {
            this.setVisible(false);
            str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah penarikan : " ); //pengambilan
            t = Integer.parseInt(str1);
            tarik mengambil = new tarik();
            mengambil.ambil(tab,t);
            tab =mengambil.getsaldo();
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM BNI SYARIAH-BOJONEGORO",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BNI SYARIAH - BOJONEGORO, ambil kartu ATM Anda.");
                System.exit(0);
            }
        }
        else if (iPil == 4)
        {
            z=JOptionPane.showConfirmDialog(null,"Cara Penggunaan Aplikasi\n[1] Masukkan PIN dengan benar\n[2] Bertransaksilah dengan benar sesuai pilihan\n[3] Gunakan Uang sesuai kebutuhan dan rajinlah menabung\n ","INFO",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BNI SYARIAH - BOJONEGORO, ambil kartu ATM Anda.");
                System.exit(0);
            }
        }
        else if (iPil == 5)
        {
            JOptionPane.showMessageDialog(null,"SILAHKAN AMBIL KARTU ATM ANDA !","TERIMAKASIH",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_btPilihActionPerformed

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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPilih;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tfPilih;
    // End of variables declaration//GEN-END:variables
}
