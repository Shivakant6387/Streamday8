import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flatmap {
    private int id;
    private String name;
    private String email;
    private List<String> phoneNumber;
    public Flatmap(){
    }
    public Flatmap(int id,String name,String email,List<String>phoneNumber){
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;

    }
    public int getId(){return id;}
    public String getName(){return name;}
    public String getEmail(){return email;}
    public List<String>getPhoneNumber(){return phoneNumber;}
    public  static List<Flatmap>getAll(){

        return Stream.of(
                new Flatmap(1,"john","john@gmail.com", Arrays.asList("8237895735981","21332342432")),
                new Flatmap(1,"john","john@gmail.com", Arrays.asList("8237895735981","21332342432")),
                new Flatmap(1,"john","john@gmail.com", Arrays.asList("8237895735981","21332342432")),
                new Flatmap(1,"john","john@gmail.com", Arrays.asList("8237895735981","21332342432"))
        ).collect(Collectors.toList());
    }
    public static void main(String[]args){
    List<Flatmap>cus=Flatmap.getAll();
   List<String>email= cus.stream()
            .map(customer->customer.getEmail())
            .collect(Collectors.toList());
        System.out.println(email);
        List<String>name= cus.stream()
                .map(customer->customer.getName())
                .collect(Collectors.toList());
        System.out.println(name);
        List<Integer>id= cus.stream()
                .map(customer->customer.getId())
                .collect(Collectors.toList());
        System.out.println(id);
        List<List<String>>phone= cus.stream()
                .map(customer->customer.getPhoneNumber())
                .collect(Collectors.toList());
        System.out.println(phone);
        List<String>phones= cus.stream()
                .flatMap(customer->customer.getPhoneNumber().stream())
                .collect(Collectors.toList());
        System.out.println(phones);
    }
}
