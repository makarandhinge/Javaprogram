import java.io.*;
import java.net.*;
import java.util.*;
public class Clientfact {
public static void main(String[] args){
try (
Socket s = new Socket ("localhost", 1080);
BufferedReader br = new BufferedReader (new InputStreamReader(s.getInputStream()));
BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(s.getOutputStream()))){
Scanner input = new Scanner (System.in);
System.out.println("Enter the number");
int x = input.nextInt();
bw.write(Integer.toString(x));
bw.newLine();
bw. flush() ;
String result = br. readLine();
System.out.println(result);
} 
catch(IOException exc){
System.out.println(exc.getMessage());
}
}
}
