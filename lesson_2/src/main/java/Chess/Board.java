package Chess;

import java.util.Arrays;

/**
 * Created by Mur on 17.01.2017.
 */
public class Board {
    static Cell[][] board = new Cell[8][8];
    static Figure[] figures = new Figure[3];

    static class Bishop extends Figure {


        public Bishop(Cell position) {
            super(position);
            if (position.getDiagonal() < 8 && position.getVertical() < 8) {
                board[position.getDiagonal()][position.getVertical()] = position;


            }
        }

        public Cell[][] way(Cell dist) throws ImposibleMoveException, FigureNotFoundException, OccupiedWayException {

            if (dist.getDiagonal() < 8 && dist.getVertical() < 8) {
                if (position.getDiagonal() != dist.getDiagonal() && position.getVertical() != dist.getVertical()) {
                    if (position.getDiagonal() > dist.getDiagonal() && position.getVertical() > dist.getVertical()) {
                        for (int i = 0; i < 8; i++) {
                            if (position.getVertical() - i < 0) {
                                throw new ImposibleMoveException("Impossible move exception");
                            }
                            int b = position.getDiagonal() - i;
                            int d = position.getVertical() - i;
                            board[b][d] = new Cell(null, position.getDiagonal() - i, position.getVertical() - i);
                            if (b == dist.getDiagonal() && d == dist.getVertical()) {
                                for (Cell[] cell : board) {
                                    for (Cell cel : cell) {
                                        if (cel == null) {
                                            board[b][d] = new Cell("Bishop", b, d);
                                            return board;
                                        } else throw new OccupiedWayException("Occupied Way Exception");
                                    }
                                }
                            }
                        }

                    }


                    if (position.getDiagonal() > dist.getDiagonal() && position.getVertical() < dist.getVertical()) {
                        for (int i = 0; i < 8; i++) {
                            if (position.getDiagonal() - i < 0 || position.getVertical() > 7) {
                                break;
                            }
                            int b = position.getDiagonal() - i;
                            int d = position.getVertical() + i;
                            board[b][d] = new Cell(null, position.getDiagonal() - i, position.getVertical() + i);
                            if (b == dist.getDiagonal() && d == dist.getVertical()) {
                                for (Cell[] cell : board) {
                                    for (Cell cel : cell) {
                                        if (cel == null) {
                                            board[b][d] = new Cell("Bishop", b, d);
                                            return board;
                                        } else throw new OccupiedWayException("Occupied Way Exception");
                                    }
                                }
                            }
                        }

                    }
                    if (position.getDiagonal() < dist.getDiagonal() && position.getVertical() < dist.getVertical()) {
                        for (int i = 1; i < 7; i++) {
                            if (position.getDiagonal() + i > 7) {
                                throw new ImposibleMoveException("Impossible Move Exception");
                            }
                            int b = position.getDiagonal() + i;
                            int d = position.getVertical() + i;
                            if (board[b][d].getFigure()!= null &&  board[b][d].getFigure().length()!=0) {
                                throw new OccupiedWayException("Occupied Way Exception");
                            }
                            board[b][d] = new Cell(null, position.getDiagonal() + i, position.getVertical() + i);
                            if (b == dist.getDiagonal() && d == dist.getVertical()) {
                                board[b][d] = new Cell("Bishop", b, d);
                                return board;
                            }//else ;throw new OccupiedWayException("Occupied Way Exception")
                        } //else throw new OccupiedWayException("Occupied Way Exception");
                    }
                }

                if (position.getDiagonal() < dist.getDiagonal() && position.getVertical() > dist.getVertical()) {
                    for (int i = 0; i < 8; i++) {
                        if (position.getDiagonal() + i > 7 || position.getVertical() < 0) {
                            break;
                        }
                        int b = position.getDiagonal() + i;
                        int d = position.getVertical() - i;
                        board[b][d] = new Cell(null, position.getDiagonal() + i, position.getVertical() - i);
                        if (b == dist.getDiagonal() && d == dist.getVertical()) {
                            for (Cell[] cell : board) {
                                for (Cell cel : cell) {
                                    if (cel == null) {
                                        board[b][d] = new Cell("Bishop", b, d);
                                        return board;
                                    } else throw new OccupiedWayException("Occupied Way Exception");
                                }
                            }
                        }
                    }
                }

            }

            return null;
        }
        }

        public static void main(String args[]) throws ImposibleMoveException, FigureNotFoundException, OccupiedWayException {
            Figure bishop = new Bishop(new Cell("Bishop", 1, 1));
            for (Cell[] cell : bishop.way(new Cell(null, 7, 7))) {
                for (Cell caellt : cell) {
                    if (caellt != null) {
                        System.out.println(caellt.getFigure() + " " + caellt.getDiagonal() + " " + caellt.getVertical());
                    }
                }
            }
        }
    }





