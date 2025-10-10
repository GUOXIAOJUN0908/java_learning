import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {
        // Create an ArrayList to hold String elements
        ArrayList<String> Al = new ArrayList<>();
        // 不会去重
        Al.add("Hello");
        Al.add("World");  
        Al.add("Hello");

        Al.add(0,"fist");
        System.out.println(Al);
        System.out.println(Al.get(0));
        Al.set(0,"change");
        System.out.println(Al);
        for(String s:Al){
            System.out.println(s);
        }
       
    }
}