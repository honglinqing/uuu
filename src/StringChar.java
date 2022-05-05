public class StringChar {
    public String changeChar(char[] c){
        String s="";

        for (int i = 0; i <c.length ; i++) {
            s=s+c[i]+"";
        }
        return s;
    }
}
