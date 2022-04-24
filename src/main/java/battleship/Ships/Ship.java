package battleship.Ships;

public abstract class Ship {

    int startRow;
    int startColumn;
    boolean vertical;

    public abstract int getSize();
    public abstract String getID();
    public abstract String getName();
    public abstract int getHitCount();
    public abstract void updateHitCount();
    
    public void setRow(int startRow){
        this.startRow = startRow;
    }

    public int getRow(){
        return this.startRow;
    }

    public void setColumn(int startColumn){
        this.startColumn = startColumn;
    }

    public int getColumn(){
        return this.startColumn;
    }

    public void setVertical(boolean vertical){
        this.vertical = vertical;
    }

    public boolean isVertical(){
        return this.vertical;
    }

    
    
}
