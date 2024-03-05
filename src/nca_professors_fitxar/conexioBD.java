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
    private Connection conexio;

    public conexioBD() {
        this.url = "jdbc:mysql://srv965.hstgr.io:3306/u346867692_fitxar";
        this.usuari = "u346867692_fitxar";
        this.contrasenya = "Fat/323232";
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
