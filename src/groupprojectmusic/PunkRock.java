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
public class PunkRock extends Music{
    String songTitle,artist,album;
    double price;
    private String dateReleased;
    
    PunkRock(){
        this.songTitle="I wanna be sedated";
        this.artist="Ramones";
        this.album="The Greatest Hits";
    }
    public void printSong(){
        PunkRock obj1=new PunkRock();
        System.out.println("Song Title: "+obj1.songTitle);
    }
    public void printArtist(){
        PunkRock obj2=new PunkRock();
        System.out.println("Artist: "+obj2.artist);
    }
    public void printAlbum(){
        PunkRock obj3=new PunkRock();
        System.out.println("Album Title: "+obj3.album);
    }
    public void setDateReleased(String newDate){
        dateReleased=newDate;
    }
    public String getDateReleased(){
        return dateReleased;
    }
    public void setPrice(double newPrice){
        price=newPrice;
    }
    public double getPrice(){
        return price;
    }  
}
