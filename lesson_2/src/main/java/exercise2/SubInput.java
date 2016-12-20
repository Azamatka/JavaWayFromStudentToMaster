package exercise2;
/**
 * SubInput класс наследующий интерфейс адаптированный под автоматический ввод через стринговый массив
 * @since 20.12.2016
 * @version 1
 */
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

    }

