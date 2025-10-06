class Animalsounds{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Pig extends Animalsounds{
    @Override
    public void sound(){
        System.out.println("Pig says: wee wee");
    }
}

class Dog extends Animalsounds{
    @Override
    public void sound(){
        System.out.println("Dog says: bow wow");
    }
}

class Main{
    public static void main(String[] args){
        Animalsounds a1 = new Animalsounds();
        Dog d1 = new Dog();
        Pig p1 = new Pig();

        a1.sound();
        d1.sound();
        p1.sound();
    }
}
