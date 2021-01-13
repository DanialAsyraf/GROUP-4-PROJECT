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
public class PopRock extends Music{
   String songTitle,artist,album;
    double price;
    private String dateReleased;
    
    PopRock(){
        this.songTitle="Iris";
        this.artist="Goo Goo Dolls";
        this.album="The Greatest Hits";
    }
    public void printSong(){
        PopRock obj1=new PopRock();
        System.out.println("Song Title: "+obj1.songTitle);
    }
    public void printArtist(){
        PopRock obj2=new PopRock();
        System.out.println("Artist: "+obj2.artist);
    }
    public void printAlbum(){
        PopRock obj3=new PopRock();
        System.out.println("Album Title: "+obj3.album);
    }
    public void setDateReleased(String newDate){
        dateReleased=newDate;
    }
    public String getDateReleased(){
        return dateReleased;
    }   
    //polymorphism
    void recommendedSong(String recSong1,String recSong2){
        System.out.println("Other related songs: "+recSong1+"||"+recSong2);
    }    
}
