package Chess;

import static Chess.Board.board;

/**
 * Created by Mur on 13.02.2017.
 */
public class Bishop extends Figure {


    Cell[][] boardHelper = new Cell[8][8];
    public Bishop(String colour, Cell position) {
        super(colour, position);

    }


    public Cell[][] move(Cell dist) {
        if (position.getDiagonal() > dist.getDiagonal() && position.getVertical() > dist.getVertical()) {
            for (int i = 0; i < 8; i++) {
                int b = position.getDiagonal() - i;
                int d = position.getVertical() - i;
                boardHelper[b][d] = new Cell("Empty", b, d);
                if (b == dist.getDiagonal() && d == dist.getVertical()) {
                    return boardHelper;
                }
            }
        }

        if (position.getDiagonal() > dist.getDiagonal() && position.getVertical() < dist.getVertical()) {
            for (int i = 0; i < 8; i++) {
                int b = position.getDiagonal() - i;
                int d = position.getVertical() + i;
                boardHelper[b][d] = new Cell("Empty", b, d);
                if (b == dist.getDiagonal() && d == dist.getVertical()) {
                    return boardHelper;
                }
            }
        }

            if (position.getDiagonal() < dist.getDiagonal() && position.getVertical() < dist.getVertical()) {
                for (int i = 0; i < 8; i++) {
                    int b = position.getDiagonal() + i;
                    int d = position.getVertical() + i;
                    boardHelper[b][d] = new Cell("Empty", b, d);
                    if (b == dist.getDiagonal() && d == dist.getVertical()) {
                        return boardHelper;
                    }
                }
            }
                if (position.getDiagonal() < dist.getDiagonal() && position.getVertical() > dist.getVertical()) {
                    for (int i = 0; i < 8; i++) {
                        int b = position.getDiagonal() + i;
                        int d = position.getVertical() - i;
                        boardHelper[b][d] = new Cell("Empty", b, d);
                        if (b == dist.getDiagonal() && d == dist.getVertical()) {
                            return boardHelper;
                        }
                    }

                }
        return null;
    }
}



