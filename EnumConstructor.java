enum Level{
    // Enum constants has its own description
    LOW("Low level"),
    MEDIUM("Medium level"), 
    HIGH("High level");
    //field(variable)
    private String des;
    // constructor
    Level(String des){
        this.des = des;
    }

    // method
    public String getDes(){
        return des;
    }
}

class EnumConstructor{
    public static void main(String[] args) {
        Level level = Level.MEDIUM;
        System.out.println(level);
        System.out.println(level.getDes());
    }
}