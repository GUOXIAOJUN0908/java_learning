package IOstream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// COPY 图片的功能真的是让我大为震撼
public class CopyImage {
    public static void main(String[] args){
        try(
        FileInputStream input = new FileInputStream("C:/Users/Admin/one drive - Xiao Jun/OneDrive - Yi Star Pte Ltd/Dealer Analysis Power BI/Desktop/学习/power BI/50道测试题/刷新次数.png");
        FileOutputStream output = new FileOutputStream("./COPY.png")){
            int b;
            while ((b=input.read())!=-1){
                output.write(b);
            }
            System.out.println("Image copied successfully.");
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
}
