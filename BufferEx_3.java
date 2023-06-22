import java.io.*;

public class BufferEx_3 {

    public static void main(String[] args)throws IOException
    {
        FileReader f = new FileReader("SelfInfo.txt");
        BufferedReader br = new BufferedReader(f);

        String str = null;

        while((str = br.readLine())!= null)
        {
            System.out.println(str);
        }
       br.close();
       f.close();


    }
}
