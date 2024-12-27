package org.demo;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class MyHobbies {
    public static void main(String... args) {
        Set<String> hobbies = ImmutableSet.of("Climbing", "Reading", "Cooking");
        hobbies.forEach(System.out::println);
    }
}
