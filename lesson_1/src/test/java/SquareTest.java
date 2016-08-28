import zadanie4.Square;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

/**
 * SquareTest  класс проверки вычисления  квадратного уравнения
 * @since 25.08.2016
 * @version 1
 */
public class SquareTest extends OutTest{
    @Test
    public void mustCalculate(){
        Square square=new Square(5,7,9);
        float sqr= square.calculate(2);
        float res=43;
        Assert.assertThat(res,is(sqr));
    }
    @Test
    public void stepCalculatr(){
        Square square=new Square(9,7,5);
        square.show(1,5,2);
        Assert.assertThat("21.0\r\n107.0\r\n", is(output.toString()));

            }
        }


