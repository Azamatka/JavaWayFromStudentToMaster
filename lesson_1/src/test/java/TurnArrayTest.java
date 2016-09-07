import org.junit.Assert;
import org.junit.Test;
import zadanie5.TurnArray;
import static org.hamcrest.core.Is.is;

/**
 * TurnArrayTest  класс проверки поворота массива
 * @since 06.09.2016
 * @version 1
 */
public class TurnArrayTest {
@Test
    public void mustTurnArray(){
    int [][]simpArray={{2, 9 ,7}, {4, 3 ,2}, {6, 1 ,0}};
    int [] [] resArray={{7,2,0},{9,3,1},{2,4,6}};
    TurnArray turn=new TurnArray();
    turn.arrayTurn(simpArray);
    Assert.assertThat(resArray,is(simpArray));
}
}