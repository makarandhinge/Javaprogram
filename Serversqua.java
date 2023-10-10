import java.io.*;
import java.net.*;

public class Serversqua{
public static void main(String[] args)
{
System.out.println("Listening.");
try (
ServerSocket server = new ServerSocket(1080) ; 
Socket s = server.accept ();
BufferedReader br = new BufferedReader (new InputStreamReader(s.getInputStream()));
BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(s.getOutputStream()))) {
System.out.println( "Connected.");
int x = Integer.parseInt (br.readLine()) ;
int z = x*x;
bw.write ("The Square of "+z);
bw. newLine();
bw.flush();
} catch(IOException exc)
{
System.out.println(exc.getMessage());
}
}
}