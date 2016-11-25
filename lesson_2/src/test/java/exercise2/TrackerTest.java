package exercise2;
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
        track.addItem(new Item("Matt", "is doctor", 21, 1));
        track.addItem(new Item("John", "is driver", 45, 2));
        track.addItem(new Item("Jeff", "is  programmer", 53, 3));
        track.addItem(new Item("George", "is president", 88, 4));
        Assert.assertThat(track.items[1].getName(), is("John"));
    }

    @Test
    public void trackerMustFindById() {
        Tracker track = new Tracker();
        track.addItem(new Item("Matt", "is doctor", 21, 1));
        track.addItem(new Item("John", "is driver", 45, 2));
        track.addItem(new Item("Jeff", "is  programmer", 53, 3));
        track.addItem(new Item("George", "is president", 88, 4));
        Assert.assertThat(track.findById(4).getName(), is("George"));
    }

    @Test
    public void trackerMustFindByName() {
        Tracker track = new Tracker();
        track.addItem(new Item("Matt", "is doctor", 21, 1));
        track.addItem(new Item("John", "is driver", 45, 2));
        track.addItem(new Item("Jeff", "is  programmer", 53, 3));
        track.addItem(new Item("George", "is president", 88, 4));
        Assert.assertThat(track.findByName("Jeff").getDesc(), is("is  programmer"));
    }

    @Test
    public void trackerMustEditApp() {
        Tracker track = new Tracker();
        track.addItem(new Item("Matt", "is doctor", 21, 1));
        track.addItem(new Item("John", "is driver", 45, 2));
        track.addItem(new Item("Jeff", "is  programmer", 53, 3));
        track.addItem(new Item("George", "is president", 88, 4));
        track.editApp(2, (new Item("Petr", "is programmer", 04, 9)));
        Assert.assertThat(track.items[2].getName(), is("Petr"));
    }

    @Test
    public void trackerMustShowAllApp() {
        Tracker track = new Tracker();
        track.addItem(new Item("Matt", "is doctor", 21, 1));
        track.addItem(new Item("John", "is driver", 45, 2));
        track.addItem(new Item("Jeff", "is  programmer", 53, 3));
        track.addItem(new Item("George", "is president", 88, 4));
        for (Item item : track.showAllApp()) {
            System.out.println(item.getName());
        }
        Assert.assertThat("Matt\r\nJohn\r\nJeff\r\nGeorge\r\n", is(output.toString()));

    }

    @Test
    public void trackerMustDeleteApp() {
        Tracker track = new Tracker();
        track.addItem(new Item("Matt", "is doctor", 21, 1));
        track.addItem(new Item("John", "is driver", 45, 2));
        track.addItem(new Item("Jeff", "is  programmer", 53, 3));
        track.addItem(new Item("George", "is president", 88, 4));
        track.delApp(0);
        Assert.assertNull(track.items[0].getName());
    }
}