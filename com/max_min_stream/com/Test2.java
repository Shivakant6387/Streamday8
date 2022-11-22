package com.max_min_stream.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test2 {
    public static void main(String[]args){
        List<String>list2= Arrays.asList("marco","daisy","michael","sanya","robin");
        //min()
        Optional<String>minValue =list2.stream()
                .min(Comparator.comparing(String::valueOf));
        if(minValue.isPresent()){
            System.out.println(minValue.get());
        }
        list2.stream()
                .min(Comparator.comparing(String::valueOf))
                .ifPresent(no-> System.out.println("min value is ...."+no));
        //max()
        list2.stream()
                .max(Comparator.comparing(String::valueOf))
                .ifPresent(no-> System.out.println("max value is ...."+no));
    }
}
