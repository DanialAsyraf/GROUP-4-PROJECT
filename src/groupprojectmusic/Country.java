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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Country extends Music{
    String songTitle,artist,album;
    double price;
    private String dateReleased;
    
    Country(){
        this.songTitle="Come on Over";
        this.artist="Shania Twain";
        this.album="The Country Hits";
        this.dateReleased="27th February 1998";
        this.price=13.70;
    }
    
    private JFrame frame;
    
    public void printCountry(){
        
        ImageIcon country=new ImageIcon("countryalbum.png");
        JOptionPane.showMessageDialog(null," ","Display Country Album",JOptionPane.INFORMATION_MESSAGE,country);
        
        frame= new JFrame("Country Info");
        Country obj1=new Country();
        JOptionPane.showMessageDialog(frame,"Country"+"\nRelated Song:"+obj1.songTitle+"\nArtist :"+obj1.artist+"\nAlbum:"+obj1.album+"\nDate Released :"+obj1.dateReleased+"\nPrice of album: RM"+obj1.price+"\nRecommended Song:"+"\n1.Up!"+"\n2.Take Me Home"+"\nPlatform: "+"\n1.Youtube"+"\n2.Apple Music"+"\n3. Joox");
        
    }
}
