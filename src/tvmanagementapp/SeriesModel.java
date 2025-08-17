/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tvmanagementapp;

/**
 *
 * @author maxwe
 */
public class SeriesModel {
    public String SeriesId;
    public String SeriesName;
    public int SeriesAge;
    public String SeriesNumberOfEpisodes;
    
    public SeriesModel(String SeriesId, String SeriesName,int SeriesAge, String SeriesNumberOfEpisodes){
        this.SeriesId = SeriesId;
        this.SeriesName = SeriesName;
        this.SeriesAge = SeriesAge;
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes;
    }
    

    public String getSeriesId() {
        return SeriesId;
    }

    public String getSeriesName() {
        return SeriesName;
    }

    public int getSeriesAge() {
        return SeriesAge;
    }

    public String getSeriesNumberOfEpisodes() {
        return SeriesNumberOfEpisodes;
    }
    
}
