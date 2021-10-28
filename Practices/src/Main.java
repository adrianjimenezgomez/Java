//importar la libreria de import java.util.Scanner para poder escribir datos desde consola...
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Bienvenido\n\na este programa");

        int age = 18;
        String name = "Adrian";
        String lastname = "Jimenez";

        System.out.println("Hola mi nombre es " + name + " " + lastname + " y tengo " + age + " años.");

        String Namedog = "Beto";
        int dog_age = 2;

        System.out.println("El nombre de mi perro es " + Namedog + " y tiene " + dog_age + " años");

        int totaL_age = age + dog_age;

        System.out.println(totaL_age);

        /*

        int edad = 40;
        boolean mayoredad = edad >=18;

        if(mayoredad) {
            System.out.println("Tú eres adulto");
        } else {
            System.out.println("Eres menor de edad");
        }

         */

        Scanner n1 = new Scanner(System.in);
        //Scanner n1 = new Scanner(System.in);
        String name1 = "";
        int number1 = 0, number2 = 0, number3 = 0;

        System.out.println("Cuál es tu nombre: ");
        name1 = n1.nextLine();

        System.out.println("Pon un número para tu suma: ");
        number1 = n1.nextInt();

        System.out.println("Pon un número para tu suma: ");
        number2 = n1.nextInt();

        System.out.println("Pon un número para tu suma: ");
        number3 = n1.nextInt();

        double result1 = number1 + number2 + number3;

        System.out.println("El resultado de tu suma es: " + result1);
    }
}
//minute 43:27 / 6:52:07
