import java.util.Arrays;

public class Equal {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int b[]=new int[a.length];
        fill(0,4,8,b);
        System.out.println(Arrays.toString(b));

    }
    public static int[] fill(int a,int b,int value,int []arr ){
        for (int i = a; i <b ; i++) {
            arr[i]=value;

        }
        return arr;
    }
}
