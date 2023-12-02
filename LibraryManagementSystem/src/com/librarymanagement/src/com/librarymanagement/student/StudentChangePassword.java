package com.librarymanagement.student;

import com.librarymanagement.admin.DBConnection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import keeptoo.KGradientPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class StudentChangePassword extends javax.swing.JFrame {
    static Color transparent = new Color(0, 0, 0, 0);
    static DBConnection db;
    String first_name;
    
    public StudentChangePassword() {
        initComponents();
        db = new DBConnection();
        db.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new KGradientPanel();
        moveFrame = new JPanel();
        backBtn = new JLabel();
        confirmBtn = new JButton();
        jLabel4 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        newPass = new JPasswordField();
        confirmPass = new JPasswordField();
        newEmpty = new JLabel();
        confirmEmpty = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new AbsoluteLayout());

        kGradientPanel1.setkEndColor(new Color(57, 167, 255));
        kGradientPanel1.setkStartColor(new Color(23, 107, 135));
        kGradientPanel1.setLayout(new AbsoluteLayout());

        moveFrame.setBackground(transparent);

        backBtn.setFont(new Font("Poppins Medium", 0, 12)); // NOI18N
        backBtn.setForeground(new Color(255, 238, 217));
        backBtn.setHorizontalAlignment(SwingConstants.CENTER);
        backBtn.setIcon(new ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/left-arrow.png")); // NOI18N
        backBtn.setText("Back to login");
        backBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        GroupLayout moveFrameLayout = new GroupLayout(moveFrame);
        moveFrame.setLayout(moveFrameLayout);
        moveFrameLayout.setHorizontalGroup(moveFrameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(moveFrameLayout.createSequentialGroup()
                .addComponent(backBtn)
                .addGap(0, 254, Short.MAX_VALUE))
        );
        moveFrameLayout.setVerticalGroup(moveFrameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(moveFrameLayout.createSequentialGroup()
                .addComponent(backBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        kGradientPanel1.add(moveFrame, new AbsoluteConstraints(0, 0, 360, -1));

        confirmBtn.setBackground(new Color(255, 238, 217));
        confirmBtn.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        confirmBtn.setForeground(new Color(23, 107, 135));
        confirmBtn.setText("CONFIRM");
        confirmBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(confirmBtn, new AbsoluteConstraints(130, 220, 110, -1));

        jLabel4.setFont(new Font("Poppins ExtraBold", 1, 14)); // NOI18N
        jLabel4.setForeground(new Color(255, 238, 217));
        jLabel4.setText("CHANGE YOUR PASSWORD");
        jLabel4.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(255, 238, 217)));
        jLabel4.setFocusable(false);
        kGradientPanel1.add(jLabel4, new AbsoluteConstraints(90, 30, -1, 30));

        jLabel2.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new Color(255, 238, 217));
        jLabel2.setText("Your new password");
        kGradientPanel1.add(jLabel2, new AbsoluteConstraints(70, 80, -1, -1));

        jLabel3.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new Color(255, 238, 217));
        jLabel3.setText("Confirm password");
        kGradientPanel1.add(jLabel3, new AbsoluteConstraints(70, 140, -1, -1));

        newPass.setBackground(new Color(57, 167, 255));
        newPass.setFont(new Font("Poppins Medium", 0, 12)); // NOI18N
        newPass.setForeground(new Color(255, 238, 217));
        newPass.setHorizontalAlignment(JTextField.CENTER);
        newPass.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(255, 238, 217)));
        kGradientPanel1.add(newPass, new AbsoluteConstraints(70, 100, 230, 30));

        confirmPass.setBackground(new Color(57, 167, 255));
        confirmPass.setFont(new Font("Poppins Medium", 0, 12)); // NOI18N
        confirmPass.setForeground(new Color(255, 238, 217));
        confirmPass.setHorizontalAlignment(JTextField.CENTER);
        confirmPass.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(255, 238, 217)));
        kGradientPanel1.add(confirmPass, new AbsoluteConstraints(70, 160, 230, 30));

        newEmpty.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        newEmpty.setForeground(new Color(255, 0, 0));
        newEmpty.setHorizontalAlignment(SwingConstants.CENTER);
        kGradientPanel1.add(newEmpty, new AbsoluteConstraints(290, 80, 10, -1));

        confirmEmpty.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        confirmEmpty.setForeground(new Color(255, 0, 0));
        confirmEmpty.setHorizontalAlignment(SwingConstants.CENTER);
        kGradientPanel1.add(confirmEmpty, new AbsoluteConstraints(290, 140, 10, -1));

        getContentPane().add(kGradientPanel1, new AbsoluteConstraints(0, 0, 360, 270));

        setSize(new Dimension(360, 268));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    protected void setFirstName(String first_name) {
        this.first_name = first_name;
    }
    protected String getFirstName() {
        return this.first_name;
    }
    
    private void confirmBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        String new_pass = newPass.getText();
        String confirm_pass = confirmPass.getText();
        
        newEmpty.setText(new_pass.isEmpty() ? "*" : "");
        confirmEmpty.setText(confirm_pass.isEmpty() ? "*" : "");
        
        try {
            if(!new_pass.isEmpty() && !confirm_pass.isEmpty()) {
                if(new_pass.equals(confirm_pass)) {
                int confirm = JOptionPane.showConfirmDialog(null, "Confirm update?", "Message", JOptionPane.OK_CANCEL_OPTION);
            
                    if(confirm == JOptionPane.OK_OPTION) {
                        db.ps = db.con.prepareStatement("UPDATE StudentInfo SET password = ? WHERE firstName = ?");
                        db.ps.setString(1, confirm_pass);
                        db.ps.setString(2, first_name );
                        int check = db.ps.executeUpdate();

                        if(check == 1) {
                            JOptionPane.showMessageDialog(null, "Password changed, Thank you!");
                            newPass.setText("");
                            confirmPass.setText("");
                            return;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Password mismatch", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(Exception e) {
            System.out.println("Error : " +e.getMessage());
        }
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void backBtnMouseClicked(MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        StudentLogin login = new StudentLogin();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_backBtnMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel backBtn;
    private JButton confirmBtn;
    private JLabel confirmEmpty;
    private JPasswordField confirmPass;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private KGradientPanel kGradientPanel1;
    private JPanel moveFrame;
    private JLabel newEmpty;
    private JPasswordField newPass;
    // End of variables declaration//GEN-END:variables
}
