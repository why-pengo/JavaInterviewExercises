import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Driver: starting");
        AverageValue averageValue = new AverageValue();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Driver: average = " + averageValue.average(list));
        System.out.println("Driver: averageStream = " + averageValue.averageStream(list));

        System.out.println("Driver: complete");
    }
}
