import org.junit.Assert;
import org.junit.Test;
import zadanie3.Point;
import zadanie3.MaxLenght;
import zadanie3.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * MaxNumTest  класс проверки вычисления  самой длинной стороны треугольника
 * @since 14.08.2016
 * @version 1
 */
public class MaxLenghtTest {
    @Test
    public void maxSideShouldBeRight() {
Triangle tr = new Triangle(new Point(5,7),new Point(-4,-5),new Point(-4,6));
        MaxLenght m=new MaxLenght();
        double res=15.0;
        Assert.assertThat(res,is(m.max(tr)));
    }
}