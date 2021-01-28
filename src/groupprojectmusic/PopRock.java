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
public class PopRock extends Music{
    String songTitle,artist,album;
    double price;
    private String dateReleased;
    
    PopRock(){
        this.songTitle="Iris";
        this.artist="Goo Goo Dolls";
        this.album="The Greatest Hits";
        this.dateReleased="26th May 2004";
        this.price=13.70;
    }
    private JFrame frame;
    
    public void printPopRock(){
        
        ImageIcon pop=new ImageIcon("popalbum.png");
        JOptionPane.showMessageDialog(null," ","Display Pop Rock Album",JOptionPane.INFORMATION_MESSAGE,pop);
        
        frame= new JFrame("Pop Rock Info");
        PopRock obj1=new PopRock();
        JOptionPane.showMessageDialog(frame,"Pop Rock"+"\nRelated Song:"+obj1.songTitle+"\nArtist :"+obj1.artist+"\nAlbum:"+obj1.album+"\nDate Released :"+obj1.dateReleased+"\nPrice of album: RM"+obj1.price+"\nRecommended Song:"+"\n1.Bohemian Rhapsody"+"\n2.Shut up and Dance!"+"\nPlatform: "+"\n1.Youtube"+"\n2.Apple Music"+"\n3. Joox");
    } 
}
