package battleship.Ships;

public class Submarine extends Ship {

    int size = 3;
    String id = "s";
    String name = "Submarine";
    int hitCount = 0;

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void updateHitCount() {
        hitCount++;  
    }

    @Override
    public int getHitCount() {
        return hitCount;
    } 

    @Override
    public String getID() {
        return id;
    }
    
}
