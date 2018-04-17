public class Driver {
    public static void main(String[] args) {
        System.out.println("Driver: starting");

        Factorial f = new Factorial();

        Integer rs = f.calculate(4);
        System.out.println("Driver: rs = " + rs);

        rs = f.recursiveFactorial(4);
        System.out.println("Driver: recursive rs = " + rs);

        System.out.println("Driver: complete");
    }
}
