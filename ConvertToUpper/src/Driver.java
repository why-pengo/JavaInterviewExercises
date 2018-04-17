import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Driver: starting");

        ConvertToUpper convertToUpper = new ConvertToUpper();
        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        List<String> list2 = new ArrayList<>();
        list2.add("five");
        list2.add("six");
        list2.add("seven");
        list2.add("eight");

        System.out.println("Driver: upperCase list1 = " + convertToUpper.upperCase(list1));
        System.out.println("Driver: upperCase list2 = " + convertToUpper.upperCaseStream(list2));

        System.out.println("Driver: starting");
    }
}
