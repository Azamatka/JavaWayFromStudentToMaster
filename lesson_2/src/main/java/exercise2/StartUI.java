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

    public int askAction;
    Tracker tracker = new Tracker();
    Input input = new ConsoleInput();

    public StartUI(Input input) {
        this.input = input;
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        StartUI start = new StartUI(input);
        start.menu();
    }

    public void menu() {
        System.out.println("Choose menu's paragraph:" + "\n" +
                "1.Create application" + "\n" +
                "2.Find by id" + "\n" +
                "3.Find by name" + "\n" +
                "4.Edit application" + "\n" +
                "5.Get all applications" + "\n" +
                "6.Delete application" + "\n" +
                "7.Add comment" + "\n" +
                "8.Get all comments" + "\n" +
                "9.Exit");
        Scanner scimmer = new Scanner(System.in);
        askAction = scimmer.nextInt();
        if (askAction == 1) {
            String askName = input.ask("Enter name:");
            String askDesc = input.ask("Enter description:");
            long dateTime = tracker.getDate();
            long id = tracker.getId();
            tracker.addApp(new Item(askName, askDesc, dateTime, id, tracker.com));
            this.menu();
        }
        if (askAction == 2) {
            long askId = input.asklong("Enter id:");
            Item item = tracker.findById(askId);
            System.out.println(item.getName() + " " + item.getDesc() + " " + new Date(item.getDate()) + " " + item.getId());
            this.menu();

        }
        if (askAction == 3) {
            System.out.println("Enter name: ");
            Scanner sc = new Scanner(System.in);
            String askNameFind = sc.nextLine();
            Item item = tracker.findByName(askNameFind);
            System.out.println(item.getName() + " " + item.getDesc() + " " + new Date(item.getDate()) + " " + item.getId());
            this.menu();
        }
        if (askAction == 4) {
            long idEdit = input.asklong("Enter application's id, which you want to edit:");
            String askNameEdit = input.ask("Enter new name:");
            String askDescEdit =input.ask("Enter new description:");
            long dateTimeEdit = tracker.findById(idEdit).getDate();
            tracker.editApp(idEdit, new Item(askNameEdit, askDescEdit, dateTimeEdit, idEdit, tracker.com));
            System.out.println("Application is eddited to: ");
            System.out.println(tracker.findById(idEdit).getName() + " " + tracker.findById(idEdit).getDesc() + " " + new Date(tracker.findById(idEdit).getDate()) + " " + tracker.findById(idEdit).getId());
            this.menu();
        }
        if (askAction == 5) {
            for (Item item : tracker.getAll()) {
                if (item != null) {
                    System.out.print(item.getName() + " " + item.getDesc() + " " + new Date(item.getDate()) + " " + item.getId() + "\n");

                }
            }
            this.menu();}
            if (askAction == 6) {
                long delApp = input.asklong("Enter application's id, which you want to delete:");
                tracker.delApp(delApp);
                this.menu();
            }
            if (askAction == 7) {
                long askComm = input.asklong("Enter aplications's id, which you want to add comment");
                System.out.println("Enter comment: ");
                Scanner scann = new Scanner(System.in);
                String newComm = scann.nextLine();
                tracker.addComm(askComm, new Comment(newComm));
                this.menu();
            }
            if (askAction == 8) {
                long askComment = input.asklong("Enter application's id which comments you want to see:");
                for (Comment comments : tracker.findById(askComment).getAllComm()) {
                    if (comments != null) {
                        System.out.println(comments.getComment());
                    }
                }
                this.menu();
            }
            if (askAction == 9) {
                System.exit(0);
            }
 
        }
    }



