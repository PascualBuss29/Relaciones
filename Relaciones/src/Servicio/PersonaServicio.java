/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cPersona() {
        String mascota;
        int persona = 0;
        do {
            Persona p1 = new Persona();
            System.out.println("Ingrese el nombre de la persona");
            p1.setNombre(leer.next());
            System.out.println("Ingrese el apellido");
            p1.setApellido(leer.next());
            System.out.println("Ingrese la edad");
            p1.setEdad(leer.nextInt());
            System.out.println("Ingrese el DNI");
            p1.setDni(leer.nextInt());
            System.out.println("Desea una mascota?S/N");
            mascota = leer.next();

            if (mascota.equalsIgnoreCase("S")) {
                if (persona == 0) {
                    Perro m1 = new Perro("Colincha", "MantoNegro", 2, "Mediano");
                    p1.setPerro(m1);
                    System.out.println(p1);
                } else {
                    Perro m2 = new Perro("Tom", "callejero", 8, "chiquito");
                    p1.setPerro(m2);
                    System.out.println(p1);
                }

            } else {
                System.out.println("Adopta no compres");
            }
            persona++;
        } while (persona == 1);

    }
}
