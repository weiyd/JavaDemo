package sqlDemo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBHelper {
    public static final String url = "jdbc:mysql://127.0.0.1/student?&characterEncoding=utf8&serverTimezone=GMT";
    public static final String name="com.mysql.cj.jdbc.Driver";
    public static final String user ="root";
    public static final String password = "root";

    public Connection conn = null;
    public PreparedStatement pst =null;

    public DBHelper(String sql){
        try{
            Class.forName(name);
            conn = DriverManager.getConnection(url,user,password);
            pst = conn.prepareStatement(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            this.conn.close();
            this.pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}