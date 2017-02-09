package Chess;

import java.util.Arrays;

/**
 * Created by Mur on 16.01.2017.
 */
public class Cell {
    int  diagonal;
     int vertical;
   public String figure;
    public   Cell(String figure,int diagonal,int vertical) {
        this.diagonal=diagonal;
        this.vertical=vertical;
        this.figure=figure;

    }
    public Cell(){}
    public int getDiagonal(){
        return this.diagonal;
    }
    public int getVertical(){
        return this.vertical;
    }
    public String getFigure(){
        return this.figure;
    }
    public void setVertical(int number){
        this.vertical=vertical;
    }
    public void setDiagonal(int number){
        this.diagonal=diagonal;
    }
    public void setFigure(String figure){
         this.figure=figure;
    }
}