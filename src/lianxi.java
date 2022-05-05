 public class lianxi{
    public static void main(String[] args) {
        char b[]={'孙','红','坤'};
          String s=charChange(b);
        System.out.println(s);

          }
          public static  String charChange(char[] a ){
              String st="";
              for (int i = 0; i < a.length; i++) {
                 st+=a[i]; //st=st+a[i];
              }
              return st;
          }
    }
