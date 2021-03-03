/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * 
 * @author Franmi
 */
//atributos de los jugadores rusos todos privados
public class JugadorRuso {

    private int id;
    private String nombre;
    private boolean vivo;

    /**
     * contructor con id tipo entero
     */
    public JugadorRuso(int id) {
        this.id = id;
        vivo = true;
    }

    /**
     * constructor tipo String con nombre
     */
    public JugadorRuso(String nombre) {
        this.nombre = nombre;
        vivo = true;
    }

    /**
     * contructor con String nombre y entero id
     */
    public JugadorRuso(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        vivo = true;
    }

    /**
     * metodo que dispara el revolver te muestra el dato del jugador
     */
    public boolean seDispara(Revolver r) {
        System.out.println("El jugador ruso con id=" + id + "/nombre=" + nombre + " se apunta con el revolver");
        /**
         * si r da la accion de dispara marca una bala disparada y retorna el
         * boolean como muerto si no retorna que esta vivo y ha tenido suerte
         */
        if (r.disparar()) {
            System.out.println("<Bala disparada>");
            vivo = false;
        } else {
            System.out.println("Esta ronda he tenido suerte");
        }
        return vivo;
    }

    //metodo para ver si los jugadores estan vivos o muertos 
    public boolean isVivo() {
        return vivo;
    }
}
