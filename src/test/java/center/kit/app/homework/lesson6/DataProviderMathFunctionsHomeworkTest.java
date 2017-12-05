package center.kit.app.homework.lesson6;

import center.kit.app.homework.lesson5.MathFunctions;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class DataProviderMathFunctionsHomeworkTest {
    @Test
    @FileParameters(value = "src/test/resources/divisiontestdata.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderDivisionTest(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathFunctions.division(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/sumtestdata.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderSumTest(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathFunctions.sum(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/circleareastestdata.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderCircleAreasComparisonTestAdd(int argA, int argB) {
        Assert.assertFalse(MathFunctions.circleAreasComparison(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/nullcomptestdata.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderNullComparisonTestAdd(int argA, int argB) {
        Assert.assertNull(MathFunctions.nullComp(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/subtestdata.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderSubTestAdd(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathFunctions.sub(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/wordscomptestdata.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderWordsComparisonTestAdd(String argA, String argB) {
        Assert.assertTrue(MathFunctions.wordsComparison(argA, argB));
    }
}
