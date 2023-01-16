/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Persona> personas = new ArrayList<>();
    ArrayList<Perro> perros = new ArrayList<>();

    public void crearPersonas() {
        int per;
        int persona = 0;
        System.out.println("Cuantas personas desea ingresar?");
        per = leer.nextInt();

        do {

            Persona per1 = new Persona();
            System.out.println("Ingrese el nombre de la persona");
            per1.setNombre(leer.next());
            System.out.println("Ingrese el apellido");
            per1.setApellido(leer.next());
            System.out.println("Ingrese la edad");
            per1.setEdad(leer.nextInt());
            System.out.println("Ingrese el DNI");
            per1.setDni(leer.nextInt());
            personas.add(per1);
            persona++;
        } while (persona < per);
    }

    public void crearPerros() {
        int p1;
        int perr = 0;

        System.out.println("Cuantos perros desea crear?");
        p1 = leer.nextInt();

        do {
            Perro perro = new Perro();
            System.out.println("Ingrese el nombre del perro");
            perro.setNombre(leer.next());
            System.out.println("Ingrese la raza");
            perro.setRaza(leer.next());
            System.out.println("Ingrese la edad");
            perro.setEdad(leer.nextInt());
            System.out.println("Ingrese el tamaño");
            perro.setTamaño(leer.next());
            perros.add(perro);
            perr++;
        } while (perr < p1);
    }

    public void mostrarPersona() {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public void mostrarPerros() {
        for (Perro perr : perros) {
            System.out.println(perr.getNombre());
        }
    }

    public void adoparPerro() {
        for (int i = 0; i < personas.size(); i++) {

            System.out.println("Hola " + personas.get(i).getNombre() + " esta es la lista de perros disponibles");
            mostrarPerros();

            System.out.println("Que perro desea adopatr?");
            String nombreP = leer.next();
            boolean aux = false;

            for (Perro perro1 : perros) {

                if (perro1.getNombre().equalsIgnoreCase(nombreP)) {

                    aux = true;
                    System.out.println("Usted adopto a: " + perro1);
                    personas.get(i).setPerro(perro1);
                    perro1.setAdoptado(aux);
                    perros.remove(perro1);
                    break;
                }
            }

        }

    }
}
