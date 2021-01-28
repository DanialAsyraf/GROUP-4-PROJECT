/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupprojectmusic;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
        this.dateReleased="14 April 2004";
        this.price=45.60;
    }
    private JFrame frame;
    
    public void printPunkRock(){
        
        ImageIcon punk=new ImageIcon("punkalbum.png");
        JOptionPane.showMessageDialog(null," ","Display Punk Rock Album",JOptionPane.INFORMATION_MESSAGE,punk);
        
        frame= new JFrame("Punk Rock Info");
        PunkRock obj1=new PunkRock();
        JOptionPane.showMessageDialog(frame,"Punk Rock"+"\nRecommended Song:"+obj1.songTitle+"\nArtist :"+obj1.artist+"\nAlbum:"+obj1.album+"\nDate Released :"+obj1.dateReleased+"\nPrice of album: RM"+obj1.price+"\nPlatform: "+"\n1.Youtube"+"\n2.Apple Music"+"\n3. Joox");
    }  
}
