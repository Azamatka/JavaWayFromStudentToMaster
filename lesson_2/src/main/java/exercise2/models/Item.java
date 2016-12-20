package exercise2.models;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;
/**
 * Item класс заявка
 * @since 20.12.2016
 * @version 1
 */
public class Item extends Comment {
    public String name;
    public String description;
    long dateTime;
    public Comment[] com=new Comment[100];
    long id;



    public Item() {

    }
    /**
     * Item конструктор заявка
     * @param  name имя заявки
     *  @param  description описание заявки
     *  @param  dateTime  дата создания заявки
     *  @param  id цникальный id заявки
     *  @param com массив комментариев для заявки
     * @since 20.12.2016
     * @version 1
     */
    public Item(String name, String description,long dateTime, long id, Comment[]  com) {
        this.name = name;
        this.description = description;
        this.dateTime = dateTime;
        this.id = id;
        this.com = com;

    }


    public String getName() {
        return this.name;
    }

    public Comment[] getComm() { return this.com;}

    public String getDesc() {
        return this.description;
    }

    public long getDate() {
        return this.dateTime;
    }
    public void setId(long id){this.id=id;}
    public void setTime(long time){this.dateTime=time;}
    /**
     * Comment вспомогательный метод для добавления комментариев
     * @param comment комментарий типа Comment
     * @since 20.12.2016
     * @version 1
     */

    public Comment  addComm(Comment comment){
        for (int i = 0; i < com.length; i++) {
            if (this.com[i] == null) {
                this.com[i] = comment;
                break;
            }
        }
        return comment;
    }
    /**
     * getAllComm  метод для получения всех комментариев
     * @since 20.12.2016
     * @version 1
     */
    public Comment[] getAllComm() {
        Comment[] result = getComm();
        return result;
    }
    public long getId() {
        return this.id;
    }



    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (dateTime != item.dateTime) return false;
        if (id != item.id) return false;
        if (name != null ? !name.equals(item.name) : item.name != null) return false;
        if (description != null ? !description.equals(item.description) : item.description != null) return false;
        return Arrays.equals(com, item.com);

    }

    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) (dateTime ^ (dateTime >>> 32));
        result = 31 * result + Arrays.hashCode(com);
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dateTime=" + dateTime +
                ", com=" + Arrays.toString(com) +
                ", id=" + id +
                '}';
    }
}

