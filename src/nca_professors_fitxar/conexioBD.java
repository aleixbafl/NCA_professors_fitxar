package nca_professors_fitxar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexioBD {
    private String url;
    private String usuari;
    private String contrasenya;
    private String drive;
    private Connection conexio;

    public conexioBD() {
        this.url = "jdbc:mysql://localhost:3306/fitxar";
        this.usuari = "root";
        this.contrasenya = "";
        //this.drive = "com.mysql.cj.jdbc.Driver";
    }

    public Connection getConexio() {
        return conexio;
    }
    
    public void obrirConexio() throws SQLException, ClassNotFoundException{
        //Class.forName(drive);
        conexio = DriverManager.getConnection(url, usuari, contrasenya);
    }
    
    public void tancaConexio() throws SQLException {
        if (conexio != null) {
            conexio.close();
        }
    }
    
}
