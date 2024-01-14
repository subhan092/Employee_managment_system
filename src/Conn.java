

import java.sql.*;

public class Conn {

    public Connection c;
    public Statement s;


    public Conn () {

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            c = DriverManager.getConnection("jdbc:ucanaccess://C://Users//ibm//Documents//Database10.accdb");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
