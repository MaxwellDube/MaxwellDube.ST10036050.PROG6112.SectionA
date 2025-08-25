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
import javax.swing.JOptionPane;

public class Options {
    private static Scanner input = new Scanner(System.in);
    private static final List<SeriesModel> seriesList = new ArrayList<>();
    
    //captureSeries (Option 1)
    public static void captureSeries(){
        
        
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
    
    public static void searchSeries(){
        String searchId = JOptionPane.showInputDialog(null, "Enter Code To Search");
        for (SeriesModel series : seriesList) {
            String seriesFound = null;
            if(searchId.equals(series.getSeriesId())){

                System.out.println("----------------------\n");
                System.out.println("SERIES FOUND!!!");
                seriesFound = searchId;


                System.out.println("\nID: " + series.getSeriesId());
                System.out.println("Name: " + series.getSeriesName());
                System.out.println("Age Restriction: " + series.getSeriesAge());
                System.out.println("Episodes: " + series.getSeriesNumberOfEpisodes());
                System.out.println("----------------------\n");
                return;

            }
            if(seriesFound != null) {
                System.out.println("No series by that id was found");
                return;
            }
        }
    }
    
    public static void existingSeriesReport(){
        for (SeriesModel series : seriesList) {
            System.out.println("----------------------");
            System.out.println("SERIES REPORT");
            System.out.println("\nID: " + series.getSeriesId());
            System.out.println("Name: " + series.getSeriesName());
            System.out.println("Age Restriction: " + series.getSeriesAge());
            System.out.println("Episodes: " + series.getSeriesNumberOfEpisodes());
            System.out.println("----------------------");
        }
    }
    
    public static void deleteSeries(){
        String Id = JOptionPane.showInputDialog(null, "Enter Code To Delete");
        for (SeriesModel series : seriesList) {
            String id = series.getSeriesId();
            String name = series.getSeriesName();
            int age = series.getSeriesAge();
            String episodes = series.getSeriesNumberOfEpisodes();

            if(Id.equals(series.getSeriesId())){
                String[] options = {"Delete", "Cancel"};
                int choice = JOptionPane.showOptionDialog(null, "Are you sure you want to delete:\n "+ id + name + age + episodes, "Message Action",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                switch(choice){
                    case 0:
                        seriesList.remove(series);

                        System.out.println("SERIES SUCCESSFULLY DELETED!\n");
                        break;
                    case 1: 

                        break;
                }

            }
            
        }
        
        
    }
    
    public static void updateSeries(){
        String Id = JOptionPane.showInputDialog(null, "Enter Code for series You Want To Update");
        for(SeriesModel series: seriesList){
            
            if(series.getSeriesId().equals(Id)){
                System.out.println("ARE YOU SURE YOU WANT TO UPDATE THIS SERIES!");
                
                System.out.println("\nID: " + series.getSeriesId());
                System.out.println("Name: " + series.getSeriesName());
                System.out.println("Age Restriction: " + series.getSeriesAge());
                System.out.println("Episodes: " + series.getSeriesNumberOfEpisodes());
                System.out.println("----------------------");
                
                
                System.out.print("CONFIRM (YES-y | NO-n):");
                String confirm = input.nextLine();
                
                
                while(confirm.equals("y") || confirm.equals("n") ){
                    
                    if (confirm.equals("y")){
                        seriesList.remove(series);

                        System.out.print("\nSeries ID = " + Id);

                        System.out.print("\nEnter New Series Name: ");
                        String SeriesName = input.nextLine();

                        System.out.print("Enter New Series age restriction: ");
                        int SeriesAge = Integer.parseInt(input.nextLine());

                        while (SeriesAge > 18 || SeriesAge < 2){
                            System.out.print("Please re-enter the Series age restriction between 2 & 18: ");
                            SeriesAge = Integer.parseInt(input.nextLine());
                        }

                        System.out.print("Enter the New number of episodes for " + SeriesName + ": ");
                        String SeriesNumberOfEpisodes = input.nextLine();

                        // Store in list
                        seriesList.add(new SeriesModel(Id, SeriesName, SeriesAge, SeriesNumberOfEpisodes));

                        //Instantietion for SeriesModel object
                        SeriesModel details = new SeriesModel(Id, SeriesName, SeriesAge, SeriesNumberOfEpisodes);
                        
                        System.out.println("----------------------");
                        System.out.print("SERIES ID - " + Id + " - SUCCESFULLY UPDATED!\n");
                        System.out.print("\n ID: " + details.getSeriesId() + "\n Name: " + details.getSeriesName() + "\n Age: " + details.getSeriesAge() + "\n Episodes: " + details.getSeriesNumberOfEpisodes() + "\n");
                        return;
                    }else if(confirm.equals("n")){
                        return;
                    }
                    
                System.out.println("PLEASE CONFIRM WITH APPROPRIATE LETTER (YES-y | NO-n):");
                confirm = input.nextLine();
                    
                }     
            }
        }
    }
}
