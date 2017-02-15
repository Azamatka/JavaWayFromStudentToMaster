package Chess;

/**
 * Created by Mur on 07.02.2017.
 */
public class FigureNotFoundException extends RuntimeException{
    public FigureNotFoundException(String msg){
        super(msg);
    }
}