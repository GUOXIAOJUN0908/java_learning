// 写这个recursion的目的是计算1到10的和
public class recursion{
    public static int sum(int i,int j){
        if(i>j){
            return 0;
        }
        return i+sum(i+1,j);
    };
    public static void main(String[] args){
        int result=sum(1,10);
        System.out.println(result);
    }
}