public class Maths {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.ceil(x));
        System.out.println(Math.ceil(y));

        System.out.println(Math.floor(x));
        System.out.println(Math.floor(y));

        System.out.println(Math.pow(x,y)); // Eleva una variable a cierta potencia

        System.out.println(Math.max(x,y)); // indica cuál número es mayor que el otro

        System.out.println(Math.sqrt(y)); //indica cuál es la raíz cuadrada de cierta varibale

        System.out.println(Math.PI * Math.pow(y,2)); //indica el área de un círculo

        System.out.println(4 * Math.PI * Math.pow(y,2));

        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
