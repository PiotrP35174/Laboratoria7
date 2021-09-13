package sample.pl.lublin.wsei.java.cwiczenia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyDB {
    public String host;
    public Number port;
    public String Name;
    private String user;
    private String password;

    public MyDB(String host, Number port, String Name, String user, String password) {
        MyDB db = new MyDB();
        db.host = "root";
        db.port = 3306;
        db.Name = "localhost";
        db.setUser(System.in.toString());
        db.setPassword(System.in.toString());

    }

    public void setUser(String newuser) {
        this.user = newuser;
    }

    public void setPassword(String newpassword) {
        this.password = newpassword;
    }


}

    /*static void MyDB.getConncetion() {
        private Connection conn = null;

        private void connect () {
            Properties connectionProps = new Properties();
            connectionProps.put("user", user);
            connectionProps.put("password", password);
            connectionProps.put("serverTimezone", "Europe/Warsaw");

            String jdbcString = "jdbc:mysql://" + host + ":" + port + "/" + Name;
            try {
                conn = DriverManager.getConnection(
                        jdbcString, connectionProps);
            } catch (SQLException e) {
                System.out.println("Blad podlaczenia do bazy: " + jdbcString);
                System.out.println("Komunikat bledu: " + e.getMessage());
                conn = null;
            }
            System.out.println("Connected to database " + Name);
        }

        public Connection getConnection () {
            if (conn == null)
                connect();
            return conn;
        }


    }
}

*/
