/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;
/**
 * 
 * @author Franmi
 */
public class Revolver {

    /**
     * atributos de revolver todos privados posiciones es un final, siempre
     * constante
     */
    private int posRealBala;
    private int posActualDisparo;
    public final int POSICIONES = 6;

    /**
     * constructor que coloca la bala en una posicion random
     */
    public Revolver() {
        Random r = new Random();
        posRealBala = r.nextInt(POSICIONES);
        girarCilindro();
    }

    /**
     * metodo que te devuelve la posicion de la bala y el cañon que esta
     * apuntando ahoramismo
     */
    public void mirarPosiciones() {
        System.out.println("Pista: la bala está en la pos: " + posRealBala);
        System.out.println("Pista: la posicion actual a disparar es: " + posActualDisparo);
    }

    /**
     * metodo que dispara si la posicion actual es igual a posicion disparo se
     * cuenta como un disparo te retorna un boolean y avanza el cilindro
     */
    public boolean disparar() {
        boolean exito = false;

        if (posRealBala == posActualDisparo) {
            exito = true;
        }

        avanzarCilindro();
        return exito;
    }

    /**
     * metodo que te suma una posicion, mueve el tampor donde estan las balas
     */
    private void avanzarCilindro() {
        posActualDisparo++;
        //
        if (posActualDisparo == 6) {
            posActualDisparo = 0;
        }

    }

    /**
     * gira el cilindro y lo devuelve en una posicion random
     */
    public void girarCilindro() {
        Random r = new Random();
        posActualDisparo = r.nextInt(POSICIONES);
    }

    /**
     * gira el cilindro pero marcando el numero de posiciones que quieres que
     * gire
     */
    public void girarCilindro(int nPosiciones) {
        posActualDisparo = (posActualDisparo + nPosiciones) % POSICIONES;
    }
}
