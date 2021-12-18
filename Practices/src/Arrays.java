import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        String [] palabras = {"Perro", "Gato", "Tortuga", "Araña", "Vaca", "Chivo"};
        Random r = new Random();
        int n = r.nextInt(palabras.length);

        String palabraSecreta = palabras[n];

        System.out.println(palabraSecreta);

        int[] numeros = new int[3];
        numeros[0] = 7;
        numeros[1] = 34;
        numeros[2] = 15;

        for (int i = 0; i < 3; i ++){
            System.out.println(numeros[i]);
        }

        Scanner entrada = new Scanner(System.in);
        int nElements;

        nElements = Integer.parseInt(JOptionPane.showInputDialog("Coloque la cantidad de elementos: "));

        char[] letters = new char[nElements];

        System.out.println("Escriba los elementos del arreglo");

        for (int i = 0; i < nElements; i ++){
            System.out.println((i + 1) + ". Digite un caracter: ");
            letters[i] = entrada.next().charAt(0);
        }
        System.out.println("\nLos arreglos son");
        for (int i = 0; i < nElements; i ++) {
            System.out.println(letters[i] + "");
        }
        int xs = 0;
        while (xs <= 10){
            System.out.println("El valor de Xs es " + xs);
            xs = xs + 2;
        }
    }
}
