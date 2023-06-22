import java.io.*;


public class BufferEx {
    public static void main(String[] args)
    {
        try{
            FileInputStream f = new FileInputStream("SelfInfo.txt");
            BufferedInputStream b = new BufferedInputStream(f);
            int i;
            while((i = b.read())!= -1)
            {
                System.out.println((char)i);
            }
            b.close();
            f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
