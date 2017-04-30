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
public class Materia {

    private int id_materia ;
    private String nombre_materia ;
    private int id_carrera ;
    private int id_materia_prerrequisito ;
    private boolean estado ;

    /**
     * @return the id_materia
     */
    public int getId_materia() {
        return id_materia;
    }

    /**
     * @param id_materia the id_materia to set
     */
    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    /**
     * @return the nombre_materia
     */
    public String getNombre_materia() {
        return nombre_materia;
    }

    /**
     * @param nombre_materia the nombre_materia to set
     */
    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    /**
     * @return the id_carrera
     */
    public int getId_carrera() {
        return id_carrera;
    }

    /**
     * @param id_carrera the id_carrera to set
     */
    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    /**
     * @return the id_materia_prerrequisito
     */
    public int getId_materia_prerrequisito() {
        return id_materia_prerrequisito;
    }

    /**
     * @param id_materia_prerrequisito the id_materia_prerrequisito to set
     */
    public void setId_materia_prerrequisito(int id_materia_prerrequisito) {
        this.id_materia_prerrequisito = id_materia_prerrequisito;
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

}
