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
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
public class GroupProjectMusic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File file=new File("/Users/Desktop/Music.txt");
        
        AbsMusic obj=new AbsMusic(); //abstract class
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name=scan.next();
        System.out.println("Welcome! "+name);
        
        ArrayList<String> genre=new ArrayList<String>();
        genre.add("Punk Rock");
        genre.add("Pop Rock");
        genre.add("Country");
        genre.add("Instrumental");
        
        System.out.println("\nMusic Genre available in this store: "+genre);
        
        Music m=new Music();
        m.checkGenre();
        System.out.println("\n");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
        
        System.out.println("++++Punk Rock++++");
        PunkRock p=new PunkRock();
        p.printMethod1();
        p.printSong();
        p.printArtist();
        p.printAlbum();
        p.setDateReleased("14th April 2010");
        System.out.println("Date of Released: "+p.getDateReleased());
        p.setPrice(45.60);
        System.out.println("Price of the song: Rm"+p.getPrice());
        
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
        
        System.out.println("++++POP ROCK++++");
        PopRock p1=new PopRock();
        p1.printMethod2();
        p1.printSong();
        p1.printArtist();
        p1.printAlbum();
        p1.setDateReleased("26th May 2013");
        System.out.println("Date of Released: "+p1.getDateReleased());
        obj.typeSubscription(); //abstract class
        p1.sum(14,20);
        p1.recommendedSong("Bohemian Rhapsody","Shut up and Dance!");
        
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::"); 
        
        System.out.println("++++COUNTRY++++");
        Country p2=new Country();
        p2.printMethod3();
        p2.printSong();
        p2.printArtist();
        p2.printAlbum();
        p2.setDateReleased("27th February 2015");
        System.out.println("Date of Released: "+p2.getDateReleased());
        obj.typeSubscription(); //abstract class
        p2.sum(26,20);
        p2.recommendedSong("Up!","Take Me Home");

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
        
        System.out.println("++++INSTRUMENTAL++++");
        Instrumental p3=new Instrumental();
        p3.printMethod4();
        p3.printSong();
        p3.printArtist();
        p3.printAlbum();
        p3.recommendedSong("Canon Rock","River flows in you");
        p3.setDateReleased("27th December 2017");
        System.out.println("Date of Released: "+p3.getDateReleased());
        obj.typeSubscription(); //abstract class
        p3.sum(26,20);
        p3.recommendedSong("Canon Rock","River flows in you");
    }
    
}
