import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner odd = new Scanner(System.in);
        int n1;

        System.out.print("Escriba un número entero: ");
        n1 = odd.nextInt();

        if(n1 % 2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        System.out.println("El número ingresado fue: " + n1);

        System.out.println("Calcule el precio de su artículo sin IVA...");

        Scanner iva = new Scanner(System.in);
        double precio1;
        System.out.print("Escriba el precio de su artículo");
        precio1 = iva.nextDouble();



    }
}
