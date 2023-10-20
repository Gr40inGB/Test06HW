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
        NumbersListComparer numbersListComparer1 = new NumbersListComparer(list1, list4);
        NumbersListComparer numbersListComparer2 = new NumbersListComparer(list2, list3);
        assertEquals(numbersListComparer1.getComparerResult(), "\tAverage value of [1000.6, 100.2] are bigger");
        assertEquals(numbersListComparer2.getComparerResult(), "\tAverage value of [0.0] and [-1.0, 1.0] are equal");
        assertNotEquals(numbersListComparer2.getComparerResult(), "\tAverage value of [0.0] and [-1.0, 1.0] are equals");
    }
}