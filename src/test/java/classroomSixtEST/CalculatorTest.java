package classroomSixtEST;

import classroomSix.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class CalculatorTest {

    private Calculator calculator;


    @BeforeClass
    public void setUp() {
        System.out.println("This executes before each class");
        calculator = new Calculator();
    }

    @BeforeTest
    public void beforeEachTest() {
        System.out.println("This is executed before each Test");
    }

    @AfterTest
    public void afterEachTest() {
        System.out.println("This is executed after each Test");
    }


    @Test
    public void testAddition() {
        System.out.println("----- START OF Verify function testSum in CalculatorTestSuccessful class -------------");
        int result = calculator.addition(3, 6);
        Assert.assertEquals(9, result);
        System.out.println("----- END OF Verify function testSum in CalculatorTestSuccessful class -------------");
    }


    @Test
    public void testSubtraction() {
        int result = calculator.subtraction(3, 6);
        Assert.assertEquals(-3, result);
        result = calculator.subtraction(6, 3);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testMultiplication() {
    }

    @Test
    public void testDivision() {
    }


}