package src.Jugadores;

public class Jugador {
    
    private String nombre;
    private int puntuacion, pGanadas, pPerdidas;
    public Jugador(String nombre) {
        this.nombre = nombre;
        puntuacion = 0;
        pGanadas = 0;
        pPerdidas = 0;

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
    

    
}
