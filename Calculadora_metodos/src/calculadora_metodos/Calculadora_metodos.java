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
        double n1, n2;
        do {
            System.out.println("*****************");
            System.out.println("Calculadora");
            System.out.println("*****************");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Salir");

            System.out.print("Introduce la opcion deseada: ");
            opcion = tc.nextInt();

            if (opcion > 0 && opcion < 5) {
            }
            switch (opcion) {
                case 1:
                    System.out.println("La suma es " + suma());
                    ;
                    break;
                case 2:
                    System.out.println("La resta es " + resta());
                    ;
                    break;
                case 3:
                    System.out.println("La multiplicacion es " + multiplicacion());
                    ;
                    break;
                case 4:
                    System.out.println("La division es " + division());
                    ;
                    break;
                case 5:
                    System.out.println("Fin");
                    ;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    ;
                    break;
            }

        } while (opcion != 5);
    }

    public static double suma() {
        double n1, n2;
        System.out.print("Introduce el primer numero ");
        n1 = tc.nextDouble();
        System.out.print("Introduce el segundo numero ");
        n2 = tc.nextDouble();
        return (n1 + n2);
    }

    public static double resta() {
        double n1, n2;
        System.out.print("Introduce el primer numero ");
        n1 = tc.nextFloat();
        System.out.print("Introduce el segundo numero ");
        n2 = tc.nextFloat();
        return (n1 - n2);
    }

    public static double multiplicacion() {
        double n1, n2;
        System.out.print("Introduce el primer numero ");
        n1 = tc.nextFloat();
        System.out.print("Introduce el segundo numero ");
        n2 = tc.nextFloat();
        return (n1 * n2);
    }

    public static double division() {
        double n1, n2;
        System.out.print("Introduce el primer numero ");
        n1 = tc.nextFloat();
        System.out.print("Introduce el segundo numero ");
        n2 = tc.nextFloat();
        if (n2 == 0) {
            return -1;
        } else {
            return (n1 / n2);
        }
    }

}
