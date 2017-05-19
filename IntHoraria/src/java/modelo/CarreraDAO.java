/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.*;
import java.sql.*;

/**
 *
 * @author Alejo
 */
public class CarreraDAO extends Dao {

    PreparedStatement ps = null;
    ResultSet rs = null;

    public Integer agregarCarrera(Carrera carrera) throws SQLException {
        String sql = "INSERT INTO carrera VALUES (?,?)";
        this.ps = conexion.prepareStatement(sql);
        ps.setInt(1, carrera.getId_carrera());
        ps.setString(2, carrera.getNombre_carrera());
        Integer num = ps.executeUpdate();
        return num;
    }
    
    public Integer actualizarCarrera(Carrera carrera) throws SQLException {
        //String sql = "INSERT INTO carrera (carrera_nombre,carrera_user,carrera_clave) VALUES ('" + carrera.getNombre() + "','" + carrera.getCarrera() + "','" + carrera.getClave() + "')";
        String sql = "UPDATE carrera SET nombre_carrera=?  WHERE id_carrera=?";
        this.ps = conexion.prepareStatement(sql);
        ps.setString(1, carrera.getNombre_carrera());
        ps.setInt(2, carrera.getId_carrera());
        Integer num = ps.executeUpdate();
        return num;
    }
    
    /*
    public Carrera consultarCarrera(String carrera, String clave) throws SQLException {        
        Carrera u = new Carrera();
        String sql = "SELECT u.id_carrera, u.nombre_carrera, u.clave FROM carrera u WHERE 1=1 AND u.id_carrera = ? AND u.clave = ?";
        this.ps = conexion.prepareStatement(sql);
        ps.setString(1, carrera);
        ps.setString(2, clave);
        this.rs = ps.executeQuery();
        if(rs.next()){
            u.setId_carrera(rs.getInt("id_carrera"));
            u.setNombre_usario(rs.getString("nombre_carrera"));
            u.setClave(rs.getString("clave"));
            return u;
        }
        
        return null;
    }
    */
}
