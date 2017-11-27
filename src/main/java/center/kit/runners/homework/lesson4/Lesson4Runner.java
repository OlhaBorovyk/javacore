package center.kit.runners.homework.lesson4;

import center.kit.app.homework.lesson4.utils.convertors.PrimitiveConvertor;

public class Lesson4Runner {

    public static void main(String[] args) {

        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        float floatIn = 49.14f;
        char floatToCharResult = primitiveConvertor.floatToChar(floatIn);
        System.out.println("Input float value is " + floatIn + ". Output char value is " + floatToCharResult);

        int intIn = 65789;
        char intToCharResult = primitiveConvertor.intToChar(intIn);
        System.out.println("Input integer value is " + intIn + ". Output char value is " + intToCharResult);

        char charIn = 'A';
        int charToIntResult = primitiveConvertor.charToInt(charIn);
        System.out.println("Input char value is " + charIn + ". Output integer value is " + charToIntResult);


    }
}
