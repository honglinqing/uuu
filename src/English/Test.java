package English;

public class Test {
    public static void main(String[] args) {
        Bspeed b=new Bspeed();
        b.setAge(30);

        b.setName("孙洪坤");

        System.out.println(b.getName()+"的年龄："+b.getAge());
        b.eat();
        b.student();
        Pspeed p=new Pspeed();
        p.eat();
        p.SEnglish();
        p.student();
        p.setName("孙玉冲");
        p.setAge(20);
        System.out.println(p.getName()+"的年龄："+p.getAge());
    }
}
