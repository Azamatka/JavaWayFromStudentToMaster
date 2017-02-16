package Chess;

/**
 * ImposibleMoveException class create new Exception when move is Impossible
 * @since 16.02.2017
 * @version 1
 */
public class ImposibleMoveException extends RuntimeException {
    public ImposibleMoveException(String msg){
        super(msg);
    }
}
