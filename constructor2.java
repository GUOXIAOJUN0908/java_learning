public class constructor2 {
    String wheels;
    String color;
    int doors;
    public constructor2(String wheels, String color, int doors){
        // this 可以解决类成员和构造函数参数冲突的情况
        this.wheels = wheels;
        this.color = color;
        this.doors = doors;

    };
    public static void main(String[] args){
        constructor2 car = new constructor2("4","red",4);
        System.out.println(car.wheels);
        System.out.println(car.color);

    }
}
