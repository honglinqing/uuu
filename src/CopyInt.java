import java.util.Arrays;

public class CopyInt {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        int b[]=new int[a.length];
        IntCopy ff=new IntCopy();
        ff.copy(0,4,5,b);//[0 4)
        System.out.println(Arrays.toString(b));
    }
}
