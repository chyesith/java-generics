package org.generic;

import java.util.Arrays;
import java.util.List;

public class GenericMethod {
    public static void main(String[] args) {
        String[] names = {"John", "Michel", "Jake"};
        Integer[] numbers = {1, 3, 4, 6, 7};

        List<String> nameList = convertArray(names);
        List<Integer> numberList = convertArray(numbers);
    }
    private static <T> List<T> convertArray(T[] array) {
        return Arrays.asList(array);
    }

}
