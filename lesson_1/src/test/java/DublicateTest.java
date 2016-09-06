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
    public void dublicateMustBeDeleted(){
        Dublicate dub=new Dublicate();
        String [] res={"Привет", "Привет","Петр", "задание", "Петр","выполнено", "верно", "задание"};
        dub.delDublicate(res);
    String [] res1={"Привет"," ","Петр","задание"," ","выполнено","верно"," "};
    Assert.assertThat(res1,is(res));
    }
}

