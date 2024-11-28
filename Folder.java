import java.io.*;
public class Solution{
public static void main(String[] args) throws IOException{
    File folder = new File("figure.docx");
        try {
            if(folder.createNewFile()){
                System.out.println("File: " + folder.getName());
            }else{
                System.out.println("File already exists");
            }
            System.out.println("Is fie readable: " + folder.canRead());
            System.out.println("Is file writable: " + folder.canWrite());
            System.out.println("File's absoltue path: " + folder.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error ocurred");
        }
    }
}