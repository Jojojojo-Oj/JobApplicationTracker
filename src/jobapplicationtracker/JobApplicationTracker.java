/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jobapplicationtracker;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import jobapplicationtracker.view.LoginFrame;

/**
 *
 * @author Acer Nitro
 */
public class JobApplicationTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        FlatLightLaf.setup();
        SwingUtilities.invokeLater(() -> {
            LoginFrame login = new LoginFrame();
            login.setVisible(true);
        });
        
        
    }
    
}
