package Trabajo;

import java.util.*;

public class Sprint5_p3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la temperatura del niño");
        int temperatura = entrada.nextInt();
        int edad = 15;
        int peso = 23;
        int dosis_parecetamol=0;

        if (temperatura<38) {
            System.out.println("El niño esta bien");
        } else if (temperatura<=39) {
            System.out.println("Es recomendable darle un baño para bajar temperatura");
            if (edad<3) {
                System.out.println("Debes consultar al médico");
            } else if (edad<12) {
                dosis_parecetamol= (peso*15);
                System.out.println("Hay que darle una dosis de paracetamol de "+dosis_parecetamol+"mg cada 8h");
            } else {
                dosis_parecetamol= 500;
                System.out.println("Hay que darle una dosis de paracetamol de "+dosis_parecetamol+"mg cada 8h");
            }
        } else {
            System.out.println("Hay que llevarlo al hospital");
        }
    }

}