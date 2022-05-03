package homework0428;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Properties;

public class ShanChu {
    public static DruidDataSource datasource;

    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/homework0428/Deluyi"));
            datasource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws SQLException {
        DruidPooledConnection connection = null;
        PreparedStatement pre = null;

        connection = datasource.getConnection();
        //创建preparesStatement 接口，预编译sql语句
        pre = connection.prepareStatement("insert into student(id,name,sex,birthday,classid,age) values(?,?,?,?,?,?)");
        pre.setInt(1,7);
        pre.setString(2,"四皇");
        pre.setString(3,"男");
        pre.setString(4,String.valueOf(LocalDate.now()));
        pre.setInt(5,2);
        pre.setInt(6,32);
        //预编译，产生结果集
        int i = pre.executeUpdate();
        if (i>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

    }


}




