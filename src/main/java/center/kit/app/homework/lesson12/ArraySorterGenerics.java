package center.kit.app.homework.lesson12;

public class ArraySorterGenerics<T extends Number & Comparable> {
    private T[] tArray;

    public ArraySorterGenerics(T[] t) {
        this.tArray = t;
    }

    public static <T extends Comparable> void arraySorting(T[] myArray) {
        int lenght = myArray.length;
        T temp;

        for (int i = 0; i < lenght; i++) {
            for (int j = 1; j < (lenght - i); j++) {
                if (myArray[j - 1].compareTo(myArray[j]) > 0) {
                    temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        System.out.println("Array after sorting:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] + " ");
        }
    }

    public T[] getArray() {
        return tArray;
    }

    public void set(T[] t) {
        this.tArray = t;
    }

    public void sort() {
        int lenght = tArray.length;
        T temp;

        for (int i = 0; i < lenght; i++) {
            for (int j = 1; j < (lenght - i); j++) {
                if (tArray[j - 1].compareTo(tArray[j]) > 0) {
                    temp = tArray[j - 1];
                    tArray[j - 1] = tArray[j];
                    tArray[j] = temp;
                }
            }
        }
        System.out.println("Array after sorting:");
        for (int i = 0; i < tArray.length; i++) {
            System.out.println(tArray[i] + " ");
        }
    }
}
