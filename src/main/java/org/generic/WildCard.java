package org.generic;

import java.util.Arrays;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        List<Number> numbers = List.of(1.1, 2.2, 3, 4.4, 5.5);

        System.out.println("Printing integers - ");
        printList(integers);


        System.out.println("Printing numbers - ");
        printList(numbers);

    }
    public static void printList(List<? super Integer> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
}
