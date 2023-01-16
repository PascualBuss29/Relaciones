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
public class Cartas {
    private Integer num;
    private NewEnumPalos palo;

    public Cartas() {
    }

    public Cartas(Integer num, NewEnumPalos palo) {
        this.num = num;
        this.palo = palo;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public NewEnumPalos getPalo() {
        return palo;
    }

    public void setPalo(NewEnumPalos palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Cartas{" + "num=" + num + ", palo=" + palo + '}';
    }
    
    
    
}
