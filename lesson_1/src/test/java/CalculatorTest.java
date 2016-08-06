import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class CalculatorTest {
    @Test
    public void WhenMultiplyShouldMyltiply(){
        Calculator calc=new Calculator();
        calc.add(8,4);
        Assert.assertThat(calc.result, is(32.0));
    }
    @Test
    public void WhenMinusShouldMinus(){
        Calculator calc=new Calculator();
        calc.add1(8,4);
        Assert.assertThat(calc.result, is(4.0));
    }
    @Test
    public void WhenPlusShouldPlus(){
        Calculator calc=new Calculator();
        calc.add2(8,4);
        Assert.assertThat(calc.result, is(12.0));
    }
    @Test
    public void WhenDivideShouldDivide(){
        Calculator calc=new Calculator();
        calc.add3(8,4);
        Assert.assertThat(calc.result, is(2.0));
    }
}