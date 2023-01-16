/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guia9;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.RevolverDeAgua;
import java.util.ArrayList;

import java.util.Scanner;
import servicio.RevolverDeAguaServicio;

/**
 *
 * @author USUARIO
 */
public class Ejercicio2Guia9 {

    private static ArrayList<Jugador> jugador1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RevolverDeAguaServicio s1 = new RevolverDeAguaServicio();
        Jugador j = new Jugador();
       
        s1.ronda();
    }

}
