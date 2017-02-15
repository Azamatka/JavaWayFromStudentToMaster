package Chess;


public abstract class Figure {
public  Cell position;
    public String colour;

    public   Figure(String colour,Cell position) {
        this.position = position;
        this.colour=colour;
    }

    abstract Cell[][] move(Cell dist)throws ImposibleMoveException;

}