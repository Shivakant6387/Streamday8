package com.distinct.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Limits {
    public static void main(String[]args){
        List numLimit=new ArrayList();
        for(int i=1;i<=20;i++){
            numLimit.add(i);
        }
        System.out.println(numLimit);
        List<Integer>list= (List<Integer>) numLimit.stream()
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
