package com.librarymanagement.admin;

import java.awt.Color;
import javax.swing.JOptionPane;

public class AddStudents extends javax.swing.JFrame {
    DBConnection db;
    int xMouse;
    int yMouse;
    Color transparent = new Color(0, 0, 0, 0);
    public AddStudents() {
        db = new DBConnection();
        db.connect();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        moveFrame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        firstNameFld = new javax.swing.JTextField();
        midNameFld = new javax.swing.JTextField();
        lastNameFld = new javax.swing.JTextField();
        genderFld = new javax.swing.JTextField();
        ageFld = new javax.swing.JTextField();
        courseFld = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        usernameFld = new javax.swing.JTextField();
        passwordFld = new javax.swing.JTextField();
        addressFld = new javax.swing.JTextField();
        contactNumFld = new javax.swing.JTextField();
        idNumFld = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Students");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 238, 217));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 167, 255), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moveFrame.setBackground(new java.awt.Color(23, 107, 135));
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

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 238, 217));
        jLabel1.setText("Library Management System");
        moveFrame.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        exitBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/exit.png")); // NOI18N
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        moveFrame.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        jPanel1.add(moveFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 30));

        jPanel4.setBackground(transparent);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(23, 107, 135)), "Create Student Account", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 24), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstNameFld.setBackground(new java.awt.Color(255, 238, 217));
        firstNameFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        firstNameFld.setForeground(new java.awt.Color(11, 36, 71));
        firstNameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstNameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 107, 135), 2), "First Name", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel4.add(firstNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, 50));

        midNameFld.setBackground(new java.awt.Color(255, 238, 217));
        midNameFld.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        midNameFld.setForeground(new java.awt.Color(11, 36, 71));
        midNameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        midNameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Middle Name", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel4.add(midNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 170, 50));

        lastNameFld.setBackground(new java.awt.Color(255, 238, 217));
        lastNameFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lastNameFld.setForeground(new java.awt.Color(11, 36, 71));
        lastNameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastNameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Last Name", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel4.add(lastNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 170, 50));

        genderFld.setBackground(new java.awt.Color(255, 238, 217));
        genderFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        genderFld.setForeground(new java.awt.Color(11, 36, 71));
        genderFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        genderFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Gender", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel4.add(genderFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 170, 50));

        ageFld.setBackground(new java.awt.Color(255, 238, 217));
        ageFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        ageFld.setForeground(new java.awt.Color(11, 36, 71));
        ageFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ageFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Age", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel4.add(ageFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 170, 50));

        courseFld.setBackground(new java.awt.Color(255, 238, 217));
        courseFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        courseFld.setForeground(new java.awt.Color(11, 36, 71));
        courseFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        courseFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Course", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel4.add(courseFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 170, 50));

        jPanel2.setBackground(new java.awt.Color(23, 107, 135));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(165, 215, 232)));

        jLabel2.setFont(new java.awt.Font("Poppins ExtraBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 238, 217));
        jLabel2.setText("Student Information");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 250, 50));

        jPanel3.setBackground(new java.awt.Color(23, 107, 135));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 238, 217)));
        jPanel3.setForeground(new java.awt.Color(255, 238, 217));

        jLabel3.setFont(new java.awt.Font("Poppins ExtraBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 238, 217));
        jLabel3.setText("Student Credentials");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 250, 50));

        createBtn.setBackground(new java.awt.Color(23, 107, 135));
        createBtn.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        createBtn.setForeground(new java.awt.Color(255, 238, 217));
        createBtn.setText("Create Account");
        createBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 2, true));
        createBtn.setFocusable(false);
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        jPanel4.add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 210, 50));

        usernameFld.setBackground(new java.awt.Color(255, 238, 217));
        usernameFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        usernameFld.setForeground(new java.awt.Color(11, 36, 71));
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Student Username", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel4.add(usernameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 190, 50));

        passwordFld.setBackground(new java.awt.Color(255, 238, 217));
        passwordFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        passwordFld.setForeground(new java.awt.Color(11, 36, 71));
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Student Password", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel4.add(passwordFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 200, 50));

        addressFld.setBackground(new java.awt.Color(255, 238, 217));
        addressFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        addressFld.setForeground(new java.awt.Color(11, 36, 71));
        addressFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addressFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Student Address", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel4.add(addressFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 170, 50));

        contactNumFld.setBackground(new java.awt.Color(255, 238, 217));
        contactNumFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        contactNumFld.setForeground(new java.awt.Color(11, 36, 71));
        contactNumFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contactNumFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Contact Number", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel4.add(contactNumFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 170, 50));

        idNumFld.setBackground(new java.awt.Color(255, 238, 217));
        idNumFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        idNumFld.setForeground(new java.awt.Color(11, 36, 71));
        idNumFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idNumFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "ID Number", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel4.add(idNumFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 170, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 590, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(613, 603));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void moveFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        moveFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
    }//GEN-LAST:event_moveFrameMousePressed

    private void moveFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_moveFrameMouseDragged

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitBtnMouseClicked

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        try {
            int id = Integer.parseInt(idNumFld.getText());
            String fName = firstNameFld.getText();
            String mName = midNameFld.getText();
            String lName = lastNameFld.getText();
            String gender = genderFld.getText();
            int age = Integer.parseInt(ageFld.getText());
            String course = courseFld.getText();
            String address = addressFld.getText();
            long conNum = Long.parseLong(contactNumFld.getText());
            String username = usernameFld.getText();
            String password = passwordFld.getText();
            
            db.ps = db.con
                    .prepareStatement("INSERT INTO StudentInfo(ID, firstName, middleName, lastName, gender, age, course, address, contactNum) VALUES(?,?,?,?,?,?,?,?,?)");
            
            db.ps.setInt(1, id);
            db.ps.setString(2, fName);
            db.ps.setString(3, mName);
            db.ps.setString(4, lName);
            db.ps.setString(5, gender);
            db.ps.setInt(6, age);
            db.ps.setString(7, course);
            db.ps.setString(8, address);
            db.ps.setLong(9, conNum);
            
            int check1 = db.ps.executeUpdate();
                
            db.ps = db.con
                    .prepareStatement("INSERT INTO StudentCredentials(Username, Password) VALUES(?,?)");
            
            db.ps.setString(1, username);
            db.ps.setString(2, password);
            
            int check2 = db.ps.executeUpdate();
            
            if(check1 == 1) {
                if (check2 == 1) {
                    JOptionPane.showMessageDialog(null, "Created Successfully!");
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Student not created!", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }//GEN-LAST:event_createBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressFld;
    private javax.swing.JTextField ageFld;
    private javax.swing.JTextField contactNumFld;
    private javax.swing.JTextField courseFld;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JTextField firstNameFld;
    private javax.swing.JTextField genderFld;
    private javax.swing.JTextField idNumFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastNameFld;
    private javax.swing.JTextField midNameFld;
    private javax.swing.JPanel moveFrame;
    private javax.swing.JTextField passwordFld;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
