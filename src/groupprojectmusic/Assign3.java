/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupprojectmusic;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Assign3  {

   
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       File file = new File("tiktokusers.txt");
       ArrayList<User>users = new ArrayList<User>();
       users.add(new User("1998,KhairinKasmadi,mudhkhairin11@gmail.com,01137848821"));
       users.add(new User("1997,AmirZakri,mudhamir@gmail.com,01234566333"));
       
       FileOutputStream fo = new FileOutputStream(file);
       ObjectOutputStream output = new ObjectOutputStream(fo);
       for (User u: users) {
           output.writeObject(u);
           
       }
       
      output.close();
      fo.close();
      //deserialize the file back into the collection
      
      FileInputStream fi = new FileInputStream (file);
      ObjectInputStream input = new ObjectInputStream(fi);
      ArrayList<User>users2 = new ArrayList<User>();
      
      try {
          
      
      while (true)
      {
          User u = (User)input.readObject();
          users2.add(u);
          
      }
      
    } catch (EOFException ex) {
        
    }
    for(User u : users2) {
        System.out.println(u);
    }
    
    
       
       
    }
    
}
