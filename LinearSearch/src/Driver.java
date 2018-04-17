public class Driver {

    public static void main(String[] args) {
        System.out.println("Driver: starting");

        LinearSearch linearSearch = new LinearSearch();
        Integer[] integers = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        Integer[] integers2 = new Integer[]{10,12,4,6,7,9,1};

        Integer index = linearSearch.search(7, integers);
        System.out.println("Driver1: index of " + 7 + " is " + index);
        index = linearSearch.search(7, integers2);
        System.out.println("Driver2: index of " + 7 + " is " + index);

        System.out.println("Driver: complete");
    }
}
