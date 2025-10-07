class Animal1{
    String name;
    
}

class Dog1 extends Animal1{
    String name = "dog";
    void show(){
        System.out.println(name); // dog
        System.out.println(super.name); // null
    }
}

class Callattribute {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.show();
    }
}
