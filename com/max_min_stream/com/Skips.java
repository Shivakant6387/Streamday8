package com.max_min_stream.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skips {
    public static void main(String[]args){
        List<Integer>list= Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,20,30,80);
        List<Integer>list1=  list.stream()
                .skip(5)
                .collect(Collectors.toList());
        System.out.println(list1);

    }
}
