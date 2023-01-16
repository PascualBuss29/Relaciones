/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1extraguia9;

import Servicio.Servicio;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1ExtraGuia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Servicio ps = new Servicio();
        ps.crearPersonas();
        ps.crearPerros();
        ps.mostrarPersona();
        ps.mostrarPerros();
        ps.adoparPerro();
        ps.mostrarPersona();
    }
    
}
