package center.kit.runners.homework.lesson12;

import center.kit.app.homework.lesson12.ArraySorterGenerics;

public class ArraySorterGenericsRunner {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{23, 454, 0, 6, -34, -2, 778, 555};
        Double[] doubleArray = new Double[]{0.54, 0.43, -0.938, 0.2, 2.3, 9.34};
        Integer[] myArray = new Integer[]{587, 2538, 52369, 95239, 0, 2548};


        ArraySorterGenerics<Integer> arraySorterGenerics = new ArraySorterGenerics(myArray);
        arraySorterGenerics.arraySorting(intArray);
        arraySorterGenerics.arraySorting(doubleArray);

    }
}
