package Chess;

import java.util.Arrays;

/**
 * Board class describes chess board
 * @since 16.02.2017
 * @version 1
 */
public class Board {
    static Cell[][] board = new Cell[8][8];
    public Figure figure;
    public Cell dist;

    /**
     * Method board fills array by coordinates
     */
    public void board() {
        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 8; c++) {
                board[f][c] = new Cell("Empty", f, c);
            }
        }
    }

    /**
     * Method makeMove  moves choosed figure
     */
    public Cell[][] makeMove(Figure figure, Cell dist) {
        this.figure = figure;
        this.dist = dist;
        return figure.move(dist);
    }
    /**
     * Method   checkMove checks figures move, if move is impossible throws exceptions
     */
    public void checkMove() {
         if(!figure.position.getFigure().equals("Bishop")) throw new FigureNotFoundException("Figure not found");
        if (figure.position.getDiagonal() < 8 && dist.getVertical() < 8 && figure.position.getVertical() < 8 && dist.getVertical() < 8) {
            if (figure.position.getDiagonal() != dist.getDiagonal() && figure.position.getVertical() != dist.getVertical()) {
                for (Cell[] cell : board) {
                        for (Cell cel : cell) {
                            if (cel != null) {
                            if (cel.getFigure().equals("Empty")) {
                                if (cel.getDiagonal() == dist.getDiagonal() && cel.getVertical() == dist.getVertical()) {
                                    board[figure.position.getDiagonal()][figure.position.getVertical()] = null;
                                    board[dist.getDiagonal()][dist.getVertical()] = new Cell("Bishop", dist.getDiagonal(), dist.getVertical());

                                }
                            }else{throw new OccupiedWayException("Way is occupied by another figure!");}
                        }
                    }

                }
            }else{throw new ImposibleMoveException("Distriction coordinates and figure coordinates cant be same!");}
        }else{throw new ImposibleMoveException("Please, enter the correct coordinates");}
    }

}








