package src.Juego;

import src.Jugadores.*;
import src.tablero.*;

public class Game {
    private ingresojugadores jug; 

    public Game() {
        new ingresojugadores();

            jug.eligeJugadores();
            PPT();
            Tablero tab = new Tablero();
            tab.dibujarTablero();


    }

    // piedra papel o tijera
    public void PPT() {
        String Ganador;
        System.out.println("\n\nJuguemos Piedra-Papel o Tijera para decir que jugador va a empezar");
        do {
            String J1 = random();
            String J2 = random();
            Ganador = PPT(J1, J2);
            System.out.println("Jugador 1          Jugador 2");
            System.out.println(" "+J1+"              "+J2);
            System.out.println("\n     " + Ganador);
        } while (Ganador.equals("empate"));
    }

    public String PPT(String Jugador1, String Jugador2) {

        if (Jugador1.equals("piedra") && Jugador2.equals("tijera")) {
            return "gano jugador1";
        } else if (Jugador2.equals("piedra") && Jugador1.equals("tijera")) {
            return "gano jugador2";
        } else if (Jugador2.equals("papel") && Jugador1.equals("piedra")) {
            return "gano jugador2";
        } else if (Jugador1.equals("papel") && Jugador2.equals("piedra")) {
            return "gano jugador1";
        } else if (Jugador1.equals("tijera") && Jugador2.equals("papel")) {
            return "gano jugador1";
        } else if (Jugador2.equals("tijera") && Jugador1.equals("papel")) {
            return "gano jugador2";
        }
        return "empate";
    }

    public String random() {
        String resu;
        int random = (int) (Math.random() * (3 - 1) + 1);
        if (random == 1) {
            resu = "piedra";
        } else if (random == 2) {
            resu = "papel";
        } else {
            resu = "tijera";
        }
        return resu;
    }
    public void turno(Jugador jugador){
        
        System.out.println("Es tu turno "+jugador.getNombre());
        System.out.println("\n Elige la ficha a mover(a1 o 1a)");

    }
    //
    public void manejarTurno(Jugador jug1, Jugador jug2){
 
            turno(jug1);
            turno(jug2);


    }



}
