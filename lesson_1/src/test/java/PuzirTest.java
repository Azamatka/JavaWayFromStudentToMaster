import org.junit.Assert;
import org.junit.Test;
import zadanie5.Puzir;
import static org.hamcrest.core.Is.is;
/**
 * PuzirTest  класс проверки сортировки методом пузыря
 * @since 06.09.2016
 * @version 1
 */
public class PuzirTest {
@Test
public void puzirMustSortArray(){
    Puzir puz=new Puzir();
    int []res={0,9,1,2,3,5,6,7,8,4};
    puz.puzirSort(res);
    int []res1={0,1,2,3,4,5,6,7,8,9};
    Assert.assertThat(res,is(res1));
}
}