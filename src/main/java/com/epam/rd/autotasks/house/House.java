package com.epam.rd.autotasks.house;

import java.util.ArrayList;
import java.util.List;

public class House<T> {

    private final List<T> residents = new ArrayList<>();

    public void enter(T pet) {
        if (
                !residents.isEmpty() &&
                        !residents.get(0).getClass().isInstance(pet)
        ) {
            throw new RuntimeException("AAA!");
        }
        residents.add(pet);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("There are following residents in the house:\n");
        for (Object resident : residents) {
            builder.append(resident.toString()).append("\n");
        }
        return builder.toString();
    }
}
