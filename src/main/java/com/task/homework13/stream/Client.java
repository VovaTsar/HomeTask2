package com.task.homework13.stream;

import java.util.Arrays;
import java.util.List;

public class Client {
    private String name;
    private List<Item> items;
    private Role role;

    public Client(String name, List<Item> items) {
        this.name = name;
        this.items = items;
    }

    public Client(String name, List<Item> items, Role role) {
        this.name = name;
        this.items = items;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "{name: " + name + '\'' +
                ", items: " + (items == null ? "[]" : Arrays.toString(items.toArray())) +
                '}';
    }
}