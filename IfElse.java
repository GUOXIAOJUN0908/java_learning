import java.time.LocalDate;
import java.time.DayOfWeek;
public class IfElse{
    public static void main(String[] args){
        LocalDate today=LocalDate.now();
        DayOfWeek dayOfWeek =today.getDayOfWeek();
        String date1=dayOfWeek.toString();
        if ("MONDAY".equals(date1)){
            System.out.println("Today is Monday");
        }
        else if ("TUESDAY".equals(date1)){
            System.out.println("Today is Tuesday");
        }
        else{
            System.out.println("Today is not Monday or Tuesday");
        }

    }
}