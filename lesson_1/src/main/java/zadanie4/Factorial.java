package zadanie4;
/**
 * Factorial класс для расчета факториала
 * @since 25.08.2016
 * @version 1
 */

public class Factorial {
    /**
     * Метод для вычисления факториала
     * @param x  переменная факториала, через которую будет задаваться значение
     */
    public  double fact(int x) {
        double d = 1;
        for (int i = 1; i <= x; i++) {
            d = i * d;
        }
        return d;
    }
}