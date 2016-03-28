package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private String db = "";
    private String user = "";
    private String password = "";
    private String url = "";
    private Connection conn = null;

    public void conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(this.url, this.user, this.password);
        System.out.println("Conexion MySQL realizada con exito.");
    }

    public Connection getConexion() {
        return this.conn;
    }

    public void setDatabase(String db) {
        this.db = db;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setURL(String ip, String puerto) {
        this.url = "jdbc:mysql://" + ip + ":" + puerto + "/" + db;
    }
}
