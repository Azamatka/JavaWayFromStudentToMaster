package Chess;

import java.util.Arrays;

/**
 * Created by Mur on 16.01.2017.
 */
public class Cell {
String figureInfo;
    double diagonal;
    double number;
    public Cell(String figureInfo,int diagonal,int number) {
       this.figureInfo=figureInfo;
        this.diagonal=diagonal;
        this.number=number;
    }
    public Cell(){}
    public String getFigure(){
        return this.figureInfo;
    }
    public double getDiagonal(){
        return this.diagonal;
    }
    public double getNumber(){
        return this.number;
    }
    public void setNumber(int number){
        this.number=number;
    }

}