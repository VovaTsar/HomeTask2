package com.task.homework13.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Objects.nonNull;
import static java.util.stream.Collectors.*;

//Stream
public class Main {
    public static void main(String[] args) {
        final List<String> strings = asList("one", "two", "three", "one", null);
        final long count = strings.stream()
                .filter(Objects::nonNull)
                .filter("one"::equals)
                .count();
        System.out.println(count);

        System.out.println("version 1:");
        strings.forEach(System.out::println);
        System.out.println("version 2:");
        strings.stream().map(x -> x + "____").forEach(System.out::println);

        final List<Client> clients = asList(
                new Client("one", asList(new Item(1), new Item(2)), Role.USER),
                new Client("two", asList(new Item(3), new Item(4), new Item(4)), Role.USER),
                new Client("two", asList(new Item(6)), Role.ADMIN),
               // new Client("three", null),
                null
        );

        Map<Role, String> roleToName = clients.stream()
                .filter(Objects::nonNull)
                .filter(x -> nonNull(x.getName()))
                .collect(Collectors.groupingBy(Client::getRole, mapping(Client::getName, joining(" "))));
        System.out.println(roleToName);
    }
}