package Trabajo;

import java.util.*;

public class Sprint5_p1 {
    public static void main(String[] args) {

        int edad=0;
        int ciclo=0;
        int curso=0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la dedad del sujeto");
        edad=entrada.nextInt();

        if (edad<=0) {
            System.out.println("Recomendacion: Primero que nazca porfavor");
        } else if (edad<6) {
            ciclo=0;
        } else if (edad<7) {
            ciclo=1;
            curso=1;
        } else if (edad<8) {
            ciclo=1;
            curso=2;
        } else if (edad<9) {
            ciclo=2;
            curso=3;
        } else if (edad<10) {
            ciclo=3;
            curso=4;
        } else if (edad<11) {
            ciclo=3;
            curso=5;
        } else if (edad<12) {
            ciclo=3;
            curso=6;
        } else {
            System.out.println("El sujeto es demasiado grande");
        }

        if (ciclo==0) {
            System.out.println("Es de educacion infantil");
        } else if (ciclo==1) {
            System.out.println("Es de educacion primaria | Ciclo inicial");
        } else if (ciclo==2) {
            System.out.println("Es de educacion primaria | Ciclo medio");
        } else if (ciclo==3) {
            System.out.println("Es de educacion primaria | Ciclo superior");
        }

        System.out.println("Esta en el "+curso+"º curso");
        
    }

}