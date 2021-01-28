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
import java.util.ArrayList;
public class musicGenre {
    public ArrayList<String>genreList(){
        ArrayList<String> genre=new ArrayList<String>();
        genre.add("Punk Rock");
        genre.add("Pop Rock");
        genre.add("Country");
        genre.add("Instrumental");
        
        return(genre);
    }
}
