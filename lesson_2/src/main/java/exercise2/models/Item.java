package exercise2.models;

public class Item extends Comment {
    public String name;
    public String description;
    public long date;
    public long id;
    public Comment[] com;

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

    public Comment[] getComm() { return this.com;}

    public String getDesc() {
        return this.description;
    }

    public long getDate() {
        return this.date;
    }


    public Comment  addComm(Comment comment){
        for (int i = 0; i < com.length; i++) {
            if (this.com[i] == null) {
                this.com[i] = comment;
                break;
            }
        }
        return comment;
    }



    public long getId() {
        return this.id;
    }

    public void setId(long id) {
    }

}

