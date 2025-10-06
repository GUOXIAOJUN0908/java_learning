public class Vehicle{
    protected String brand = "Luhu";

    public void engine(){
        System.out.print("The vehicle has an engine");
    }
};

class car extends Vehicle{
    String modelname = "lansheng";
    public static void main(String[] args){
        car car1 = new car();
        car1.engine();
        System.out.print(" " + car1.brand + " " + car1.modelname);
    }

};