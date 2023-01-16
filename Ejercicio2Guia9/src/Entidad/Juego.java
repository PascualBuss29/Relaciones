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
public class Juego {

    private ArrayList<Jugador> jugador1;
    private RevolverDeAgua revolver1;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugador1, RevolverDeAgua revolver1) {
        this.jugador1 = jugador1;
        this.revolver1 = revolver1;
    }

    public ArrayList<Jugador> getJugador1() {
        return jugador1;
    }

    public void setJugador1(ArrayList<Jugador> jugador1) {
        this.jugador1 = jugador1;
    }

    public RevolverDeAgua getRevolver1() {
        return revolver1;
    }

    public void setRevolver1(RevolverDeAgua revolver1) {
        this.revolver1 = revolver1;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugador1=" + jugador1 + ", revolver1=" + revolver1 + '}';
    }
}
