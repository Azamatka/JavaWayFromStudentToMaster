package exercise2.models;

import java.util.Date;
import java.util.Random;

public class Item extends Comment {
    public String name;
    public String description;
    long dateTime;
    public Comment[] com=new Comment[100];
    long id;



    public Item() {

    }

    public Item(String name, String description,long dateTime, long id, Comment[]  com) {
        this.name = name;
        this.description = description;
        this.dateTime = dateTime;
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
        return this.dateTime;
    }
    public void setId(long id){this.id=id;}
    public void setTime(long time){this.dateTime=time;}


    public Comment  addComm(Comment comment){
        for (int i = 0; i < com.length; i++) {
            if (this.com[i] == null) {
                this.com[i] = comment;
                break;
            }
        }
        return comment;
    }

    public Comment[] getAllComm() {
        Comment[] result = getComm();
        return result;
    }
    public long getId() {
        return this.id;
    }



}

