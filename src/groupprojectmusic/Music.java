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
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Music {
    
    String musicPlatform,location;
    int year;
    
    Music(){
        this.musicPlatform="Youtube";
        this.year=2010;
        this.location="Europe";
    }
    Music(String p,int y,String l){
        this.musicPlatform=p;
        this.year=y;
        this.location=l;
    }
    public void checkGenre(){
        Scanner scan=new Scanner(System.in);
        System.out.println("List of music genre: "+"\n1. Punk Rock"+"\n2. Pop Rock"+"\n3. Country"+"\n4. Instrumental"+"\n");
        System.out.println("Please enter music genre: ");
        int musicGenre=scan.nextInt();
        
        if(musicGenre==5||musicGenre==6||musicGenre==7||musicGenre==8){
            throw new ArithmeticException("Please input a valid choice!");
        }
        else{
            System.out.println("Music genre available!");
    }        
    }
    public void printMethod1(){
        Music obj1=new Music();
        System.out.println("Platform: "+obj1.musicPlatform+"\n"+"Year of music: "+obj1.year+"\n"+"Location: "+obj1.location);

    }
    public void printMethod2(){
        Music obj2=new Music("iTunes",2013,"Europe");
        System.out.println("Platform: "+obj2.musicPlatform+"\n"+"Year of music: "+obj2.year+"\n"+"Location: "+obj2.location);

    }
    public void printMethod3(){
        Music obj3=new Music("JOOX",2015,"USA");
        System.out.println("Platform: "+obj3.musicPlatform+"\n"+"Year: "+obj3.year+"\n"+"Location: "+obj3.location);
        
    }
    public void printMethod4(){
        Music obj4=new Music("Spotify",2017,"USA");
        System.out.println("Platform: "+obj4.musicPlatform+"\n"+"Year: "+obj4.year+"\n"+"Location: "+obj4.location);
    }
    //method polymorphism
    void play(){
        System.out.println("Music is playing!");
    }
    //method overloading //calculate the price range
    void sum(int songPrice, long subscription){
        System.out.println("Total price of song including monthly subscription: RM"+(songPrice+subscription));
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame,"Are you sure you want to exit?","Confirm Exit",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }
    public void backButton(){
        
        /*frame = new JFrame();
        new groupMenu2().setVisible(true);
        frame.dispose();*/
    }
}
