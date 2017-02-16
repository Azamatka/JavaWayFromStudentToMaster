package Chess;


/**
 * OccupiedWayException class create new Exception when way to move is occupied by another figure
 * @since 16.02.2017
 * @version 1
 */
public class OccupiedWayException extends RuntimeException {
    public OccupiedWayException(String msg){
        super(msg);
    }
}