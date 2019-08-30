package com.cedisropa.operacionesaritmeticas;

import java.util.Arrays;

/**
 * Clase para operaciones aritemeticas
 */
public class Operaciones {
    /**
     * Metodo para realizar la sumatoria de 2 numeros
     * @param a primer numero a sumar
     * @param b segundo numero a sumar
     * @return resultado de la sumatoria de los 2 numeros
     */
    public static int Sumar(int a, int b) {
        return a + b;
    }

    /**
     * Metodo para realizar la sumatoria de todos los numeros de un arreglo de enteros
     * @param valores arreglo de valores a sumar
     * @return resultado de la sumatoria de todos los numeros del arreglo
     */
    public static int Sumar(int []valores) {
        if (valores.length > 1) {
            return valores[0] + Sumar(Arrays.copyOfRange(valores, 1, valores.length - 1));
        } else {
            return valores[0];
        }
    }

    /**
     * Metodo para realizar la resta de 2 numeros
     * @param a numero original
     * @param b numero que se restara
     * @return resultado de la resta del numero a - numero b
     */
    public static int Restar(int a, int b) {
        return a - b;
    }

    public static int Restar(int []valores) {
        if (valores.length > 1) {
            return valores[0] - Restar(Arrays.copyOfRange(valores, 1, valores.length - 1));
        } else {
            return valores[0];
        }
    }

    public static float Dividir(int a, int b) {
        return a / b;
    }

    public static int Multiplicar(int a, int b) {
        return a * b;
    }

    public static int Multiplicar(int []valores) {
        if (valores.length > 1) {
            return valores[0] * Multiplicar(Arrays.copyOfRange(valores, 1, valores.length - 1));
        } else {
            return valores[0];
        }
    }
}
