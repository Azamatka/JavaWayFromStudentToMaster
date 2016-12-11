package exercise2;
public class SubInput implements Input{
    private String[]answers;
    private int position=0;
    public SubInput(String[] answers){
        this.answers=answers;
    }
    public String ask(String question){
        return answers[position++];
    }

    @Override
    public long asklong(String question) {
        return 0;
    }

    @Override
    public int askint(String question) {
        return 0;
    }
}
