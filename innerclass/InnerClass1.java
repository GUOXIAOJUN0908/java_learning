package innerclass;
class OutClass {
    int x=10;
    class InnerClass{
        int y=20;
    }
}
// 调用外部和内部类 计算x+y
class InnerClass1{
    public static void main(String[] args){
        OutClass a = new OutClass();
        OutClass.InnerClass b = a.new InnerClass();
        System.out.println(a.x+b.y);

    }
}