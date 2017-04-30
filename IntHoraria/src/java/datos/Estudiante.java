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
public class Estudiante {

    private int id_estudiante;
    private boolean estado;
    private int nuip;

    /**
     * @return the id_estudiante
     */
    public int getId_estudiante() {
        return id_estudiante;
    }

    /**
     * @param id_estudiante the id_estudiante to set
     */
    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

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
    
    
}
