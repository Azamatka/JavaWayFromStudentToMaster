package zadanie5;
/**
 * Bubble  класс для  сортировки массива методом пузыря
 * @since 06.09.2016
 * @version 1
 */
public class Bubble {
    /**
     * bubbleSort метод для  сортировки массива методом пузыря
     * @param values массив переменная, через которую будут задаваться значения
     */
    public int [] bubbleSort(int [] values){
        for(int a=values.length-1;a>0;a--){
            for(int b=0;b<a;b++){
                if(values[b]>values[b+1]){
                    int num=values[b];
                    values[b]=values[b+1];
                    values[b+1]=num;
                }
            }
        }
        return values;
    }
}
