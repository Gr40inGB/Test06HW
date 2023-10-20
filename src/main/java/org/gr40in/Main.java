package org.gr40in;

import org.gr40in.model.NumbersListComparer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>() {{
            add(13.4);
            add(15.5);
            add(15.5);
            add(15.1);
        }};

        System.out.println(list.toString());

        NumbersListComparer numbersListComparer = new NumbersListComparer();
        System.out.println(numbersListComparer.getNumbersList1Average());
    }
}