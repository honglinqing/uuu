package homework0428;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.util.Properties;

public class Xuigai {
    public static DruidDataSource datasource;
    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/homework0428/Deluyi"));
            datasource= (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        DruidPooledConnection connection = datasource.getConnection();
        PreparedStatement ps = connection.prepareStatement("update  student set name='黄晓飞' where id=1");
        int i= ps.executeUpdate();
     if(i>0){
         System.out.println("执行成功");
     }else{
         System.out.println("执行失败");
     }
     connection.close();
     ps.close();
    }
}
