import java.util.*;

public class Sprint6 {

    public static void main(String[] args) {
        // Inicializacion de constantes
        final int min_id = 111;
        final int max_id = 999;
        final int min_edad = 14;
        final int max_edad = 120;
        final int min_tipo_venta = 0;
        final int max_tipo_venta = 3;
        final int min_importe_compra = 0;
        final int max_importe_compra = 1000;
        final int min_telefono = 111111111;
        final int max_telefono = 999999999;

        final String ntipos0 = "Libre";
        final String ntipos1 = "Pensionista";
        final String ntipos2 = "Carnet joven";
        final String ntipos3 = "Socio";

        // Inicializacion de variables
        int id=0, edad=0, tipo_venta=0, importe_compra=0, telefono=0;
        String text_tventa="Nada";
        boolean error = false;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca su ID");
        id = entrada.nextInt();
        if (id <min_id || id >max_id) {
            System.out.println("Esa no es una ID valida");
            error=true;
        }
        
        if (!error) {
            System.out.println("Introduzca su Edad");
            edad = entrada.nextInt();
            if (edad <min_edad || edad >max_edad) {
                System.out.println("Esa no es una edad valida");
                error=true;
            }
        }

        if (!error) {
            System.out.println("Introduzca su Tipo de Compra");
            System.out.println("----------");
            System.out.println("0."+ntipos0);
            System.out.println("1."+ntipos1);
            System.out.println("2."+ntipos2);
            System.out.println("3."+ntipos3);
            tipo_venta = entrada.nextInt();
            if (tipo_venta <min_tipo_venta || tipo_venta >max_tipo_venta) {
                System.out.println("Ese no es un tipo valido");
                error=true;
            }
        }

        if (!error) {
            System.out.println("Introduzca el Importe de la compra");
            importe_compra = entrada.nextInt();
            if (importe_compra <min_importe_compra || importe_compra >max_importe_compra) {
                System.out.println("Ese no es un importe valido");
                error=true;
            }
        }

        if (!error) {
            System.out.println("Introduzca su Telefono");
            telefono = entrada.nextInt();
            if (telefono <min_telefono || telefono >max_telefono) {
                System.out.println("Ese no es un telefono valido");
                error=true;
            }
        }

        if (!error) {
            System.out.println("----Resumen datos----");

            switch (tipo_venta) {
                case 0:
                    text_tventa=ntipos0;
                    break;
                case 1:
                    text_tventa=ntipos1;
                    break;
                case 2:
                    text_tventa=ntipos2;
                    break;
                case 3:
                    text_tventa=ntipos3;
                    break;
            }

            System.out.println("ID: "+id+" | Tipo de Venta: "+text_tventa+" | Edad: "+edad+"| Importe de la compra: "+importe_compra+" | Telefono: "+telefono);

        }


    }
}
