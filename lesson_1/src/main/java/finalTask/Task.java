package finalTask;
/**
 * Task  класс для  проверки, содержания строки sub в строке origin
 * @since 18.09.2016
 * @version 1
 */
public class Task {
    /**
     * contains метод для  проверки, содержания строки sub в строке origin
     * @param  origin оригинальная строка
     * @param sub сравниваемая строка
     */
    public boolean contains(String origin, String sub) {
        char[] orig = origin.toCharArray();
        char[] su = sub.toCharArray();
        int count=1;
        boolean result=false;
        for (int i = 0; i <=orig.length-su.length; i++) {
            if (su[0]==orig[i]){
            for (int k = 1; k < su.length; k++) {
                if (su[k]==orig[k+i]) {
                    count++;
                         if(count==su.length){
                             result=true;
                         }

                    }
                }
                    }
                }

        return result;
    }
}