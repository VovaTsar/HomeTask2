package com.task.homework12;

import org.junit.Test;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import java.util.Map;

import static com.task.homework12.MapMerge.mergeByCounter;
import static com.task.homework12.MapMerge.mergeByMapMethod;
import static org.junit.Assert.*;

public class MapMergeTest {
    @Test
    public void shouldReturnCounterOfCharByCounterMethod() {
        Map<Character, Integer> charToCounters = mergeByCounter("Hello");
        assertThat(charToCounters, Matchers.hasEntry('e', 1));
        assertThat(charToCounters, Matchers.hasEntry('l', 2));
        assertThat(charToCounters, Matchers.hasEntry('H', 1));
        assertThat(charToCounters, Matchers.hasEntry('o', 1));
        assertThat(charToCounters.values(), Matchers.hasSize(4));
    }

    @Test
    public void shouldReturnCounterOfCharByMapMethod() {
        Map<Character, Integer> charToCounters = mergeByMapMethod("Hello");
        assertThat(charToCounters, Matchers.hasEntry('e', 1));
        assertThat(charToCounters, Matchers.hasEntry('l', 2));
        assertThat(charToCounters, Matchers.hasEntry('H', 1));
        assertThat(charToCounters, Matchers.hasEntry('o', 1));
        assertThat(charToCounters.values(), Matchers.hasSize(4));
    }
}
