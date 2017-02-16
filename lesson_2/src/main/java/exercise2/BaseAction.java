package exercise2;

abstract class BaseAction implements UserAction{
     String name;
    public BaseAction(String name){
      this.name=name;
    }

       public String info(){
        return String.format("%s.%s", this.key(), name);
    }
        }

