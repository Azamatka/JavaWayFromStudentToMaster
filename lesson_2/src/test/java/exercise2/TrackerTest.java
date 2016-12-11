package exercise2;
import exercise2.models.Comment;
import exercise2.models.Item;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;


/**
 * TrackerTest  класс методов из класса Tracker
 * @since 24.11.2016
 * @version 1
 */
public class TrackerTest extends OutTest {

    @Test

    public void trackerMustAddItem() {
        Tracker track = new Tracker();
        Comment[] com = new Comment[100];
        track.addApp(new Item("Matt", "is doctor", 21, 1, com));
        track.addApp(new Item("John", "is driver", 45, 2, com));
        track.addApp(new Item("Jeff", "is  programmer", 53, 3, com));
        track.addApp(new Item("George", "is president", 88, 4, com));
        Assert.assertThat(track.items[1].getName(), is("John"));
    }

    @Test
    public void trackerMustFindById() {
        Tracker track = new Tracker();
        Comment[] com = new Comment[100];
        track.addApp(new Item("Matt", "is doctor", 21, 1, com));
        track.addApp(new Item("John", "is driver", 45, 2, com));
        track.addApp(new Item("Jeff", "is  programmer", 53, 3, com));
        track.addApp(new Item("George", "is president", 88, 4, com));
        Assert.assertThat(track.findById(4).getName(), is("George"));
    }

    @Test
    public void trackerMustFindByName() {
        Tracker track = new Tracker();
        Comment[] com = new Comment[100];
        track.addApp(new Item("ddffMattghh", "is doctor", 21, 1, com));
        track.addApp(new Item("John", "is driver", 45, 2, com));
        track.addApp(new Item("Jeff", "is  programmer", 53, 3, com));
        track.addApp(new Item("George", "is president", 88, 4, com));
        Assert.assertThat(track.findByName("Matt"),is(track.items[0]));
    }

    @Test
    public void trackerMustEditApp() {
        Tracker track = new Tracker();
        Comment[] com = new Comment[100];
        track.addApp(new Item("Matt", "is doctor", 21, 1, com));
        track.addApp(new Item("John", "is driver", 45, 2, com));
        track.addApp(new Item("Jeff", "is  programmer", 53, 3, com));
        track.addApp(new Item("George", "is president", 88, 4, com));
        track.editApp(1, new Item("Petr", "is  programmer", 22, 10, com));
        Assert.assertThat(track.findById(10).getName(), is("Petr"));
    }

    @Test
    public void trackerMustGetAll() {
        Tracker track = new Tracker();
        Comment[] com = new Comment[100];
        track.addApp(new Item("Matt", "is doctor", 21, 1, com));
        track.addApp(new Item("John", "is driver", 45, 2, com));
        track.addApp(new Item("Jeff", "is  programmer", 53, 3, com));
        track.addApp(new Item("George", "is president", 88, 4, com));
        for (Item item : track.getAll()) {
            System.out.print(item.getName());
        }
        Assert.assertThat("MattJohnJeffGeorge", is(output.toString()));

    }


    @Test
    public void trackerMustDeleteApp() {
        Tracker track = new Tracker();
        Comment[] com = new Comment[100];
        track.addApp(new Item("Matt", "is doctor", 21, 1, com));
        track.addApp(new Item("John", "is driver", 45, 2, com));
        track.addApp(new Item("Jeff", "is  programmer", 53, 3, com));
        track.addApp(new Item("George", "is president", 88, 4, com));
        Assert.assertNull(track.delApp(1).getName());
    }


            }




