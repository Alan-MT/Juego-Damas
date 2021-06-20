package src.Juego;

import src.Inicio.IngresoDatos;
import src.Jugadores.*;
import src.tablero.*;

public class Game { 
    private Jugador jugador1, jugador2;
    private Tablero tablero ;
    private ingresojugadores ing =new ingresojugadores();
    Casilla tableroPartida[][];

    public Game() {
        inicializarPartida();
    }


    public void inicializarPartida() {
        ing.mostrarJugadores();
        boolean mismo = true;
        do{
           
            jugador1 = ing.eligeJugadores();
            jugador2 = ing.eligeJugadores();
        if (jugador1.equals(jugador2)) {
            System.out.println("\n  Error. El jugador 1 y el jugador 2 son el mismo.");
        } else{ mismo = false;}

    }while (mismo == true);
    System.out.println("\n\n-"+jugador1.getNombre()+"--Vrs--"+jugador2.getNombre()+"-");

        crearPartida(jugador1, jugador2);
    


    }

    public void crearPartida(Jugador jugador1, Jugador jugador2) {

        tablero = new Tablero();
        System.out.println();
        tablero.inicializarTablero();
        tablero.mostrarTablero();
        System.out.println();


        tableroPartida = tablero.getCasillas();

        manejarTurnos(jugador1, jugador2);

       /*  realizarMovimiento(tableroPartida[5][1], tableroPartida[4][2]);
        tablero.mostrarTablero();

        realizarMovimiento(tableroPartida[2][2], tableroPartida[3][3]);
        tablero.mostrarTablero(); */
    }

    public void turno(Jugador jugador) {

        // primero elige la casilla inicial y la final

        int colIn = 0, filaIn = 0, colFn = 0, filaFn=0;

        System.out.println("\n  Turno de "+jugador.getNombre()+":");
        String ficha = IngresoDatos.getTexto("  Elige la ficha a mover (a1): ");
        colIn = tablero.buscarIndiceLetras(ficha.charAt(0));
        filaIn = Character.getNumericValue(ficha.charAt(1))-1;
        ficha = IngresoDatos.getTexto("  Elige la casilla a la que moveras: ");
        colFn = tablero.buscarIndiceLetras(ficha.charAt(0));
        filaFn = Character.getNumericValue(ficha.charAt(1))-1;


        realizarMovimiento(tableroPartida[filaIn][colIn], tableroPartida[filaFn][colFn]);
        tablero.mostrarTablero();

        // revisar si la casilla inicial tiene letra

        // revisar si es x ^ o

        // revisar si la casilla final está vacia

        // comprobar si se puede hacer el movimiento


    }


    public void manejarTurnos(Jugador jug1, Jugador jug2) {
        //hacer condicion
        boolean ganador = false;
        do {
            turno(jug1);
            turno(jug2);
        } while (ganador==false);
    }

    public void realizarMovimiento(Casilla actual, Casilla finall) {

        finall.setCaracter(actual.getCaracter());
        actual.setCaracter(' ');
        
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
            System.out.println(" " + J1 + "              " + J2);
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



}
