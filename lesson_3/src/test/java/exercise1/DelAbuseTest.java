package exercise1;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static org.hamcrest.core.Is.is;
/**
 * DelAbuseTest test which checks if programm  do delete words works correctly
 * @since 04.03.2017
 * @version 1
 */
public class DelAbuseTest {
    @Test
    public void mustDropAbuses() throws Exception {
            DelAbuse abb=new DelAbuse();
            String[]abbuse={"toDelete", "mustDel", "willDel", "haveToDel", "del"};
            String streamText="toDelete hello world mustDel willDel haveToDel programm del";
            InputStream stream = new ByteArrayInputStream(streamText.getBytes());
            String str="hello world programm ";
              OutputStream outt=new ByteArrayOutputStream();
              abb.dropAbuses(stream,outt,abbuse);
             Assert.assertThat(outt.toString(),is(str));
        }
    }

