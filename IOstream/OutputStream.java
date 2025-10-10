package IOstream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args){
        String text = "\nNew append content";
        try(FileOutputStream output = new FileOutputStream("OUTPUT.TXT",true)){
            output.write(text.getBytes());
            output.close();
            System.out.println("File written successfully.");
        }
        catch(IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

}
