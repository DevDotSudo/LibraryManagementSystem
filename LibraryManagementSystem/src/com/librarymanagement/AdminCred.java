package com.librarymanagement;

import java.util.HashMap;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import javax.swing.JOptionPane;

public final class AdminCred {
    private static HashMap<String, String> storeCred;
    protected static File file;
    protected static FileWriter fWriter;
    protected static BufferedWriter bWriter;
    private String adminUser = "Admin";
    private String adminPass = "admin123";
    protected final String ADMIN_PATH = "/home/sudo_dotdev/Documents/Admin/AdminCred.txt";
    
    public AdminCred() {
        storeCred = new HashMap<>();
        
        storeCred.put(this.getAdminUser(), this.getAdminPass());
        
        try {
            file = new File(ADMIN_PATH);
            fWriter = new FileWriter(file);
            bWriter = new BufferedWriter(fWriter);
            
            for(String cred : storeCred.keySet()) {
                bWriter.write("Admin Username : " + cred);
                bWriter.write("\nAdmin Password : " + storeCred.get(cred));
            }
            
            bWriter.close();
            fWriter.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "There is an error : " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // getter and setter methods // 
    
    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
    }
    
    public String getAdminUser() {
        return this.adminUser;
    }
    
    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }
    
    public String getAdminPass() {
        return this.adminPass;
    }
    
    // end of getter and setter methods //
}