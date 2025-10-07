class Animal{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}
// super 去集成父类的方法，不能直接用在类体中。只能卸载方法体或构造方法中
class Dog extends Animal{
    public void dogSound(){
        super.sound();
        System.out.println("Dog says: bow wow");
    }
}
// 震撼到我了，语法没有问题，但是因为同一个文件夹下面，不同的java文件里面，有重复的类名，比如Animal;Dog导致编译器在调用的时候报错
class Callmethod{
    public static void main(String args[]){
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        //驼峰命名法
        d1.dogSound();
    }
}