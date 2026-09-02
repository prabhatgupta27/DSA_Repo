import java.util.*;
import java.util.stream.Collectors;

public class Distinct {


    public static void main(String[] args) {

        String[] st = {"Gupta","Gupta","Gupta","Prabhat"};

      //  List<String> distictElement = Arrays.asList(st).stream().distinct().collect(Collectors.toList());

        HashMap<String,Integer> hm = new HashMap<>();
       Arrays.stream(st).collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream()
                        .filter(n->n.getValue() == 1).forEach((n)->{
                   System.out.println(n.getKey());
               });

        Arrays.stream(st).forEach(s-> hm.put(s,hm.getOrDefault(s,0)+1));

        hm.entrySet().stream().filter(f->f.getValue()==1).forEach((k)-> System.out.println("name=>" +k.getKey() ));


    }
}
