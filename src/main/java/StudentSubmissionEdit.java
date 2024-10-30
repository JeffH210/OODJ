/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
/**
 *
 * @author User
 */
public class StudentSubmissionEdit extends javax.swing.JFrame {

    private Component frame;

    /**
     * Creates new form AssessmentSubmission
     */
    public StudentSubmissionEdit() {
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

        jFileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TpNumTxt = new javax.swing.JTextField();
        dateTxt = new javax.swing.JTextField();
        subTitleTxt = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ShowBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SubmissionData = new javax.swing.JTable();
        BackBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fileTxt = new javax.swing.JTextField();
        SelectBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        moduleBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Student TP Number:");

        SaveBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Date:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Submission Title:");

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel1.setText("Submission Edit");

        ShowBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ShowBtn.setText("Show");
        ShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowBtnActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        SubmissionData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student TP Num", "Date", "Module", "Submission Title", "File"
            }
        ));
        jScrollPane1.setViewportView(SubmissionData);

        BackBtn.setFont(new java.awt.Font("Harlow Solid Italic", 0, 14)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        ExitBtn.setFont(new java.awt.Font("Harlow Solid Italic", 0, 14)); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Selected File:");

        SelectBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SelectBtn.setText("Select");
        SelectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Module:");

        moduleBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SPCC", "OODJ", "PFDA", "SDM", "FIS", "PYP" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3))
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TpNumTxt)
                                            .addComponent(dateTxt)
                                            .addComponent(subTitleTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                            .addComponent(fileTxt))
                                        .addGap(18, 18, 18)
                                        .addComponent(SelectBtn))
                                    .addComponent(moduleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(ShowBtn)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteBtn)
                                .addGap(18, 18, 18)
                                .addComponent(EditBtn)
                                .addGap(18, 18, 18)
                                .addComponent(SaveBtn)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TpNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(moduleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(SelectBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) SubmissionData.getModel();
    int selectedRowIndex = SubmissionData.getSelectedRow();
    
    if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(null, "Please select a row to change!");
        return;
    }
    
    String TpNum = (String) model.getValueAt(selectedRowIndex, 0);
    String date = (String) model.getValueAt(selectedRowIndex, 1);
    String module = (String) model.getValueAt(selectedRowIndex, 2);
    String submissionTitle = (String) model.getValueAt(selectedRowIndex, 3);
    String selectedFile = (String) model.getValueAt(selectedRowIndex, 4);
    
    try {
        File inputFile = new File("submission.txt");
        File tempFile = new File("tempsubmission.txt");
        
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        
        String line;
        boolean found = false;
        
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("TP Number: ") && line.substring(11).equals(TpNum)) {
                writer.write("TP Number: " + TpNum + "\n");
                writer.write("Date: " + date + "\n");
                writer.write("Module: " +module + "\n");
                writer.write("Submission Title: " + submissionTitle + "\n");
                writer.write("Selected File: " + selectedFile + "\n");
                writer.write("\n");
                // Skip the next 3 lines in the original file (the old details)
                for (int i = 0; i < 3; i++) {
                    reader.readLine();
                }
                found = true;
            } else {
                writer.write(line + "\n");
            }
        }
        
        writer.close();
        reader.close();
        
        if (found) {
            if (!inputFile.delete()) {
                JOptionPane.showMessageDialog(null, "Could not delete original file");
                return;
            }
            if (!tempFile.renameTo(inputFile)) {
                JOptionPane.showMessageDialog(null, "Could not rename temporary file");
            } else {
                JOptionPane.showMessageDialog(null, "Submission details updated successfully!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cannot find the related student TP Number!");
            tempFile.delete(); // Cleanup the temp file if no matching submission found
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error replacing the submission data: " + e.getMessage());
    }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void ShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) SubmissionData.getModel();
    model.setRowCount(0);
    
    try (BufferedReader reader = new BufferedReader(new FileReader("submission.txt"))) {
        String line;
        String[] submissionData = new String[5];
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("TP Number: ")) {
                submissionData[0] = line.substring(11).trim();
            } else if (line.startsWith("Date: ")) {
                submissionData[1] = line.substring(6).trim();
            } else if (line.startsWith("Module: ")) {
                submissionData[2] = line.substring(8).trim();
            } else if (line.startsWith("Submission Title: ")) {
                submissionData[3] = line.substring(17).trim();
            } else if (line.startsWith("Selected File: ")) {
                submissionData[4] = line.substring(15).trim();
                model.addRow(submissionData);
                submissionData = new String[5];
            }
        }
        JOptionPane.showMessageDialog(null, "Submission loaded successfully!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error loading the submission: " + e.getMessage());
    }
    }//GEN-LAST:event_ShowBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) SubmissionData.getModel();
    int selectedRowIndex = SubmissionData.getSelectedRow();
    
    if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(null, "Please select a row to edit!");
        return;
    }
    
    model.setValueAt(TpNumTxt.getText(), selectedRowIndex, 0);
    model.setValueAt(dateTxt.getText(), selectedRowIndex, 1);
    model.setValueAt(moduleBox.getSelectedItem(), selectedRowIndex, 2);
    model.setValueAt(subTitleTxt.getText(), selectedRowIndex, 3);
    model.setValueAt(fileTxt.getText(), selectedRowIndex, 4);
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) SubmissionData.getModel();
    int selectedRowIndex = SubmissionData.getSelectedRow();
    
    if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(null, "Please select a row to delete!");
        return;
    }
    
    String TpNum = (String) model.getValueAt(selectedRowIndex, 0);
    model.removeRow(selectedRowIndex);
    
    File inputFile = new File("submission.txt");
    File tempFile = new File("tempsubmission.txt");
    
    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
        
        String line;
        boolean found = false;
        
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("TP Number: ") && line.substring(11).equals(TpNum)) {
                // Skip the next 3 lines in the original file (the old details)
                for (int i = 0; i < 3; i++) {
                    reader.readLine();
                }
                found = true;
            } else {
                writer.write(line + "\n");
            }
        }
        
        if (!found) {
            JOptionPane.showMessageDialog(null, "Cannot find the related student TP Number!");
        }
    } catch (FileNotFoundException e) {
        JOptionPane.showMessageDialog(null, "File not found: " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error reading or writing file: " + e.getMessage());
    }
    
    if (inputFile.delete()) {
        if (!tempFile.renameTo(inputFile)) {
            JOptionPane.showMessageDialog(null, "Cannot rename the temporary file!");
        } else {
            JOptionPane.showMessageDialog(null, "Submission details deleted successfully!");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Cannot delete original file!");
    }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        StudentMainMenu studentMainMenu = new StudentMainMenu();
        studentMainMenu.show();
        dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SelectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    fileTxt.setText(selectedFile.getAbsolutePath());
                }
    }//GEN-LAST:event_SelectBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.show();
        dispose();
    }//GEN-LAST:event_ExitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StudentSubmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSubmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSubmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSubmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSubmissionEdit().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton SelectBtn;
    private javax.swing.JButton ShowBtn;
    private javax.swing.JTable SubmissionData;
    private javax.swing.JTextField TpNumTxt;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTextField fileTxt;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> moduleBox;
    private javax.swing.JTextField subTitleTxt;
    // End of variables declaration//GEN-END:variables
}
