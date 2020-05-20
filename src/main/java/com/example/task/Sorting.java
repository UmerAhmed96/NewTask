package com.example.task;

import java.util.*;
import java.util.stream.Collectors;

public class Sorting {

    public List<Integer> sortingMethod(int[] array){

        List<Integer> numbers = Arrays.stream(array).boxed().collect(Collectors.toList());

        Set<Integer> even = new TreeSet<>();
        Set<Integer> odd = new TreeSet<>();
        List<Integer> sortedList = new ArrayList<>();
        for (int num : numbers){
            if (num%2 == 0){
                even.add(num);
            }
            else {
                odd.add(num);
            }
        }
        sortedList.addAll(odd);
        sortedList.addAll(even);
    return sortedList;

    }
}
