package homework0428;
//9.1 创建合适的bean封装clazz和student
public class Fengzhuang {
    private int id;
    private  String name;
    private  String sex;
    private   String brithday;
    private  int classid;
    private  String cname;

    public Fengzhuang(int id, String name, String sex, String brithday, int classid, String cname) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.brithday = brithday;
        this.classid = classid;
        this.cname = cname;
    }

    public Fengzhuang() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
