package com.example.iterable;

import java.util.*;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Container<T>{

    private List<T> bag;

    public Bag() {
        this.bag = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return bag.isEmpty();
    }

    @Override
    public int size() {
        return bag.size();
    }

    @Override
    public void add(T item) {
        bag.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return bag.iterator();
    }

    // extra credit
    @Override
    public void forEach(Consumer<? super T> action) {
        bag.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return bag.spliterator();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bag{");
        sb.append("bag=").append(bag);
        sb.append('}');
        return sb.toString();
    }
}
