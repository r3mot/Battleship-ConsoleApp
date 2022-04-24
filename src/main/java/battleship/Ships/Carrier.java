package battleship.Ships;

public class Carrier extends Ship {

    final int size = 5;
    final String name = "Carrier";
    final String id = "c";
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
