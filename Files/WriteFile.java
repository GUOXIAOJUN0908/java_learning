package Files;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
    try{
        FileWriter writer = new FileWriter("./xiaojun.txt",true);
        writer.write("I am xiaojun\n");
        System.out.println("Successfully wrote to the file.");
        writer.close();
        }
    
    catch(IOException e){
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}
}
