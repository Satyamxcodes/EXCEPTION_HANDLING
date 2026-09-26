
import java.io.File;  
import java.io.FileReader;  
import java.io.IOException;  
  
public class chex {  
    public static void main(String[] args) {  
        try {  
            File file = new File("example.txt");  
            FileReader fr = new FileReader(file); // May throw IOException  
            System.out.println("File opened successfully.");  
            fr.close();  
        } catch (IOException e) {  
            System.out.println("An IOException occurred: " + e.getMessage());  
        }  
    }  
}  