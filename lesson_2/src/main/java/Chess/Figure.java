package Chess;


public abstract class Figure {
public  Cell position;

    public   Figure(Cell position) {
        this.position = position;
    }

    abstract Cell[][] way(Cell dist)throws ImposibleMoveException,FigureNotFoundException,OccupiedWayException;

}