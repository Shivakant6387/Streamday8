import java.util.Arrays;
import java.util.List;

public class FilterSTest {
public static void main(String[]args){
    List<Integer>list= Arrays.asList(10,20,30,40,50,60,70,80,90);
    System.out.println(list.stream().filter(i->i%5==0).reduce(0,(c,e)->c+e));
}
}
