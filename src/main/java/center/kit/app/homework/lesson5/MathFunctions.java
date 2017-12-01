package center.kit.app.homework.lesson5;

public class MathFunctions {
    //1 - multiply of two numbers
    public static int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    //2 - division of two numbers
    public static int division(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    //3 - sum of two numbers
    public static int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    //4 - substraction of two numbers
    public static int sub(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    //5 - trapezium area
    public static double trapeziumArea(int firstParallelSide, int secondParallelSide, int perpDistance) {
        double trapeziumArea = 0.5 * (firstParallelSide + secondParallelSide) * perpDistance;
        return trapeziumArea;
    }

    //6 - circle area
    public static double circleArea(int radius) {
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }

    //7 - circle areas comparison
    public static boolean circleAreasComparison(int firstCircleRadius, int secondCircleRadius) {
        double firstCircleArea = Math.PI * (firstCircleRadius ^ 2);
        double secondCircleArea = Math.PI * (secondCircleRadius ^ 2);
        if (firstCircleArea > secondCircleArea) {
            return true;
        } else return false;
    }

    //8 - sum of numbers
    public static int sumOfNumbers(int numIn) {
        int x = 0;
        while (x < 9) {
            numIn = numIn + 2;
            x++;
        }
        return numIn;
    }

    //9 - comparison
    public static Object nullComp(int firstNum, int secondNum) {
        int firstNumFunc = firstNum ^ firstNum;
        int secondNumFunc = secondNum ^ secondNum;
        if (firstNumFunc < secondNumFunc) {
            return null;
        } else return "Hello!";
    }

    //10 - sum of three numbers
    public static double sumOfThreeNums(double firstNum, double secondNum, double thirdNum) {
        return firstNum + secondNum + thirdNum;
    }

    //11 - multiple of four numbers
    public static double multipleOfFourNumbers(double firstNum, double secondNum, double thirdNum, double fourthNum) {
        return firstNum * secondNum * thirdNum * fourthNum;
    }

    //12 - triangle area
    public static String triangleArea(int sideLenght, double height) {
        double triangleArea = 0.5 * sideLenght * height;
        if (triangleArea > 200) {
            return "OK, it's a big triangle.";
        } else return "Small triangle.";
    }

    //13 - user login credentials approving
    public static String userLoginCredentials(String email, String password) {
        String userCredentials = String.join("/", email, password);
        return userCredentials;
    }

    //14 - substraction of three numbers
    public static int subOfThreeNums(int firstNum, int secondNum, int thirdNum) {
        return firstNum - secondNum - thirdNum;
    }

    //15 - abs of number
    public static double absOfnumber(double num) {
        return Math.abs(num);
    }

    //16 - wrods comparison
    public static boolean wordsComparison(String firstString, String secondString) {
        if (firstString.length() > secondString.length()) {
            return true;
        } else return false;
    }
}
