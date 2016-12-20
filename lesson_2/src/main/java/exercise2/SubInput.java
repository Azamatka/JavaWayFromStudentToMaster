package exercise2;

import java.util.Arrays;

public class SubInput implements Input{
    private String[]answers;
    private int position=0;
    public SubInput(String[] answers){
        this.answers=answers;
    }
    public String ask(String question){
        System.out.println(question);
        System.out.println(answers[position]);
        return answers[position++];
    }

    public long asklong(String question) {
        System.out.println(question);
        return 0 ;
    }

    public int askint(String question) {
        System.out.println(question);
        return 0;
    }
}
