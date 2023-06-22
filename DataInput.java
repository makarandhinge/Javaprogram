import java.io.*;

public class DataInput {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("xyz.txt");
        DataOutputStream dos = new DataOutputStream(f);
        dos.writeInt(10);
        dos.writeDouble(23.23);
        dos.writeChar('A');
        dos.close();
    }
}
