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
public class HorarioMateria {

    private int id_horario;
    private int id_materia;
    private int hora_bloque;
    private int id_dia_semana;

    /**
     * @return the id_horario
     */
    public int getId_horario() {
        return id_horario;
    }

    /**
     * @param id_horario the id_horario to set
     */
    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

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
     * @return the hora_bloque
     */
    public int getHora_bloque() {
        return hora_bloque;
    }

    /**
     * @param hora_bloque the hora_bloque to set
     */
    public void setHora_bloque(int hora_bloque) {
        this.hora_bloque = hora_bloque;
    }

    /**
     * @return the id_dia_semana
     */
    public int getId_dia_semana() {
        return id_dia_semana;
    }

    /**
     * @param id_dia_semana the id_dia_semana to set
     */
    public void setId_dia_semana(int id_dia_semana) {
        this.id_dia_semana = id_dia_semana;
    }
}
