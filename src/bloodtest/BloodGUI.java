/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodtest;

import bloodtest.PatientList;
import bloodtest.PatientQueue;
import bloodtest.Person;
import javax.swing.JOptionPane;

/**
 *
 * @author tenhe
 */
public class BloodGUI extends javax.swing.JFrame {
     private PatientQueue patientQueue;
     private PatientList patientList;
     
    
    public BloodGUI() {
        initComponents();
        patientQueue = new PatientQueue(LogTA);
        patientList = new PatientList(LogTA);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        nameLBL = new javax.swing.JLabel();
        nextBTN = new javax.swing.JButton();
        scheduleBTN = new javax.swing.JButton();
        nameTF = new javax.swing.JTextField();
        titleLBL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LogTA = new javax.swing.JTextArea();
        priorityDB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        noShowListBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        displayListBTN = new javax.swing.JButton();
        hospitalRB = new javax.swing.JRadioButton();
        otherLocationRB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLBL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameLBL.setText("Name");

        nextBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nextBTN.setText("Next Patient");
        nextBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTNActionPerformed(evt);
            }
        });

        scheduleBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        scheduleBTN.setText("Schedule the queue");
        scheduleBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleBTNActionPerformed(evt);
            }
        });

        nameTF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        titleLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleLBL.setText("Blood Tester.");

        LogTA.setColumns(20);
        LogTA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LogTA.setRows(5);
        jScrollPane1.setViewportView(LogTA);

        priorityDB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        priorityDB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium", "Urgent", " ", " " }));
        priorityDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityDBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Priority");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Age");

        ageTF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ageTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTFActionPerformed(evt);
            }
        });

        noShowListBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        noShowListBTN.setText("No Show-List");
        noShowListBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noShowListBTNActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodtest/blood.jpg"))); // NOI18N

        displayListBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        displayListBTN.setText("Display the List");
        displayListBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayListBTNActionPerformed(evt);
            }
        });

        buttonGroup1.add(hospitalRB);
        hospitalRB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hospitalRB.setText("Hospital");
        hospitalRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(otherLocationRB);
        otherLocationRB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        otherLocationRB.setText("Other Location");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(titleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(147, 147, 147)
                            .addComponent(nameLBL)
                            .addGap(18, 18, 18)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(157, 157, 157)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(ageTF))))
                .addGap(188, 188, 188)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nextBTN)
                                    .addGap(18, 18, 18)
                                    .addComponent(noShowListBTN)
                                    .addGap(18, 18, 18)
                                    .addComponent(displayListBTN)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(scheduleBTN))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(priorityDB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hospitalRB)
                                .addGap(18, 18, 18)
                                .addComponent(otherLocationRB)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLBL)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalRB)
                    .addComponent(otherLocationRB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priorityDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(scheduleBTN)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextBTN)
                    .addComponent(noShowListBTN)
                    .addComponent(displayListBTN))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTNActionPerformed
          Person nextPatient = patientQueue.getNextPatient();
        if (nextPatient == null) {
            LogTA.append("No patients in queue.\n");
        } else {
            LogTA.append("Next: " + nextPatient.getName() + " (" + nextPatient.getPriority() + " priority)\n");
        }
    
    }//GEN-LAST:event_nextBTNActionPerformed

    private void scheduleBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleBTNActionPerformed
        String name = nameTF.getText();
        String priority = (String) priorityDB.getSelectedItem();
        String ageText = ageTF.getText();

        if (name.isEmpty() || ageText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a name and age.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int age = Integer.parseInt(ageText);
            boolean fromHospital = hospitalRB.isSelected();
            Person patient = new Person(name, age, priority, "Dr. Smith", fromHospital);
            patientQueue.scheduleTest(patient);
            patientList.addPatient(patient);
            LogTA.append("Scheduled: " + name + " - " + priority + " - Age: " + age + (fromHospital ? " (From Hospital)" : " (Not from Hospital)") + "\n");
            nameTF.setText("");
            ageTF.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid age.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_scheduleBTNActionPerformed

    private void priorityDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priorityDBActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void ageTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ageTFActionPerformed

    private void noShowListBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noShowListBTNActionPerformed
        // TODO add your handling code here:
        patientQueue.displayNoShowList();
        
    }//GEN-LAST:event_noShowListBTNActionPerformed

    private void displayListBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayListBTNActionPerformed
        // TODO add your handling code here:
        patientList.displayPatients();
    }//GEN-LAST:event_displayListBTNActionPerformed

    private void hospitalRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalRBActionPerformed

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
            java.util.logging.Logger.getLogger(BloodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea LogTA;
    private javax.swing.JTextField ageTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton displayListBTN;
    private javax.swing.JRadioButton hospitalRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton nextBTN;
    private javax.swing.JButton noShowListBTN;
    private javax.swing.JRadioButton otherLocationRB;
    private javax.swing.JComboBox<String> priorityDB;
    private javax.swing.JButton scheduleBTN;
    private javax.swing.JLabel titleLBL;
    // End of variables declaration//GEN-END:variables
}
