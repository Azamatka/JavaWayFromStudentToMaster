package exercise2;

import exercise2.models.Comment;
import exercise2.models.Item;

import java.util.Date;

/**
 * MenuTracker класс для инициализации действий
 * @since 26.12.2016
 * @version 1
 */
public class MenuTracker {
    private Input input;
    private static  Tracker tracker;
    private UserAction[] actions = new UserAction[9];
    int number = 0;

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;

    }
    /**
     * Метод fillActions для исполнения выбранного действия
     */
    public void fillActions() {
        this.actions[0] = new AddItem("Add new application");
        this.actions[1] = new GetAll("Get all applications");
         this.actions[2] = new FindId("Find by id");
        this.actions[3] = new FindName("Find by name");
        this.actions[4] = new EditApp("Edit application");
        this.actions[5] = new DelApp("Delete application");
        this.actions[6] = new AddComm("Add comment");
        this.actions[7] = new GetComm("Get all comments");
        this.actions[8] = new Exit("Exit");
    }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);

    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
    /**
     * Класс AddItem для добавления новой заявки
     */
    private  class AddItem extends BaseAction {
        public AddItem(String name){
            super(name);
        }
                public int key() {
                return 0;
            }

            public void execute(Input input, Tracker tracker) {
                String askName = input.ask("Enter name:");
                String askDesc = input.ask("Enter description:");
                String askId = input.ask("Do you want to enter your own id?:");
                number++;
                long asklong = 0;
                if (askId.equals("yes")) {
                    asklong = number;
                } else {
                    asklong = tracker.generateId();
                }
                long dateTime = tracker.dateTimer();
                tracker.addApp(new Item(askName, askDesc, dateTime, asklong, tracker.com));

            }
        }
    /**
     * Класс GetAll для получения списка всех заявок
     */
       class GetAll  extends BaseAction {
        public GetAll(String name){
            super(name);
        }
        public int key() {
            return 1;
        }


        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.getAll()) {
                if (item != null) {
                    System.out.print(item.getName() + " " + item.getDesc() + " " + new Date(item.getDate()) + " " + item.getId() + "\n");

                }
            }
        }
        }

    /**
     * Класс FindId для нахождения заявки по id
     */
      class FindId extends BaseAction {
        public FindId(String name){
            super(name);
        }
        public int key() {
            return 2;
        }


        public void execute(Input input, Tracker tracker) {
            try { String askId = input.ask("Enter id:");
            long askIdLong = Long.parseLong(askId);
                Item item = tracker.findById(askIdLong);
                System.out.println(item.getName() + " " + item.getDesc() + " " + new Date(item.getDate()) + " " + item.getId());
            } catch (NullPointerException npe) {
                System.out.println("Enter valid id");
            }


        }
        }

    /**
     * Класс FindName для нахождения заявки по имени
     */
      class FindName extends BaseAction {
        public FindName(String name){
            super(name);
        }
        public int key() {
            return 3;
        }


        public void execute(Input input, Tracker tracker) {
           try{ String askNameFind = input.ask("Enter name to find application: ");
                Item item = tracker.findByName(askNameFind);
                if (item.getName().equals(null)) {
                    throw new NullPointerException();}
            System.out.println(item.getName() + " " + item.getDesc() + " " + new Date(item.getDate()) + " " + item.getId());
        }catch(NullPointerException npe){System.out.println("Enter the correct name");}}

        }

    /**
     * Класс EditApp для редактирования заявки
     */
      class EditApp extends BaseAction{
        public EditApp (String name){
            super(name);
        }
        public int key() {
            return 4;
        }


        public void execute(Input input, Tracker tracker) {
            String idEdit = input.ask("Enter application's id, which you want to edit:");
            String askNameEdit = input.ask("Enter new name:");
            String askDescEdit = input.ask("Enter new description:");
            long idEditLong = Long.parseLong(idEdit);
            long dateTimeEdit = tracker.findById(idEditLong).getDate();
            tracker.editApp(idEditLong, new Item(askNameEdit, askDescEdit, dateTimeEdit, idEditLong, tracker.com));
            System.out.println("Application is eddited to: ");
            System.out.println(tracker.findById(idEditLong).getName() + " " + tracker.findById(idEditLong).getDesc() + " " + new Date(tracker.findById(idEditLong).getDate()) + " " + tracker.findById(idEditLong).getId());

        }


        }

    /**
     * Класс DelApp для удаления заявки
     */
       class DelApp extends BaseAction {
        public DelApp(String name){
            super(name);
        }
        public int key() {
            return 5;
        }


        public void execute(Input input, Tracker tracker) {
            try { String delApp = input.ask("Enter application's id, which you want to delete:");
            long delAppLong = Long.parseLong(delApp);
               tracker.delApp(delAppLong);
           }catch(NullPointerException npe){
               System.out.println("Enter correct id");
           }
        }


        }

    /**
     * Класс AddComm  для добавления комментариев к заявке
     */
        class AddComm extends BaseAction {
        /**
         * Метод аddComm  вспомогательный метод для добавления комментариев к заявке
         */
        public Item addComm(long id, Comment comment) {
            try {
                Item item = tracker.findById(id);
                item.addComm(comment);
                return item;
            } catch (NullPointerException npe) {
                System.out.println("Enter correct id");
            }
            return null;
        }

        public AddComm(String name){
            super(name);
        }

        public int key() {
            return 6;
        }

        public void execute(Input input, Tracker tracker) {
            String askComm = input.ask("Enter aplications's id, which you want to add comment");
            String newComm = input.ask("Enter comment: ");
            long askCom = Long.parseLong(askComm);
            this.addComm(askCom, new Comment(newComm));

        }

        }

    /**
     * Класс GetComm для получения комментариев к заявке
     */
    class GetComm extends BaseAction  {
        public GetComm(String name){
            super(name);
        }
        public int key() {
            return 7;
        }


        public void execute(Input input, Tracker tracker) {
            String askComment = input.ask("Enter application's id which comments you want to see:");
            long askCommentLong = Long.parseLong(askComment);
            try{ for (Comment comments : tracker.findById(askCommentLong).getAllComm()) {
                if (comments != null) {
                    System.out.println(comments.getComment());}}}
                    catch(NullPointerException npe){
                        System.out.println("Enter correct id");
                }
            }


        }

    /**
     * Класс Exit для выхода из программы
     */
      class Exit extends BaseAction {
        public  Exit(String name){
            super(name);
        }
        public int key() {
            return 8;
        }


        public void execute(Input input, Tracker tracker) {
            System.exit(0);
        }

        }
}


