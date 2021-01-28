package groupprojectmusic;

import javax.swing.JOptionPane;
import java.util.*;

public class Genre {
	String [] genreList = new String [11];
	
	Genre() {
		
		this.genreList = new String [] {"Select Genre", 
				"Action",
				"Animation", 
				"Comedy", 
				"Cartoon",
				"Drama" , 
				"Documentary",
				"Experimental",
				"Family",
				"Horror",
				"Romance",
				"Sci-fi",
				"Thriller"};
	}
	
	public void exit() {
		
		if (JOptionPane.showConfirmDialog(null,"Confirm if you want to exit", "Short Video Database System",
        		JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
			System.exit(0);
        }
		
	}
	
}
