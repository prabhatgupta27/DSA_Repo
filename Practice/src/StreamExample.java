import java.util.Arrays;
import java.util.OptionalDouble;

public class StreamExample {
    public static void main(String[] args) {
        double average = Arrays.asList(1, 2, 3, 4, 5).stream()
                .filter(num -> num % 2 == 0)         // Step 1: Filter even numbers
                .mapToInt(n->n*2)                                   // Step 2: Multiply by 2
                .average()                           // Step 3: Calculate average
                .orElse(0);                          // Step 4: If no average, return 0

        System.out.println("Average: " + average);
    }
}
