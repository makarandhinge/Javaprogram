import java.io.*;

public class BufferEx_4 {
    public static void main(String[] args) throws IOException {

        FileWriter f = new FileWriter("TestOut_3.txt");
        BufferedWriter bw = new BufferedWriter(f);
        bw.write("This is my String");
        bw.close();
        System.out.println("Success");


    }
}
