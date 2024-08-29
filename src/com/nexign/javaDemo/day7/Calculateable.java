package com.nexign.javaDemo.day7;


@FunctionalInterface
public interface Calculateable<T, V> {
    Double calculate(T t, V v);
}
