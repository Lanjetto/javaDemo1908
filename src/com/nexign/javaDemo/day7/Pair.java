package com.nexign.javaDemo.day7;

import java.util.Objects;

public class Pair<T, V> {
    private final T el1;
    private final V el2;


    public Pair(T el1, V el2) {
        this.el1 = el1;
        this.el2 = el2;
    }


    public T getEl1() {
        return el1;
    }

    public V getEl2() {
        return el2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair<?, ?> pair)) return false;
        return Objects.equals(el1, pair.el1) && Objects.equals(el2, pair.el2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(el1, el2);
    }

    @Override
    public String toString() {
        return "Parir{" +
                "el1='" + el1 + '\'' +
                ", el2='" + el2 + '\'' +
                '}';
    }
}
