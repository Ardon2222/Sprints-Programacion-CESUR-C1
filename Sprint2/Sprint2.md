
        //Inicializacion de variables

        var{

        p1largo=300;
        p1ancho=150;
        p1profundo=20;

        p2largo=300;
        p2ancho=80;
        p2profundo=35;

        p1area;
        p2area;
        p1volagua;
        p2volagua;

        juntas_ancho;
        juntas_largo;
        juntas_volagua;

        temp_profundo;
        
        }fvar

        MostrarPorPantalla("--------------1.Area piscinas--------------");
        p1area=p1ancho*p1largo;
        p2area=p2ancho*p2largo;
        MostrarPorPantalla("Piscina1: "+p1area+"; Piscina2: "+p2area);
        MostrarPorPantalla("--------------2.Volumen de agua--------------");
        p1volagua=p1area*p1profundo;
        p2volagua=p2area*p2profundo;
        MostrarPorPantalla("Piscina1: "+p1volagua+"; Piscina2: "+p2volagua);
        MostrarPorPantalla("--------------3.Juntas Ancho y Largo--------------");
        juntas_ancho=p1ancho+p2ancho;
        juntas_largo=p1largo;
        //En el largo solo ponemos el uno de los 2, en este caso yo ponre el p1largo aunque se podria poner el p2 ancho tambien -
        //esto es devido a que las dos piscinas tienen el mismo largo
        MostrarPorPantalla("Ancho: "+juntas_ancho+ "; Largo: "+juntas_largo);
        MostrarPorPantalla("--------------4.Juntas Area--------------");
        MostrarPorPantalla("Area Juntas: "+juntas_ancho*juntas_largo);
        MostrarPorPantalla("--------------5.Juntas Volumen de agua--------------");
        // En un principio lo hice creando un "juntas_profundidad" y multiplicandolo por el "juntas_area" (Que tambien elimine) -
        // Sin embargo al hacer eso estaba diciendo que las dos piscinas juntas tenian la misma profundidad cuando no era asi -
        // Por lo que opte por sumar los volumenes de agua de cada una de las dos piscinas
        juntas_volagua=p1volagua+p2volagua;
        MostrarPorPantalla("Volumen de agua Juntas: "+juntas_volagua);
        MostrarPorPantalla("--------------6.Volumen agua Profundidad Intercambiada--------------");
        //Intercambio de profundidades
        temp_profundo=p1profundo;
        p1profundo=p2profundo;
        p2profundo=temp_profundo;
        //Calculo de profundidad
        p1volagua=p1area*p1profundo;
        p2volagua=p2area*p2profundo;
        MostrarPorPantalla("Piscina1: "+p1volagua+"; Piscina2: "+p2volagua);
        MostrarPorPantalla("--------------Fin--------------");
        MostrarPorPantalla("------------------------------");