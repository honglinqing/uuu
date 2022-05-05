package ehms;

public class Ehanmoshi {
    private Ehanmoshi() {


    }
    private static Ehanmoshi inistance = new Ehanmoshi();
    public static Ehanmoshi getInistance(){
        return inistance;
    }
}
