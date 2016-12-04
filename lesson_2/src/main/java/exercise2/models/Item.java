package exercise2.models;

public class Item {
    public String name;
    public String description;
    public long date;
    public long id;
    public Comment[] com = new Comment[100];

    public Item() {

    }

    public Item(String name, String description, long date, int id, Comment[]  com) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.id = id;
        this.com = com;

    }


    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.description;
    }

    public long getDate() {
        return this.date;
    }

    public long getId() {
        return this.id;
    }
    public  void setComm(Comment comment) {

    }
    public void setId(long id) {
    }

}

