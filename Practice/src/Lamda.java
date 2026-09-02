import java.util.Arrays;
import java.util.function.IntConsumer;

public class Lamda
{
    public static void main(String[] args) {

        int[] salary = {1000,2000, 3000,4000};

        Arrays.stream(salary).filter((value -> value > 1000)).forEach(System.out::println);

       // (a,b)->{a+b};
    }




}
