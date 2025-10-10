package Files;
// 要实现的功能：在当前文件夹下创建一个名为xiaojun.txt
import java.io.File;
import java.io.IOException;
// .表示当前目录； ..表示上一级目录
public class CreateFile {
    public static void main(String[] args){
        try{
            File file = new File("./xiaojun.txt");
            if (file.createNewFile()){
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
                
            }
        }
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
