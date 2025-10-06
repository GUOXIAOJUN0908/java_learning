public class constructor{
    int x;
    public constructor(){
    // 注意这里x的赋值方法，前面不可以加int
    // 可以写成this.x=5;
    x=5;
    };
    // 注意创建新的object的写法
    public static void main(String[] args){
        constructor myobj = new constructor();
        System.err.print(myobj.x);
    } 
}