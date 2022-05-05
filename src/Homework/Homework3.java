package Homework;

import java.io.File;
import java.io.IOException;

/*使用递归方式,遍历C://Windows目录,如果遍历出来的是目录则进入目录中继续遍历,
直到目录中没有目录或全部都是文件为止,打印所有文件的名称*/
public class Homework3 {
    public static void main(String[] args) throws IOException {
        show(new File("C://Windows"));

    }
    public static void show(File a){
        if (a.exists()){
            File[] files = a.listFiles();
            if (files!=null){
                for (File file : files) {
                    if (file.isFile()){
                        System.out.println(file);
                    }else{
                        show(file);
                    }
                }
            }
        }else{
            System.out.println("文件不存在");
        }
    }
}
