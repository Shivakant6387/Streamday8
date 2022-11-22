package com.max_min_stream.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test1 {
    public static void main(String[]args){
        List<Integer> list= Arrays.asList(10,29,30,40,54,90);
        //min()
        Optional<Integer>minValue=list.stream()
                .min(Comparator.comparing(Integer::intValue));
        if (minValue.isPresent()){
            System.out.println(minValue.get());
        }
        list.stream()
                .min(Comparator.comparing(Integer::intValue))
                .ifPresent(no-> System.out.println("the min value is ..."+no));
        //max()
        Optional<Integer>minValue1=list.stream()
                .max(Comparator.comparing(Integer::intValue));
        if (minValue1.isPresent()){
            System.out.println(minValue1.get());
        }
        list.stream()
                .max(Comparator.comparing(Integer::intValue))
                .ifPresent(no-> System.out.println("the max value is..."+no));
    }

}