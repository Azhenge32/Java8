package com.azhen.stream;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Azhen
 * @date 2017/10/28
 */
public class Person {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(3,4);
        List<int[]> results = list1.stream().flatMap(i -> list2.stream().map(j -> new int[]{i,j})).collect(Collectors.toList());

        int sum = list1.stream().reduce(0, (a, b) -> a + b);
        Optional<Integer> sumOpt = list1.stream().reduce( (a, b) -> a + b);
        System.out.println(sum);

        int multiply = list1.stream().reduce(1, (a, b) -> a * b);
        Optional<Integer> multiplyOpt = list1.stream().reduce((a, b) -> a * b);
        System.out.println(multiply);
    }
}
