import java.util.Scanner;

/*Programa que lee 5 digitos y calcula la media de los numeros positivos,
negativos, y también cuenta la cantidad de ceros, hecho con arreglos*/
public class Promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] numbers = new float[5];
        float sumaPositivos = 0, sumaNegativos = 0, mediaPositivos, mediaNegativos;
        int conteoPositivos = 0, conteoNegativos = 0, conteoCeros = 0;

        System.out.println("Guardando datos en el arreglo");
        for (int i = 0; i < 5; i++){
            System.out.println((i + 1) + "Ingrese los resultados: ");
            numbers[i] = entrada.nextFloat();

            if (numbers[i] == 0){
                conteoCeros++;
            }
            else if (numbers[i] > 0){
                sumaPositivos += numbers[i];
                conteoPositivos++;
            } else{
                sumaNegativos += numbers[i];
                conteoNegativos++;
            }
        }
        //Media de numeros positvos
        if (conteoPositivos == 0){
            System.out.println("La media de los positivos no se puede sacar...");
        } else{
            mediaPositivos = sumaPositivos / conteoPositivos;
            System.out.println("La media de los números positivos es: " + mediaPositivos);
        }
        //Media de numeros negativos
        if (conteoNegativos == 0) {
            System.out.println("La media de los números negativos no se puede sacar...");
        } else{
            mediaNegativos = sumaNegativos / conteoNegativos;
            System.out.println("La media de los números negativos es: " + mediaNegativos);
        }
        //Contador de ceros
        if (conteoCeros == 0){
            System.out.println("No hay ceros");
        } else{
            System.out.println("La cantidad de ceros son: " + conteoCeros);
        }
    }
}
