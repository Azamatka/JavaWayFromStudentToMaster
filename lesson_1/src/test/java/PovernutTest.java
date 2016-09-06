import org.junit.Assert;
import org.junit.Test;
import zadanie5.Povernut;
import static org.hamcrest.core.Is.is;

/**
 * PovernutTest  класс проверки поворота массива
 * @since 06.09.2016
 * @version 1
 */
public class PovernutTest {
@Test
    public void mustTurnMas(){
    int [][]simpArray={{2, 9 ,7}, {4, 3 ,2}, {6, 1 ,0}};
    int [] [] resArray={{7,2,0},{9,3,1},{2,4,6}};
    Povernut pov=new Povernut(3);
    pov.masPov(simpArray);
    Assert.assertThat(resArray,is(simpArray));
}
}