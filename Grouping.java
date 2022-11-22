import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[]args){
        List<String>laptop= Arrays.asList("Apple","Lenovo","Dell");
        Map<String,List<String>>collgroup=laptop.stream()
                .collect(Collectors.groupingBy(word->word));
        System.out.println(collgroup);
    }
}
