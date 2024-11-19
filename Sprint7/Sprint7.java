import java.util.*;

public class Sprint7 {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        int n = 0;
        boolean ncorrecto = false;

        do {
            try {
                System.out.println("Di un numero entre el 1 y el 20 (incluidos)");
                n = entrada.nextInt();
                if (n >= 1 && n <= 20) {
                    ncorrecto = true;
                } else {
                    System.out.println("El valor ha de estar entre el 1 y el 20");
                    ncorrecto = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: La entrada no es un número entero válido.");
                ncorrecto = false;
                entrada.next();
            }
        } while (!ncorrecto);

        boolean menor100 = true;
        int multiplo = 0;
        int i = 0;
        System.out.println("-----------MULTIPLOS DE "+n+"-----------");
        do {
            multiplo = n*i;
            if (multiplo<=100) {
                System.out.println(multiplo);
            } else {
                menor100 = false;
            }
            i++;
        } while (menor100);

    }
}