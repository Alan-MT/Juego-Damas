package src.tablero;

public class Casilla{

    public static final String fGris = "\u001b[47;1m";
    public static final String fRojo = "\033[41m";
    public static final String negro = "\033[30m";
    public static final String reset = "\u001B[0m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    private String caracter;
    private String casillaRoja = ANSI_BLACK_BACKGROUND+" "+caracter+" "+reset;
    private String casillaGris = ANSI_WHITE_BACKGROUND+" "+caracter+" "+reset;

    public String getCasillaNegra(String caracter) { 
        if (caracter.equals("O")) {
            return ANSI_BLACK_BACKGROUND+negro+" "+caracter+" "+reset;
        }
        return ANSI_BLACK_BACKGROUND+" "+caracter+" "+reset;
    }

    public String getCasillaGris(String caracter) {
        return ANSI_WHITE_BACKGROUND+" "+caracter+" "+reset;
    }

    public String getCaracter() {
        return caracter;
    }


    
}