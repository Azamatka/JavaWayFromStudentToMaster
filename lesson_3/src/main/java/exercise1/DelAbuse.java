package exercise1;

import java.io.*;
import java.util.Scanner;



/**
 * DelAbuse  delete words which includes abuse Array
 * @since 04.03.2017
 * @version 1
 */
public class DelAbuse {
    /**
     * dropAbuses  method deletes words which includes abuse Array
     * @since 04.03.2017
     * @param in is IputStream
     * @param out is OutputStream
     * @param abuse array of words
     * @version 1
     */
    public void dropAbuses(InputStream in, OutputStream out, String[] abuse) throws IOException {
        Scanner scanner = new Scanner(in);
        String streamWords = scanner.nextLine();
        String[] s = streamWords.split(" ");
        try (BufferedOutputStream outputStream = new BufferedOutputStream(out)) {
            for (String word : s) {
                int num = 0;
                for (String abuses : abuse) {
                        if (!word.equals(abuses) && ++num == abuse.length) {
                            outputStream.write(word.getBytes());
                            outputStream.write(32);
                        }
                    }
                }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}



