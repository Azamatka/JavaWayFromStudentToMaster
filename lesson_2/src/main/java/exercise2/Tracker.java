package exercise2;
import java.util.*;

import exercise2.models.Comment;
import exercise2.models.Item;
/**
 * Tracker класс  для методов и создания трекера
 * @since 24.11.2016
 * @version 1
 */
public class Tracker {
    public Item[] items = new Item[100];
    Item item=new Item();
    public Comment[] com = new Comment[100];
    private static final Random rn = new Random(100);
    int number = 0;
    int num = 0;

    /**
     * Метод addApp для добавления новой заявки в трекер
     */
    public Item addApp(Item item) {
        item.setId(this.generateId());
       //item.setComm(this.addComm(item.com));
        for (int i = 0; i <= items.length; i++) {
            if (items[i] == null) {
                number++;
                items[i] = item;
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
            if (item != null && item.getId() == id) {
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
     *
     * @param arraysCellNumber переменная номер заявки в массиве
     */
    public Item[] editApp(int arraysCellNumber, Item edittedApp) {
        Item[] result = new Item[number];
        for (int i = 0; i != number; i++) {
            if (i == arraysCellNumber) {
                this.items[i] = edittedApp;
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
    public Item[] getAll() {
        Item[] result = new Item[number];
        for (int i = 0; i < number; i++) {
            result[i] = this.items[i];
        }
        return result;

    }

    /**
     * Метод delApp  для удаления  заявки
     * @param arraysCellNumber переменная номер заявки в массиве
     */
    public Item[] delApp(int arraysCellNumber) {
        Item[] result = new Item[number];
        Item emptyItem = new Item();
        for (int i = 0; i != number; i++) {
            if (i == arraysCellNumber) {
                this.items[i] = emptyItem;

            }
        }
        return result;
    }
    /**
     * Метод addComm  метод для добавления комментария к заявке по  id
     * @param id айди заявки
     * @param comment комментарий
     */

     public Item addComm(int id,Comment comment) {
         for (int i = 0; i < com.length; i++) {
             if (com[i] == null) {
                 num++;
                 this.com[i] = comment;
                  item = this.findById(id);
                 item.setComm(comment);
                break;
             }
         }
         return item;
     }
    /**
     * Метод getAllComm  метод для вывода всех комментариев
     */

    public Comment[] getAllComm(){
        Comment[] result = new Comment[num];
        for(int i=0;i<=num;i++){
            result[i]=this.com[i];
        }
        return result;
    }
}


