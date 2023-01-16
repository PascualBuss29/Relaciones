/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class RevolverDeAguaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    RevolverDeAgua r1 = new RevolverDeAgua();
    Juego j1 = new Juego();
    Jugador j = new Jugador();
    ArrayList<Jugador> jugadores = new ArrayList();

    public void llenarRevolver() {
        r1.setPosicionActual((int)( Math.random() * 6)+1);
        r1.setPosicionAgua((int) (Math.random() * 6 )+ 1);
    }

    public void crearJugador() {

        System.out.println("Ingrese el numero de Jugadores(Maximo 6)");
        int numJugador = leer.nextInt();
        if (numJugador < 1 || numJugador > 6) {
            numJugador = 6;

        }
        for (int i = 1; i < numJugador + 1; i++) {
            Jugador p = new Jugador();

            p.setId(i);
            p.setMojado(false);
            jugadores.add(p);
        }
    }

    public boolean mojar() {
        boolean aux = false;
        if (r1.getPosicionActual() == r1.getPosicionAgua()) {
            aux = true;
        }
        return aux;
    }

    public void siguienteChorro() {

        if (r1.getPosicionActual() == 6) {
            r1.setPosicionActual(1);
        } else {
            r1.setPosicionActual(r1.getPosicionActual() + 1);
        }
        
    }


    public boolean disparo() {

        if (mojar()) {
            return true;
        } else {
            return false;
        }

    }

    public void llenarJuego(ArrayList<Jugador> jugador1, RevolverDeAgua revolver1) {
        j1.setJugador1(jugador1);
        j1.setRevolver1(revolver1);

    }

    public void ronda() {

        crearJugador();
        llenarRevolver();
        llenarJuego(jugadores, r1);
        System.out.println("Posicion acttual:"+r1.getPosicionActual());
        System.out.println("Posicion del agua: "+r1.getPosicionAgua());
        int cont = 0;
        do {
            System.out.println(cont+1);
            j = j1.getJugador1().get(cont);
            if(disparo()){
                break;
            }
            if (cont == j1.getJugador1().size() - 1) {
                cont = 0;
                siguienteChorro();
                
            } else {
                siguienteChorro();
                cont++;
            }

        } while (mojar() == false);
        System.out.println("El jugador   " + jugadores.get(cont).getId()+ " se mojo");

    }
//    public void ronda() {
//        ServicioJugador Sj = new ServicioJugador();
//        ServicioRevolverAgua pist = new ServicioRevolverAgua();
//       
//        boolean flag = false;
//        do{
//        for (Jugador participante : nuevoJuego.getParticipantes()) {
//           Sj.disparo1(participante, nuevoJuego.getPistola());
//           if(participante.getMojado()==true){
//               System.out.println("Se la pego");
//               flag=true;
//               break;
//           }else{
//               
//               pist.siguienteChorro(nuevoJuego.getPistola());
//               System.out.println("siguiente chorro"+ nuevoJuego.getPistola());
//           }
//        }
//        }while(flag==false);
//        System.out.println(nuevoJuego.getParticipantes());
//        
//    }

}

//  public void ronda() {
//        llenarRevolver();
//        llenarJuego();
//        for (Jugador aux : nuevoJuego.getJugadores()) {
//            System.out.println(aux);
//            disparo();
//            if (disparo()) {
//                System.out.println("You are dead " + aux.getNombre());
//                break;
//            } else {
//                siguienteChorro();
//                toStringRevolver();
//            }
//
//        }

