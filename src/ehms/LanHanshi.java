package ehms;

public class LanHanshi {
    public static void main(String[] args) {
        Lanshi a1=Lanshi.getInstance();
        Lanshi a2=Lanshi.getInstance();
        Lanshi a3=Lanshi.getInstance();

        System.out.println(a1==a2);
        System.out.println(a1==a3);
    }
}
