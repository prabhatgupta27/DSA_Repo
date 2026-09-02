import jdk.nio.mapmode.ExtendedMapMode;

import java.util.*;
import java.util.stream.Collectors;

public class Test {



    public static void main(String[] args) {

        Employee e1 = new Employee("Ravi","1");
        Employee e2 = new Employee("Shyam","2");
        Employee e3 = new Employee("Shyam","2");

        List<Employee> emplist = new ArrayList<>();
        emplist.add(e1);
        emplist.add(e2);
        emplist.add(e3);
        HashSet<String> unique = new LinkedHashSet<>();

        emplist.stream().distinct().map(e-> unique.add(e.name)).collect(Collectors.toSet());
        System.out.println(unique);
        unique.forEach(e-> System.out.println(e));
    }

}

class Employee{

    String name;
    String id;

    Employee(String name, String id){
        this.name = name;
        this.id = id;
    }

}
/*
1)you have a employee clase having name and id as parametert where you have to remove the duplicate employee
        2) salary table has empid ,salary, department => get 3 top salary using sql query
3) what is Race condition?

        select max(salary) from Salary limit(3)*/
