package Trabajo;

import java.util.*;

public class Caracol {
        public static void main(String[] args) {
        int column=10;
        int day=5; 
        int night=2;

        int tdias=0;
        int altura=0;

        do {
            tdias++;
            altura+=day;
            if (altura>=column) {
                break;
            } else {
                altura-=night;
            }
        } while (altura<column);

        System.out.println("El caracol ha tardado en subir "+tdias+" dias");
    }
}
