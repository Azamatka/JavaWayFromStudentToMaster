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
    /**
     *  @param calc новый объект класса Calculator
     */
    Calculator calc=new Calculator();
/**
* Умножение
* @param calc новый объект класса Calculator
* @param add прописываем входные параметры в новом объекте класса
* @param Assert проверяем  правильно ли работает наш метод add
*/
    @Test
    public void WhenMultiplyShouldMyltiply(){
        calc.add(8,4);
        Assert.assertThat(calc.result, is(32.0));
    }
	/**
* Вычитание
* @param calc новый объект класса Calculator
* @param add прописываем входные параметры в новом объекте класса
* @param Assert проверяем  правильно ли работает наш метод add1
*/
    @Test
    public void WhenMinusShouldMinus(){
        calc.add1(8,4);
        Assert.assertThat(calc.result, is(4.0));
    }
		/**
* Сложение
* @param calc новый объект класса Calculator
* @param add прописываем входные параметры в новом объекте класса
* @param Assert проверяем  правильно ли работает наш метод add2
*/
    @Test
    public void WhenPlusShouldPlus(){
        calc.add2(8,4);
        Assert.assertThat(calc.result, is(12.0));
    }
	/** Деление
* @param calc новый объект класса Calculator
* @param add прописываем входные параметры в новом объекте класса
* @param Assert проверяем  правильно ли работает наш метод add3
*/
    @Test
    public void WhenDivideShouldDivide(){
        calc.add3(8,4);
        Assert.assertThat(calc.result, is(2.0));
    }
}