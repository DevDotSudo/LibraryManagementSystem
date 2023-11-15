package com.librarymanagement.admin;

public class UpdateStudents extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    
    public UpdateStudents() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        moveFrame = new javax.swing.JPanel();
        dispose = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        studID = new javax.swing.JTextField();
        fNameFld = new javax.swing.JTextField();
        mNameFld = new javax.swing.JTextField();
        lNameFld = new javax.swing.JTextField();
        genderFld = new javax.swing.JTextField();
        ageFld = new javax.swing.JTextField();
        courseFld = new javax.swing.JTextField();
        addressFld = new javax.swing.JTextField();
        contactNumFld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 238, 217));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moveFrame.setBackground(new java.awt.Color(23, 107, 135));
        moveFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        dispose.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/exit.png")); // NOI18N
        dispose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disposeMouseClicked(evt);
            }
        });
        moveFrame.add(dispose, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 30, -1));

        jPanel1.add(moveFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 30));

        jPanel3.setBackground(new java.awt.Color(255, 238, 217));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 107, 135), 2), "Edit Student Profile", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 1, 18), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/boy.png")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(23, 107, 135)));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 390, 10));

        studID.setBackground(new java.awt.Color(255, 238, 217));
        studID.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        studID.setForeground(new java.awt.Color(11, 36, 71));
        studID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        studID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 107, 135), 2), "Student ID Number", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel3.add(studID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, 50));

        fNameFld.setBackground(new java.awt.Color(255, 238, 217));
        fNameFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fNameFld.setForeground(new java.awt.Color(11, 36, 71));
        fNameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fNameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "First Name", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins Medium", 0, 12), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel3.add(fNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 150, 40));

        mNameFld.setBackground(new java.awt.Color(255, 238, 217));
        mNameFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        mNameFld.setForeground(new java.awt.Color(11, 36, 71));
        mNameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mNameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Middle Name", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins Medium", 0, 12), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel3.add(mNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 150, 40));

        lNameFld.setBackground(new java.awt.Color(255, 238, 217));
        lNameFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lNameFld.setForeground(new java.awt.Color(11, 36, 71));
        lNameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lNameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Last Name", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins Medium", 0, 12), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel3.add(lNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 150, 40));

        genderFld.setBackground(new java.awt.Color(255, 238, 217));
        genderFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        genderFld.setForeground(new java.awt.Color(11, 36, 71));
        genderFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        genderFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Gender", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins Medium", 0, 12), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel3.add(genderFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 150, 40));

        ageFld.setBackground(new java.awt.Color(255, 238, 217));
        ageFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        ageFld.setForeground(new java.awt.Color(11, 36, 71));
        ageFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ageFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Age", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins Medium", 0, 12), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel3.add(ageFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 140, 40));

        courseFld.setBackground(new java.awt.Color(255, 238, 217));
        courseFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        courseFld.setForeground(new java.awt.Color(11, 36, 71));
        courseFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        courseFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Course", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins Medium", 0, 12), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel3.add(courseFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 140, 40));

        addressFld.setBackground(new java.awt.Color(255, 238, 217));
        addressFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        addressFld.setForeground(new java.awt.Color(11, 36, 71));
        addressFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addressFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Address", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins Medium", 0, 12), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel3.add(addressFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 140, 40));

        contactNumFld.setBackground(new java.awt.Color(255, 238, 217));
        contactNumFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        contactNumFld.setForeground(new java.awt.Color(11, 36, 71));
        contactNumFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contactNumFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Contact Number", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins Medium", 0, 12), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel3.add(contactNumFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 140, 40));

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(23, 107, 135));
        jLabel3.setText("Student Profile");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        saveBtn.setBackground(new java.awt.Color(23, 107, 135));
        saveBtn.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 238, 217));
        saveBtn.setText("Save Changes");
        saveBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 0, true));
        saveBtn.setFocusable(false);
        jPanel3.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 140, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 550));

        setSize(new java.awt.Dimension(427, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void disposeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disposeMouseClicked
        this.dispose();
    }//GEN-LAST:event_disposeMouseClicked

    private void moveFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_moveFrameMousePressed

    private void moveFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_moveFrameMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressFld;
    private javax.swing.JTextField ageFld;
    private javax.swing.JTextField contactNumFld;
    private javax.swing.JTextField courseFld;
    private javax.swing.JLabel dispose;
    private javax.swing.JTextField fNameFld;
    private javax.swing.JTextField genderFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lNameFld;
    private javax.swing.JTextField mNameFld;
    private javax.swing.JPanel moveFrame;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField studID;
    // End of variables declaration//GEN-END:variables
}
