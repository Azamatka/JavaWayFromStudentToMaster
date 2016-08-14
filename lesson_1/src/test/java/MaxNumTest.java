import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * MaxNumTest  класс проверки вычисления  самой длинной стороны треугольника
 * @since 14.08.2016
 * @version 1
 */
public class MaxNumTest {
    @Test
    public void maxSideShouldBeRight() {
MaxNum tr = new MaxNum(new Point(5,7),new Point(-4,-5),new Point(-4,6));
        double abc=tr.max();
        double res=15.0;
        Assert.assertThat(res,is(abc));
    }
}