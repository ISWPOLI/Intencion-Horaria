/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class Consultas extends Conexion {

    
    public boolean login(String usuario,String clave){
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            //manera segura y correcta de hacerla
            String consulta = "select* from usuarios where usuario = ? y clave = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, clave);
            //guardar el resultado de la consulta
            rs = pst.executeQuery();
            
            if(rs.absolute(1)){
                //si existe 1 registro
                return true;
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }finally {
            try {
                //cerrar conexion pst y rs
                if(getConexion() != null) getConexion().close();                
                if(pst != null) pst.close();
                if(rs != null) rs.close();
            }
            catch (Exception e) {
            }
            
        }
        
        return false;
        
    }
    //probar si funciona por consola 
    
    public static ArrayList<String> llenar_combo(){
        ArrayList<String> lista = new ArrayList<String>();
        String consulta = "SELECT nombre FROM materias Where disponible IS NOT NULL";
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {            
         
            rs = pst.executeQuery(consulta);
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(rs.next()){
                lista.add(rs.getString("ID"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public static ArrayList<String> llenar_combo2(){
        ArrayList<String> lista = new ArrayList<String>();
        String consulta = "SELECT horario FROM materias Where disponible IS NOT NULL";
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {            
         
            rs = pst.executeQuery(consulta);
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(rs.next()){
                lista.add(rs.getString("IDD"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public static void main(String[] args){
        Consultas co = new Consultas();
        System.out.println(co.login("santi","santi"));
    }
    
    
}
