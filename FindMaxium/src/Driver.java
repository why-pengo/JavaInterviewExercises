public class Driver {
    public static void main(String[] args) {
        System.out.println("Driver: starting");

        FindMaxium findMaxium = new FindMaxium();
        Integer[] integers = new Integer[]{1, 2, 3, 5, 8, 13};

        Integer max = findMaxium.findMax(integers);
        System.out.println("Driver: max = " + max);

        System.out.println("Driver: complete");
    }
}
