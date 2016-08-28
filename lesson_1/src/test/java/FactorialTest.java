import org.junit.Assert;
import org.junit.Test;
import zadanie4.Factorial;
import static org.hamcrest.core.Is.is;

/**
 * FactorialTest  класс проверки вычисления  факториала
 * @since 25.08.2016
 * @version 1
 */
public class FactorialTest {
    @Test
    public void factorialMustCalculate() {
        Factorial factor=new Factorial();
       double y= factor.fact(6);
        double x=720;
        Assert.assertThat(y,is(x));
    }

}