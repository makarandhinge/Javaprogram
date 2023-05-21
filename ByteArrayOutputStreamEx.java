import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamEx {
    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte b[] = "Today is a bright sunny day".getBytes();
        out.write(b);
        System.out.println(out.toString());  //convert byte array to string
        out.close();   /// closing the stream
    }

}
