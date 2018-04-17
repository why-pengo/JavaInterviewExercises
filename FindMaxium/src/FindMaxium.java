/**
 * Find Maximum
 * Write a method that returns the largest integer in the list.
 * You can assume that the list has at least one element.
 */
public class FindMaxium {
    public static Integer findMax(Integer[] integers) {
        Integer max = 0;

        // for(int i = 0; i < integers.length; i++) {
        for(int i: integers){
            System.out.println("findMax: current max = " + max + " current i = " + i);
            //if(integers[i]  > max) max = integers[i];
            if(i  > max) max = i;
        }

        return max;
    }
}
