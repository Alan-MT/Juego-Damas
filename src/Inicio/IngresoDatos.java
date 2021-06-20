package src.Inicio;

import java.util.Scanner;

public class IngresoDatos {
    
    static Scanner scanner = new Scanner(System.in);

    private static void imprimirMensaje(String mensaje){
        System.out.print("\n"+mensaje+" ");
    }
    
    public static String getTexto(String mensaje){
        imprimirMensaje(mensaje);
        String res = scanner.nextLine();
        return res;
    }
    
    public static int getnumero(String mensaje){
        imprimirMensaje(mensaje);
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }


}
