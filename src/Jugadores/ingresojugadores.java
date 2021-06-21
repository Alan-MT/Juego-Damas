package src.Jugadores;

import src.Inicio.IngresoDatos;

public class ingresojugadores {
    private final int MAXIMO_JUGADORES = 10;
    private Jugador[] jug = new Jugador[MAXIMO_JUGADORES];
    private int ultimoJugador=0;


    public ingresojugadores(){
    }
    public void ingresarJugador() {

        if (ultimoJugador < MAXIMO_JUGADORES) {
            
            jug[ultimoJugador] = new Jugador(IngresoDatos.getTexto("\n  Escriba el nombre del jugador: "));
            ultimoJugador++;

        } else {
            System.out.println("\n    No se puede ingresar, ya ha alcanzado el numero maximo de jugadores.");
        }    

    }

    public void mostrarJugadores() {

        if (ultimoJugador == 0) {
            System.out.println("\n    No hay jugadores ingresados.");
        } else {
            System.out.println("\n   - Lista de Jugadores -");
            for (int i = 0; i < ultimoJugador; i++) {
                System.out.println("  "+(i+1)+". "+jug[i].getNombre());
            }
        }

    }

    public void mostrarTablaPosiciones () {

        if (ultimoJugador == 0) {
            System.out.println("\n    No hay jugadores ingresados.");
        } 
        else {
            ordenarTabla();
            System.out.println("\n   - Tabla de Posiciones -\n");
            for (int i = 0; i < ultimoJugador; i++) {
                System.out.println("  "+(i+1)+". "+jug[i].mostrarDatosJugador());
            }
        }
    }
    public Jugador seleccionarJugador() {

        mostrarJugadores();

        int num = IngresoDatos.getnumero("\n  Escriba el numero del jugador: ");

        return jug[num-1];
    }

    public void ordenarTabla() {

        for (int i = 0; i < ultimoJugador; i++) {
            for (int j = 0; j < ultimoJugador-1; j++) {

                if (jug[j].getPuntuacion() < jug[j+1].getPuntuacion()) {
                    Jugador aux = jug[j];
                    jug[j] = jug[j+1];
                    jug[j+1] = aux;
                }
            }
        }

    }
    public Jugador[] getJug() {
        return jug;
    }
    public void setJug(Jugador[] jug) {
        this.jug = jug;
    }
    public int getMAXIMO_JUGADORES() {
        return MAXIMO_JUGADORES;
    }
    public int getUltimoJugador() {
        return ultimoJugador;
    }
    public void setUltimoJugador(int ultimoJugador) {
        this.ultimoJugador = ultimoJugador;
    }
    
    

}
