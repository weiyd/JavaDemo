package sqlDemo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {
    static String sql = null;
    static DBHelper  db1= null;
    static ResultSet ret = null;

    public static void main(String[] args) {
        sql = "select * from student";
        db1 = new DBHelper(sql);

        try{
            ret = db1.pst.executeQuery();
            while (ret.next()){
                String uid  = ret.getString(1);
                int ufname = ret.getInt(2);
                String ulname = ret.getString(3);
                String udate = ret.getString(4);
                System.out.println(uid + "\t" + ufname + "\t" + ulname + "\t" + udate );
            }
            ret.close();
            db1.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
