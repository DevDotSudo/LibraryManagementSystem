package com.librarymanagement.student;

import com.librarymanagement.admin.ChooseAcc;
import java.awt.Color;
import javax.swing.JOptionPane;

public class StudentMenu extends javax.swing.JFrame {
    static Color transparent;
    int xMouse;
    int yMouse;
    
    public StudentMenu() {
        transparent = new Color(0, 0, 0, 0);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();
        profileBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        borrowBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        changePassBtn = new javax.swing.JButton();
        exitSystemBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JLabel();
        moveFrame = new javax.swing.JPanel();
        navMenu = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fNameFld = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mNameFld = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lNameFld = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        genderFld = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        conNumFld = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        deptFld = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ageFld = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        yearAndSectionFld = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        oldPassFld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        newPassFld = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navPanel.setBackground(new java.awt.Color(57, 167, 255));
        navPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        navPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/profile.png")); // NOI18N
        jLabel1.setText("Student");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(254, 254, 254)));
        jLabel1.setIconTextGap(10);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        navPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 60));

        backBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(254, 254, 254));
        backBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/left-arrow.png")); // NOI18N
        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        navPanel.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        profileBtn.setBackground(transparent);
        profileBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        profileBtn.setForeground(new java.awt.Color(254, 254, 254));
        profileBtn.setText("My Profile");
        profileBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        profileBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileBtn.setFocusable(false);
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });
        navPanel.add(profileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 220, 40));

        homeBtn.setBackground(transparent);
        homeBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(254, 254, 254));
        homeBtn.setText("Home");
        homeBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.setFocusable(false);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        navPanel.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 40));

        borrowBtn.setBackground(transparent);
        borrowBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        borrowBtn.setForeground(new java.awt.Color(254, 254, 254));
        borrowBtn.setText("Borrowed Books");
        borrowBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        borrowBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrowBtn.setFocusable(false);
        borrowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowBtnActionPerformed(evt);
            }
        });
        navPanel.add(borrowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 220, 40));

        returnBtn.setBackground(transparent);
        returnBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        returnBtn.setForeground(new java.awt.Color(254, 254, 254));
        returnBtn.setText("Return Book");
        returnBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        returnBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnBtn.setFocusable(false);
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        navPanel.add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, 40));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/isufst.png")); // NOI18N
        jLabel2.setText("ISUFST");
        navPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        changePassBtn.setBackground(transparent);
        changePassBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        changePassBtn.setForeground(new java.awt.Color(254, 254, 254));
        changePassBtn.setText("Change Password");
        changePassBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        changePassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changePassBtn.setFocusable(false);
        changePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassBtnActionPerformed(evt);
            }
        });
        navPanel.add(changePassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 220, 40));

        exitSystemBtn.setBackground(transparent);
        exitSystemBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        exitSystemBtn.setForeground(new java.awt.Color(254, 254, 254));
        exitSystemBtn.setText("Exit System");
        exitSystemBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        exitSystemBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitSystemBtn.setFocusable(false);
        exitSystemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitSystemBtnActionPerformed(evt);
            }
        });
        navPanel.add(exitSystemBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 220, 40));

        jLabel3.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Library Management");
        navPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, -1));

        idLabel.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        idLabel.setForeground(new java.awt.Color(254, 254, 254));
        idLabel.setText("ID : ");
        navPanel.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, -1));

        getContentPane().add(navPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 500));

        jPanel1.setBackground(new java.awt.Color(255, 238, 217));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/exit.png")); // NOI18N
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 30, -1));

        moveFrame.setBackground(new java.awt.Color(57, 167, 255));
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
        jPanel1.add(moveFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 0, 880, 30));

        navMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(255, 238, 217));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 238, 217));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Home - Choose Your Department", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 18), new java.awt.Color(57, 167, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(23, 107, 135));
        jButton1.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/security.png")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 160, 110));

        jButton2.setBackground(new java.awt.Color(23, 107, 135));
        jButton2.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/presentation.png")); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 170, 110));

        jButton3.setBackground(new java.awt.Color(23, 107, 135));
        jButton3.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/laser-cutting-machine.png")); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 160, 100));

        jButton4.setBackground(new java.awt.Color(23, 107, 135));
        jButton4.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/managers.png")); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 170, 100));

        jLabel20.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(57, 167, 255));
        jLabel20.setText("Information Technology");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 180, 40));

        jLabel21.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(57, 167, 255));
        jLabel21.setText("Education");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        jLabel22.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(57, 167, 255));
        jLabel22.setText("Industrial Technology");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 160, 30));

        jLabel23.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(57, 167, 255));
        jLabel23.setText("Hotel Management");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 580, 380));

        navMenu.addTab("Home", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 238, 217));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 238, 217));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "My Profile", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 18), new java.awt.Color(57, 167, 255))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(57, 167, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setFocusable(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("First Name : ");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        fNameFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fNameFld.setForeground(new java.awt.Color(254, 254, 254));
        fNameFld.setText("Eric Dave");
        fNameFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(fNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 110, -1));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Middle Name : ");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        mNameFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        mNameFld.setForeground(new java.awt.Color(254, 254, 254));
        mNameFld.setText("Seballos");
        mNameFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(mNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 110, -1));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Last Name : ");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lNameFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lNameFld.setForeground(new java.awt.Color(254, 254, 254));
        lNameFld.setText("Cala-or");
        lNameFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(lNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 110, -1));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("Gender : ");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        genderFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        genderFld.setForeground(new java.awt.Color(254, 254, 254));
        genderFld.setText("Male");
        genderFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(genderFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 60, -1));

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setText("Contact Number : ");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        conNumFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        conNumFld.setForeground(new java.awt.Color(254, 254, 254));
        conNumFld.setText("09814106023");
        conNumFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(conNumFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 100, -1));

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(254, 254, 254));
        jLabel14.setText("Department : ");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        deptFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        deptFld.setForeground(new java.awt.Color(254, 254, 254));
        deptFld.setText("CICT");
        deptFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(deptFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 80, -1));

        jLabel16.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(254, 254, 254));
        jLabel16.setText("Age  : ");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        ageFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        ageFld.setForeground(new java.awt.Color(254, 254, 254));
        ageFld.setText("21");
        ageFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(ageFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 40, -1));

        jLabel18.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(254, 254, 254));
        jLabel18.setText("Year & Section : ");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        yearAndSectionFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        yearAndSectionFld.setForeground(new java.awt.Color(254, 254, 254));
        yearAndSectionFld.setText("2-E");
        yearAndSectionFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(yearAndSectionFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 50, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 560, 200));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 600, 360));

        navMenu.addTab("Your Profile", jPanel4);

        jPanel7.setBackground(new java.awt.Color(255, 238, 217));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 238, 217));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrowed Books", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 18), new java.awt.Color(57, 167, 255))); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 610, 390));

        navMenu.addTab("Borrowed Books", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 238, 217));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 238, 217));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Return Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 18), new java.awt.Color(57, 167, 255))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 600, 360));

        navMenu.addTab("Return Book", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 238, 217));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 238, 217));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 18), new java.awt.Color(57, 167, 255))); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(57, 167, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Enter your old password");
        jPanel13.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        oldPassFld.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        oldPassFld.setForeground(new java.awt.Color(44, 44, 44));
        oldPassFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        oldPassFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPassFldActionPerformed(evt);
            }
        });
        jPanel13.add(oldPassFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 180, -1));

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Enter your new password");
        jPanel13.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        newPassFld.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        newPassFld.setForeground(new java.awt.Color(44, 44, 44));
        newPassFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel13.add(newPassFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, -1));

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Confirm your new password");
        jPanel13.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 180, -1));

        jPasswordField1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(44, 44, 44));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel13.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, -1));

        jButton5.setBackground(new java.awt.Color(57, 167, 255));
        jButton5.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(254, 254, 254));
        jButton5.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/pass2.png")); // NOI18N
        jButton5.setText("Save Password");
        jButton5.setBorder(null);
        jButton5.setFocusable(false);
        jButton5.setIconTextGap(10);
        jPanel13.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 180, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/pass1.png")); // NOI18N
        jPanel13.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 310, 180));

        jLabel13.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(254, 254, 254));
        jLabel13.setText("Let's secure your account");
        jPanel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, -1));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 490, 270));

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 560, 350));

        navMenu.addTab("Change Password", jPanel9);

        jPanel1.add(navMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 660, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 660, 500));

        setSize(new java.awt.Dimension(879, 497));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        if(profileBtn.isSelected()) {
            profileBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        profileBtn.setBackground(new java.awt.Color(57, 167, 255));
        navMenu.setSelectedIndex(1);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
       if(homeBtn.isSelected()) {
            homeBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        homeBtn.setBackground(new java.awt.Color(57, 167, 255));
        navMenu.setSelectedIndex(0);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void borrowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowBtnActionPerformed
        if(borrowBtn.isSelected()) {
            borrowBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        borrowBtn.setBackground(new java.awt.Color(57, 167, 255));
        navMenu.setSelectedIndex(2);
    }//GEN-LAST:event_borrowBtnActionPerformed

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        ChooseAcc choose = new ChooseAcc();
        this.dispose();
        choose.setVisible(true);
    }//GEN-LAST:event_backBtnMouseClicked

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        if(returnBtn.isSelected()) {
            returnBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        returnBtn.setBackground(new java.awt.Color(57, 167, 255));
        navMenu.setSelectedIndex(3);
    }//GEN-LAST:event_returnBtnActionPerformed

    private void changePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassBtnActionPerformed
        if(changePassBtn.isSelected()) {
            changePassBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        changePassBtn.setBackground(new java.awt.Color(57, 167, 255));
        navMenu.setSelectedIndex(4);
    }//GEN-LAST:event_changePassBtnActionPerformed

    private void exitSystemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitSystemBtnActionPerformed
        if(exitSystemBtn.isSelected()) {
            exitSystemBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        exitSystemBtn.setBackground(new java.awt.Color(57, 167, 255));
        
        int exit = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit System", JOptionPane.OK_CANCEL_OPTION);
        
        if(exit == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitSystemBtnActionPerformed

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

    private void oldPassFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPassFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldPassFldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageFld;
    private javax.swing.JLabel backBtn;
    private javax.swing.JButton borrowBtn;
    private javax.swing.JButton changePassBtn;
    private javax.swing.JLabel conNumFld;
    private javax.swing.JLabel deptFld;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JButton exitSystemBtn;
    private javax.swing.JLabel fNameFld;
    private javax.swing.JLabel genderFld;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lNameFld;
    private javax.swing.JLabel mNameFld;
    private javax.swing.JPanel moveFrame;
    private javax.swing.JTabbedPane navMenu;
    private javax.swing.JPanel navPanel;
    private javax.swing.JPasswordField newPassFld;
    private javax.swing.JTextField oldPassFld;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton returnBtn;
    private javax.swing.JLabel yearAndSectionFld;
    // End of variables declaration//GEN-END:variables
}
