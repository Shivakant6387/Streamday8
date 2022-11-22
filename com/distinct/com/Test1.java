package com.distinct.com;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[]args){
        List<String>courseList= Arrays.asList("java","Python","JavaScript","Angular","React","Node","Ruby");
        courseList.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
