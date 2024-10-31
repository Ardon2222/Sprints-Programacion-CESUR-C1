package Trabajo;

class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3}; 
        int suma = 0;
        boolean esUnico;

        for (int i = 0; i < arr.length; i++) {
            esUnico = true;

            // Comprobar si el elemento actual se repite en el resto del array
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    esUnico = false; // Encontramos una repetición
                    break; // No es único, salimos del bucle
                }
            }
            // Si es único, lo sumamos
            if (esUnico) {
                suma += arr[i];
            }
        }

        System.out.println(suma);
    }
}