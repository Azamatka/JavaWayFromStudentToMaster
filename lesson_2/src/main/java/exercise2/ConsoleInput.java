package exercise2;
 import java.util.*;
public class ConsoleInput  implements Input {
    Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public long asklong(String questions) {
        System.out.println(questions);
        return scanner.nextLong();

    }

}
