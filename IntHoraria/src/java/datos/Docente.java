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
public class Docente {
    private int id_docente;
    private boolean estado;
    private int nuip;

    /**
     * @return the id_docente
     */
    public int getId_docente() {
        return id_docente;
    }

    /**
     * @param id_docente the id_docente to set
     */
    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
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
