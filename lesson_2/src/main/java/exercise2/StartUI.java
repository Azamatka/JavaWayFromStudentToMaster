package exercise2;
/**
 * StartUI класс для запуска программы
 * @since 26.12.2016
 * @version 1
 */
import  exercise2.Tracker;
import exercise2.models.*;

import java.util.Date;
import java.util.Scanner;


public class StartUI {
private Input input;
public StartUI(Input input){
this.input=input;}
    /**
     * Метод init метод для осуществления действий и  инициализации input в StartUI
     */
public void init(){
    Tracker tracker=new Tracker();
    MenuTracker menu=new MenuTracker(this.input,tracker);
    menu.fillActions();
    do {
        menu.show();
        int key = Integer.valueOf(input.ask("Select: "));
        menu.select(key);
     }while(1==1);


}

public static void main(String[]args){
    Input input=new ConsoleInput();
    new StartUI(input).init();
}
}
