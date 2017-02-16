package Chess;


/**
 * Cell describes cell of cells array
 * @since 16.02.2017
 * @version 1
 */
public class Cell {
    int  diagonal;
     int vertical;
    String figure;
     /**
     * Method Cell-constructor of Cell
      * @param figure - figure chooses the figure you want to move
      * @param diagonal-diagonal of chess board
      * @param vertical-vertical of chess board
      */
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