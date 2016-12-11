package exercise2;
 import java.util.*;
public class ConsoleInput  implements Input {


    public String ask(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextLine();
    }

    public long asklong(String questions) {
        Scanner scann = new Scanner(System.in);
        System.out.println(questions);
        return scann.nextLong();

    }
    public int askint(String quest) {
        Scanner scann = new Scanner(System.in);
        System.out.println(quest);
        return scann.nextInt();
    }

}
