package exercise2;
/**
 * Created by Mur on 10.01.2017.
 */
abstract class BaseAction implements UserAction{
     String name;
    public BaseAction(String name){
      this.name=name;
    }
         // abstract int key();
        // abstract void execute(Input input, Tracker tracker);
       public String info(){
        return String.format("%s.%s", this.key(), name);
    }
        }

