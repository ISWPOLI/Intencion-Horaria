/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.TUsuario_;
import java.sql.*;

/**
 *
 * @author Alejo
 */
public class UsuarioDAO_ extends Dao {

    PreparedStatement ps = null;
    ResultSet rs = null;

    public Integer agregarUsuario(TUsuario_ usuario) throws SQLException {
        //String sql = "INSERT INTO usuario (usuario_nombre,usuario_user,usuario_clave) VALUES ('" + usuario.getNombre() + "','" + usuario.getUsuario() + "','" + usuario.getClave() + "')";
        String sql = "INSERT INTO usuario (usuario_nombre,usuario_user,usuario_clave) VALUES (?,?,?)";
        this.ps = conexion.prepareStatement(sql);
        ps.setString(1, usuario.getNombre());
        ps.setString(2, usuario.getUsuario());
        ps.setString(3, usuario.getClave());
        Integer num = ps.executeUpdate();
        return num;
    }
    
    public Integer actualizarUsuario(TUsuario_ usuario) throws SQLException {
        //String sql = "INSERT INTO usuario (usuario_nombre,usuario_user,usuario_clave) VALUES ('" + usuario.getNombre() + "','" + usuario.getUsuario() + "','" + usuario.getClave() + "')";
        String sql = "UPDATE usuario SET usuario_clave=? WHERE usuario_user=?";
        this.ps = conexion.prepareStatement(sql);
        ps.setString(1, usuario.getClave());
        ps.setString(2, usuario.getUsuario());
        Integer num = ps.executeUpdate();
        return num;
    }
    
    public TUsuario_ consultarUsuario(String usuario, String clave) throws SQLException {        
        TUsuario_ u = new TUsuario_();
        String sql = "SELECT u.usuario_nombre, u.usuario_user, u.usuario_clave FROM usuario u WHERE 1=1 AND u.usuario_user = ? AND u.usuario_clave = ?";
        this.ps = conexion.prepareStatement(sql);
        ps.setString(1, usuario);
        ps.setString(2, clave);
        this.rs = ps.executeQuery();
        if(rs.next()){
            u.setNombre(rs.getString("usuario_nombre"));
            u.setUsuario(rs.getString("usuario_user"));
            u.setClave(rs.getString("usuario_clave"));
            return u;
        }
        
        return null;
    }
    
        public TUsuario_ comprobarUsuario(String usuario) throws SQLException {        
        TUsuario_ u = new TUsuario_();
        String sql = "SELECT u.usuario_nombre, u.usuario_user, u.usuario_clave FROM usuario u WHERE 1=1 AND u.usuario_user = ?";
        this.ps = conexion.prepareStatement(sql);
        ps.setString(1, usuario);
        this.rs = ps.executeQuery();
        if(rs.next()){
            u.setNombre(rs.getString("usuario_nombre"));
            u.setUsuario(rs.getString("usuario_user"));
            u.setClave(rs.getString("usuario_clave"));
            return u;
        }
        
        return null;
    }
    

}
