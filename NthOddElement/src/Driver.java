import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Driver: starting");
        NthOddElement nthOddElement = new NthOddElement();
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer rs = nthOddElement.getElement(list, 3);
        System.out.println("Driver: " + 3 + "rd element of " + list + " is " + rs);

        rs = nthOddElement.getElement(list, 9);
        System.out.println("Driver: " + 9 + "th element of " + list + " is " + rs);

        rs = nthOddElement.getElementBetter(list, 3);
        System.out.println("Driver: " + 3 + "rd element of " + list + " is " + rs);

        System.out.println("Driver: complete");
    }
}
