/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dongk
 */
public class LecturerRegistration extends javax.swing.JFrame {

    /**
     * Creates new form LecturerRegistration
     */
    public LecturerRegistration() {
        initComponents();
        // Implement Registration Option Page from Registration Option JFrame
        RegistrationOption registrationOption = new RegistrationOption();
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
        jLabel1 = new javax.swing.JLabel();
        LecturerProfileButtonActionPerformed = new javax.swing.JButton();
        LecturerIndividualButtonActionPerformed = new javax.swing.JButton();
        ReturnButtonActionPerformed = new javax.swing.JButton();
        ExitButtonActionPerformed = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setText("Lecturer Registration");

        LecturerProfileButtonActionPerformed.setBackground(java.awt.Color.gray);
        LecturerProfileButtonActionPerformed.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        LecturerProfileButtonActionPerformed.setText("Lecturer Profile");
        LecturerProfileButtonActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LecturerProfileButtonActionPerformedActionPerformed(evt);
            }
        });

        LecturerIndividualButtonActionPerformed.setBackground(java.awt.Color.gray);
        LecturerIndividualButtonActionPerformed.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        LecturerIndividualButtonActionPerformed.setText("Lecturer Individual");
        LecturerIndividualButtonActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LecturerIndividualButtonActionPerformedActionPerformed(evt);
            }
        });

        ReturnButtonActionPerformed.setBackground(java.awt.Color.gray);
        ReturnButtonActionPerformed.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        ReturnButtonActionPerformed.setText("Return");
        ReturnButtonActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformedActionPerformed(evt);
            }
        });

        ExitButtonActionPerformed.setBackground(java.awt.Color.gray);
        ExitButtonActionPerformed.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        ExitButtonActionPerformed.setText("Exit");
        ExitButtonActionPerformed.setAutoscrolls(true);
        ExitButtonActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformedActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/output-onlinepngtools.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LecturerProfileButtonActionPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LecturerIndividualButtonActionPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReturnButtonActionPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExitButtonActionPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(LecturerProfileButtonActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LecturerIndividualButtonActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ReturnButtonActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ExitButtonActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LecturerIndividualButtonActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LecturerIndividualButtonActionPerformedActionPerformed
        // TODO add your handling code here:
        // Click Lecturer Individual Button go to the Lecturer Individual Page
        LecturerIndividual lecturerIndividual = new LecturerIndividual();
        lecturerIndividual.show();
        dispose();
    }//GEN-LAST:event_LecturerIndividualButtonActionPerformedActionPerformed

    private void ReturnButtonActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformedActionPerformed
        // TODO add your handling code here:
        // Click Return Button and return back to the Registration Option Page
        RegistrationOption registrationOption = new RegistrationOption();
        registrationOption.show();
        dispose();
    }//GEN-LAST:event_ReturnButtonActionPerformedActionPerformed

    private void ExitButtonActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformedActionPerformed
        // TODO add your handling code here:
        // Click Exit Button and return back to the Login Page
        Login login = new Login();
        login.show();
        dispose();
    }//GEN-LAST:event_ExitButtonActionPerformedActionPerformed

    private void LecturerProfileButtonActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LecturerProfileButtonActionPerformedActionPerformed
        // TODO add your handling code here:
        // Click Lecturer Profile Button abd go to the Lecturer Profile Page
        LecturerProfile lecturerProfile = new LecturerProfile();
        lecturerProfile.show();
        dispose();
    }//GEN-LAST:event_LecturerProfileButtonActionPerformedActionPerformed

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
            java.util.logging.Logger.getLogger(LecturerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButtonActionPerformed;
    private javax.swing.JButton LecturerIndividualButtonActionPerformed;
    private javax.swing.JButton LecturerProfileButtonActionPerformed;
    private javax.swing.JButton ReturnButtonActionPerformed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
