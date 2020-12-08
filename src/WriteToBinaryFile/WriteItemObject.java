package WriteToBinaryFile;
import java.io.*;
import java.nio.charset.StandardCharsets;


public class WriteItemObject {
    public static void main(String[] args) {
        
        Item itemObject = new Item("Oppo R90S",120.00f);
        itemObject.setProfitMargin();
        FileOutputStream output = null;
        ObjectOutputStream objOutput = null;
        try{
            File file = new File("item.txt");
            byte[] data = "ABCD".getBytes(StandardCharsets.UTF_8);
            output = new FileOutputStream("itemObj.ser");
            objOutput = new ObjectOutputStream(output);
            objOutput.writeObject(itemObject);
            output.close();
            objOutput.close();
        }
        catch(IOException e)
        {
            System.out.println("Exception:" + e.getMessage());
        }
    }   
}
