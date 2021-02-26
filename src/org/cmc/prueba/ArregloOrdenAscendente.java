package org.cmc.prueba;

public class ArregloOrdenAscendente {

    public static void main(String[] args) {

        // Arreglos con valores a ordenar
        Integer[] numeros = {2, 4, 5, 1, 6, 3, 9, 7, 8, 0};

        // Se invoca método de ordenar números
        ordenarNumeros(numeros);

        // Se itera el arreglo para mostrar los valores ordenados
        for (Integer numero : numeros) {
            System.out.println("numero = " + numero);
        }
    }

    /**
     * Metodo para ordenar arreglos de forma ascendente
     *
     * @param arreglo
     */
    public static void ordenarNumeros(Object[] arreglo) {
        int total = arreglo.length;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }
    }
}
