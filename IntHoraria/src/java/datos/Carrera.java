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
public class Carrera {

    private int id_carrera;
    private String nombre_carrera;
    
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
     * @return the nombre_carrera
     */
    public String getNombre_carrera() {
        return nombre_carrera;
    }

    /**
     * @param nombre_carrera the nombre_carrera to set
     */
    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }

}
