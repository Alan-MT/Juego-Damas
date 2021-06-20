package src.tablero;


public class Tablero {

    private int tamaño = 8;
    String[][] tabla = new String[8][8];
    Casilla c = new Casilla();
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String reset = "\u001B[0m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String negro = "\033[30m";

    public Tablero() {
        for (int x=0; x<tamaño; x++){
            for(int y=0; y<tamaño; y++){
                if(y <= 2){
                    Par(x, y,"X");
                } else if(y == 3) {
                    Par(x, y," ");
                } else if(y == 4){
                    Par(x, y, " ");
                } else if(y >= 5){
                    Par(x, y, "O");
                }
            }
        }
    }

    public void Par(int x, int y, String ficha){
        if((x+y)%2 == 0){
            tabla[x][y] = c.getCasillaGris(" ");
        }else{
            tabla[x][y] = c.getCasillaNegra(ficha); 
        }
    }
    public void dibujarTablero() {
        char letras[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        System.out.print("  ");
        for (int i = 0; i < tamaño; i++){
            System.out.print(ANSI_RED_BACKGROUND+" " + letras[i] + " "+reset);
        }
        System.out.println();
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (j == 0){
                    System.out.print(ANSI_RED_BACKGROUND+(i+1) + " "+reset);
                }
                System.out.print(tabla[j][i]);
            }
            System.out.println();
        }
    }

}