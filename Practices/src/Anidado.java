import java.util.Scanner;

public class Anidado {
    public static void main(String[] args){

        Scanner operation = new Scanner(System.in);
        int foperation;
        System.out.println("1 = suma, 2 = resta, 3 = multi, 4 = división.");
        System.out.print("Escriba un número del 1 al 4: ");
        foperation = operation.nextInt();

        int n1 = 8;
        int n2 = 4;
        double result;

        if (foperation == 1) {
            result = n1 + n2;
            System.out.println("El resultado de la suma es: " + result);
        } else if (foperation == 2) {
            result = n1 - n2;
            System.out.println("El resultado de la resta es: " + result);
        } else if (foperation == 3) {
            result = n1 * n2;
            System.out.println("El resultado de la multiplicación es: " + result);
        } else if (foperation == 4) {
            result = n1 / n2;
            System.out.println("El resultado de la división es :" + result);
        } else {
            System.out.print("La opción no es válida");
        }

        /**
        Scanner seguir = new Scanner(System.in);
        String exit;
        System.out.print("¿Desea volver a repetir el proceso? s (Sí) o n (N0)");
        exit = seguir.nextLine();
        **/
        int i = 0;

        System.out.println("Ciclo con for: ");
        for(i = 1; i <= 10; i++) {
            if(i < 10) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
        }
        i = 1;
        System.out.println("");

        System.out.println("WHILE");
        while (i <= 10) {
            if(i < 10) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
            i++;
        }
        i = 1;
        System.out.println("");

        System.out.println("do While");
        do {
            if(i < 10) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
            i++;
        } while (i <= 10);
    } //fin del método main
} //fin de la clase Anidado
