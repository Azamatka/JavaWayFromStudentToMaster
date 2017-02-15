package Chess;

/**
 * Created by Mur on 07.02.2017.
 */
public class OccupiedWayException extends RuntimeException {
    public OccupiedWayException(String msg){
        super(msg);
    }
}