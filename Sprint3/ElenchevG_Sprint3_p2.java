package Trabajo;

import java.util.*;

public class ElenchevG_Sprint3_p2 {

    public static void main(String[] args) {

    //Inicializacion de variables

        int puntos=0;
        int nregistro;
        int phermano;
        int pvivir_poblacion;
        int pptrabajar_poblacion;
        int pdiscapacidad;
        int pfamilia;
        int pfamiliar_escolarizado;

        Scanner entrada=new Scanner(System.in);
        System.out.println("Numero de registro del almuno");
        nregistro=entrada.nextInt();
        System.out.println("Responde las siguientes preguntas:");
        do {
            System.out.println("¿El alumno tiene un hermano en el centro? (0:No; 1:Si)");
            phermano=entrada.nextInt();
        } while (phermano!=0 && phermano!=1);
        do {
            System.out.println("¿El alumno vive en la misma poblacion del centro? (0:No; 1:Si)");
            pvivir_poblacion=entrada.nextInt();
        } while (pvivir_poblacion!=0 && pvivir_poblacion!=1);
        do {
            System.out.println("¿Los padres del alumno trabajan en la misma poblacion del centro? (0:No; 1:Si)");
            pptrabajar_poblacion=entrada.nextInt();
        } while (pptrabajar_poblacion!=0 && pptrabajar_poblacion!=1);
        do {
            System.out.println("¿El alumno tiene alguna discapacidad igual o superior al 33% o enfermedad crónica? (0:No; 1:Si)");
            pdiscapacidad=entrada.nextInt();
        } while (pdiscapacidad!=0 && pdiscapacidad!=1);
        
        do {
            System.out.println("¿El alumno forma parte de una familia numerosa o monoparental? (0:No; 1:Si)");
            pfamilia=entrada.nextInt();
        } while (pfamilia!=0 && pfamilia!=1);
        do {
            System.out.println("¿El padre, madre, tutor legal o hermano del alumno ha sido escolarizado? (0:No; 1:Si)");
            pfamiliar_escolarizado=entrada.nextInt(); 
        } while (pfamiliar_escolarizado!=0 && pfamiliar_escolarizado!=1);

        if (phermano==1) {
            puntos+=40;
        }
        if (pvivir_poblacion>=pptrabajar_poblacion) {
            puntos+=30;
        } else {
            if (pptrabajar_poblacion==1) {
                puntos+=20;
            }
        }
        if (pdiscapacidad==1) {
            puntos+=10;
        }
        if (pfamilia==1) {
            puntos+=15;
        }
        if (pfamiliar_escolarizado==1) {
            puntos+=5;
        }
        System.out.println("El alumno "+nregistro+" tiene "+puntos+" puntos");
    }
}
