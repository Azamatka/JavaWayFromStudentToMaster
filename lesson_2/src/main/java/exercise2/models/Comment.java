package exercise2.models;
/**
 * Comment класс для создания комментариев к заявке
 * @since 24.11.2016
 * @version 1
 */
public class Comment {
   public  String comment;
    public Comment(){}
    /**
     * Метод Comment конструктор для возвращения и использования комментария
     * @param comment переменная комментария
     */

    public Comment(String comment){

        this.comment=comment;
    }

    public String getComment(){
        return this.comment;
    }

}
