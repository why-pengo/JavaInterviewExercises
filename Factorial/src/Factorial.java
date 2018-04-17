/**
 * Write a method that calculates the factorial of a given number.
 * Factorial is the product of all positive integers less than or equal to n.
 * For example, factorial(4) = 4x3x2x1 = 24.
 * TIP: To make it more interesting, try to do it recursively.
 */
public class Factorial {

    public Integer calculate(Integer n) {
        System.out.println("Factorial: entering loop for " + n);
        Integer f = n;

        for (int j = n - 1; j > 0; j--) {
            System.out.println("Factorial: calculating " + f + " * " + j);
            f = f * j;
        }

        System.out.println("Factorial: f = " + f);

        return f;
    }

    public Integer recursiveFactorial(Integer n) {
        Integer f = n;

        if(n > 1) {
            System.out.println("recursiveFactorial: f = " + f);
            f = f * recursiveFactorial(n - 1);
        }

        return f;
    }
}
