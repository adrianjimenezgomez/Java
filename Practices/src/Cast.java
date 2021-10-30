public class Cast {
    public static void main(String[] args) {

        double persons = 145.0 / 23;
        System.out.println(persons);

        int newPersons = (int) persons;

        System.out.println(newPersons);

        //

        int a = 30;
        int b = 20;

        System.out.println((double) a/b);

        double c = a/b;

        System.out.println(c);

        char n = '1';
        int n1 = (int) n;
        System.out.println(n1); // conversion de 1 a 49 alt + 49 = 1
    }
}
