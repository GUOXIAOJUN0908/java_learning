class Animal{
    String name;
    
}

class Dog extends Animal{
    String name = "dog";
    void show(){
        System.out.println(name); // dog
        System.out.println(super.name); // null
    }
}

class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.show();
    }
}
