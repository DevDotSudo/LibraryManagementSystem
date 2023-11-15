/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.librarymanagement.admin;


import java.awt.Color;
import javax.swing.JOptionPane;


public class AdminMenu extends javax.swing.JFrame {
    Color transparent = new Color(0, 0, 0, 0);
    int xMouse;
    int yMouse;
    
    public AdminMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        moveFrame = new javax.swing.JPanel();
        line = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        addStudentsBtn = new javax.swing.JButton();
        showStudentsBtn = new javax.swing.JButton();
        updateStudentsBtn = new javax.swing.JButton();
        deleteStudentsBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        cictBtn = new javax.swing.JButton();
        coedBtn = new javax.swing.JButton();
        chmBtn = new javax.swing.JButton();
        citBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exitSystemBtn = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 238, 217));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/exit.png")); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, -1, -1));

        moveFrame.setBackground(new java.awt.Color(23, 107, 135));
        moveFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        moveFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        moveFrame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveFrameMouseDragged(evt);
            }
        });
        moveFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moveFrameMousePressed(evt);
            }
        });
        moveFrame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(moveFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 30));

        line.setBackground(new java.awt.Color(57, 167, 255));
        line.setForeground(new java.awt.Color(255, 238, 217));
        line.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(57, 167, 255)));
        jPanel1.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 880, 10));

        jPanel4.setBackground(new java.awt.Color(23, 107, 135));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 238, 217));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 107, 135));
        jLabel1.setText("CHOOSE A TASK");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 20));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 240, 40));

        jPanel3.setBackground(transparent);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 238, 217), 2), "Students", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Black", 0, 18), new java.awt.Color(255, 238, 217))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addStudentsBtn.setBackground(transparent);
        addStudentsBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        addStudentsBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/addStud.png")); // NOI18N
        addStudentsBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 238, 217)), "Add Students", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Poppins Medium", 0, 14), new java.awt.Color(255, 238, 217))); // NOI18N
        addStudentsBtn.setFocusable(false);
        addStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentsBtnActionPerformed(evt);
            }
        });
        jPanel3.add(addStudentsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, 110));

        showStudentsBtn.setBackground(transparent);
        showStudentsBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/phone-book.png")); // NOI18N
        showStudentsBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(234, 234, 234)), "Show Students", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Poppins Medium", 0, 14), new java.awt.Color(255, 238, 217))); // NOI18N
        showStudentsBtn.setFocusable(false);
        showStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStudentsBtnActionPerformed(evt);
            }
        });
        jPanel3.add(showStudentsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 140, 110));

        updateStudentsBtn.setBackground(transparent);
        updateStudentsBtn.setForeground(new java.awt.Color(255, 238, 217));
        updateStudentsBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/update.png")); // NOI18N
        updateStudentsBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 238, 217)), "Update Students", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Poppins Medium", 0, 14), new java.awt.Color(255, 238, 217))); // NOI18N
        updateStudentsBtn.setFocusable(false);
        updateStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentsBtnActionPerformed(evt);
            }
        });
        jPanel3.add(updateStudentsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 140, 90));

        deleteStudentsBtn.setBackground(transparent);
        deleteStudentsBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/icons8-delete-48.png")); // NOI18N
        deleteStudentsBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 238, 217)), "Delete Students", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Poppins Medium", 0, 14), new java.awt.Color(255, 238, 217))); // NOI18N
        deleteStudentsBtn.setFocusable(false);
        deleteStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentsBtnActionPerformed(evt);
            }
        });
        jPanel3.add(deleteStudentsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 140, 90));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 390, 290));

        jPanel6.setBackground(transparent);
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 238, 217), 2), "Departments", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Black", 0, 18), new java.awt.Color(255, 238, 217))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cictBtn.setBackground(transparent);
        cictBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/security.png")); // NOI18N
        cictBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 238, 217)), "CICT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Poppins Medium", 0, 14), new java.awt.Color(255, 238, 217))); // NOI18N
        cictBtn.setFocusable(false);
        cictBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cictBtnActionPerformed(evt);
            }
        });
        jPanel6.add(cictBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, 110));

        coedBtn.setBackground(transparent);
        coedBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/presentation.png")); // NOI18N
        coedBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 238, 217)), "COED", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Poppins Medium", 0, 14), new java.awt.Color(255, 238, 217))); // NOI18N
        coedBtn.setFocusable(false);
        coedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coedBtnActionPerformed(evt);
            }
        });
        jPanel6.add(coedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 130, 110));

        chmBtn.setBackground(transparent);
        chmBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/managers.png")); // NOI18N
        chmBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 238, 217)), "CHM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Poppins Medium", 0, 14), new java.awt.Color(255, 238, 217))); // NOI18N
        chmBtn.setFocusable(false);
        chmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chmBtnActionPerformed(evt);
            }
        });
        jPanel6.add(chmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 171, 130, 90));

        citBtn.setBackground(transparent);
        citBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/laser-cutting-machine.png")); // NOI18N
        citBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 238, 217)), "CIT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Poppins Medium", 0, 14), new java.awt.Color(255, 238, 217))); // NOI18N
        citBtn.setFocusable(false);
        citBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citBtnActionPerformed(evt);
            }
        });
        jPanel6.add(citBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 140, 90));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 380, 290));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 840, 390));

        jPanel2.setBackground(new java.awt.Color(255, 238, 217));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(57, 167, 255));
        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 167, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/isufst.png")); // NOI18N
        jLabel2.setText("ISUFST");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 167, 255));
        jLabel5.setText("Library Management");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 130, -1));

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 167, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/admin.png")); // NOI18N
        jLabel3.setText("Admin");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(57, 167, 255)));
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 880, 70));

        exitSystemBtn.setBackground(new java.awt.Color(57, 167, 255));
        exitSystemBtn.setFont(new java.awt.Font("Poppins ExtraBold", 0, 18)); // NOI18N
        exitSystemBtn.setForeground(new java.awt.Color(57, 167, 255));
        exitSystemBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/power-on.png")); // NOI18N
        exitSystemBtn.setLabelFor(exitSystemBtn);
        exitSystemBtn.setText("Exit");
        exitSystemBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        exitSystemBtn.setFocusable(false);
        exitSystemBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitSystemBtnMouseClicked(evt);
            }
        });
        jPanel1.add(exitSystemBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, -1, -1));

        backBtn.setFont(new java.awt.Font("Poppins ExtraBold", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(57, 167, 255));
        backBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/left-arrow.png")); // NOI18N
        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(879, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void moveFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_moveFrameMousePressed

    private void moveFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_moveFrameMouseDragged

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        ChooseAcc choose = new ChooseAcc();
        this.dispose();
        choose.setVisible(true);
    }//GEN-LAST:event_backBtnMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void addStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentsBtnActionPerformed
        if(addStudentsBtn.isSelected()) {
            addStudentsBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        addStudentsBtn.setBackground(new java.awt.Color(23,107,135));
        
        AddStudents add = new AddStudents();
        add.setVisible(true);
    }//GEN-LAST:event_addStudentsBtnActionPerformed

    private void showStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStudentsBtnActionPerformed
        if(showStudentsBtn.isSelected()) {
            showStudentsBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        showStudentsBtn.setBackground(new java.awt.Color(23,107,135));
        
        ShowStudents show = new ShowStudents();
        show.setVisible(true);
    }//GEN-LAST:event_showStudentsBtnActionPerformed

    private void updateStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentsBtnActionPerformed
        if(updateStudentsBtn.isSelected()) {
            updateStudentsBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        updateStudentsBtn.setBackground(new java.awt.Color(23,107,135));
        
        UpdateStudents update = new UpdateStudents();
        update.setVisible(true);
    }//GEN-LAST:event_updateStudentsBtnActionPerformed

    private void deleteStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentsBtnActionPerformed
        if(deleteStudentsBtn.isSelected()) {
            deleteStudentsBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        deleteStudentsBtn.setBackground(new java.awt.Color(23,107,135));
        
        DeleteStudents delete = new DeleteStudents();
        delete.setVisible(true);
    }//GEN-LAST:event_deleteStudentsBtnActionPerformed

    private void cictBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cictBtnActionPerformed
        if(cictBtn.isSelected()) {
            cictBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        cictBtn.setBackground(new java.awt.Color(23,107,135));
        
        CICT cict = new CICT();
        cict.setVisible(true);
    }//GEN-LAST:event_cictBtnActionPerformed

    private void coedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coedBtnActionPerformed
        if(coedBtn.isSelected()) {
            coedBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        coedBtn.setBackground(new java.awt.Color(23,107,135));
        
        COED coed = new COED();
        coed.setVisible(true);
    }//GEN-LAST:event_coedBtnActionPerformed

    private void citBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citBtnActionPerformed
        if(citBtn.isSelected()) {
            citBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        citBtn.setBackground(new java.awt.Color(23,107,135));
        
        CIT cit = new CIT();
        cit.setVisible(true);
    }//GEN-LAST:event_citBtnActionPerformed

    private void chmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chmBtnActionPerformed
        if(chmBtn.isSelected()) {
            chmBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        chmBtn.setBackground(new java.awt.Color(23,107,135));
        
        CHM chm = new CHM();
        chm.setVisible(true);
    }//GEN-LAST:event_chmBtnActionPerformed

    private void exitSystemBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitSystemBtnMouseClicked
        int exit = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit System", JOptionPane.OK_CANCEL_OPTION);
        
        if(exit == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitSystemBtnMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentsBtn;
    private javax.swing.JLabel backBtn;
    private javax.swing.JButton chmBtn;
    private javax.swing.JButton cictBtn;
    private javax.swing.JButton citBtn;
    private javax.swing.JButton coedBtn;
    private javax.swing.JButton deleteStudentsBtn;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exitSystemBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel line;
    private javax.swing.JPanel moveFrame;
    private javax.swing.JButton showStudentsBtn;
    private javax.swing.JButton updateStudentsBtn;
    // End of variables declaration//GEN-END:variables

    
}

