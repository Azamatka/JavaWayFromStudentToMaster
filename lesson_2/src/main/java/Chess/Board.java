package Chess;

import java.util.Arrays;

/**
 * Created by Mur on 17.01.2017.
 */
public class Board  {
    Cell cel=new Cell();
    Cell[] board =new Cell[64];
    Figure[] figures = new Figure[32];

    public class Bishop extends Figure {
        public Bishop(Cell position) {
            super(position);
        }

        public Cell[] way(Cell dist) {
            Cell []result;
            if (dist.getNumber() <= 64) {
                if (dist.getFigure().equals(null)) {
                    if (dist.getNumber() > position.getNumber()) {
                      double diagNum= dist.getDiagonal()-position.getDiagonal();
                        if(dist.getNumber()-position.getNumber()/7==diagNum||dist.getNumber()-position.getNumber()/9==diagNum){
                            return
                        }
                        if(dist.getNumber()/7==diagNum||dist.getNumber()/9==diagNum)

                    }
                    if (position.getNumber()>dist.getNumber()) {

                    }
                }

            }
            return null;
        }
    }
    public static void main(String[] args) {



    }
}




