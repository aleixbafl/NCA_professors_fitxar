package nca_professors_fitxar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexioBD {
    private String url;
    private String usuari;
    private String contrasenya;
    private String drive;
    private Connection conexio;

    public conexioBD() {
        this.url = "jdbc:mysql://192.0.1.196:3306/fitxar";
        this.usuari = "root";
        this.contrasenya = "";
        //this.drive = "com.mysql.cj.jdbc.Driver";
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
    
    //select
    public ResultSet ecjecutarConsulta(String consulta) throws SQLException{
        Statement statement = conexio.createStatement();
        return statement.executeQuery(consulta);
    }
    
    //insertar, actualitzar y eliminar
    public int ecjecutarActualitzar(String consulta) throws SQLException{
        Statement statement = conexio.createStatement();
        return statement.executeUpdate(consulta);
    }
}
