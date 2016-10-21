
package programa;

import java.util.*;
import materia.Materia;


public class Programa {

    protected String nombre;

    /**
     * 
     */
    protected int duracion;

    /**
     * 
     */
    protected LinkedList<Materia>[] malla;

    /**
     * 
     */
    protected String facultad;
    
    
    public Programa() {
        nombre="";
        duracion=0;
        malla=null;
        facultad="";
    }
    public Programa(String nombre,int duracion,String facultad) {
        this.nombre=nombre;
        this.duracion=0;
        this.malla=null;
        this.facultad=facultad;
    }

}