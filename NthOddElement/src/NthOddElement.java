import java.util.List;

/**
 * Nth Odd Element
 * Write a method that returns the nth element of a list.
 * If the index of the element exceeds the list size, then return -1.
 *
 * public Integer getElement(List<Integer> list, Integer n)
 */
public class NthOddElement {
    public Integer getElement(List<Integer> list, Integer n) {
        if(n > list.size() - 1) return -1;
        return list.get(n);
    }

    public Integer getElementBetter(List<Integer> list, Integer n ) {
        return n > list.size() - 1 ? -1 : list.get(n);
    }
}
