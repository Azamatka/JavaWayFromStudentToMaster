package exercise2;

import exercise2.models.Comment;
import exercise2.models.Item;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * StartUITest класс для тестирования класса StartUI
 * @since 26.12.2016
 * @version 1
 */
  public class StartUITest  {
    public static void main(String[] args) {
        Input input= new SubInput(new String[]{
            "0", "George", "Smith","yes","0", "Matt", "Johns","yes","2","1","1","3","eorge","4","1",
                "Azamat","Iltinbaev","1","5","2","1","6","1","Hello","7","1","8"});
        new StartUI(input).init();



    }
}
