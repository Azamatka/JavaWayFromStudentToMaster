import org.junit.Assert;
import org.junit.Test;
import zadanie5.Dublicate;
import static org.hamcrest.core.Is.is;

/**
 * DublicateTest  класс проверки выявления дубликатов
 * @since 06.09.2016
 * @version 1
 */
public class DublicateTest {
@Test
    public void dublicatesMustBeDeleted(){
        Dublicate dub=new Dublicate();
        String [] res={"Hello", "Hello","exercises", "done", "correctly","exercises", "?", "done"};
        dub.delDublicate(res);
    String [] res1={"Hello", "exercises", "done", "correctly", "?", null, null, null};
    Assert.assertThat(res1,is(res));
    }
}

