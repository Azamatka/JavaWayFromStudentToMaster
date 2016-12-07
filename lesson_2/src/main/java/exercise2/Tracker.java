package exercise2;
import java.util.*;

import exercise2.models.Comment;
import exercise2.models.Item;
/**
 * Tracker класс  для методов и создания трекера
 * @since 24.11.2016
 * @version 1
 */
public class Tracker extends Item {
    public Item[] items = new Item[100];
    private static final Random rn = new Random(100);
    int number = 0;


    /**
     * Метод addApp для добавления новой заявки в трекер
     */
    public Item addApp(Item item) {
        item.setId(this.generateId());
        for (int i = 0; i <= items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                number++;
                break;
            }
        }
        return item;
    }

    /**
     * Метод findById  для нахождения заявки по айди
     */
    public Item findById(int id) {
        Item result = null;
        for (Item item : items) {
            if (item.getId() == id) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Метод findByName  для нахождения заявки по имени пользователя
     */
    public boolean findByName(String name) {
        boolean result = false;
        char[] subname = name.toCharArray();
        int count = 1;
        for (Item item : items) {
            if (item != null) {
                char[] names = items[0].getName().toCharArray();
                for (int i = 0; i <= names.length - subname.length; i++) {
                    if (subname[0] == names[i]) {
                        for (int k = 1; k < subname.length; k++) {
                            if (subname[k] == names[k + i]) {
                                count++;
                                if (count == subname.length) {
                                    result = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    /**
     * Метод editApp  для редактирования заявки
     * edittedApp редактируемая заявка
     * @param id заявки
     */
    public Item   editApp(int id, Item edittedApp) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getId()==id) {
               items[i] = edittedApp;
                 break;
            }
        }
        return edittedApp;
    }
    /**
     * Метод generateId  для генерации случайных чисел для присвоения уникального айди заявке
     */
    long generateId() {

        return rn.nextLong() + System.currentTimeMillis();
    }

    /**
     * Метод getAll  для выведения всех заявок
     */
    public Item[] getAll() {
        Item[] result = new Item[number];
        for (int i = 0; i <=number; i++) {
            if (items[i] != null) {
                result[i] = items[i];
            }
        }
        return result;

    }

    /**
     * Метод delApp  для удаления  заявки
     * @param id заявки
     */
    public Item delApp(int id) {
        Item emptyItem = new Item();
        for (int i = 0; i <number; i++) {
           if (items[i].getId()==id) {
                 items[i] = emptyItem;
                break;

            }
       }
        return emptyItem;
    }

    /**
     * Метод addComm  метод для добавления комментария к заявке по  id
     * @param id айди заявки
     * @param comment комментарий
     */

     public Item addComm(int id,Comment comment) {
         Item item = findById(id);
         item.addComm(comment);
         return item;
     }
    /**
     * Метод getAllComm  метод для вывода всех комментариев
     * @param id айди заявки
     */

    public Comment[] getAllComm(int id){
        Comment[] result = findById(id).getComm();
        return result;
    }
}



