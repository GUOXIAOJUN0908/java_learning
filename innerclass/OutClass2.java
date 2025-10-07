package innerclass;
// 这里要实现的功能是 static inner class,体会有什么不同
public class OutClass2 {
    int x = 10;
    static class InnerClass2 {
        int y = 20;
    }
    
}

// 调用外部和内部类 计算x+y
class InnerClass2 {
    public static void main(String[] args) {
        OutClass2 a = new OutClass2();
        // 明白了 这里不需要用a 再来创建b 懂了
        OutClass2.InnerClass2 b = new OutClass2.InnerClass2();
        System.out.println(a.x + b.y);

    }
}
