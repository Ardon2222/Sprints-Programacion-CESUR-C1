package Trabajo;

import java.util.*;

public class Sprint5_p2 {
    public static void main(String[] args) {
        Random rand = new Random();

        float nota_prueba=rand.nextFloat(10+1);
        float nota_practicas=rand.nextFloat(10+1);
        float nentregas=rand.nextFloat(100+1);
        float nota_entregas=0;
        boolean ECS=true;

        if (nota_prueba<7) {
            System.out.println("Estas suspedido");
        } else {
            if (nentregas>70) {
                System.out.println("Estas suspedido por no seguir la evalucacion continua");
                ECS=false;
            } else if (nentregas==100) {
                System.out.println("Estas suspedido por no seguir la evalucacion continua");
                nota_entregas=10;   
            } else if (nentregas>=90) {
                System.out.println("Estas suspedido por no seguir la evalucacion continua");
                nota_entregas=8;   
            } else if (nentregas>=80) {
                System.out.println("Estas suspedido por no seguir la evalucacion continua");
                nota_entregas=6;   
            } else if (nentregas>=70) {
                System.out.println("Estas suspedido por no seguir la evalucacion continua");
                nota_entregas=4;   
            }
        }

        float nota_final = (((nota_prueba/100)*20)+((nota_entregas/100)*10));
        if (nota_final<5) {
            nota_final = (((nota_prueba/100)*20)+((nota_entregas/100)*10)+((nota_practicas/100)*70));
        }

        System.out.println("Tu nota final es: "+nota_final);

        if (ECS=false) {
            System.out.println("Es necesario seguir evaluación continua");
        } else {
            System.out.println("Recomendacion: Realizar los ejercicios preparatorios para la PAF2");
        }

        
    }

}