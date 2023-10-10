import java.io.*;
import java.net.*;
public class Serverfact {
public static void main(String[] args) {
System.out.println("Listening.");
try (
ServerSocket server = new ServerSocket(1080); 
Socket s = server.accept();
BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream())) ) {
System.out.println("Connected.");
int x = Integer.parseInt(br.readLine());
int z=1;
for (int i=1;i<x+1;i++)
z = z*i;
bw.write("The Factorial of "+z);
bw.newLine();
bw.flush();
}catch(IOException exc) {
System.out.println(exc.getMessage());
}
}
}