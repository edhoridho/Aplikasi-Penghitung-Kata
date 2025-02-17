/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi.penghitung.kata;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER A314
 */
public class HitungKataFrame extends javax.swing.JFrame {

    /**
     * Creates new form HitungKataFrame
     */
    public HitungKataFrame() {
        initComponents();
        tambahDocumentListener(); // Tambahkan DocumentListener ke JTextArea
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        btnHitung = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnCariKata = new javax.swing.JButton();
        lblJumlahKata = new javax.swing.JLabel();
        lblJumlahKarakter = new javax.swing.JLabel();
        lblJumlahKalimat = new javax.swing.JLabel();
        lblJumlahParagraf = new javax.swing.JLabel();
        txtCariKata = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblHasilPencarian = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Penghitung Kata", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 18)))); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Masukkan Teks Disini"));

        txtInput.setColumns(20);
        txtInput.setRows(5);
        jScrollPane1.setViewportView(txtInput);

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnCariKata.setText("Cari");
        btnCariKata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariKataActionPerformed(evt);
            }
        });

        lblJumlahKata.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblJumlahKata.setText("jumlah kata");

        lblJumlahKarakter.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblJumlahKarakter.setText("jumlah karakter");

        lblJumlahKalimat.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblJumlahKalimat.setText("jumlah kalimat");

        lblJumlahParagraf.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblJumlahParagraf.setText("jumlah paragraf");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setText("Cari Kata dalam teks yang di input:");

        lblHasilPencarian.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblHasilPencarian.setText("jumlah kata yang dicari");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCariKata)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCariKata)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblHasilPencarian)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblJumlahKata)
                    .addComponent(lblJumlahKarakter)
                    .addComponent(lblJumlahKalimat)
                    .addComponent(lblJumlahParagraf))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCariKata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCariKata)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHitung)
                            .addComponent(btnSimpan))
                        .addGap(31, 31, 31)
                        .addComponent(lblJumlahKata)
                        .addGap(34, 34, 34)
                        .addComponent(lblJumlahKarakter)
                        .addGap(34, 34, 34)
                        .addComponent(lblJumlahKalimat)
                        .addGap(35, 35, 35)
                        .addComponent(lblJumlahParagraf)))
                .addGap(18, 18, 18)
                .addComponent(lblHasilPencarian)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //mencegah fitur real time berjalan sebelum tombol hitung di tekan
    private boolean hitungRealTimeAktif = false; 

    
    //gasan hiitung jumlah karakter, kata, kalimat n paragraf dengan memanggil method hitungrealtime
    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
    hitungRealTimeAktif = true; // Aktifkan perhitungan real-time
    hitungRealTime(); // Hitung teks saat ini
    JOptionPane.showMessageDialog(this, "Perhitungan real-time diaktifkan.");
    }//GEN-LAST:event_btnHitungActionPerformed

    //untuk cari jumlah dari kata tertentu
    private void btnCariKataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariKataActionPerformed
    String kataDicari = txtCariKata.getText().trim(); // Ambil kata dari JTextField
    String teks = txtInput.getText(); // Ambil teks dari JTextArea

    if (kataDicari.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Masukkan kata yang ingin dicari!");
        return;
    }

    // Pisahkan teks menjadi kata-kata
    String[] kataArray = teks.split("\\W+"); // Split berdasarkan non-alfanumerik

    // Hitung jumlah kemunculan kata
    int jumlahKemunculan = 0;
    for (String kata : kataArray) {
        if (kata.equalsIgnoreCase(kataDicari)) { // Bandingkan tanpa case-sensitive
            jumlahKemunculan++;
        }
    }

    // Tampilkan hasil di JLabel
    if (jumlahKemunculan > 0) {
        lblHasilPencarian.setText("Kata ditemukan sebanyak: " + jumlahKemunculan + " kali");
    } else {
        lblHasilPencarian.setText("Kata tidak ditemukan.");
    }
    }//GEN-LAST:event_btnCariKataActionPerformed

    //simpan data pencarian ke dalam file
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
    String teks = txtInput.getText(); // Ambil teks dari JTextArea
    int jumlahKata = teks.isEmpty() ? 0 : teks.split("\\s+").length;
    int jumlahKarakter = teks.length();
    int jumlahKalimat = teks.isEmpty() ? 0 : teks.split("[.!?]").length;
    int jumlahParagraf = teks.isEmpty() ? 0 : teks.split("\\n").length;

    // Gabungkan teks dan hasil perhitungan
    String hasil = "Teks:\n" + teks + "\n\n" +
                   "Hasil Perhitungan:\n" +
                   "Jumlah Kata: " + jumlahKata + "\n" +
                   "Jumlah Karakter: " + jumlahKarakter + "\n" +
                   "Jumlah Kalimat: " + jumlahKalimat + "\n" +
                   "Jumlah Paragraf: " + jumlahParagraf;

    // Gunakan JFileChooser untuk menyimpan file
    JFileChooser fileChooser = new JFileChooser();
    int pilih = fileChooser.showSaveDialog(this);

    if (pilih == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(hasil); // Tulis hasil ke file
            JOptionPane.showMessageDialog(this, "File berhasil disimpan!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan file: " + e.getMessage());
        }
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(HitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HitungKataFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariKata;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHasilPencarian;
    private javax.swing.JLabel lblJumlahKalimat;
    private javax.swing.JLabel lblJumlahKarakter;
    private javax.swing.JLabel lblJumlahKata;
    private javax.swing.JLabel lblJumlahParagraf;
    private javax.swing.JTextField txtCariKata;
    private javax.swing.JTextArea txtInput;
    // End of variables declaration//GEN-END:variables
    
    //method tambahdocumentlistener
    private void tambahDocumentListener() {
    txtInput.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        @Override
        public void insertUpdate(javax.swing.event.DocumentEvent e) {
            if (hitungRealTimeAktif) {
                hitungRealTime();
            }
        }

        @Override
        public void removeUpdate(javax.swing.event.DocumentEvent e) {
            if (hitungRealTimeAktif) {
                hitungRealTime();
            }
        }

        @Override
        public void changedUpdate(javax.swing.event.DocumentEvent e) {
            if (hitungRealTimeAktif) {
                hitungRealTime();
            }
        }
    });
    }
    
    //method hitung realtime
    private void hitungRealTime() {
    String teks = txtInput.getText().trim();
    int jumlahKarakter = teks.length();
    int jumlahKata = teks.isEmpty() ? 0 : teks.split("\\s+").length;
    int jumlahKalimat = teks.isEmpty() ? 0 : teks.split("[.!?]").length;
    int jumlahParagraf = teks.isEmpty() ? 0 : teks.split("\\n").length;

    lblJumlahKata.setText("Jumlah kata: " + jumlahKata);
    lblJumlahKarakter.setText("Jumlah karakter: " + jumlahKarakter);
    lblJumlahKalimat.setText("Jumlah kalimat: " + jumlahKalimat);
    lblJumlahParagraf.setText("Jumlah paragraf: " + jumlahParagraf);
    }
}
