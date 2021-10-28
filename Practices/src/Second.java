import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.out.println("*************");
        System.out.println("Bienvenido...");
        System.out.println("*************");

        Scanner entry = new Scanner(System.in);
         int n1;
         int n2;
         int n3;

         System.out.println("Tecleé el primer número: ");
         n1 = entry.nextInt();
         System.out.println("Tecleé el segundo número: ");
         n2 = entry.nextInt();
         System.out.println("Tecleé el tercer número: ");
         n3 = entry.nextInt();

         int mayor = n1;

         if (n2 > mayor) {
             mayor = n2;
         }
     }
}
