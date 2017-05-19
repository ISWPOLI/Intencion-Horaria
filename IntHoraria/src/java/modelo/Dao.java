/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.*;

/**
 *
 * @author Alejo
 */
public class Dao {
    public Connection conexion;
    public final static String hostDb = "localhost";
    public final static String portDb = "3306";
    public final static String nameDb = "bd_gestion_materias";
    public final static String userDb = "root";
    public final static String passDb = "";
    
    //Conectar a la Base de datos
    public void conectar() throws SQLException,ClassNotFoundException{
         Class.forName("com.mysql.jdbc.Driver");
         this.conexion=DriverManager.getConnection("jdbc:mysql://"+hostDb+":"+portDb+"/"+nameDb,userDb,passDb);
    }
    //Desconectar a la Base de datos
    public void desconectar() throws SQLException, ClassNotFoundException{
        this.conexion.close();
    }
    
    //Pensar la implementacion con sqlite
}
