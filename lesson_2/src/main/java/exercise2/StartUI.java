package exercise2;
/**
 * StartUI класс для запуска программы
 * @since 24.11.2016
 * @version 1
 */
import  exercise2.Tracker;
import exercise2.models.*;

import java.util.Date;
import java.util.Scanner;


public class StartUI {

    public String askAction;
    Tracker tracker = new Tracker();
    Input input = new ConsoleInput();
     long number=0;
    public StartUI(Input input) {
        this.input = input;
    }

    public static void main(String[] args) {
        StartUI start = new StartUI(new ConsoleInput());
        start.menu();
    }
    /**
     * Метод addComm  метод для добавления комментария к заявке по  id
     * @param id айди заявки
     * @param comment комментарий
     */

    public Item addComm(long id,Comment comment) {
        Item item = tracker.findById(id);
        item.addComm(comment);
        return item;
    }
    /**
     * Метод menu метод для выбора и реализации пункта меню
     */
    public void menu() {
        askAction = input.ask("Choose menu's paragraph:" + "\n" +
                "1.Create application" + "\n" +
                "2.Find by id" + "\n" +
                "3.Find by name" + "\n" +
                "4.Edit application" + "\n" +
                "5.Get all applications" + "\n" +
                "6.Delete application" + "\n" +
                "7.Add comment" + "\n" +
                "8.Get all comments" + "\n" +
                "9.Exit");
        int askActionInt = Integer.parseInt(askAction);
        if (askActionInt == 1) {
            String askName = input.ask("Enter name:");
            String askDesc = input.ask("Enter description:");
            String askId = input.ask("Do you want to enter your own id?:");
            number++;
            long asklong=0;
            if(askId.equals("yes")){
                asklong=number;
            }else{asklong=tracker.generateId();}
             long dateTime = tracker.dateTimer();
            tracker.addApp(new Item(askName, askDesc, dateTime, asklong, tracker.com));
            this.menu();
        }
        if (askActionInt == 2) {
            String askId = input.ask("Enter id:");
            long askIdLong = Long.parseLong(askId);
            Item item = tracker.findById(askIdLong);
            System.out.println(item.getName() + " " + item.getDesc() + " " + new Date(item.getDate()) + " " + item.getId());
            this.menu();

        }
        if (askActionInt == 3) {
            String askNameFind = input.ask("Enter name to find application: ");
            Item item = tracker.findByName(askNameFind);
            System.out.println(item.getName() + " " + item.getDesc() + " " + new Date(item.getDate()) + " " + item.getId());
            this.menu();
        }
        if (askActionInt == 4) {
            String idEdit = input.ask("Enter application's id, which you want to edit:");
            String askNameEdit = input.ask("Enter new name:");
            String askDescEdit = input.ask("Enter new description:");
            long idEditLong = Long.parseLong(idEdit);
            long dateTimeEdit = tracker.findById(idEditLong).getDate();
            tracker.editApp(idEditLong, new Item(askNameEdit, askDescEdit, dateTimeEdit, idEditLong, tracker.com));
            System.out.println("Application is eddited to: ");
            System.out.println(tracker.findById(idEditLong).getName() + " " + tracker.findById(idEditLong).getDesc() + " " + new Date(tracker.findById(idEditLong).getDate()) + " " + tracker.findById(idEditLong).getId());
            this.menu();
        }
        if (askActionInt == 5) {
            for (Item item : tracker.getAll()) {
                if (item != null) {
                    System.out.print(item.getName() + " " + item.getDesc() + " " + new Date(item.getDate()) + " " + item.getId() + "\n");

                }
            }
            this.menu();
        }
        if (askActionInt == 6) {
            String delApp = input.ask("Enter application's id, which you want to delete:");
            long delAppLong = Long.parseLong(delApp);
            tracker.delApp(delAppLong);
            this.menu();
        }
        if (askActionInt == 7) {
            String askComm = input.ask("Enter aplications's id, which you want to add comment");
            String newComm = input.ask("Enter comment: ");
            long askCom = Long.parseLong(askComm);
            this.addComm(askCom, new Comment(newComm));
            this.menu();
        }
        if (askActionInt == 8) {
            String askComment = input.ask("Enter application's id which comments you want to see:");
            long askCommentLong = Long.parseLong(askComment);
            for (Comment comments : tracker.findById(askCommentLong).getAllComm()) {
                if (comments != null) {
                    System.out.println(comments.getComment());
                }
            }
            this.menu();
        }
        if (askActionInt == 9) {
            System.exit(0);
        }
    }

    }






