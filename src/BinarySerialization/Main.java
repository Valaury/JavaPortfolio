package BinarySerialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    static String filename = "Object.ser";
    public static void main(String args[]) {

       MammalInt Platypus = new MammalInt("Platypus",4);
       Platypus.eat();
       Platypus.travel();
        System.out.println("=================================");
        Serialize(Platypus);
        Deserialize(); 
    }
    
    public static void Serialize(MammalInt mammal){
        //Serialize
       try{
          FileOutputStream f = new FileOutputStream(new File(filename));
          ObjectOutputStream o = new ObjectOutputStream(f);
          o.writeObject(mammal);
          o.close();
          f.close();
          
          System.out.println("Obejct was written to File");

      }catch(FileNotFoundException ex){
          System.out.println("File Not Found");
          System.out.println(ex);
      }catch(IOException e){
          System.out.println(e);
          System.out.println("IOEXcpetion");
      }
    }
    
    public static void Deserialize(){
        try{
            FileInputStream fi = new FileInputStream(new File(filename));
          ObjectInputStream oi = new ObjectInputStream(fi);
                  
          MammalInt mammalr = (MammalInt) oi.readObject();
          System.out.println("=================================");
          System.out.println("" + (String) mammalr.toString());
          System.out.println("=================================");

          
          oi.close();
          fi.close();  
        }catch(IOException e){
            System.out.println("No File Found");
        }catch(ClassNotFoundException e){
            System.out.println("No Class Found");
        }
        
    }
}
