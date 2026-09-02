import java.util.*;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;
    double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class FindMaxCount {



    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 7, 7, 4, 5, 3, 7, 9};

       Map.Entry<Integer, Long> maxOccurence = Arrays.stream(arr).boxed()
               .collect(Collectors.groupingBy(n->n, Collectors.counting())).entrySet()
               .stream().max(Map.Entry.comparingByValue()).orElse(null);

        System.out.println(maxOccurence.getKey() +" -> " +maxOccurence.getValue());

        // Step 1: Count the frequency of each element
        Map<Integer, Long> frequencyMap = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        System.out.println("Frequency Map: " + frequencyMap);

        // Step 2: Get the second highest occurrence using sorted and skip(1)
        Map.Entry<Integer, Long> secondHighestOccurrence = frequencyMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue(Comparator.reverseOrder())) // Sort in descending order
                .skip(1) // Skip the first (highest occurrence)
                .findFirst() // Get the second highest
                .orElse(null); // Return null if not available

        // Step 3: Print the result
        if (secondHighestOccurrence != null) {
            System.out.println("Second Highest Occurrence: " + secondHighestOccurrence.getKey() +
                    " = " + secondHighestOccurrence.getValue());
        } else {
            System.out.println("Second Highest Occurrence Not Available");
        }

        Integer sortedDistinct = Arrays.stream(arr)
                .distinct()                                 // Remove duplicates
                .boxed()                                   // Convert int to Integer
                .sorted(Comparator.reverseOrder())         // Sort in descending order
                .skip(1)
                .findFirst().orElse(0);
        System.out.println(sortedDistinct);

      /*  List<Character> chars = Arrays.asList('a', 'a', 'b', 'b', 'b', 'd');

        // Step 1: Count frequency using groupingBy
        Map<Character, Long> frequencyMap = chars.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("Frequency Map: " + frequencyMap);

        // Step 2: Get second highest count using sorted + skip(1)
        Optional<Map.Entry<Character, Long>> secondHighest = frequencyMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // Sort by value (descending)
                .skip(1)                      // Skip the first (highest) entry
                .findFirst();

        secondHighest.ifPresentOrElse(
                entry -> System.out.println("Second Highest: " + entry.getKey() + " = " + entry.getValue()),
                () -> System.out.println("Second Highest Count Not Available")
        );*/

        List<Person> people = List.of(
                new Person("Raghav", 25, 50000),
                new Person("Shashi", 30, 60000),
                new Person("Sachin", 25, 55000),
                new Person("Maven", 35, 70000),
                new Person("Java", 30, 65000)
        );

        Map<Integer, Double>  avgSalaryByAge = people.stream()
                .collect(Collectors.groupingBy(p->p.age,Collectors.averagingDouble(p->p.salary)));

        avgSalaryByAge.forEach((age,avgSalary)->{
            System.out.println(age + "-> "+ avgSalary);
        });
        System.out.println("------------------------------------------");
        Map.Entry<Integer, Double> highSalary = avgSalaryByAge.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);

        System.out.println(highSalary.getKey() +"-> "+highSalary.getValue());
    }
}
