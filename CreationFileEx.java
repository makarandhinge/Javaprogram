import java.io.*;

public class CreationFileEx {
    public static void main(String[] args) throws IOException{
        File f1 = new File("SelfInfo.txt");
        f1.createNewFile();
        System.out.println("File exist "+ f1.exists());
        System.out.println("File is Write "+ f1.canWrite());
        System.out.println("Name of File "+ f1.getName());
        System.out.println("File length "+ f1.length());
    }

}
