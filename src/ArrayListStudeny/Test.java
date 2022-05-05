package ArrayListStudeny;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Student> arr=new ArrayList<>();
        System.out.println("请输入共有的学生数");
        int a = scanner.nextInt();
        int i=0;
      while (i<a){
          System.out.println("请输入学生姓名：");
          String name=scanner.next();
          System.out.println("请输入学生年龄：");
          int age=scanner.nextInt();
          Student student=new Student();
          student.setName(name);
          student.setAge(age);
          arr.add(student);


          i++;
      }
        for (int j = 0; j <arr.size() ; j++) {
            Student s=arr.get(i);
            System.out.println("name: "+s.getName()+"age "+s.getAge());
        }


    }



}
