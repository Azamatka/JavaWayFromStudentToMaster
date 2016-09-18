import finalTask.Task;
import org.junit.Assert;
import org.junit.Test;
/**
 * TaskTest  класс проверки содержания подстроки в строке оригинальной
 * @since 18.09.2016
 * @version 1
 */
public class TaskTest {

    @Test
    public void originMustContainSub() throws Exception {
        Assert.assertTrue(new Task().contains("notsubOriginnotsub","Origin"));
    }

    @Test
    public void originDoesntContainSub() throws Exception {
        Assert.assertFalse(new Task().contains("Oritgin","Origin"));
    }
}
