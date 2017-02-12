package Chess;

import exercise2.*;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Mur on 02.02.2017.
 */
public class BishopTest extends exercise2.OutTest {


    @Test
    public void wayfirst() throws Exception {
        Board.Bishop brdFirst=new Board.Bishop(new Cell("Bisop",0,0));
        for (Cell[] cell : brdFirst.way(new Cell("Empty", 7, 7))) {
            for (Cell cel : cell) {
                if (cel != null) {
                    System.out.println(cel.getFigure() + " " + cel.getDiagonal() + " " + cel.getVertical());
                }
            }
        }
        Assert.assertThat("Empty 0 0\r\nEmpty 1 1\r\nEmpty 2 2\r\nEmpty 3 3\r\nEmpty 4 4\r\nEmpty 5 5\r\nEmpty 6 6\r\nBishop 7 7\r\n", is(output.toString()));
    }


    @Test
    public void waySecond() throws Exception {
        Board.Bishop brdSecond=new Board.Bishop(new Cell("Bisop",5,5));
        for (Cell[] cell : brdSecond.way(new Cell("Empty", 0, 0))) {
            for (Cell cel : cell) {
                if (cel != null) {
                    System.out.println(cel.getFigure() + " " + cel.getDiagonal() + " " + cel.getVertical());
                }
            }
        }
        Assert.assertThat("Bishop 0 0\r\nEmpty 1 1\r\nEmpty 2 2\r\nEmpty 3 3\r\nEmpty 4 4\r\nEmpty 5 5\r\n", is(output.toString()));
    }


    @Test
    public void wayThird() throws Exception {
        Board.Bishop brdSThird=new Board.Bishop(new Cell("Bisop",6,1));
        for (Cell[] cell : brdSThird.way(new Cell("Empty", 1, 6))) {
            for (Cell cel : cell) {
                if (cel != null) {
                    System.out.println(cel.getFigure() + " " + cel.getDiagonal() + " " + cel.getVertical());
                }
            }
        }
        Assert.assertThat( "Bishop 1 6\r\nEmpty 2 5\r\nEmpty 3 4\r\nEmpty 4 3\r\nEmpty 5 2\r\nEmpty 6 1\r\n", is(output.toString()));
    }


    @Test
    public void wayFourth() throws Exception {
        Board.Bishop brdFourth=new Board.Bishop(new Cell("Bisop",1,4));
        for (Cell[] cell : brdFourth.way(new Cell("Empty", 4, 1))) {
            for (Cell cel : cell) {
                if (cel != null) {
                    System.out.println(cel.getFigure() + " " + cel.getDiagonal() + " " + cel.getVertical());
                }
            }
        }
        Assert.assertThat("Empty 1 4\r\nEmpty 2 3\r\nEmpty 3 2\r\nBishop 4 1\r\n", is(output.toString()));
    }

}

