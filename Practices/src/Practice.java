import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //Serie de numeros impares
        for(int i = 0; i <= 100; i ++){
            if ((i % 2)!=0){
                System.out.println(i);
            }
        }
        System.out.println("Finobacci");
        //finobacci 0, 1, 1, 2, 3, 5, 8, 11, ...
        //Algoritmos ciclicos
        int x = 1;
        int anterior = 0;
        int temp;
        while (true){
            System.out.println(x);
            temp = x;
            x = x + anterior;
            anterior = temp;
            if (x > 100){
                break;
            }
        }
    }
}
