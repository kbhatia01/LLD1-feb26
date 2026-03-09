package lmbdaExpression;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(){
        List<Integer> ls = List.of(2,4,6,3,5,3,2,1,5,6,4); // data source..
        Stream<Integer> s = ls.stream();

//        Intermidiate: lazy methods..
//        Terminals: evaluate lazy loading
//        List<Integer> evens = s.filter((x)-> x%2==0)
//                .map((x)-> x*x)
//                .sorted().distinct().collect(Collectors.toList());

//        Test t = new Test();
//       s.filter((x)-> x%2==0)
//                .map((x)-> x*x)
//                .sorted().distinct().forEach(System.out::println);
//
        Stream<Integer> s1 = ls.stream();
//
        int z = s1.reduce(0,Integer::sum);
        System.out.println(z);

//
//        Stream<Integer> s2 = ls.stream();
//        Optional<Integer> z1 = s2.reduce((a, b)-> a>b? a: b);
//

        Stream<Integer> s3 = ls.stream();
        int z3 = s3.reduce((a, b)-> a*b).orElse(100);
        System.out.println(z3);

//        System.out.println(z1.get());

    }

//    REDUCE: Shrinking..

}


// int a = 0;
// for int i=0; i< len; i++:
//  a+= arr[i]


// int a = a[0];
// for int i=1; i< len; i++:
//  if a > arr[i]: a=arr[i]