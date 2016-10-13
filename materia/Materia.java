/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materia;

/**
 *
 * @author mauricio
 */

import java.util.*;

/**
 * 
 */
public abstract class Materia {
/**
     * identificador de la materia
     */
    protected int codigo;

    /**
     * imporatancia que va a tener al 
     * momento de generar el horario
     */
    protected int pesoHorario;

    /**
     * nombre de la materia
     */
    protected String nombre;

    /**
     * materias que deben verse antes
     */
    protected Map<Materia, Boolean>  prerrequisitos;

    /**
     * si tiene prerrequisitos
     */
    protected boolean pre;

    /**
     * nos dice la intencidad horaria
     */
    protected int creditos;

    /**
     * nos dice a que programa pertenece
     */
    protected String programa;


    /**
     * Default constructor
     */
    public Materia() {
        codigo=0;
        pesoHorario=0;
        nombre="";
        prerrequisitos=null;
        pre=false;
        creditos=0;
        programa="";
        
    }
    public Materia(int Codigo,int pesoHorario,String nombre,boolean pre, int creditos, String programa){
        this.codigo=codigo;
        this.pesoHorario=pesoHorario;
        this.nombre=nombre;
        this.pre=pre;
        this.creditos=creditos;
        this.programa=programa;
        prerrequisitos=null;
    }

    



    /**
     * @return
     */
    public int getCodigo() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getPesoHorario() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public String getNombre() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public Map<Materia,Boolean> getPrerrequisitos() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Boolean getPre() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getCreditos() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public String getPrograma() {
        // TODO implement here
        return "";
    }

    /**
     *
     * @param codigo
     */
     public void setCodigo (int codigo  )  {
        this.codigo=codigo;
    }

    
    public void setPesoHorario( int pesoHorario ) {
        // TODO implement here
        this.pesoHorario=pesoHorario;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre ) {
        // TODO implement here
       this.nombre= nombre;
    }

    /**
     * @param prerrequisitos
     */
    public void setPrerrequisitos(Map<Materia, Boolean>  prerrequisitos ) {
        // TODO implement here
        this.prerrequisitos=prerrequisitos;
    }

    /**
     * @param pre
     */
    public void setPre(  boolean pre ) {
        // TODO implement here
        this.pre=pre;
    }

    /**
     * @param creditos
     */
    public void setCreditos(int creditos ) {
        // TODO implement here
       this.creditos=creditos;
    }

    /**
     * @param programa
     */
    public void setPrograma( String programa ) {
        // TODO implement here
        this.programa=programa;
    }

}
