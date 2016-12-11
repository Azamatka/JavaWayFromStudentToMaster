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
    private static final Random rn = new Random();
    int number = 0;


    /**
     * Метод addApp для добавления новой заявки в трекер
     */
    public Item addApp(Item item) {
        item.setId(this.generateId());
        item.setTime(this.dateTimer());
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
    public Item findById(long id) {
        Item result = null;
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return result;
    }

    /**
     * Метод findByName  для нахождения заявки по имени пользователя
     */
    public Item findByName(String name) {
       Item result = new Item();
        char[] subname = name.toCharArray();
        int count = 1;
        for (Item item : items) {
            if (item != null) {
                char[] names = item.getName().toCharArray();
                for (int i = 0; i <= names.length - subname.length; i++) {
                    if (subname[0] == names[i]) {
                        for (int k = 1; k < subname.length; k++) {
                            if (subname[k] == names[k + i]) {
                                count++;
                                if (count == subname.length) {
                                    return item;
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
     * edittedApp отредактированная заявка
     * @param id заявки
     */
    public Item   editApp(long id, Item edittedApp) {
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
    public Item delApp(long id) {
        for (int i = 0; i <number; i++) {
           if (items[i].getId()==id) {
                 items[i] = null;
                break;

            }
       }
        return null;
    }

    /**
     * Метод addComm  метод для добавления комментария к заявке по  id
     * @param id айди заявки
     * @param comment комментарий
     */

     public Item addComm(long id,Comment comment) {
         Item item = findById(id);
         item.addComm(comment);
         return item;
     }
    public long generateId(){
        return System.currentTimeMillis()+rn.nextInt(100);
    }
    public long dateTimer(){
        return System.currentTimeMillis();
    }

}



