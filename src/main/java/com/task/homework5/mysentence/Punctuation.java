package com.task.homework5.mysentence;

import java.util.Objects;

public class Punctuation {
    private char a;

    public Punctuation(char a) {
        this.a = a;
    }

    public char get() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Punctuation that = (Punctuation) o;
        return a == that.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
