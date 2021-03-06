package src.tablero;

import src.Jugadores.*;
public class Tablero {

    private String fRojo = "\033[41m", reset = "\u001B[0m";
    private Casilla casillas[][] = new Casilla[8][8];
    private char[] letras = {'a','b','c','d','e','f','g','h'};

    public Tablero() {

    }

    public void inicializarTablero() {

        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas.length; j++) {

                if ((i+j)%2==0) {
                    casillas[i][j] = new Casilla(true, ' ');
                } 
                else {
                    casillas[i][j] = new Casilla(false, ' ');
                }

                if (i<3 && casillas[i][j].isOscuro()) {
                    casillas[i][j].setCaracter('X');
                } 

                if (i>4 && casillas[i][j].isOscuro()) {
                    casillas[i][j].setCaracter('O');
                }
                
            }
        }
    } 

    public void mostrarTablero() {

        System.out.println();

        imprimirFilaLetras();

        for (int i = 0; i < casillas.length; i++) {
            System.out.print(fRojo+"     " + (i+1)+" "+reset);
            for (int j = 0; j < casillas.length; j++) {
                System.out.print(casillas[i][j].getCasilla());
            }
            System.out.print(" " + (i+1));
            System.out.println();
        }

        imprimirFilaLetras();
      
    }

    private void imprimirFilaLetras() {

        System.out.print("       ");
        for (int i = 0; i < letras.length; i++) {
            System.out.print(fRojo+" "+letras[i]+" "+reset);
        }
        System.out.println();

    }

    public int buscarIndiceLetras(char letra) {
        int indice = 9;
        for (int i = 0; i < letras.length; i++) {
            if (letra == letras[i]) {
                indice = i;
                break;
            }
        }
        return indice;
    }
    public void contadorFichas(Jugador jugador1, Jugador jugador2) {
        jugador1.setFichasTablero(0);
        jugador2.setFichasTablero(0);
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas.length; j++) {

                if (casillas[i][j].getCaracter()==jugador1.getSimbolo()) {
                    jugador1.setFichasTablero(jugador1.getFichasTablero()+1);
                } 
                
                if (casillas[i][j].getCaracter()==jugador2.getSimbolo()) {
                    jugador2.setFichasTablero(jugador2.getFichasTablero()+1);
                }
                
            }
        }
    }

    public Casilla[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }

    
    

}