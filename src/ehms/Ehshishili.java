package ehms;

public class Ehshishili {
    public static void main(String[] args) {
        Ehanmoshi a1= Ehanmoshi.getInistance();
        Ehanmoshi a2=Ehanmoshi.getInistance();
        Ehanmoshi a3=Ehanmoshi.getInistance();

        System.out.println(a1==a2);
        System.out.println(a1==a3);
    }
}
