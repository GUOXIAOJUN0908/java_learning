// 奇怪class必须小写呢
class Animal2{
    Animal2(){
        System.out.println("Animal Constructor");
    }
}

class Cat extends Animal2{
    Cat(){
        super();
        System.out.println("Cat Constructor");
    }
}
 
class Callconstructor{
    public static void main(String[] args) {
        Cat cat = new Cat();
    }
}