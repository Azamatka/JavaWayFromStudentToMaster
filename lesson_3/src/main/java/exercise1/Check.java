package exercise1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;



/**
 * Check class checks stream to parity
 * @since 19.02.2017
 * @version 1
 */
public class Check {

    /**
     * Method boolean returns true or false
     * @param in-  is input stream parameter
     */
    public boolean isNumber(InputStream in) throws IOException {
        try (ByteArrayOutputStream result = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) != -1) {
                result.write(buffer, 0, length);
            }
            String res = result.toString("UTF-8");
            int number = Integer.parseInt(res);
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}



