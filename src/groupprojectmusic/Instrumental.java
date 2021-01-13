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
public class Instrumental extends Country{
    String songTitle,artist,album;
    double price;
    private String dateReleased;
    
    Instrumental(){
        this.songTitle="Canon in D";
        this.artist="Sungha Jung";
        this.album="The Greteast Fingerstyle of all time!";
    }
    public void printSong(){
        Instrumental obj1=new Instrumental();
        System.out.println("Song Title: "+obj1.songTitle);
    }
    public void printArtist(){
        Instrumental obj2=new Instrumental();
        System.out.println("Artist: "+obj2.artist);
    }
    public void printAlbum(){
        Instrumental obj3=new Instrumental();
        System.out.println("Album Title: "+obj3.album);
    }
    public void setDateReleased(String newDate){
        dateReleased=newDate;
    }
    public String getDateReleased(){
        return dateReleased;
    }    
}
