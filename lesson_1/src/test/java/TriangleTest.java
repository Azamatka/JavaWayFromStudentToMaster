import org.junit.Test;
import zadanie3.Point;
import zadanie3.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * TriangleTest класс для проверки вычисления площади треугольника
 * @author Azamat
 * @since 14.08.2016
 * @version 1
 */
public class TriangleTest {
    @Test
    public void whenCalculateAreaMustBeRight(){
        final Triangle tr= new Triangle(new Point(1, 2), new Point(2, 1), new Point(4, 6));
        assertThat(tr.area(), is(3.5));
    }
    @Test(expected=IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        final Triangle tr= new Triangle(new Point(1,1), new Point(1, 1), new Point(4, 3));
        tr.area();
    }
    }

