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
        List<SeriesModel> seriesList = new ArrayList<>();
        
        
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
                    captureSeries(seriesList);
                    break;
                case "2":
                    String searchId = JOptionPane.showInputDialog(null, "w");
                    for (SeriesModel series : seriesList) {
                        String seriesFound = null;
                        if(searchId.equals(series.getSeriesId())){
                            
                            System.out.println("----------------------\n");
                            System.out.println("SERIES FOUND!!!");
                            seriesFound = searchId;

                        }
                        
                        if(seriesFound != null){
                            System.out.println("\nID: " + series.getSeriesId());
                            System.out.println("Name: " + series.getSeriesName());
                            System.out.println("Age Restriction: " + series.getSeriesAge());
                            System.out.println("Episodes: " + series.getSeriesNumberOfEpisodes());
                            System.out.println("----------------------\n");
                            break;
                            
                        }else{
                            System.out.println("No series by that id was found");
                            break;
                        }
                    }
                    break; 
                case "3":
                    
                    break;
                case "4":
                    break;
                case "5":
                    for (SeriesModel series : seriesList) {
                        System.out.println("ID: " + series.getSeriesId());
                        System.out.println("Name: " + series.getSeriesName());
                        System.out.println("Age Restriction: " + series.getSeriesAge());
                        System.out.println("Episodes: " + series.getSeriesNumberOfEpisodes());
                        System.out.println("----------------------");
                    }
                    break;
                case "6":
                    running = false;
                    break;
            }   

        }

    }
    
    public static void captureSeries(List seriesList){
        
        
        System.out.print("\nEnter the Series ID: ");
        String SeriesId = input.nextLine();
        
        System.out.print("Enter the Series Name: ");
        String SeriesName = input.nextLine();
        
        System.out.print("Enter the Series age restriction: ");
        int SeriesAge = Integer.parseInt(input.nextLine());
        
        while (SeriesAge > 18 || SeriesAge < 2){
            System.out.print("Please re-enter the Series age restriction between 2 & 18: ");
            SeriesAge = Integer.parseInt(input.nextLine());
        }
        
        System.out.print("Enter the number of episodes for " + SeriesName + ": ");
        String SeriesNumberOfEpisodes = input.nextLine();
        
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
        
        // Store in list
        seriesList.add(new SeriesModel(SeriesId, SeriesName, SeriesAge, SeriesNumberOfEpisodes));
        
        //Instantietion for SeriesModel object
        SeriesModel details = new SeriesModel(SeriesId, SeriesName, SeriesAge, SeriesNumberOfEpisodes);
        
        
        System.out.print("\n ID: " + details.getSeriesId() + "\n Name: " + details.getSeriesName() + "\n Age: " + details.getSeriesAge() + "\n Episodes: " + details.getSeriesNumberOfEpisodes() + "\n");
        
        
    }
    
}
