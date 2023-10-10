import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);

            System.out.println("Server is waiting for a connection...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            int[] numbers = new int[3];
            for (int i = 0; i < 3; i++) {
                String input = in.readLine();
                numbers[i] = Integer.parseInt(input);
            }

            int largest = numbers[0];
            for (int i = 1; i < 3; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
            }

            out.println("The largest number is: " + largest);

            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
