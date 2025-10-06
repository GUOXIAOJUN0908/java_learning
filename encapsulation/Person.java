public class Person{
    private int age;
    // 这里必须添加int
    public int get(){
        return age;

    }
    // 这里必须添加void
    public void set(int newage){
        age = newage;
    }

    public static void main(String[] args){
        Person p1 = new Person();
        p1.set(18);
        System.out.println(p1.get());
    }
}