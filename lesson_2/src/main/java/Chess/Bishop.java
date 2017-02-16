package Chess;

import static Chess.Board.board;

/**
 * Bishop class describes Bishops moves
 * @since 16.02.2017
 * @version 1
 */
public class Bishop extends Figure {


    Cell[][] boardHelper = new Cell[8][8];
    public Bishop(String colour, Cell position) {
        super(colour, position);

    }

    /**
     * Method move describes Bishops moves
     * @param dist- distriction to move
     */
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



