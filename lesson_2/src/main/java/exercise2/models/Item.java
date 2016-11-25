package exercise2.models;
import exercise2.Comment;

public class Item {
    public String name;
    public String description;
    public long date;
    public long id;
    public Item(){

    }
    public Item(String name,String  description,long  date, int id){
        this.name=name;
        this.description=description;
        this.date=date;
        this.id=id;

    }


    public String getName(){
        return this.name;
    }
    public String getDesc(){
        return this.description;
    }
    public long getDate(){
        return this.date;
    }
    public long getId(){
        return this.id;
    }
    public void setId(long id){
    }
    Comment[] com=new Comment[100];
}
