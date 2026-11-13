/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jobapplicationtracker;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import jobapplicationtracker.view.Login_frame;


/**
 *
 * @author Acer Nitro
 */
public class JobApplicationTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlatDarkLaf.setup();
        
        SwingUtilities.invokeLater(()->{
            Login_frame frame = new Login_frame();
            frame.setVisible(true);
        });
       
        
        
    }
    
}
