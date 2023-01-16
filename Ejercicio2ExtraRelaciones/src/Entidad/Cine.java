/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Cine {
    private String pelicula;
    private String[][]sala;
    private Integer precio;
    private ArrayList<Espectadores> espectadores;

    public Cine() {
    }

    public Cine(String pelicula, String[][] sala, Integer precio, ArrayList<Espectadores> espectadores) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
        this.espectadores = espectadores;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public ArrayList<Espectadores> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectadores> espectadores) {
        this.espectadores = espectadores;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", sala=" + sala + ", precio=" + precio + ", espectadores=" + espectadores + '}';
    }

   
    
}
