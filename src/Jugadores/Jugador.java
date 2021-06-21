package src.Jugadores;

public class Jugador {
    
    private String nombre;
    private int puntuacion, pGanadas, pPerdidas, fichasTablero;
    private char simbolo;
    
    public Jugador(String nombre) {
        this.nombre = nombre;

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    public int getpGanadas() {
        return pGanadas;
    }
    public void setpGanadas(int pGanadas) {
        this.pGanadas = pGanadas;
    }
    public int getpPerdidas() {
        return pPerdidas;
    }
    public void setpPerdidas(int pPerdidas) {
        this.pPerdidas = pPerdidas;
    }
    public int getFichasTablero() {
        return fichasTablero;
    }
    public void setFichasTablero(int fichaTablero) {
        this.fichasTablero = fichaTablero;
    }
    public char getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }
    public String mostrarDatosJugador() {
        return " Nombre: " + nombre + ", Partidas ganadas: " + pGanadas + ", Partidas perdidas: " + pPerdidas + ", Puntuacion: " + puntuacion;
    }

    
}
