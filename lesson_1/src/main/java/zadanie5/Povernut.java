package zadanie5;
/**
 * Povernut класс для  поворота массива
 * @since 06.09.2016
 * @version 1
 */
public class Povernut {
    int i;
    int j;
    int s;
    /**
     * Povernut метод конструктор для передачи длины массива
     */
    public Povernut(int s) {

        this.s = s;
    }
    /**
     *  masPov метод для  поворота массива
     * @param x массив переменная, через которую будут задаваться значения
     */
    public int[][] masPov(int[][] x) {
        for ( i = 0; i < s / 2; i++) {
            for (j = i; j < s - 1 - i; j++) {
                int res = x[i][j];
                x[i][j] = x[j][s - i - 1];
                x[j][s - i - 1] = x[s - 1 - i][s - 1 - j];
                x[s - 1 - i][s - 1 - j] = x[s - 1 - j][i];
                x[s - j - 1][i] = res;

            }
        }
        return x;
    }
}

