package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    public Statement connect() throws ClassNotFoundException, SQLException
    {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String url = "jdbc:ucanaccess://C:\\Users\\HP\\Documents\\NetBeansProjects\\DigitalDiary\\DiDiaryDB.accdb";
        Connection conn = DriverManager.getConnection(url);
        Statement st = conn.createStatement();
        return st;
    }
}
