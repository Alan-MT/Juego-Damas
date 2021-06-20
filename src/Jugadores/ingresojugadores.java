package src.Jugadores;

import src.Inicio.IngresoDatos;

public class ingresojugadores {
    private Jugador[] jug = new Jugador[5];
    private int player1, player2;


    public ingresojugadores(){
        ingresojugador();
    }
    public void ingresojugador(){
        for (int i = 0; i < 5; i++) {
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
    public void eligeJugadores(){
        player1 = IngresoDatos.getnumero("Elige al jugador 1--")-1;
        player2 = IngresoDatos.getnumero("Elige al jugador 2--")-1;
        
        System.out.println("\n\n-"+jug[player1].getNombre()+"--Vrs--"+jug[player2].getNombre()+"-");
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
