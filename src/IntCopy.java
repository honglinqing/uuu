public class IntCopy {
    public int[] copy(int a,int b,int value,int arr[]){
        for (int i = a; i <b ; i++) {
            arr[i]=value;

        }

        return arr;
    }
}
