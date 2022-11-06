import java.util.Scanner;

public class Main {
    private static final String VOCALES = "aeiouáéíóú";
    private static final String CONSONANTES ="bcdfghijklmnñpqrstvwxyz";

    public  static  int contarVocales(String cadena){
        int contador = 0;
        String cadenaMin = cadena.toLowerCase();
        for (int i = 0; i < cadenaMin.length(); i++) {
            if (VOCALES.contains(cadenaMin.substring(i, i +1))){
                contador++;
            }
        }
        return contador;
    }
    public static int contarConsonantes(String cadena){
        int contador = 0;
        String cadenaMin = cadena.toLowerCase();
        for (int i = 0; i < cadenaMin.length(); i++) {
            if (CONSONANTES.contains(cadenaMin.substring(i, i +1))){
                contador++;
            }
        }
        return contador;
    }

    public static int contarTotalCaracteres(String cadena){
        return cadena.length();
    }

    public static String convertirAMayusculas(String cadena){
        return cadena.toUpperCase();
    }

    public static String convertirAMinusculas(String cadena){
        return cadena.toLowerCase();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena");
        String frase = sc.nextLine();

        System.out.println("La cadena introducida tiene " +contarVocales(frase)+ " vocales" );
        System.out.println("La cadena introducida tiene " +contarConsonantes(frase)+ " consonantes" );
        System.out.println("La cadena introducida totlmente en mayusculas es " +convertirAMayusculas(frase));
        System.out.println("La cadena introducida totlmente en minusculas es " +convertirAMinusculas(frase));
    }
}