/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tvmanagementapp;

/**
 *
 * @author maxwe
 */

import java.util.*;
import javax.swing.*;

public class Menu {
    private static Scanner input = new Scanner(System.in);
    

    public static void menuPopUp(){
        
        
        
        boolean running = true;
    
        while (running){
            String options = JOptionPane.showInputDialog(null, """
    
                1 - Capture a new series
                2 - Search for a series
                3 - Update series age restriction                                             
                4 - Delete a series
                5 - Print series report - 2025
                6 - Exit Application                                        
                                                        """, "MENU", JOptionPane.INFORMATION_MESSAGE);
            
            switch (options){
                case "1":
                    Options.captureSeries();
                    break;
                case "2":
                        Options.searchSeries();                   
                    break; 
                case "3":
                    
                    break;
                case "4":                    
                        Options.deleteSeries();              
                    break;
                case "5":
                        Options.existingSeriesReport();   
                    break;
                case "6":
                    running = false;
                    break;
            }   

        }

    }
    
    
    
}
