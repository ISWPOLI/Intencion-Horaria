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
public class UsuarioDAO extends Dao {

    PreparedStatement ps = null;
    ResultSet rs = null;

    public Integer agregarUsuario(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario VALUES (?,?,?,?,?)";
        this.ps = conexion.prepareStatement(sql);
        ps.setInt(1, usuario.getNuip());
        ps.setString(2, usuario.getNombre_usuario());
        ps.setString(3, usuario.getApellido_usuario());
        ps.setString(4, usuario.getEmail_usuario());
        ps.setString(5, usuario.getClave());
        Integer num = ps.executeUpdate();
        return num;
    }
    
    public Integer actualizarUsuario(Usuario usuario) throws SQLException {
        //String sql = "INSERT INTO usuario (usuario_nombre,usuario_user,usuario_clave) VALUES ('" + usuario.getNombre() + "','" + usuario.getUsuario() + "','" + usuario.getClave() + "')";
        String sql = "UPDATE usuario SET clave=?  WHERE id_usuario=?";
        this.ps = conexion.prepareStatement(sql);
        ps.setString(1, usuario.getClave());
        ps.setInt(2, usuario.getNuip());
        Integer num = ps.executeUpdate();
        return num;
    }
    
    public Usuario consultarUsuario(int nuip, String clave) throws SQLException {        
        Usuario u = new Usuario();
        String sql = "SELECT u.nuip, u.nombre_usuario, u.clave FROM usuario u WHERE 1=1 AND u.nuip = ? AND u.clave = ?";
        this.ps = conexion.prepareStatement(sql);
        ps.setInt(1, nuip);
        ps.setString(2, clave);
        this.rs = ps.executeQuery();
        if(rs.next()){
            u.setNuip(rs.getInt("nuip"));
            u.setNombre_usuario(rs.getString("nombre_usuario"));
            u.setClave(rs.getString("clave"));
            return u;
        }
        
        return null;
    }
    
        public Usuario comprobarUsuario(String usuario) throws SQLException {        
        Usuario u = new Usuario();
        String sql = "SELECT u.id_usuario, u.nombre_usuario, u.clave FROM usuario u WHERE 1=1 AND u.id_usuario = ?";
        this.ps = conexion.prepareStatement(sql);
        ps.setString(1, usuario);
        this.rs = ps.executeQuery();
        if(rs.next()){
            u.setNuip(rs.getInt("id_usuario"));
            u.setNombre_usuario(rs.getString("nombre_usuario"));
            u.setClave(rs.getString("clave"));
            return u;
        }
        
        return null;
    }
    

}
