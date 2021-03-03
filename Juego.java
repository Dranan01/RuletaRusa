/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Franmi
 */


public class Juego {

    /**
     * 
     * @return 
     */
    
    public static String menu(){
        
        String menu = "Ahora usando el siguiente menu selecciona que ha de hacer el jugador \n" 
                                            + " 1-Mirar la posicion de la bala \n"
                                            + " 2-Dispararse \n"
                                            + " 3-Mover el cilindro una posicion \n"
                                            + " 4-Girar el cilindro al completo \n"
                                            + " 5-salir \n" ;
                                            return menu;
                                          
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JugadorRuso p1 = new JugadorRuso("Ivanovich");
        JugadorRuso p2 = new JugadorRuso("Putin");
        JugadorRuso p3 = new JugadorRuso("Vladimir");
        JugadorRuso p4 = new JugadorRuso("Pavel");
        JugadorRuso p5 = new JugadorRuso("Mihail");
        JugadorRuso p6 = new JugadorRuso("Vladislav");

        Revolver r1 = new Revolver();
        Revolver r2 = new Revolver();

        int player = 0;
        int accion = 0;
        int cilindro = 0;

        while (accion != 5) {
            try {
                System.out.println("Hay dos revolveres, ¿Cual coges y quien quieres que lo coja? seleccionalos con 1 y 2");
                int revolver = sc.nextInt();
                switch (revolver) {
                    //USO DEL REVOLVER UNO
                    case 1:
                        System.out.println("Has seleccionado el revolver " + revolver + " ahora, con un numero selecciona el jugador, hay hasta 6");
                        player = sc.nextInt();

                        switch (player) {
                            //JUGADOR 1

                            case 1:
                                //COMPROBACIÓN DE VIDA
                                if (p1.isVivo()) {
                                    System.out.println(menu());
                                    accion = sc.nextInt();
                                    //ACCIONES JUGADOR 1
                                    switch (accion) {
                                        case 1:
                                            r1.mirarPosiciones();
                                            break;
                                        case 2:
                                            System.out.println(p1.seDispara(r1));
                                            break;
                                        case 3:
                                            System.out.println("Escoge cuanto lo giras");
                                            cilindro = sc.nextInt();
                                            r1.girarCilindro(cilindro);
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 4:
                                            r1.girarCilindro();
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 5:
                                            System.out.println("Adios");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                    break;
                                } else {
                                    System.out.println("No puedes usar este jugador porque esta muerto, elige otro");
                                }

                            //JUGADOR 2
                            case 2:
                                if (p2.isVivo()) {
                                    System.out.println(menu());
                                    accion = sc.nextInt();
                                    //ACCIONES DEL JUGADOR 2
                                    switch (accion) {
                                        case 1:
                                            r1.mirarPosiciones();
                                            break;
                                        case 2:
                                            System.out.println(p2.seDispara(r1));

                                            break;
                                        case 3:
                                            System.out.println("Escoge cuanto lo giras");
                                            cilindro = sc.nextInt();
                                            r1.girarCilindro(cilindro);
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 4:
                                            r1.girarCilindro();
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 5:
                                            System.out.println("Adios");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }

                                } else {
                                    System.out.println("No puedes usar este jugador porque esta muerto, elige otro");
                                }
                                break;
                            //JUGADOR 3 
                            case 3:
                                if (p3.isVivo()) {
                                    System.out.println(menu());
                                    accion = sc.nextInt();
                                    //ACCIONES DEL JUGADOR 3
                                    switch (accion) {
                                        case 1:
                                            r1.mirarPosiciones();
                                            break;
                                        case 2:
                                            System.out.println(p3.seDispara(r1));

                                            break;
                                        case 3:
                                            System.out.println("Escoge cuanto lo giras");
                                            cilindro = sc.nextInt();
                                            r1.girarCilindro(cilindro);
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 4:
                                            r1.girarCilindro();
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 5:
                                            System.out.println("Adios");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } else {
                                    System.out.println("No puedes usar este jugador porque esta muerto, elige otro");
                                }
                                break;

                            //JUGADOR 4
                            case 4:
                                if (p4.isVivo()) {
                                    System.out.println(menu());
                                    accion = sc.nextInt();
                                    //ACCIONES DEL JUGADR 4
                                    switch (accion) {
                                        case 1:
                                            r1.mirarPosiciones();
                                            break;
                                        case 2:
                                            System.out.println(p4.seDispara(r1));

                                            break;
                                        case 3:
                                            System.out.println("Escoge cuanto lo giras");
                                            cilindro = sc.nextInt();
                                            r1.girarCilindro(cilindro);
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 4:
                                            r1.girarCilindro();
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 5:
                                            System.out.println("Adios");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } else {
                                    System.out.println("No puedes usar este jugador porque esta muerto, elige otro");
                                }
                                break;
                            //JUGADOR 5
                            case 5:
                                if (p5.isVivo()) {
                                    System.out.println(menu());
                                    accion = sc.nextInt();
                                    //ACCIONES DEL JUGADOR 5
                                    switch (accion) {
                                        case 1:
                                            r1.mirarPosiciones();
                                            break;
                                        case 2:
                                            System.out.println(p5.seDispara(r1));

                                            break;
                                        case 3:
                                            System.out.println("Escoge cuanto lo giras");
                                            cilindro = sc.nextInt();
                                            r2.girarCilindro(cilindro);
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 4:
                                            r1.girarCilindro();
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 5:
                                            System.out.println("Adios");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } else {

                                    System.out.println("No puedes usar este jugador porque esta muerto, elige otro");
                                }
                                break;
                            //JUGADOR 6
                            case 6:
                                if (p6.isVivo()) {
                                    System.out.println(menu());
                                    accion = sc.nextInt();
                                    //ACCIONES DEL JUGADOR 6
                                    switch (accion) {
                                        case 1:
                                            r2.mirarPosiciones();
                                            break;
                                        case 2:
                                            System.out.println(p6.seDispara(r2));

                                            break;
                                        case 3:
                                            System.out.println("Escoge cuanto lo giras");
                                            cilindro = sc.nextInt();
                                            r2.girarCilindro(cilindro);
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 4:
                                            r2.girarCilindro();
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 5:
                                            System.out.println("Adios");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }

                                } else {
                                    System.out.println("No puedes usar este jugador porque esta muerto, elige otro");

                                }
                                break;

                            default:
                                throw new AssertionError();
                        }
                        break;

                    // USO DEL REVOLVER 2
                    case 2:
                        System.out.println("Has seleccionado el revolver " + revolver + " ahora, con un numero selecciona el jugador, hay hasta 6");
                        player = sc.nextInt();

                        switch (player) {
                            //JUGADOR 1
                            case 1:
                                if (p1.isVivo()) {
                                    System.out.println(menu());
                                    accion = sc.nextInt();
                                    //ACCIONES JUGADOR 1
                                    switch (accion) {
                                        case 1:
                                            r2.mirarPosiciones();
                                            break;
                                        case 2:
                                            System.out.println(p1.seDispara(r2));

                                            break;
                                        case 3:
                                            System.out.println("Escoge cuanto lo giras");
                                            cilindro = sc.nextInt();
                                            r2.girarCilindro(cilindro);
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 4:
                                            r2.girarCilindro();
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 5:
                                            System.out.println("Adios");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } else {
                                    System.out.println("No puedes usar este jugador porque esta muerto, elige otro");

                                }
                                break;
                            //JUGADOR 2
                            case 2:
                                if (p2.isVivo()) {
                                    System.out.println(menu());
                                    accion = sc.nextInt();
                                    //AACIONES JUGADOR 2
                                    switch (accion) {
                                        case 1:
                                            r2.mirarPosiciones();
                                            break;
                                        case 2:
                                            System.out.println(p2.seDispara(r2));

                                            break;
                                        case 3:
                                            System.out.println("Escoge cuanto lo giras");
                                            cilindro = sc.nextInt();
                                            r2.girarCilindro(cilindro);
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 4:
                                            r2.girarCilindro();
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 5:
                                            System.out.println("Adios");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } else {
                                    System.out.println("No puedes usar este jugador porque esta muerto, elige otro");

                                }
                                break;
                            //JUGADOR 3 
                            case 3:
                                if (p3.isVivo()) {
                                    System.out.println(menu());
                                    accion = sc.nextInt();
                                    //ACCIONES JUGADOR 3
                                    switch (accion) {
                                        case 1:
                                            r2.mirarPosiciones();
                                            break;
                                        case 2:
                                            System.out.println(p3.seDispara(r2));

                                            break;
                                        case 3:
                                            System.out.println("Escoge cuanto lo giras");
                                            cilindro = sc.nextInt();
                                            r2.girarCilindro(cilindro);
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 4:
                                            r2.girarCilindro();
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 5:
                                            System.out.println("Adios");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } else {

                                    System.out.println("No puedes usar este jugador porque esta muerto, elige otro");
                                }
                                break;
                            //JUGADOR 4
                            case 4:
                                if (p4.isVivo()) {
                                    System.out.println(menu());
                                    accion = sc.nextInt();
                                    //ACCIONES JUGADOR 4
                                    switch (accion) {
                                        case 1:
                                            r2.mirarPosiciones();
                                            break;
                                        case 2:
                                            System.out.println(p4.seDispara(r2));

                                            break;
                                        case 3:
                                            System.out.println("Escoge cuanto lo giras");
                                            cilindro = sc.nextInt();
                                            r2.girarCilindro(cilindro);
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 4:
                                            r2.girarCilindro();
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 5:
                                            System.out.println("Adios");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } else {

                                    System.out.println("No puedes usar este jugador porque esta muerto, elige otro");
                                }
                                break;
                            //JUGADOR 5
                            case 5:
                                if (p5.isVivo()) {
                                    System.out.println(menu());
                                    accion = sc.nextInt();
                                    //ACCIONES JUGADOR 5
                                    switch (accion) {
                                        case 1:
                                            r2.mirarPosiciones();
                                            break;
                                        case 2:
                                            System.out.println(p5.seDispara(r2));

                                            break;
                                        case 3:
                                            System.out.println("Escoge cuanto lo giras");
                                            cilindro = sc.nextInt();
                                            r2.girarCilindro(cilindro);
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 4:
                                            r2.girarCilindro();
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 5:
                                            System.out.println("Adios");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } else {
                                    System.out.println("No puedes usar este jugador porque esta muerto, elige otro");

                                }
                                break;
                            //JUGADOR 6
                            case 6:
                                if (p6.isVivo()) {
                                    System.out.println(menu());
                                    accion = sc.nextInt();
                                    //ACCIONES JUGADOR 6
                                    switch (accion) {
                                        case 1:
                                            r2.mirarPosiciones();
                                            break;
                                        case 2:
                                            System.out.println(p6.seDispara(r2));

                                            break;
                                        case 3:
                                            System.out.println("Escoge cuanto lo giras");
                                            cilindro = sc.nextInt();
                                            r2.girarCilindro(cilindro);
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 4:
                                            r2.girarCilindro();
                                            System.out.println("Cilindro girado");
                                            break;
                                        case 5:
                                            System.out.println("Adios");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } else {

                                    System.out.println("No puedes usar este jugador porque esta muerto, elige otro");
                                }
                                break;

                            default:
                                throw new AssertionError();
                        }
                        break;

                    default:
                        throw new AssertionError();
                }
            } catch (AssertionError ae) {
                System.out.println(ae);
            }
        }

    }

}
