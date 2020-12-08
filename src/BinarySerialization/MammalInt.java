package BinarySerialization;

import java.io.Serializable;

public class MammalInt implements Serializable {
    public String Name;
    public int Legs;
    public MammalInt(String name, int legs){
        Name = name;
        Legs = legs;
    }
    
   public void eat() {
      System.out.println(Name +" eats");
   }

   public void travel() {
      System.out.println(Name + " travels");
   } 

   public int noOfLegs() {
      return 4;
   }
   
   public static void Joke(){
       System.out.println("Joke?");
   }
   
   @Override
   public String toString(){
       return "Mammal Name: "+ Name + " Number of Legs: + " + Legs;
   }
}