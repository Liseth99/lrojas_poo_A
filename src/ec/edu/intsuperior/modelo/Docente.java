/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Cristhian
 */
public class Docente {
    
    
    String ci;
    String nombre;
    String apellido;
    String direccion;
    String especialidad;
    public enum TipoGenero {
        MASCULINO, FEMENINO
    }
    TipoGenero genero;

    public Docente() {
    }

    public Docente(String ci, String nombre, String apellido, String direccion, String especialidad, TipoGenero genero) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.genero = genero;
    }

    public String getCi() {
        return ci;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public TipoGenero getGenero() {
        return genero;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setGenero(TipoGenero genero) {
        this.genero = genero;
    }
   public String tostring() {
         return"Los datos del docente solicitada es :\n"
            + "Cedula:  " +getCi() + "\n"
                + "Nombre y apellido: " +getNombre() +"\n"
                       + "genero: "+getGenero();
                
    }
    
}
   
    

