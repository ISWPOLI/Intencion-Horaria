/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author alugo
 */
public class Usuario {

    private int nuip ;
    private String nombre_usuario ;
    private String apellido_usuario ;
    private String email_usuario ;
    private String clave;

    /**
     * @return the nuip
     */
    public int getNuip() {
        return nuip;
    }

    /**
     * @param nuip the nuip to set
     */
    public void setNuip(int nuip) {
        this.nuip = nuip;
    }

    /**
     * @return the nombre_usario
     */
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * @param nombre_usario the nombre_usario to set
     */
    public void setNombre_usuario(String nombre_usario) {
        this.nombre_usuario = nombre_usario;
    }

    /**
     * @return the apellido_usuario
     */
    public String getApellido_usuario() {
        return apellido_usuario;
    }

    /**
     * @param apellido_usuario the apellido_usuario to set
     */
    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    /**
     * @return the email_usuario
     */
    public String getEmail_usuario() {
        return email_usuario;
    }

    /**
     * @param email_usuario the email_usuario to set
     */
    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

}
