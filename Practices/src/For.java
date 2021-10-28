public class For {
    public static void main(String[] args) {
        // Ciclo While
        for(int i = 1; i <= 5; i++){ // for(inicio; condicion; incremento)
            System.out.print(i + ", "); //instrucción de la variable...
        }
        System.out.println("Listo!");

        //Ciclo While

        int a = 1;

        while(a < 10) { //while(variable sea menor a diez)
            System.out.println(a + ", "); // Imprime valor de variable
            a += 2; // incremento de la variable
        }

        //Ciclo Do-While

        int b = 1000;
        do {
            System.out.print(b + ", ");
            b -= 200;
        } while (b >=0);

        System.out.println("Listo!");
    }
}
