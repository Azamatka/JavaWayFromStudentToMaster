package exercise2;
 import java.util.*;
/**
 * ConsoleInput класс наследующий интерфейс адаптированный под ввод с консоли
 * @since 20.12.2016
 * @version 1
 */
public class ConsoleInput  implements Input {


    public String ask(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextLine();
    }


}
