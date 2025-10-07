interface Inerface1 {
    void method1();
    
}
interface Inerface2 {
    void method2();   
}

class test implements Inerface1, Inerface2 {
    public void method1() {
        System.out.println("Implementation of method1 from Inerface1");
    }
    
    public void method2() {
        System.out.println("Implementation of method2 from Inerface2");
    }
}

class Interface {
    public static void main(String[] args) {
        test obj = new test();
        obj.method1();
        obj.method2();
    }
}