// 熟悉一个类中，有多个构造函数，this()调用另一个构造函数
// 这个类要实现的功能是输出一个人的出生年份和性别
public class constructor3 {
    int year;
    String gender;
    public constructor3(int year, String gender) {
        this.year = year;
        this.gender= gender;
    };
    public constructor3(int year) {
        this(year, "female");
    };

    public static void main(String[] args) {
        constructor3 person1 = new constructor3(1990, "male");
        System.out.println("person1: " + person1.year + " " + person1.gender);
        constructor3 person2 = new constructor3(1995);
        System.out.println("person2: " + person2.year + " " + person2.gender);
}
}
