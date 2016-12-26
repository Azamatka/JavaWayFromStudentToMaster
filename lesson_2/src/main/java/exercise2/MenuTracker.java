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
        this.actions[0] = new AddItem();
        this.actions[1] = new GetAll();
         this.actions[2] = new FindId();
        this.actions[3] = new FindName();
        this.actions[4] = new EditApp();
        this.actions[5] = new DelApp();
        this.actions[6] = new AddComm();
        this.actions[7] = new GetComm();
        this.actions[8] = new Exit();
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
    private class AddItem implements UserAction {
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

        public String info() {
            return String.format("%s.%s", this.key(), "Add the new item");
        }
    }
    /**
     * Класс GetAll для получения списка всех заявок
     */
    private   class GetAll implements UserAction {

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


        public String info() {
            return String.format("%s.%s", this.key(), "Get All");
        }
    }
    /**
     * Класс FindId для нахождения заявки по id
     */
    private  class FindId implements UserAction {

        public int key() {
            return 2;
        }


        public void execute(Input input, Tracker tracker) {
            String askId = input.ask("Enter id:");
            long askIdLong = Long.parseLong(askId);
            Item item = tracker.findById(askIdLong);
            System.out.println(item.getName() + " " + item.getDesc() + " " + new Date(item.getDate()) + " " + item.getId());

        }

        public String info() {
            return String.format("%s.%s", this.key(), "Find by id");
        }
    }
    /**
     * Класс FindName для нахождения заявки по имени
     */
    private   class FindName implements UserAction {

        public int key() {
            return 3;
        }


        public void execute(Input input, Tracker tracker) {
            String askNameFind = input.ask("Enter name to find application: ");
            Item item = tracker.findByName(askNameFind);
            System.out.println(item.getName() + " " + item.getDesc() + " " + new Date(item.getDate()) + " " + item.getId());

        }

        public String info() {
            return String.format("%s.%s", this.key(), "Find by name");
        }
    }
    /**
     * Класс EditApp для редактирования заявки
     */
    private   class EditApp implements UserAction {

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

        public String info() {
            return String.format("%s.%s", this.key(), "Edit application");
        }
    }
    /**
     * Класс DelApp для удаления заявки
     */
    private   class DelApp implements UserAction {

        public int key() {
            return 5;
        }


        public void execute(Input input, Tracker tracker) {
            String delApp = input.ask("Enter application's id, which you want to delete:");
            long delAppLong = Long.parseLong(delApp);
            tracker.delApp(delAppLong);

        }

        public String info() {
            return String.format("%s.%s", this.key(), "Delete application");
        }
    }
    /**
     * Класс AddComm  для добавления комментариев к заявке
     */
    private   class AddComm implements UserAction {
        /**
         * Метод аddComm  вспомогательный метод для добавления комментариев к заявке
         */
        public Item addComm(long id, Comment comment) {
            Item item = tracker.findById(id);
            item.addComm(comment);
            return item;
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

        public String info() {
            return String.format("%s.%s", this.key(), "Add comment to application");
        }
    }
    /**
     * Класс GetComm для получения комментариев к заявке
     */
    private   class GetComm implements UserAction {

        public int key() {
            return 7;
        }


        public void execute(Input input, Tracker tracker) {
            String askComment = input.ask("Enter application's id which comments you want to see:");
            long askCommentLong = Long.parseLong(askComment);
            for (Comment comments : tracker.findById(askCommentLong).getAllComm()) {
                if (comments != null) {
                    System.out.println(comments.getComment());
                }
            }
        }

        public String info() {
            return String.format("%s.%s", this.key(), "Show comments");
        }
    }
    /**
     * Класс Exit для выхода из программы
     */
    private   class Exit implements UserAction {

        public int key() {
            return 8;
        }


        public void execute(Input input, Tracker tracker) {
            System.exit(0);
        }

        public String info() {
            return String.format("%s.%s", this.key(), "Exit");
        }
    }
}

