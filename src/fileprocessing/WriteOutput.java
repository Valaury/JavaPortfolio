package fileprocessing;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteOutput {
    public static void main(String[] args) {
        try {
            Item items[] = new Item[2];
            PrintWriter output;
            Scanner console = new Scanner(System.in);
            
            output = new PrintWriter("item.txt");
            for(int i = 0;i<items.length;i++)
            {
                items[i] = new Item();
                System.out.println("Enter Item name:");
                items[i].setItemName(console.next());
                System.out.println("Enter item price");
                items[i].setItemCost(Float.parseFloat(console.next()));
                items[i].setProfitMargin();
                System.out.println("Profit margin set to: "+items[i].getProfitMargin()*100+"%");
                output.println(items[i].toString());
                System.out.println(items[i].toString());
            }
            output.close();
        } catch (FileNotFoundException ex) {
            System.out.println("cannot write file, retry.");
        }
        catch(NumberFormatException ne)
        {
            System.out.println("Please enter a numeric value for cost.");
        }
        
    }
    
}
