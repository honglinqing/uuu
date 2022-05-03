package homework0428;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
//9.2 查询学生表所有数据,展示 s.*,c.cname
public class DuridQueryDemo {
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
        PreparedStatement ps = connection.prepareStatement("select s.*,c.cname from clazz as c, student as s where s.classid=c.cid;");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            System.out.println("id:" + rs.getInt(1) + "\t name:" + rs.getString("name")
                    + "\t sex:" + rs.getString(3) + "\t age" + rs.getInt(4)+"\t brithday:"+rs.getString(5)+"\t classid:"+rs.getString(6));
        }


    }

}
