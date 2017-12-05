package center.kit.app.homework.lesson6;

public class LoopsSwithArraysHomework {

    //Task a
    public static void evenNumbersArray() {
        int counter = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        int[] evenNumbersArray = new int[counter];
        counter = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                evenNumbersArray[counter] = i;
                counter++;
            }
        }
        for (int arrayElement : evenNumbersArray) {
            System.out.print(arrayElement + " ");
        }
        System.out.println();
        for (int i = 0; i < evenNumbersArray.length; i++) {
            System.out.println(evenNumbersArray[i]);
        }
    }

    //Task b
    public static void oddNumbersArray() {
        int counter = 0;
        for (int i = 0; i <= 99; i++) {
            if (i % 2 == 1) {
                counter++;
            }
        }
        int[] oddNumbersArray = new int[counter];
        counter = 0;
        for (int i = 0; i <= 99; i++) {
            if (i % 2 == 1) {
                oddNumbersArray[counter] = i;
                counter++;
            }
        }
        for (int arrayElement : oddNumbersArray) {
            System.out.print(arrayElement + " ");
        }
        System.out.println();
        for (int i = oddNumbersArray.length - 1; i >= 0; i--) {
            System.out.print(oddNumbersArray[i] + " ");
        }
    }

    //Task c
    public static void randomNumbersArray() {
        int[] randomNumbersArray = new int[15];
        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] = (int) (Math.random() * 10);
        }
        for (int arrayElement : randomNumbersArray) {
            System.out.print(arrayElement + " ");
        }
        int counter = 0;
        for (int i = 0; i < randomNumbersArray.length; i++) {
            if (randomNumbersArray[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter);
    }

    //Task d
    public static void minMaxArray() {
        int[] randomNumbersArray = new int[15];
        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] = (int) (Math.random() * 1000);
        }
        for (int arrayElement : randomNumbersArray) {
            System.out.print(arrayElement + " ");
        }
        int maxValue = randomNumbersArray[0];
        for (int i = 0; i < randomNumbersArray.length; i++) {
            if (randomNumbersArray[i] > maxValue) {
                maxValue = randomNumbersArray[i];
            }
        }
        System.out.println();
        System.out.println("Max value in array: " + maxValue);

        int minValue = randomNumbersArray[0];
        for (int i = 0; i < randomNumbersArray.length; i++) {
            if (randomNumbersArray[i] < minValue) {
                minValue = randomNumbersArray[i];
            }
        }
        System.out.println("Min value in array: " + minValue);
    }

    //Task e
    public static void twoDimensionalArray() {
        int[][] myArray = new int[8][5];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = (int) (10 + Math.random() * 100);
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

