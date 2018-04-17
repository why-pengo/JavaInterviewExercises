public class Driver {
    public static void main(String[] args) {
        SumMultiplesOfThreeAndFive sumMultiplesOfThreeAndFive = new SumMultiplesOfThreeAndFive();

        for(int i = 1; i <= 14; i = i + 2) {
            Integer sum = sumMultiplesOfThreeAndFive.Sum(i);
            System.out.println("SumMultiplesOfThreeAndFive: The of sum of multiples of three and five for given " + i + " is " + sum);
        }
    }
}
