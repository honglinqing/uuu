import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MYsol {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/netclass?serverTimezone=UTC";
        String username ="root";
        String password="root";
        Connection sss = DriverManager.getConnection(url, username, password);
        String sql ="select * from yyy";
        Statement ss = sss.createStatement();
        ResultSet s = ss.executeQuery(sql);
        while (s.next()){
            System.out.println("id:" + s.getInt(1) + "\t name:" + s.getString("name")
                    + "\t sex:" + s.getString(3) + "\t score:" + s.getString(4));
        }

        s.close();
        ss.close();
        sss.close();
    }






}
