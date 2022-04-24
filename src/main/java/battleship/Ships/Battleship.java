package battleship.Ships;

public class Battleship extends Ship{

    final int size = 4;
    final String name = "Battleship";
    final String id = "b";
    int hitCount = 0;

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHitCount() {
        return this.hitCount;
    }

    @Override
    public void updateHitCount() {
        hitCount++;
    }
    
}
