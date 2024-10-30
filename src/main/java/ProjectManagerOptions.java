/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author hassa
 */
public class ProjectManagerOptions extends javax.swing.JFrame {


    public ProjectManagerOptions() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        RegistrationButtonActionPerformed = new javax.swing.JButton();
        RegistrationButtonActionPerformed2 = new javax.swing.JButton();
        RegistrationButtonActionPerformed4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        RegistrationButtonActionPerformed5 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel1.setText("Admin Options");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegistrationButtonActionPerformed.setBackground(java.awt.Color.gray);
        RegistrationButtonActionPerformed.setText("Allot Students");
        RegistrationButtonActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationButtonActionPerformedActionPerformed(evt);
            }
        });

        RegistrationButtonActionPerformed2.setBackground(java.awt.Color.gray);
        RegistrationButtonActionPerformed2.setText("View status");
        RegistrationButtonActionPerformed2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationButtonActionPerformed2ActionPerformed(evt);
            }
        });

        RegistrationButtonActionPerformed4.setBackground(java.awt.Color.gray);
        RegistrationButtonActionPerformed4.setText("Assign Supervisor");
        RegistrationButtonActionPerformed4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationButtonActionPerformed4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel3.setText("Project Manager");

        RegistrationButtonActionPerformed5.setBackground(java.awt.Color.gray);
        RegistrationButtonActionPerformed5.setText("Add Project");
        RegistrationButtonActionPerformed5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationButtonActionPerformed5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RegistrationButtonActionPerformed2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegistrationButtonActionPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(RegistrationButtonActionPerformed4, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(RegistrationButtonActionPerformed5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(RegistrationButtonActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegistrationButtonActionPerformed4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegistrationButtonActionPerformed2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegistrationButtonActionPerformed5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrationButtonActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationButtonActionPerformedActionPerformed
        AllotStudentsGUI allotStudentsGUI = new AllotStudentsGUI();
        allotStudentsGUI.setVisible(true);
    }//GEN-LAST:event_RegistrationButtonActionPerformedActionPerformed

    private void RegistrationButtonActionPerformed2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationButtonActionPerformed2ActionPerformed
        AssignSupervisorGUI assignSupervisorGUI = new AssignSupervisorGUI();
        assignSupervisorGUI.setVisible(true);
    }//GEN-LAST:event_RegistrationButtonActionPerformed2ActionPerformed

    private void RegistrationButtonActionPerformed4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationButtonActionPerformed4ActionPerformed
        ViewStatusGUI viewStatusGUI = new ViewStatusGUI();
        viewStatusGUI.setVisible(true);
    }//GEN-LAST:event_RegistrationButtonActionPerformed4ActionPerformed

    private void RegistrationButtonActionPerformed5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationButtonActionPerformed5ActionPerformed
        CreateProjectForm createProjectForm = new CreateProjectForm();
        createProjectForm.setVisible(true);
    }//GEN-LAST:event_RegistrationButtonActionPerformed5ActionPerformed


    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectManagerOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegistrationButtonActionPerformed;
    private javax.swing.JButton RegistrationButtonActionPerformed2;
    private javax.swing.JButton RegistrationButtonActionPerformed4;
    private javax.swing.JButton RegistrationButtonActionPerformed5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
