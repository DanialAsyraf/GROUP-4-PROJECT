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
public class Instrumental extends Country{
    String songTitle,artist,album;
    double price;
    private String dateReleased;
    
    Instrumental(){
        this.songTitle="Canon in D";
        this.artist="Sungha Jung";
        this.album="The Greteast Fingerstyle of all time!";
        this.dateReleased="27th December 2007";
        this.price=13.70;
    }
    private JFrame frame;
    
    public void printInstrumental(){
        
        ImageIcon inst=new ImageIcon("instalbum.png");
        JOptionPane.showMessageDialog(null," ","Display Instrumental Album",JOptionPane.INFORMATION_MESSAGE,inst);
        
        frame= new JFrame("Instrumental Info");
        Instrumental obj1=new Instrumental();
        JOptionPane.showMessageDialog(frame,"Instrumental"+"\nRelated Song:"+obj1.songTitle+"\nArtist :"+obj1.artist+"\nAlbum:"+obj1.album+"\nDate Released :"+obj1.dateReleased+"\nPrice of album: RM"+obj1.price+"\nRecommended Song:"+"\n1.Canon Rock"+"\n2.River flows in you"+"\nPlatform: "+"\n1.Youtube"+"\n2.Apple Music"+"\n3. Joox");
    }    
}
