/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author USUARIO
 */
public class Perro {

    private String nombre;
    private String raza;
    private Integer edad;
    private String tamaño;
    private Boolean adoptado;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.adoptado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Boolean getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(Boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return  " " + nombre + "\n,"
                + " Raza= " + raza + "\n,"
                + " Edad= " + edad+ "\n"
                + " Tamaño= " + tamaño +"" ;
    }
    

   

}
