package exercise2;

import exercise2.models.Comment;
import exercise2.models.Item;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * StartUITest класс для тестирования SubInput
 * @since 19.12.2016
 * @version 1
 */
  public class StartUITest  {
    public static void main(String[] args) {
        Input input= new SubInput(new String[]{
            "1", "George", "Smith","yes","1", "Matt", "Johns","yes","2","1","5","3","eorge","4","1",
                "Azamat","Iltinbaev","5","6","2","5","7","1","Hello","8","1","9"});
        StartUI start = new StartUI(input);
        start.menu();


    }
}
