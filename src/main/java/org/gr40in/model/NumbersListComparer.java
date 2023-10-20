package org.gr40in.model;

import java.util.ArrayList;
import java.util.List;

public class NumbersListComparer {
    List<Double> numbersList1;
    Double numbersList1Average;
    List<Double> numbersList2;
    Double numbersList2Average;

    public NumbersListComparer() {
        this.numbersList1 = new ArrayList<>();
        this.numbersList2 = new ArrayList<>();
    }

    public NumbersListComparer(List<Double> numbersList1, List<Double> numbersList2) {
        this.numbersList1 = numbersList1;
        this.numbersList1Average = NumbersListComparerService.getAverage(this.numbersList1);
        this.numbersList2 = numbersList2;
        this.numbersList2Average = NumbersListComparerService.getAverage(this.numbersList2);
    }

    public String getComparerResult() {
        String list1 = this.numbersList1.toString();
        String list2 = this.numbersList2.toString();
        return "\tAverage value of " +
                (this.numbersList1Average.equals(this.numbersList2Average) ? list1 + " and " + list2 + " are equal" :
                        (this.numbersList1Average > this.numbersList2Average ? list1 : list2) + " are bigger");
    }


}
