package Trabajo;

public class Sprint2 {
    public static void main(String[] args) {

        int p1largo=300;
        int p1ancho=150;
        int p1profundo=20;

        int p2largo=300;
        int p2ancho=80;
        int p2profundo=35;

        int p1area;
        int p2area;
        int p1volagua;
        int p2volagua;

        int juntas_ancho;
        int juntas_largo;
        int juntas_volagua;

        int temp_profundo;

        System.out.println("--------------1.Area piscinas--------------");
        p1area=p1ancho*p1largo;
        p2area=p2ancho*p2largo;
        System.out.println("Piscina1: "+p1area+"; Piscina2: "+p2area);
        System.out.println("--------------2.Volumen de agua--------------");
        p1volagua=p1area*p1profundo;
        p2volagua=p2area*p2profundo;
        System.out.println("Piscina1: "+p1volagua+"; Piscina2: "+p2volagua);
        System.out.println("--------------3.Juntas Ancho y Largo--------------");
        juntas_ancho=p1ancho+p2ancho;
        juntas_largo=p1largo;
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
        p1volagua=p1area*p1profundo;
        p2volagua=p2area*p2profundo;
        System.out.println("Piscina1: "+p1volagua+"; Piscina2: "+p2volagua);
        System.out.println("--------------Fin--------------");
        System.out.println("------------------------------");


        





    }
}
