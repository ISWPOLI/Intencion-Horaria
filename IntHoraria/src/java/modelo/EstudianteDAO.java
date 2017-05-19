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
public class EstudianteDAO extends Dao {

    PreparedStatement ps = null;
    ResultSet rs = null;

    public Integer agregarEstudiante(Estudiante estudiante) throws SQLException {
        String sql = "INSERT INTO estudiante VALUES (null,?,?)";
        this.ps = conexion.prepareStatement(sql);
        ps.setBoolean(1, estudiante.isEstado());
        ps.setInt(2, estudiante.getNuip());
        Integer num = ps.executeUpdate();
        return num;
    }

    public Integer actualizarEstudiante(Estudiante estudiante) throws SQLException {
        //String sql = "INSERT INTO estudiante (estudiante_nombre,estudiante_user,estudiante_clave) VALUES ('" + estudiante.getNombre() + "','" + estudiante.getEstudiante() + "','" + estudiante.getClave() + "')";
        String sql = "UPDATE estudiante SET estado=?  WHERE nuip=?";
        this.ps = conexion.prepareStatement(sql);
        ps.setBoolean(1, estudiante.isEstado());
        ps.setInt(2, estudiante.getNuip());
        Integer num = ps.executeUpdate();
        return num;
    }
}
