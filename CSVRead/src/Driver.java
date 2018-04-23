public class Driver {
    public static void main(String[] args) {
        System.out.println("Driver: starting");

        CSVRead csvRead = new CSVRead();
        csvRead.parse("input.csv", "c");

        System.out.println("Driver: complete");
    }
}
