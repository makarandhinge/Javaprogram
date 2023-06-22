import java.io.*;

public class BufferEx_2 {
    public static void main(String[] args)
    {
        try{
            FileOutputStream f = new FileOutputStream("TestOut.txt");
            BufferedOutputStream bout = new BufferedOutputStream(f);
            String s = "Welcome to Java";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            f.close();
            System.out.println("Success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
