package ehms;

public class Lanshi {
    private Lanshi(){

    }

    private static Lanshi instance;

    public static Lanshi getInstance(){
        if (null==instance){
            instance = new Lanshi();
        }
        return instance;
    }


}
