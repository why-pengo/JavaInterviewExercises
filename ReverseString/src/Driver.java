public class Driver {
    public static void main(String[] args) {
        System.out.println("Driver: starting");
        ReverseString reverseString = new ReverseString();

        String ex = "java interview";
        System.out.println("Driver: ex = " + ex);
        String rs = reverseString.strRev(ex);
        System.out.println("Driver: rs = " + rs);

        System.out.println("Driver: complete");
    }
}
