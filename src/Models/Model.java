package Models;

import java.sql.SQLException;

public class Model extends Database {

    public Model(String db, String user, String pass, String ip, String port) throws ClassNotFoundException, SQLException {
        super.setDatabase(db);
        super.setUser(user);
        super.setPassword(pass);
        super.setURL(ip, port);
        super.conectar();
    }

}
