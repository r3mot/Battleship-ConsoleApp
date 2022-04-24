package battleship.Ships;

public class ShipType {

    public static final Ship[] COMPUTER = { 
        new Battleship(),
        new Carrier(),
        new Destroyer(),
        new PatrolBoat(),
        new Submarine()
    };

    public static final Ship[] HUMAN = {
        new Battleship(),
        new Carrier(),
        new Destroyer(),
        new PatrolBoat(),
        new Submarine()
    };

    public static final int NUMBER_OF_SHIPS = HUMAN.length;
    
}
