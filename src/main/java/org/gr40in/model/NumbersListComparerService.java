package org.gr40in.model;

import org.decimal4j.util.DoubleRounder;

import java.util.ArrayList;
import java.util.List;

public class NumbersListComparerService {
    public static List<Double> parseStringDataToNumbersList(String data) {
        String[] stringsArray = data.split("\s+");
        if (stringsArray.length == 0) throw new StringToDoubleParseException("Sting data is empty");
        List<Double> dataAsNumbersList = new ArrayList<>();
        for (String currentValue : stringsArray) {
            try {
                dataAsNumbersList.add(Double.parseDouble(currentValue));
            } catch (NumberFormatException e) {
                throw new StringToDoubleParseException("couldn't convert this - " + currentValue);
            }
        }
        return dataAsNumbersList;
    }

    public static boolean stringDataIsOk(String data) {
        boolean itValid = true;
        String[] stringsArray = data.split("\s+");
        for (String string : stringsArray) {
            if (!string.matches("\\d+\\.?\\d+")) itValid = false;
        }
        return itValid;
    }

    public static Double getAverage(List<Double> numbersList) {
        int count = 0;
        Double sum = 0.0;
        for (Double number : numbersList) {
            sum += number;
            count++;
        }
        return DoubleRounder.round(sum / count, 8);
    }


}
