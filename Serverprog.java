import java.io.*;
import java.net.*;

public class Serverprog {
   public static void main(String[] args) throws IOException {

    ServerSocket ss = new ServerSocket(100);
    Socket s = ss.accept();

    DataInputStream dis2 = new DataInputStream(s.getInputStream());
    DataOutputStream dos2 = new DataOutputStream(s.getOutputStream());

    String str = dis.readUTF();
    String nums[] = str.spilt(";");
    
    int a = Integer.parseInt(nums[0]);
    int b = Integer.parseInt(nums[1]);
    int c = Integer.parseInt(nums[2]);
    int lar;

    if(a>b && a>c){
        lar = a;
    }
    if(b>a && b>c){
        lar = b;
    }
    if(c>a && c>b){
        lar = c;
    }
    dos2.writeUTF(" "+lar);
    ss.close();
    s.close();

   } 
}
