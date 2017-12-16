package center.kit.app.homework.lesson8;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FilesWorkStation {

    //sorting the numbers in array
    public static int[] fileLineSorting(int[] lineNumbers) {
        for (int i = lineNumbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (lineNumbers[j] > lineNumbers[j + 1]) {
                    int tmp = lineNumbers[j];
                    lineNumbers[j] = lineNumbers[j + 1];
                    lineNumbers[j + 1] = tmp;
                }
            }
        }
        return lineNumbers;
    }

    //palindrome test
    public static boolean isPalindrome(String inputWord) {
        boolean isPalindrome = true;
        for (int i = 0; i < inputWord.length() / 2; i++) {
            isPalindrome = isPalindrome &&
                    (inputWord.charAt(i) == inputWord.charAt(inputWord.length() - i - 1));
        }
        if (isPalindrome) {
            return true;
        } else {
            return false;
        }
    }

    //Task a
    public static void fileCreators() throws IOException {
        //creating an input file
        File inputFile = new File("C:\\Users\\borovik_o\\work", "sorted_data.txt");

        //creating an output file
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\borovik_o\\work\\unsorted_data.txt"));
        String outputFileLine;

        BufferedWriter writerInput = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(inputFile.getAbsolutePath())));

        while ((outputFileLine = bufferedReader.readLine()) != null) {
            StringBuilder inputFileLine = new StringBuilder();
            int[] outputFileLineToArray = Arrays.stream(outputFileLine.split(",")).mapToInt(Integer::parseInt).toArray();
            int[] inputFileLineArray = fileLineSorting(outputFileLineToArray);
            for (int inputNum : inputFileLineArray
                    ) {
                inputFileLine.append(String.format("%s,", inputNum));
            }
            inputFileLine.delete(inputFileLine.length() - 1, inputFileLine.length());
            writerInput.append(inputFileLine);
            writerInput.newLine();
        }
        writerInput.close();
    }

    //Task b
    public static void palindromeListInFile() throws IOException {
        //creating an input file
        File inputFile = new File("C:\\Users\\borovik_o\\work", "is_palindrome_data.txt");

        //creating an output file
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\borovik_o\\work\\palindrome_check_data.txt"));
        String outputFileLine;

        BufferedWriter writerInput = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(inputFile.getAbsolutePath())));

        while ((outputFileLine = bufferedReader.readLine()) != null) {
            StringBuilder inputFileLine = new StringBuilder();
            if (isPalindrome(outputFileLine)) {
                inputFileLine.append(String.format("%s is palindrome", outputFileLine));
            } else {
                inputFileLine.append(String.format("%s is not palindrome", outputFileLine));
            }
            writerInput.append(inputFileLine);
            writerInput.newLine();
        }
        writerInput.close();
    }

    //Task c
    public static void userDataInput() throws IOException {
        //file directory
        String currentDir = "C:\\Users\\borovik_o\\work";
        //scanner creating
        Scanner scanner = new Scanner(System.in);
        //file name
        System.out.println("Please, enter the file name:");
        String fileName = scanner.nextLine();
        //file creating
        File inputFile = new File(currentDir, String.format("%s.txt", fileName));
        BufferedWriter writerInput = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(inputFile.getAbsolutePath())));
        System.out.println("Please, enter the words:");
        while (true) {
            //user words reading
            String userWord = scanner.nextLine();
            if (userWord.equals("exit")) {
                break;
            } else {
                writerInput.append(userWord);
                writerInput.newLine();
            }
        }
        writerInput.close();
    }

}
