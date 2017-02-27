package exercise1;

import java.io.*;


/**
 * Created by Mur on 21.02.2017.
 */
public class DelAbuse {
   public void dropAbuses(InputStream in, OutputStream out, String[] abuse)throws IOException {
       try (ByteArrayOutputStream result = new ByteArrayOutputStream()) {
           byte[] buffer = new byte[1024];
           int length;
           while ((length = in.read(buffer)) != -1) {
               result.write(buffer, 0, length);
           }
           String res = result.toString("UTF-8");
           char[] streamText = res.toCharArray();
           for (String words : abuse) {
               int count=1;
               char[]abuses=words.toCharArray();
               for (int i = 0; i <= streamText.length - abuses.length; i++) {
                   if (abuses[0] == streamText[i]) {
                       for (int k = 1; k < abuses.length; k++) {
                           if (abuses[k] == streamText[k + i]) {
                               count++;
                               if (count == abuses.length) {
                                   for(int d=0;d<abuses.length;d++) {
                                       streamText[i+d] = '\u0000';
                                   }
                               }
                           }
                       }
                   }
               }
           }
               String str = String.valueOf(streamText);
           System.out.println(str);
               out.write(str.getBytes("UTF-8"));
           }

       }
   }


