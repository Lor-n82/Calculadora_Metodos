/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_metodos;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Calculadora_metodos {

    public static Scanner tc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion;
        float n1 = 0, n2 = 0;
        do {
            System.out.println("*****************");
            System.out.println("Calculadora");
            System.out.println("*****************");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Salir");

            System.out.println("Introduce la opcion deseada ");
            opcion = tc.nextInt();

            if (opcion > 0 && opcion < 5) {
            }
            switch (opcion) {
                case 1:
                    suma(n1, n2);
                    System.out.println("La suma es " + n1 + n2);
                    ;
                    break;
            }

        } while (opcion != 5);
    }

    public static float suma(float n1, float n2) {

        System.out.println("Introduce el primer numero ");
        n1 = tc.nextFloat();
        System.out.println("Introduce el primer numero ");
        n2 = tc.nextFloat();
        return (n1 + n2);
    }

    public static float resta(float n1, float n2) {

        System.out.println("Introduce el primer numero ");
        n1 = tc.nextFloat();
        System.out.println("Introduce el primer numero ");
        n2 = tc.nextFloat();
        return (n1 - n2);
    }

    public static float multiplicacion(float n1, float n2) {

        System.out.println("Introduce el primer numero ");
        n1 = tc.nextFloat();
        System.out.println("Introduce el primer numero ");
        n2 = tc.nextFloat();
        return (n1 * n2);
    }

    public static float division(float n1, float n2) {

        System.out.println("Introduce el primer numero ");
        n1 = tc.nextFloat();
        System.out.println("Introduce el primer numero ");
        n2 = tc.nextFloat();
        return (n1 / n2);
    }
}
