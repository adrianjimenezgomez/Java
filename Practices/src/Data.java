public class Data {
    public static void main(String[] args) {
        var salary = 3000;
        var pension = salary * 0.03;
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var empleadoName = "Adrián";
        var lastNempleado = "Jiménez";
        System.out.printf("Empleado: " + empleadoName + " " + lastNempleado + " Salario: " + salary);
        System.out.println("Pensión: " + pension);
        System.out.printf("Salario Total: " + totalSalary);
    }
}
