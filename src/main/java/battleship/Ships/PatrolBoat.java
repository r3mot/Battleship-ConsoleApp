package battleship.Ships;

public class PatrolBoat extends Ship {

    final int size = 2;
    final String name = "Patrol Boat";
    final String id = "p";
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
