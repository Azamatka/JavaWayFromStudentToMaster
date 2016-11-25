package exercise2;
import java.util.*;
import exercise2.models.Item;
/**
 * Tracker класс  для методов и создания трекера
 * @since 24.11.2016
 * @version 1
 */
public class Tracker {
    public Item[] items = new Item[100];
    private int position = 0;
    private static final Random rn = new Random(100);
    /**
     * Метод addItem  для добавления новой заявки в трекер
     */
    public Item addItem(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }
    /**
     * Метод findById  для нахождения заявки по айди
     */
    public Item findById(int id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId() == id) {
                result = item;
                break;
            }
        }
        return result;
    }
    /**
     * Метод ffindByName  для нахождения заявки по имени пользователя
     */
    public Item findByName(String name) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getName().equals(name)) {
                result = item;
                break;
            }
        }
        return result;
    }
    /**
     * Метод editApp  для нахождения заявки по имени пользователя
     * @param a  переменная номер заявки в массиве
     */
    public Item[] editApp(int a, Item itm) {
        Item[] result = new Item[this.position];
        for (int i = 0; i != this.position; i++) {
            if (i == a) {
                this.items[i] = itm;
            }
        }
        return result;
    }

    /**
     * Метод generateId  для генерации случайных чисел для присвоения уникального айди заявке
     */
long generateId() {
        return rn.nextLong() + System.currentTimeMillis();
    }
    /**
     * Метод showAllApp  для выведения всех заявок
     */
    public Item[] showAllApp() {
        Item[] result = new Item[this.position];
        for (int i = 0; i != this.position; i++) {
            result[i] = this.items[i];
        }
        return result;

    }
    /**
     * Метод delApp  для удаления  заявки
     * @param b  переменная номер заявки в массиве
     */
    public Item[] delApp(int b) {
        Item[] result = new Item[this.position];
        Item it=new Item();
        for (int i = 0; i != this.position; i++) {
            if (i == b) {
                this.items[i] = it;

            }
        }
        return result;
    }
}
