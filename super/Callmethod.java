class Anima{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
};

class dog{
    super.sound();
    @Override
    public void sound(){
        System.out.println("Dog says: bow wow");
    }
};

class Main{
    public static void main(String args[]){
        Anima a1 = new Anima();
        dog d1 = new dog();
        d1.sound();
    }
}