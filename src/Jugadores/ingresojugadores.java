package src.Jugadores;

import src.Inicio.IngresoDatos;

public class ingresojugadores {
    private Jugador[] jug = new Jugador[10];
    private int player1;
    private int player2 = 1;


    public ingresojugadores(){
        ingresojugador();
    }
    public void ingresojugador(){
        for (int i = 0; i < jug.length; i++) {
            String nombres = IngresoDatos.getTexto((i+1)+") Ingrese el nombre del jugador");
            jug[i] = new Jugador(nombres);
        }
    }
    public void mostrarJugadores(){
        System.out.println("\nLos jugadores son:");
        for (int i = 0; i < jug.length; i++) {
            System.out.println((i+1)+". "+jug[i].getNombre());
        }
    }
    public Jugador eligeJugadores(){
        player1 = IngresoDatos.getnumero("Elige al jugador "+player2+"")-1;
        if (player2 == 2) {
            player2 = 1;
        } else {
            player2++;
        }
        
    return jug[player1];
    }
    public Jugador[] getJug() {
        return jug;
    }
    public void setJug(Jugador[] jug) {
        this.jug = jug;
    }
    public int getPlayer1() {
        return player1;
    }
    public void setPlayer1(int player1) {
        this.player1 = player1;
    }
    public int getPlayer2() {
        return player2;
    }
    public void setPlayer2(int player2) {
        this.player2 = player2;
    }
    
    

}
