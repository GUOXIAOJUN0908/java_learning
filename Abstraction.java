abstract class SeaAnimal{
    // 抽象方法 没有方法体
    public abstract void eat();
    // 抽象类中可以有普通方法
    public void sleep() {
        System.out.println("sleep");
    }
    
}

class fish extends SeaAnimal {
    @Override
    public void eat() {
        System.out.println("fish eat");
    }
}

class Abstraction{
    public static void main(String[] args) {
        fish f = new fish();
        f.eat();
        f.sleep();
    }
}
