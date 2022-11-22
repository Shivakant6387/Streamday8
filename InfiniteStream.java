import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStream {
 public static void main(String[]args){
     //infinite streams used to generate infinite stream of data

     //iterate()

     //static
     //return

//      List<Integer>collect= IntStream.iterate(0, n->n+2)
//             .mapToObj(Integer::valueOf)
//             .limit(100)
//             .collect(Collectors.toList());
//     System.out.println(collect);

     //generate
     List<Integer>collect2= Stream.generate(()->(new Random()).nextInt(100))
             .limit(10)
             .collect(Collectors.toList());
     System.out.println(collect2);
 }
}
