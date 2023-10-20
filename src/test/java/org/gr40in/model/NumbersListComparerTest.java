package org.gr40in.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumbersListComparerTest {

    @Test
    void getComparerResult() {
        List<Double> list1 = new ArrayList<>(Arrays.asList(12.2, 12.2, 12.2, 12.2, 12.2, 12.2, 12.2, 12.2, 12.2, 12.2));
        List<Double> list2 = new ArrayList<>(Arrays.asList(0.0));
        List<Double> list3 = new ArrayList<>(Arrays.asList(-1.0, 1.0));
        List<Double> list4 = new ArrayList<>(Arrays.asList(1000.6, 100.2));

    }
}