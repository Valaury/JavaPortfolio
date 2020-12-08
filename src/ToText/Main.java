package ToText;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static String FileName = "Lorem.txt";

    public static void main(String args[]) throws IOException {
        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, "
                + "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu "
                + "fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        System.out.println("=========================================");
        System.out.println("Writing Lorem Ipsum to File");
        try{
            FileWriter writer = new FileWriter(new File(FileName));
            writer.write(lorem);
            writer.flush();
            writer.close();
            System.out.println("Lorem ipsum was written to file.");
        }catch(FileNotFoundException ex){
            System.out.println("File Not Found");
        }
        System.out.println("=========================================");
        System.out.println("Reading Lorem Ipsum from File");
        try{
            String theWholeThing = "";
            FileReader vFReader = new FileReader(FileName);
            int characters;
            while ((characters = vFReader.read()) != -1) {
                theWholeThing = theWholeThing + (char)characters;
            }
            
            System.out.println(theWholeThing);
            System.out.println("=========================================");
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }
    }
}
