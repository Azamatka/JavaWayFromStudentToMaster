package exercise2;
/**
 * Интерфейс для  MenuTracker
 */
public interface  UserAction {
    int key();
    void execute(Input input,Tracker tracker);
    String info();
}
