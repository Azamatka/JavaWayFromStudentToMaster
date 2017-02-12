package Chess;

import java.util.Arrays;

/**
 * Created by Mur on 17.01.2017.
 */
public class Board {
    static Cell[][] board = new Cell[8][8];
    static Cell[][] boardWay = new Cell[8][8];
    static Figure[] figures = new Figure[3];

    static class Bishop extends Figure {


        public Bishop(Cell position) {
            super(position);
            if (position.getDiagonal() < 8 && position.getVertical() < 8) {
                board[position.getDiagonal()][position.getVertical()] = position;


            }
        }

        public Cell[][] way(Cell dist) throws ImposibleMoveException, FigureNotFoundException, OccupiedWayException {
            for (int i = 0; i < 8; i++) {
                for (int c = 0; c < 8; c++) {
                    board[i][c] = new Cell("Empty", i, c);
                }
            }
            if (dist.getDiagonal() < 8 && dist.getVertical() < 8) {
                if (position.getDiagonal() != dist.getDiagonal() && position.getVertical() != dist.getVertical()) {
                    if (position.getDiagonal() > dist.getDiagonal() && position.getVertical() > dist.getVertical()){
                        for (int i = 0; i < 8; i++) {
                            if (position.getVertical() - i < 0) {
                                throw new ImposibleMoveException("Impossible move exception");
                            }
                            int b = position.getDiagonal() - i;
                            int d = position.getVertical() - i;
                            if (board[b][d].getFigure().equals("Empty")) {
                                boardWay[b][d] = new Cell("Empty", position.getDiagonal() - i, position.getVertical() - i);
                                if (b == dist.getDiagonal() && d == dist.getVertical()) {
                                    boardWay[b][d] = new Cell("Bishop", b, d);
                                    return boardWay;
                                }
                            } else {
                                throw new OccupiedWayException("Occupied Way Exception");
                            }
                        }
                    }

                    if (position.getDiagonal() > dist.getDiagonal() && position.getVertical() < dist.getVertical()) {
                        for (int i = 0; i < 8; i++) {
                            if (position.getDiagonal() - i < 0 || position.getVertical() > 7) {
                                throw new ImposibleMoveException("Impossible move exception");
                            }
                            int b = position.getDiagonal() - i;
                            int d = position.getVertical() + i;
                           if (board[b][d].getFigure().equals("Empty")) {
                                boardWay[b][d] = new Cell("Empty", position.getDiagonal() - i, position.getVertical() + i);
                                if (b == dist.getDiagonal() && d == dist.getVertical()) {
                                    boardWay[b][d] = new Cell("Bishop", b, d);
                                    return boardWay;

                                }
                            } else {
                                throw new OccupiedWayException("Occupied Way Exception");
                            }
                        }
                    }

                    if (position.getDiagonal() < dist.getDiagonal() && position.getVertical() < dist.getVertical()) {
                        for (int i = 0; i < 8; i++) {
                            if (position.getDiagonal() + i > 7) {
                                throw new ImposibleMoveException("Impossible Move Exception");
                            }
                            int b = position.getDiagonal() + i;
                            int d = position.getVertical() + i;
                            if (board[b][d].getFigure().equals("Empty")) {
                                boardWay[b][d] = new Cell("Empty", position.getDiagonal() +i, position.getVertical() +i);
                                if (b == dist.getDiagonal() && d == dist.getVertical()) {
                                    boardWay[b][d] = new Cell("Bishop", b, d);
                                    return boardWay;
                                }
                            } else {
                                throw new OccupiedWayException("Occupied Way Exception");
                            }
                        }
                    }

                    if (position.getDiagonal() < dist.getDiagonal() && position.getVertical() > dist.getVertical()) {
                        for (int i = 0; i < 8; i++) {
                            if (position.getDiagonal() + i > 7 || position.getVertical() < 0) {
                                throw new ImposibleMoveException("Impossible move exception");
                            }
                            int b = position.getDiagonal() + i;
                            int d = position.getVertical() - i;
                            if (board[b][d].getFigure().equals("Empty")) {
                                boardWay[b][d] = new Cell("Empty", position.getDiagonal() + i, position.getVertical() - i);
                                if (b == dist.getDiagonal() && d == dist.getVertical()) {
                                    boardWay[b][d] = new Cell("Bishop", b, d);
                                    return boardWay;
                                }
                            } else {
                                throw new OccupiedWayException("Occupied Way Exception");
                            }
                        }

                    }

                }else{throw new ImposibleMoveException("Impossible move exception");}
            }else{throw new ImposibleMoveException("Impossible move exception");}
            return null;
        }

    }
}







