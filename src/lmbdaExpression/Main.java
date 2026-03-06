package lmbdaExpression;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(){
        List<Integer> ls = List.of(2,4,6,3,5,3,2,1,5,6,4); // data source..
        Stream<Integer> s = ls.stream();

//        Intermidiate: lazy methods..
//        Terminals: evaluate lazy loading
        List<Integer> evens = s.filter((x)-> x%2==0)
                .sorted().collect(Collectors.toList());
        
        System.out.println(evens);

    }
}
