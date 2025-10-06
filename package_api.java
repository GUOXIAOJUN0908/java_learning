import java.util.Scanner;
// 一个java文件只有一个public类，且这个public的类必须和文件名一致
class PackageApi {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        String username;

        System.out.println("请输入用户名：");
        username = s1.nextLine();
        System.out.println("欢迎你，" + username + "!" );
        s1.close();
    }
}
