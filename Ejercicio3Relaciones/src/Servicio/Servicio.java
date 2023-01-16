/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.*;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Baraja b1 = new Baraja();
    Cartas cart1 = new Cartas();
    int cont = 0;
    ArrayList<Cartas> maso = new ArrayList();

    public void barajar() {
        Collections.shuffle(b1.getCartas());

    }

    public void siguienteCarta() {
        cont++;
        if (cont == 40) {
            cart1 = b1.getCartas().get(0);
            System.out.println(b1.getCartas().get(0));
            maso.add(cart1);
            b1.getCartas().remove(0);

        } else {
            System.out.println("Se acabo el maso, barajar de nuevo");
        }

    }

    public void mostrarBaraja() {
        System.out.println("Las cartas restantes son: ");
        for (Cartas baraja : b1.getCartas()) {
            System.out.println(baraja.getNum() +" De "+baraja.getPalo());

        }
        System.out.println(b1.getCartas().size());
    }

    public void cartasDisponibles() {
        System.out.println("El total de cartas que quedan es: " + (b1.getCartas().size()));

    }

    public void darCartas() {
        int op;
        System.out.println("Cuantas cartas desea pedir");
        op = leer.nextInt();
        if (b1.getCartas().size() >= op) {
            for (int i = 0; i < op; i++) {
                maso.add(b1.getCartas().get(0));
                b1.getCartas().remove(0);
            }

        }
    }

    public void mostrarMonton() {
        if (maso.size() == 0) {
            
            System.out.println("No se han sacado cartas");
        } else {
            System.out.println("Las cartas son: ");
            for (Cartas cartas : maso) {
                System.out.println(cartas.getNum().toString() + " De " + cartas.getPalo().toString());
               
            }
        }
         System.out.println(" ");
    }

    public void menuCartas() {
        int op;
        System.out.println("Bienvenido al Juego");
        do {
            System.out.println("------------:::MENU:::------------");
            System.out.println("Qué desea realizar:\n"
                    + "1- Barajar.\n"
                    + "2- Siguiente carta.\n"
                    + "3- Cartas disponibles.\n"
                    + "4- Dar Cartas.\n"
                    + "5- Mostrar Monton.\n"
                    + "6- Mostrar Baraja.\n"
                    + "7- Terminar Juego");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    barajar();
                    break;
                case 2:
                    siguienteCarta();

                    break;
                case 3:
                    cartasDisponibles();
                    break;
                case 4:
                    darCartas();
                    break;
                case 5:
                    mostrarMonton();
                    break;
                case 6:
                    mostrarBaraja();
                    break;
                case 7:
                    System.out.println("Hasta luego!");
                    break;
                default:

                    System.out.println("error... no indicó una opción correcta!");
            }
        } while (op != 7);
    }

}
