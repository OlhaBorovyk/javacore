package center.kit.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class MathFunctionsTests {
    @Test
    public void multiplyTest() {
        int firstNum = 4;
        int secondNum = 5;
        int expRes = 20;
        int actRes = MathFunctions.multiply(firstNum, secondNum);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void multipleNegativeTest() {
        int firstNum = 5, secondNum = 67, expRes = 34;
        int actRes = MathFunctions.multiply(firstNum, secondNum);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void divisionTest() {
        int firstNum = 10;
        int secondNum = 5;
        int expRes = 2;
        int actRes = MathFunctions.division(firstNum, secondNum);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void sumTest() {
        int firstNum = 56;
        int secondNum = 32;
        int expRes = 1792;
        int actRes = MathFunctions.sum(firstNum, secondNum);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void subTest() {
        int firstNum = 79;
        int secondNum = 29;
        int expRes = 50;
        int actRes = MathFunctions.sub(firstNum, secondNum);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void trapeziumAreaTest() {
        int firstParallelSide = 16;
        int secondParallelSide = 28;
        int perpDistance = 5;
        int expRes = 110;
        double actRes = MathFunctions.trapeziumArea(firstParallelSide, secondParallelSide, perpDistance);
        Assert.assertEquals(expRes, actRes, 1);
    }

    @Test
    public void circleAreaTest() {
        int radius = 58;
        double expRes = 10562.96d;
        double actRes = MathFunctions.circleArea(radius);
        Assert.assertEquals(expRes, actRes, 2);
    }

    @Test
    public void circleAreasComparisonTest() {
        int firstRadius = 67;
        int secondRadius = 14;
        boolean actRes = MathFunctions.circleAreasComparison(firstRadius, secondRadius);
        Assert.assertTrue(actRes);
    }

    @Test
    public void circleAreasComparisonNegTest() {
        int firstRadius = 128;
        int secondRadius = 567;
        boolean actRes = MathFunctions.circleAreasComparison(firstRadius, secondRadius);
        Assert.assertFalse(actRes);
    }

    @Test
    public void sumOfNumbersTest() {
        int numIn = 598;
        int expRes = 616;
        int actRes = MathFunctions.sumOfNumbers(numIn);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void nullCompTest() {
        int firstNum = 25;
        int secondNum = 16;
        Assert.assertNull(MathFunctions.nullComp(firstNum, secondNum));
    }

    @Test
    public void nullCompNegTest() {
        int firstNum = 45;
        int secondNum = 67;
        Assert.assertNotNull(MathFunctions.nullComp(firstNum, secondNum));
    }

    @Test
    public void sumOfThreeNumsTest() {
        double firstNum = 456.098d;
        double secondNum = 7658.345d;
        double thirdNum = 58756.54d;
        double expRes = 66870.983d;
        double actRes = MathFunctions.sumOfThreeNums(firstNum, secondNum, thirdNum);
        Assert.assertEquals(expRes, actRes, 3);
    }

    @Test
    public void multipleOfFourNumbersTest() {
        double firstNum = 365.5d;
        double secondNum = 12.568d;
        double thirdNum = 67.009d;
        double fourthNum = 0.2d;
        double expRes = 61562.5620872d;
        double actRes = MathFunctions.multipleOfFourNumbers(firstNum, secondNum, thirdNum, fourthNum);
        Assert.assertEquals(expRes, actRes, 7);
    }

    @Test
    public void triangleAreaTest() {
        int sideLenght = 70;
        double height = 56;
        String expRes = "OK, it's a big triangle.";
        String actRes = MathFunctions.triangleArea(sideLenght, height);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void triangleAreaSecTest() {
        int sideLenght = 56;
        double height = 34;
        String unExpRes = "Nooooooooo!!!!!";
        String actRes = MathFunctions.triangleArea(sideLenght, height);
        Assert.assertNotEquals(unExpRes, actRes);
    }

    @Test
    public void userLoginCredentialsTest() {
        String email = "good_user@gmail.com";
        String password = "111111";
        String expRes = "good_user@gmail.com/111111";
        String actRes = MathFunctions.userLoginCredentials(email, password);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void subOfThreeNumsTest() {
        int firstNum = 4598, secondNum = 567, thirdNum = 67;
        int expRes = firstNum - secondNum - thirdNum;
        int actRes = MathFunctions.subOfThreeNums(firstNum, secondNum, thirdNum);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void absOfnumberTest() {
        double num = -567.05d;
        Assert.assertEquals(567.05d, MathFunctions.absOfnumber(num), 2);
    }

    @Test
    public void wordsComparisonTest() {
        String firstString = "Lalaland";
        String secondString = "OK";
        boolean expRes = true;
        Assert.assertTrue(MathFunctions.wordsComparison(firstString, secondString));
    }
}
