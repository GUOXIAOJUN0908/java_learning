package IOstream;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class BufferRead {
    public static void main(String[] args) {
    try(BufferedReader Br = new BufferedReader(new FileReader("OUTPUT.txt"))){
        String line;
        while((line = Br.readLine())!=null){
            System.out.println(line);

        }
    }
    catch(IOException e){
        System.out.println("An error occurred: " + e.getMessage());
    }
    
}}
