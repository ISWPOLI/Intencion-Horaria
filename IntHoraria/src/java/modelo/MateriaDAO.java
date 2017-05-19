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
public class MateriaDAO extends Dao {

    PreparedStatement ps = null;
    ResultSet rs = null;

    public Integer agregarMateria(Materia materia) throws SQLException {
        String sql = "INSERT INTO materia VALUES (null,?,?,?,?)";
        this.ps = conexion.prepareStatement(sql);
        ps.setString(1, materia.getNombre_materia());
        ps.setInt(2, materia.getId_carrera());
        ps.setInt(3, materia.getId_materia_prerrequisito());
        ps.setBoolean(4, materia.isEstado());
        Integer num = ps.executeUpdate();
        return num;
    }

    public Integer actualizarMateria(Materia materia) throws SQLException {
        //String sql = "INSERT INTO materia (materia_nombre,materia_user,materia_clave) VALUES ('" + materia.getNombre() + "','" + materia.getMateria() + "','" + materia.getClave() + "')";
        String sql = "UPDATE materia SET estado=?  WHERE id_materia=?";
        this.ps = conexion.prepareStatement(sql);
        ps.setBoolean(1, materia.isEstado());
        ps.setInt(2, materia.getId_materia());
        Integer num = ps.executeUpdate();
        return num;
    }
    
    /*
    public Materia consultarMateria(String materia, String clave) throws SQLException {
        Materia u = new Materia();
        String sql = "SELECT u.id_materia, u.nombre_materia, u.clave FROM materia u WHERE 1=1 AND u.id_materia = ? AND u.clave = ?";
        this.ps = conexion.prepareStatement(sql);
        ps.setString(1, materia);
        ps.setString(2, clave);
        this.rs = ps.executeQuery();
        if (rs.next()) {
            u.setId_materia(rs.getInt("id_materia"));
            u.setNombre_usario(rs.getString("nombre_materia"));
            u.setClave(rs.getString("clave"));
            return u;
        }

        return null;
    }*/
}
