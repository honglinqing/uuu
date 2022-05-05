public class Util {
    String name;
    int ade;

    public Util() {
        System.out.println("无参构造");
    }
    public Util(String name) {
        System.out.println("有参构造");
    }
    /*  public Util(String name, int ade) {
        this.name = name;
        this.ade = ade;
    }*/
    public void show(){
        System.out.println(name);
        System.out.println(ade);
        System.out.println("调用show方法");
    }
}
