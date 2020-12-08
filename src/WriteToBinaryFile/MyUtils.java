package WriteToBinaryFile;
public class MyUtils {
    public static void printLine()
    {
        for(int i=0;i<30; i++)
            System.out.print("=");
        System.out.println("");
    }    
    public static void printLine(char c)
    {
        for(int i=0;i<30; i++)
            System.out.print(c);
        System.out.println("");
    }
    public static void printLine(char c, int x)
    {
        for(int i=0;i<x; i++)
            System.out.print(c);
        System.out.println("");
    }
    public static void printLine(int x)
    {
        for(int i=0;i<x; i++)
            System.out.print("=");
        System.out.println("");
    }
}
