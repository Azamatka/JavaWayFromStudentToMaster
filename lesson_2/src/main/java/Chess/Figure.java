package Chess;
/**
 * Abstract class Figure describes figure
 * @since 16.02.2017
 * @version 1
 */

public abstract class Figure {
public  Cell position;
    public String colour;
    /**
     * Method Figure-constructor of Figure
     * @param colour - colour of figure
     * @param position-figure position
     */
    public   Figure(String colour,Cell position) {
        this.position = position;
        this.colour=colour;
    }
    /**
     * Method  Cell- move the figure by figure logic
     * @param dist- distriction to move
     */
    abstract Cell[][] move(Cell dist)throws ImposibleMoveException;

}