import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        //输入周几，去调用方法，周一：跑步  周二 爬山 周三 睡觉  if语句
        System.out.println("请输入：");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       String st=week(a);
        System.out.println(st);

    }
    public static String week(int a){
        if(a==1){
            return "跑步";
        }
        if(a==2){
            return "爬山";
        }
        if(a==3){
            return "睡觉";
        }
        return "输入错误！";
    }

}
