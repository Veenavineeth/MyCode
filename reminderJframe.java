/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reminder;

import DAL.ReminderDal;
import DAO.ReminderDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class reminderJframe extends javax.swing.JFrame {
    ReminderDao daoObj=new ReminderDao();
    ReminderDal dalObj=new ReminderDal();
    boolean createflag=false;
    boolean updateflag=false;
    /**
     * Creates new form reminderJframe
     */
    public reminderJframe() {
        initComponents();
        jTblReminderTable.setVisible(false);
        jScrollPaneReminderTable.setEnabled(false);
        jTxtRemId.setVisible(false);
        jLblRemId.setVisible(false);
        jBtnUpdate.setEnabled(false);
        PopulateTable() ;
         
    }
     public void PopulateTable() 
       { 
         try
        {
           ArrayList<ReminderDao> objList=dalObj.getallReminders();
           DefaultTableModel tableModel=(DefaultTableModel)jTblReminderTable.getModel();
           Object[] row=new  Object[4];
           tableModel.setRowCount(0);
           for(ReminderDao empObj: objList)
           {
               row[0]=empObj.getRemId();
               row[1]=empObj.getRemName();
               row[2]=empObj.getRemDate();
               row[3]=empObj.getRemTime();
               tableModel.addRow(row);
           }           
           }
        catch(Exception ex)
        {
            ex.printStackTrace();
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

        jLblRemId = new javax.swing.JLabel();
        jTxtRemId = new javax.swing.JTextField();
        jLblRemName = new javax.swing.JLabel();
        jTxtRemName = new javax.swing.JTextField();
        jLblRemDate = new javax.swing.JLabel();
        jTxtRemDate = new javax.swing.JTextField();
        jLblRemTime = new javax.swing.JLabel();
        jTxtRemTime = new javax.swing.JTextField();
        jBtnUpdate = new javax.swing.JButton();
        jBtnView = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();
        jScrollPaneReminderTable = new javax.swing.JScrollPane();
        jTblReminderTable = new javax.swing.JTable();
        jBtnCreate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLblRemId.setText("ID");

        jLblRemName.setText("Reminder Name");

        jLblRemDate.setText("Date");

        jLblRemTime.setText("Time");

        jBtnUpdate.setText("Update");
        jBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateActionPerformed(evt);
            }
        });

        jBtnView.setText("View");
        jBtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnViewActionPerformed(evt);
            }
        });

        jBtnExit.setText("Exit");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });

        jTblReminderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTblReminderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblReminderTableMouseClicked(evt);
            }
        });
        jScrollPaneReminderTable.setViewportView(jTblReminderTable);
        if (jTblReminderTable.getColumnModel().getColumnCount() > 0) {
            jTblReminderTable.getColumnModel().getColumn(0).setMinWidth(0);
            jTblReminderTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTblReminderTable.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jBtnCreate.setText("Create");
        jBtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPaneReminderTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblRemId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblRemName))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLblRemTime)
                                    .addComponent(jLblRemDate))
                                .addGap(21, 21, 21)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtRemDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtRemName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtRemId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBtnCreate)
                                    .addComponent(jBtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnUpdate)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtRemTime, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTxtRemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtRemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblRemName))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtRemDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblRemDate))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtRemTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblRemTime))
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jBtnCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLblRemId)
                                .addGap(195, 195, 195))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtnView)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnUpdate)
                                .addGap(24, 24, 24)
                                .addComponent(jBtnExit)
                                .addGap(71, 71, 71)))))
                .addComponent(jScrollPaneReminderTable, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed
        // TODO add your handling code here:
       
        jTblReminderTable.setVisible(true);
        jScrollPaneReminderTable.setEnabled(true);
        daoObj.setRemName(jTxtRemName.getText());
        daoObj.setRemDate(jTxtRemDate.getText());
        daoObj.setRemTime(jTxtRemTime.getText());
       
        try
        {
            if(dalObj.updateAReminder(daoObj))
            {
                JOptionPane.showMessageDialog(new reminderJframe(),"Reminder updated successfully");
                PopulateTable();
                
            }
            else
            {
                 JOptionPane.showMessageDialog(new reminderJframe(),"Reminder updation failed");
            }
        }
      catch(Exception ex)
        {
        JOptionPane.showMessageDialog(new reminderJframe(),"Contact support");  
        }
        
    }//GEN-LAST:event_jBtnUpdateActionPerformed

    private void jBtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnViewActionPerformed
        // TODO add your handling code here:
        jTblReminderTable.setVisible(true);
        jScrollPaneReminderTable.setEnabled(true);
        jBtnUpdate.setEnabled(true);
        PopulateTable();
        
    }//GEN-LAST:event_jBtnViewActionPerformed

    private void jTblReminderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblReminderTableMouseClicked
        // TODO add your handling code here:
         try
          {
            int row=jTblReminderTable.getSelectedRow();
            int id = 0;
            if(row == -1)
             {
          // No row selected
           // Show error message
             }
            else{
            id= (int) (jTblReminderTable).getModel().getValueAt(row,0);
            daoObj.setRemId(id);
            new ReminderDal().viewReminderById(daoObj);
            jTxtRemName.setText(daoObj.getRemName());
            jTxtRemDate.setText(daoObj.getRemDate());
            jTxtRemTime.setText(daoObj.getRemTime());
            }
          }
          catch(Exception ex)
          {
              ex.printStackTrace();
          }
        
        
    }//GEN-LAST:event_jTblReminderTableMouseClicked

    private void jBtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreateActionPerformed
        // TODO add your handling code here:
       
        jTblReminderTable.setVisible(true);
        jScrollPaneReminderTable.setEnabled(true);
        daoObj.setRemName(jTxtRemName.getText());
        daoObj.setRemDate(jTxtRemDate.getText());
        daoObj.setRemTime(jTxtRemTime.getText());
        try
        {
            if(dalObj.createAReminder(daoObj))
            {
                JOptionPane.showMessageDialog(new reminderJframe(),"Reminder created");
               PopulateTable() ;
            }
            else
            {
                 JOptionPane.showMessageDialog(new reminderJframe(),"Reminder not created");
            }
        }
      catch(Exception ex)
        {
        JOptionPane.showMessageDialog(new reminderJframe(),"Contact support");  
        }
    }//GEN-LAST:event_jBtnCreateActionPerformed

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
            java.util.logging.Logger.getLogger(reminderJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reminderJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reminderJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reminderJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reminderJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCreate;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JButton jBtnView;
    private javax.swing.JLabel jLblRemDate;
    private javax.swing.JLabel jLblRemId;
    private javax.swing.JLabel jLblRemName;
    private javax.swing.JLabel jLblRemTime;
    private javax.swing.JScrollPane jScrollPaneReminderTable;
    private javax.swing.JTable jTblReminderTable;
    private javax.swing.JTextField jTxtRemDate;
    private javax.swing.JTextField jTxtRemId;
    private javax.swing.JTextField jTxtRemName;
    private javax.swing.JTextField jTxtRemTime;
    // End of variables declaration//GEN-END:variables
}
