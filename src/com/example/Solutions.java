package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solutions {

    List<Person> persons = Arrays.asList(
            new Person(1, "Rohit", "Yadav"),
            new Person(2, "Surbhi", "Singh"),
            new Person(3, "Ranbir", "Singh"),
            new Person(3, "Santosh", "Yadav"),
            new Person(3, "Babita", "Yadav")
    );

    public static void main(String[] args) {
        new Solutions().finalList();

    }

    void finalList() {
        Map<String, List<Person>> finallastName = persons.stream().collect(Collectors.groupingBy(
                Person::getLastName
        ));

    }
}
