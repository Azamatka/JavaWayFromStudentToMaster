package zadanie5;
import java.util.Arrays;
/**
 * Dublicate класс для  удаления дубликатов из массива
 * @since 06.09.2016
 * @version 1
 */

public class Dublicate {
    /**
     * delDublicate метод для  удаления дубликатов из массива
     * @param args массив переменная, через которую будет задаваться значение
     */
    public String[] delDublicate(String[] args) {
        for (int i = args.length - 1; i > 0; i--) {
            StringBuffer result = new StringBuffer();
            result.append(args[i]);
            String res = result.toString();
            for (int j = 0; j < args.length; j++) {
                StringBuffer esult = new StringBuffer();
                esult.append(args[j]);
                String re = esult.toString();
                if (res.equals(re)) {
                    if (j != i) {
                        args[i] = " ";
                    }
                }
            }
        }
        return args;
    }
}