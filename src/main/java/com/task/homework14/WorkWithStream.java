package com.task.homework14;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class WorkWithStream {
    public static void main(String[] args) {
        Stream<String> names =Stream.of("John Lennon", "Paul McCartney",
                "George Harrison" ,"Ringo Starr","Pete Best", "Stuart Sutcliffe");
        System.out.println(filter(names,str->str.startsWith("Pete")));

        Stream<String> nameMax =Stream.of("John Lennon", "Paul McCartney",
                "George Harrison" ,"Ringo Starr","Pete Best", "Stuart Sutcliffe");
        Optional<String> max = nameMax.map(str -> str.substring(0, str.indexOf(" ")))
                .max(Comparator.comparingInt(s -> s.length()));
        System.out.println(max);
    }
    private static <T> List<T> filter(Stream<T> stream, Predicate<T> predicate) {
        return stream.reduce(new ArrayList<>(), (List<T> list, T obj) -> {
            if (predicate.test(obj)) {
                list.add(obj);
            }
            return list;
        }, ( list, res) -> {
            res.addAll(list);
            return res;
        });
    }

}
