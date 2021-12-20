public class Matrices {
    public static void main(String[] args){
        String [][] names = new String[3][3];
        names[0][0] = "value1";
        names[0][1] = "value2";
        names[0][2] = "value3";

        names[1][0] = "value4";
        names[1][1] = "value5";
        names[1][2] = "value6";

        names[2][0] = "value7";
        names[2][1] = "value8";
        names[2][2] = "value9";

        System.out.println("value 3 :" + names[0][2]);
        //Imprimir una fila [0]
        for (int i = 0; i<names.length; i ++){
            System.out.println("Value " + ": " + names[0][1]);
        }
        //Imprimir todos los datos por medio de dos ciclos
        for (int i = 0; i < names.length; i ++) {
            for (int j = 0; j < names.length; j++) {
                System.out.println("Value i = " + i + " Value j = " + j + " " + names[i][j]);
            }
        }
    }
}
