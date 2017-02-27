package exercise1;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

//import static java.lang.System.out;
import static org.hamcrest.core.Is.is;

/**
 * Created by Mur on 26.02.2017.
 */
public class DelAbuseTest {
    @Test
    public void dropAbuses() throws Exception {
            DelAbuse abb=new DelAbuse();
            String[]abbuse={"toDelete", "mustDel", "willDel", "haveToDel", "del"};
            String streamText="toDelete  hello world mustDel  willDel haveToDel programm del";
            InputStream stream = new ByteArrayInputStream(streamText.getBytes());
            String str="  hello world     programm ";
           OutputStream outt=new ByteArrayOutputStream();
              abb.dropAbuses(stream,outt,abbuse);
             Assert.assertThat(outt.toString(),is(str));
        }
    }

