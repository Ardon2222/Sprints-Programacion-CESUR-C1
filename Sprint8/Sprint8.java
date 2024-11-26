package Trabajo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sprint8 {

        // Inicializacion constantes
        static final String lentes1="Lentes Monofocales";
        static final String lentes2="Lentes Bifocales y Trifocales";
        static final String lentes3="Lentes Progresivas";
        static final String lentes4="Lentes Fotocromáticas";
        static final String lentes5="Aun no usa lentes";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Inicializacion variables
        int otro_cliente=0;
        int nclientes=0;

        do {
            // Inicializacion variables reinicializadas para cada cliente
            int i=0;
            int lentes=0;
            boolean lentes_bien=false;
            boolean ha_donado=false;

            System.out.println("-----------------------------");
            System.out.println("-----------------------------");
            System.out.println("Hola nuevo cliente");
            System.out.println("-----------------------------");
            boolean errorint=false;
            do {
                System.out.println("-----------------------------");
                System.out.println("¿Que tipo de lentes utilizas?");
                System.out.println("-----------------------------");
                System.out.println("1."+lentes1);
                System.out.println("2."+lentes2);
                System.out.println("3."+lentes3);
                System.out.println("4."+lentes4);
                System.out.println("5."+lentes5);
                System.out.println("-----------------------------");
                System.out.println("Introduce el numero de la opcion");
                System.out.println("-----------------------------");
                try {
                    lentes=entrada.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("ERROR: Esa no es una opcion valida, elije entre 1-5");
                    errorint=true;
                    entrada.next();
                }
                if (lentes>=1 && lentes<=5) {
                    lentes_bien=true;
                } else if (!errorint){
                    System.out.println("ERROR: Esa no es una opcion valida, elije entre 1-5");
                }
                i++;
            } while (i<3 && !lentes_bien);

            if (lentes_bien) {
                // Asignar nombre de lentes
                String lentes_elejidos = f_lentes_elejidos(lentes);

                // Donar
                ha_donado = donacion(entrada);

                System.out.println("-----------------------------");
                System.out.println("El cliente usa estas gafas:");
                System.out.println(lentes_elejidos);
                System.out.println("El cliente ha donado: "+ha_donado);
                System.out.println("-----------------------------");
                System.out.println("-----------------------------");
                
                boolean otro_cliente_bien=false;
                errorint=false;
                System.out.println("-----------------------------");
                System.out.println("¿Introducir datos de otro cliente?");
                System.out.println("-----------------------------");
                System.out.println("1.Si");
                System.out.println("2.No");
                do {
                    try {
                        otro_cliente=entrada.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Elije una opcion: 1.Si | 2.No");
                        errorint=true;
                        entrada.next();
                    }
                    if (otro_cliente==1 || otro_cliente==2) {
                        otro_cliente_bien=true;
                    } else if (!errorint){
                        System.out.println("Elije una opcion: 1.Si | 2.No");
                    }
                } while (!otro_cliente_bien);
                nclientes++;
            }

        } while (otro_cliente!=2);
        System.out.println("-----------------------------");
        System.out.println("Programa finalizado");
        System.out.println("Se han contado "+nclientes+" clientes");
        System.out.println("-----------------------------");
        
    }
    
    // Funcion para donar a los niños de africa
    public static boolean donacion(Scanner entrada) {
        int donar=0;
        boolean ha_donado=false;
        do {
            try {
                System.out.println("¿Quieres donar para los niños africanos?");
                System.out.println("-----------------------------");
                System.out.println("1.Si");
                System.out.println("2.No");
                System.out.println("-----------------------------");
                donar=entrada.nextInt();
                if (donar==1) {
                    ha_donado=true;
                    System.out.println("Gracias por donar");
                } else if (donar!=1 && donar!=2) {
                    System.out.println("Elije una opcion: 1.Si | 2.No");
                } else{
                    ha_donado=false;
                    System.out.println("¿Si no donas tal vez se mueran, estas seguro de que no quires donar?");
                    System.out.println("¿Quieres donar?");
                    System.out.println("-----------------------------");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    System.out.println("-----------------------------");
                    donar=entrada.nextInt();
                    if (donar==1) {
                        ha_donado=true;
                    } else if (donar!=1 && donar!=2) {
                        System.out.println("Elije una opcion: 1.Si | 2.No");
                    } else {
                        ha_donado=false;
                        System.out.println("¿De verdad no vas a donar, quieres matar a esos niños?");
                        System.out.println("¿Quieres donar?");
                        System.out.println("-----------------------------");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        System.out.println("-----------------------------");
                        donar=entrada.nextInt();
                        if (donar==1) {
                            ha_donado=true;
                            System.out.println("Gracias por donar");
                        } else if (donar!=1 && donar!=2) {
                            System.out.println("Elije una opcion: 1.Si | 2.No");
                        } else {
                            ha_donado=false;
                            System.out.println("Eres un monstruo malvado, por tu culpa los niños moriran, quedate con tu dinero");
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Elije una opcion: 1.Si | 2.No");
                entrada.next();
                donar=0;
            }
        } while (donar!=1 && donar!=2);
        return ha_donado;
    }

    // Minifuncion para asignar el valor de una variable
    public static String f_lentes_elejidos(int lentes) {
        switch (lentes) {
            case 1:
                return lentes1;
            case 2:
                return lentes2;
            case 3:
                return lentes3;
            case 4:
                return lentes4;
            case 5:
                return lentes5;
            default:
                return "Opción no válida";
        }
    }
}
