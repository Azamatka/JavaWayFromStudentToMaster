import org.junit.Assert;
import org.junit.Test;
import zadanie3.Point;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * PointTest  класс для проверки расчета расстояния между точками
 * @author Azamat
 * @since 14.08.2016
 * @version 1
 */
public class PointTest {
    @Test
    public void distanceMustBeRight()  {
        final Point p1=new Point(1,1);
        final Point p2=new Point(4,5);
        double res= 5.0;
                double tres=p1.distanceTo(p2);
        Assert.assertThat(res,is(tres));
    }

}