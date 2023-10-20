package org.gr40in.model;

import java.util.List;

public class NumbersListComparer {
    List<Double> numbersList1;
    Double numbersList1Average;
    List<Double> numbersList2;
    Double numbersList2Average;

    public NumbersListComparer() {
    }

    public NumbersListComparer(List<Double> numbersList1, List<Double> numbersList2) {
        this.numbersList1 = numbersList1;
        this.numbersList1Average = NumbersListComparerService.getAverage(this.numbersList1);
        this.numbersList2 = numbersList2;
        this.numbersList2Average = NumbersListComparerService.getAverage(this.numbersList2);
    }

    public List<Double> getNumbersList1() {
        return numbersList1;
    }

    public void setNumbersList1(List<Double> numbersList1) {
        this.numbersList1 = numbersList1;
    }

    public List<Double> getNumbersList2() {
        return numbersList2;
    }

    public Double getNumbersList1Average() {
        return this.numbersList1Average;
    }

    public Double getNumbersList2Average() {
        return this.numbersList2Average;
    }

    public void setNumbersList2(List<Double> numbersList2) {
        this.numbersList2 = numbersList2;
    }

    public String getComparerResult() {
        String list1 = this.numbersList1.toString();
        String list2 = this.numbersList2.toString();
        return "Average value of " +
                (this.numbersList1Average.equals(this.numbersList2Average) ? list1 + " and " + list2 + " are equal" :
                        this.numbersList1Average > this.numbersList2Average ? list1 : list2 + " are bigger");
    }


}
