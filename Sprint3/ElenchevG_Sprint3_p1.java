package Trabajo;

import java.util.*;

public class ElenchevG_Sprint3_p1 {
    public static void main(String[] args) {

        //Inicializacion de constantes

        final float largo=300.3f;

        //Inicializacion de variables

        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce el ancho de la piscina1:");
        float p1ancho=entrada.nextFloat();
        System.out.println("Introduce el profundo de la piscina1:");
        float p1profundo=entrada.nextFloat();

        System.out.println("Introduce el ancho de la piscina2:");
        float p2ancho=entrada.nextFloat();
        System.out.println("Introduce el profundo de la piscina2:");
        float p2profundo=entrada.nextFloat();

        int p1area;
        int p2area;
        int p1volagua;
        int p2volagua;

        float juntas_ancho;
        float juntas_largo;
        int juntas_volagua;

        float temp_profundo;
        

        System.out.println("--------------1.Area piscinas--------------");
        p1area=(int)(p1ancho*largo);
        p2area=(int)(p2ancho*largo);
        System.out.println("Piscina1: "+p1area+"; Piscina2: "+p2area);
        System.out.println("--------------2.Volumen de agua--------------");
        p1volagua=(int)(p1area*p1profundo);
        p2volagua=(int)(p2area*p2profundo);
        System.out.println("Piscina1: "+p1volagua+"; Piscina2: "+p2volagua);
        System.out.println("--------------3.Juntas Ancho y Largo--------------");
        juntas_ancho=p1ancho+p2ancho;
        juntas_largo=largo;
        //En el largo solo ponemos el uno de los 2, en este caso yo ponre el p1largo aunque se podria poner el p2 ancho tambien -
        //esto es devido a que las dos piscinas tienen el mismo largo
        System.out.println("Ancho: "+juntas_ancho+ "; Largo: "+juntas_largo);
        System.out.println("--------------4.Juntas Area--------------");
        System.out.println("Area Juntas: "+juntas_ancho*juntas_largo);
        System.out.println("--------------5.Juntas Volumen de agua--------------");
        // En un principio lo hice creando un "juntas_profundidad" y multiplicandolo por el "juntas_area" (Que tambien elimine) -
        // Sin embargo al hacer eso estaba diciendo que las dos piscinas juntas tenian la misma profundidad cuando no era asi -
        // Por lo que opte por sumar los volumenes de agua de cada una de las dos piscinas
        juntas_volagua=p1volagua+p2volagua;
        System.out.println("Volumen de agua Juntas: "+juntas_volagua);
        System.out.println("--------------6.Volumen agua Profundidad Intercambiada--------------");
        //Intercambio de profundidades
        temp_profundo=p1profundo;
        p1profundo=p2profundo;
        p2profundo=temp_profundo;
        //Calculo de profundidad
        p1volagua=(int)(p1area*p1profundo);
        p2volagua=(int)(p2area*p2profundo);
        System.out.println("Piscina1: "+p1volagua+"; Piscina2: "+p2volagua);
        System.out.println("--------------Fin--------------");
        System.out.println("------------------------------");


        





    }
}
