package Chess;

import exercise2.OutTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static Chess.Board.board;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * BoardTest checks the correctness of the behavior of the method
 * @since 16.02.2017
 * @version 1
 */
public class BoardTest extends exercise2.OutTest {

    @Test
    public void makeMove() {
        Board bord = new Board();
        bord.board();
        for (Cell[] cell : bord.makeMove(new Bishop("black", new Cell("Bishop", 5, 5)), new Cell(null, 1, 1))) {
            for (Cell cel : cell) {
                if (cel != null) {
                    System.out.println(cel.getFigure() + " " + cel.getDiagonal() + " " + cel.getVertical());
                }
            }
        }
        Assert.assertThat("Empty 1 1\r\nEmpty 2 2\r\nEmpty 3 3\r\nEmpty 4 4\r\nEmpty 5 5\r\n", is(output.toString()));
    }

    @Test(expected = OccupiedWayException.class)
    public void checkForOccupiedWayException() throws Exception {
        Board bord = new Board();
        bord.board();
        bord.makeMove(new Bishop("black", new Cell("Bishop", 5, 5)), new Cell(null, 1, 1));
        board[3][3] = new Cell("Refe", 3, 3);
        bord.checkMove();
    }

    @Test(expected = ImposibleMoveException.class)
    public void checkForImposibleMoveException() throws Exception {
        Board bord1 = new Board();
        bord1.board();
        bord1.makeMove(new Bishop("black", new Cell("Bishop", 9, 8)), new Cell(null, 9, 9));
        bord1.checkMove();

    }

    @Test(expected = FigureNotFoundException.class)
    public void checkForFigureNotFoundException() throws Exception {
        Board bord1 = new Board();
        bord1.board();
        bord1.makeMove(new Bishop("black", new Cell("Rtgd", 5, 5)), new Cell(null, 1, 1));
        bord1.checkMove();

    }

}