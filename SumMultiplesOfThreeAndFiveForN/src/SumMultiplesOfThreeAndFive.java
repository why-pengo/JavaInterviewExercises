public class SumMultiplesOfThreeAndFive {

    public Integer Sum(Integer n) {
        Integer sum = 0;
        System.out.println("Sum: entering loop for " + n);
        for (int i = 1; i <= n; i++) {
            System.out.println("Sum: i = " + i);
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println("Sum: adding " + i + " to sum");
                sum += i;
            }
        }
        return sum;
    }
}
