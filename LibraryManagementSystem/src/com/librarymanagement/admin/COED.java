
package com.librarymanagement.admin;

public class COED extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    public COED() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        moveFrame = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 238, 217));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moveFrame.setBackground(new java.awt.Color(23, 107, 135));
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

        exit.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/exit.png")); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        moveFrame.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, -1, -1));

        jPanel1.add(moveFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 30));

        jPanel2.setBackground(new java.awt.Color(255, 238, 217));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 107, 135), 2), "COED BOOKS MANAGER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 1, 18), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(23, 107, 135)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 840, 10));

        jTable1.setBorder(null);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Title", "Book Author", "Book Pages"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 820, 200));

        jTextField5.setBackground(new java.awt.Color(255, 238, 217));
        jTextField5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(11, 36, 71));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Book ID", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 50));

        jTextField6.setBackground(new java.awt.Color(255, 238, 217));
        jTextField6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(11, 36, 71));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Book Title", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 190, 50));

        jTextField7.setBackground(new java.awt.Color(255, 238, 217));
        jTextField7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(11, 36, 71));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Book Author", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 180, 50));

        jTextField8.setBackground(new java.awt.Color(255, 238, 217));
        jTextField8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(11, 36, 71));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Book Pages", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 180, 50));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 107, 135));
        jLabel2.setText("List of Books");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jButton1.setBackground(new java.awt.Color(23, 107, 135));
        jButton1.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 238, 217));
        jButton1.setText("Add Book");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, 50));

        jButton2.setBackground(new java.awt.Color(23, 107, 135));
        jButton2.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 238, 217));
        jButton2.setText("Update Book");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 170, 50));

        jButton3.setBackground(new java.awt.Color(23, 107, 135));
        jButton3.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 238, 217));
        jButton3.setText("Delete Book");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 170, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 860, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 500));

        setSize(new java.awt.Dimension(880, 491));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

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
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel moveFrame;
    // End of variables declaration//GEN-END:variables
}
