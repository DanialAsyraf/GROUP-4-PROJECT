/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupprojectmusic;

/**
 *
 * @author user
 */
public class Country extends PopRock{
    String songTitle,artist,album;
    double price;
    private String dateReleased;
    
    Country(){
        this.songTitle="Come on Over";
        this.artist="Shania Twain";
        this.album="The Country Hits";
    }
    public void printSong(){
        Country obj1=new Country();
        System.out.println("Song Title: "+obj1.songTitle);
    }
    public void printArtist(){
        Country obj2=new Country();
        System.out.println("Artist: "+obj2.artist);
    }
    public void printAlbum(){
        Country obj3=new Country();
        System.out.println("Album Title: "+obj3.album);
    }
    public void setDateReleased(String newDate){
        dateReleased=newDate;
    }
    public String getDateReleased(){
        return dateReleased;
    }    
}
