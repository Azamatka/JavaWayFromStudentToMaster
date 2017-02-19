package exercise1;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

/**
 * CheckTest  checks Check class  if it works correctly
 * @since 19.02.2017
 * @version 1
 */
public class CheckTest {
    @Test
    public void mustBeTrue() throws Exception {
        Check ch = new Check();
        String nums="12";
        InputStream stream = new ByteArrayInputStream(nums.getBytes());
        Assert.assertTrue(ch.isNumber(stream));
    }
    @Test
    public void mustBeFalse() throws Exception {
        Check ch = new Check();
        String nums="11";
        InputStream stream = new ByteArrayInputStream(nums.getBytes());
        Assert.assertFalse(ch.isNumber(stream));
    }
}