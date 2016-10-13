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
public class MateriaInstitucional extends Materia{
    
    public MateriaInstitucional(){
        super();
    }
     public MateriaInstitucional(int codigo,int pesoHorario,String nombre,boolean pre, int creditos, String programa){
         super(codigo, pesoHorario, nombre, pre, creditos, programa);
     }
}
