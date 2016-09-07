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
     *
     * @param args массив переменная, через которую будет задаваться значение
     */
    public String[] delDublicate(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null) {
                for (int j = i + 1; j < args.length; j++) {
                    if (args[j] != null) {
                        if (args[j].equals(args[i])) {
                            for (int j1 = j; j1 < args.length - 1; j1++) {
                                args[j1] = args[j1 + 1];
                            }
                            args[args.length - 1] = null;
                        }

                    }

                }

            }

        }
        return args;
    }
}