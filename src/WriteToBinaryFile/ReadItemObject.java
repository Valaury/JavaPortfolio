package WriteToBinaryFile;
import java.io.*;
import java.util.Scanner;
public class ReadItemObject {
    public static void main(String[] args) {
        Item itm = null;
        FileInputStream infile = null;
        ObjectInputStream objInfile = null;
        System.out.printf("%30s\n","Item");
        MyUtils.printLine('x',120);
        try
        {
            infile = new FileInputStream("itemObj.ser");
            objInfile = new ObjectInputStream(infile);
            itm = (Item)objInfile.readObject();
            System.out.println("Item read: "+itm.toString());
            MyUtils.printLine('x',120);
        }
        catch(IOException e)
        {
            System.out.println("Exception:"+e.getMessage());
        }
        catch (ClassNotFoundException cnf)
        {
            System.out.println("Item class not found");
        }
    }
    
}
