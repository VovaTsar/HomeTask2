package com.task2.homework4.domain;

import java.util.Objects;

public class PhoneNumber {
    private final int codeCountry;
    private final int  tel;

    public PhoneNumber(int codeCountry, int tel) {
        this.codeCountry = codeCountry;
        this.tel = tel;
    }

    public int getTel() {
        return tel;
    }

    public int getCodeCountry() {
        return codeCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return codeCountry == that.codeCountry &&
                tel == that.tel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeCountry, tel);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "codeCountry=" + codeCountry +
                ", tel=" + tel +
                '}';
    }
}
