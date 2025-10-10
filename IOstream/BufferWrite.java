package IOstream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite {
    public static void main(String[] args) {
        try(BufferedWriter Bw = new BufferedWriter(new FileWriter("OUTPUT.txt",true))){
     
            Bw.newLine();
            Bw.write("This is appended line.");
            
        }
        catch(IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
        
    }
    
}
