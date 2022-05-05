public class TestDemo2 {
    public static void main(String[] args) {
       int a=2;
       int b=3;
       int c=anInt(a,b);
        System.out.println(c);
    }
    public static int anInt(int a,int b){
        if (a==b){
            return 1;
        }
        return -1;

    }
}
