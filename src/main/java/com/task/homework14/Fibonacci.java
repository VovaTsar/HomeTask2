package com.task.homework14;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer, Long> counterToValue = new HashMap<>();
    static
    {
        counterToValue.put(0, 0L);
        counterToValue.put(1, 1L);
        counterToValue.put(2, 1L);
    }
    public static long fibonacci(int x)
    {
        return counterToValue.computeIfAbsent(x, n -> fibonacci(n - 2) + fibonacci(n - 1));
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(100));
    }
}
