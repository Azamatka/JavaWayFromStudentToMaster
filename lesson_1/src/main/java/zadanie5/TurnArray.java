package zadanie5;
/**
 * TurnArray класс для  поворота массива
 * @since 06.09.2016
 * @version 1
 */
public class TurnArray {
    /**
     *  arrayTurn метод для  поворота массива
     * @param x массив переменная, через которую будут задаваться значения
     */
    public int[][] arrayTurn(int[][] x) {
        int i=0;
        for ( int j = i; j < x.length - 1 - i; j++) {
                int res = x[i][j];
                x[i][j] = x[j][x.length - i - 1];
                x[j][x.length - i - 1] = x[x.length - 1 - i][x.length - 1 - j];
                x[x.length - 1 - i][x.length - 1 - j] = x[x.length - 1 - j][i];
                x[x.length - j - 1][i] = res;

            }
        return x;
        }

    }


