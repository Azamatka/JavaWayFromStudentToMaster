import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
* CalculatorTest класс для проверки вычисления арифмитеческих операций: + - *  и /
* @author Azamat
* @since 6.08.2016
* @version 1
*/
public class CalculatorTest{
   
    Calculator calc=new Calculator();
/**
* Умножение
*/
    @Test
    public void whenMultiplyShouldMyltiply(){
        calc.add(8,4);
        Assert.assertThat(calc.result, is(32.0));
    }
	/**
* Вычитание

*/
    @Test
    public void whenMinusShouldMinus(){
        calc.add1(8,4);
        Assert.assertThat(calc.result, is(4.0));
    }
		/**
* Сложение

*/
    @Test
    public void whenPlusShouldPlus(){
        calc.add2(8,4);
        Assert.assertThat(calc.result, is(12.0));
    }
	/** Деление

*/
    @Test
    public void whenDivideShouldDivide(){
        calc.add3(8,4);
        Assert.assertThat(calc.result, is(2.0));
    }
}