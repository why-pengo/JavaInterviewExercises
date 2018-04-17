import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Convert to Upper Case (Java 8 Lambdas and Streams)
 * Write a method that converts all strings in a list to their upper case.
 *
 * public List<String> upperCase(List<String> list)
 */
public class ConvertToUpper {
    public List<String> upperCase(List<String> list) {
        List<String> results = new ArrayList<>();

        for (String s : list) {
            results.add(s.toUpperCase());
        }

        return results;
    }

    public List<String> upperCaseStream(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}

