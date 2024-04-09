package org.generic;

import java.util.Arrays;
import java.util.List;

public class BoundedType {
    public static void main(String[] args) {
        Double[] doubleNumbers = {2.0 ,4.0 , 5.0 , 6.0};
        Integer[] numbers = {1, 3, 4, 6, 7};

        List<Double> doubleList = convertArray(doubleNumbers);
        List<Integer> numberList = convertArray(numbers);
    }
    private static <T extends Number> List<T> convertArray(T[] array) {
        return Arrays.asList(array);
    }

}
