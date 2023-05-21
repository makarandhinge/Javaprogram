import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamEx {
    public static void main(String[] args) throws IOException {
        byte b[] = "this is my first program".getBytes();
        ByteArrayInputStream inp = new ByteArrayInputStream(b);
        int n = inp.available();
        System.out.println("Number of available bytes: " + n);
        int i;
        while ((i = inp.read()) != -1) {
            System.out.println((char) i);
        }
    }
}

