package Chess;

/**
 * Created by Mur on 16.01.2017.
 */
public class ImposibleMoveException extends RuntimeException {
    public ImposibleMoveException(String msg){
        super(msg);
    }
}
