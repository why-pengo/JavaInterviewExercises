import java.util.List;

/**
 * Average Value (Java 8 Lambdas and Streams)
 * Write a method that returns the average of a list of integers.
 *
 * public Double average(List<Integer> list)
 */
public class AverageValue {
    public static Double average(List<Integer> list) {
        Double rs, sum = 0D;

        for(int i: list) {
            sum += i;
        }
        rs = sum / list.size();

        return rs;
    }

    public static Double averageStream(List<Integer> list) {
        return list.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
    }
}
