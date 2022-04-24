package battleship.Controllers;

import java.io.IOException;
import java.util.Optional;

import battleship.App;
import battleship.Constants.ErrorMessage;
import battleship.Ships.Battleship;
import battleship.Ships.Carrier;
import battleship.Ships.Destroyer;
import battleship.Ships.PatrolBoat;
import battleship.Ships.Ship;
import battleship.Ships.ShipType;
import battleship.Ships.Submarine;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class SelectSizeController {

    static class Index {
        static int BATTLESHIP = 0;
        static int CARRIER = 1;
        static int DESTROYER = 2;
        static int PATROL_BOAT = 3;
        static int SUBMARINE = 4;
    }

    static class Size {
        static int BATTLESHIP = new Battleship().getSize();
        static int CARRIER = new Carrier().getSize();
        static int DESTROYER = new Destroyer().getSize();
        static int PATROL_BOAT = new PatrolBoat().getSize();
        static int SUBMARINE = new Submarine().getSize();
    }

    @FXML private Button battleship;
    @FXML private Label battleshipCount;
    @FXML private Button carrier;
    @FXML private Label carrierCount;
    @FXML private Button continueBtn;
    @FXML private Button destroyer;
    @FXML private Label destroyerCount;
    @FXML private Label patrolCount;
    @FXML private Button patrolboat;
    @FXML private Button sizeFifteen;
    @FXML private Button sizeTen;
    @FXML private Button sizeTwelve;
    @FXML private Button submarine;
    @FXML private Label submarineCount;

    private int[] shipTypeCount = new int[5];
    private int gridSize = 0;
    private int capacity = 0;
    private final String TEN = "sizeTen";
    private final String TWELVE = "sizeTwelve";
    private final String FIFTEEN = "sizeFifteen";

    @FXML
    void switchToSetShip(ActionEvent event) throws IOException {
        App.setRoot("SetShip");
    }

    @FXML
    void addBattleship(ActionEvent event) {

        int value = increment(Index.BATTLESHIP);
        battleshipCount.setText(stringValue(value));

        if(tooManyShips(value, Size.BATTLESHIP)){
            displayError();
        }
    }

    @FXML
    void addCarrier(ActionEvent event) {

    
        int value = increment(Index.CARRIER);
        carrierCount.setText(stringValue(value));

        if(tooManyShips(value, Size.CARRIER)){
            displayError();
        }
    }

    @FXML
    void addDestroyer(ActionEvent event) {
        
        int value = increment(Index.DESTROYER);
        destroyerCount.setText(stringValue(value));

        if(tooManyShips(value, Size.DESTROYER)){
            displayError();
        }
    }

    @FXML
    void addPatrolBoat(ActionEvent event) {

        int value = increment(Index.PATROL_BOAT);
        patrolCount.setText(stringValue(value));

        if(tooManyShips(value, Size.PATROL_BOAT)){
            displayError();
        }
    }

    @FXML
    void addSubmarine(ActionEvent event) {

        int value = increment(Index.SUBMARINE);
        submarineCount.setText(stringValue(value));

        if(tooManyShips(value, Size.SUBMARINE)){
            displayError();
        }
    }

    @FXML
    void sizeSelected(ActionEvent event) {
        
        Button btn = (Button) event.getSource();
        disableSizeButtons();

        switch(btn.getId()){
            case TEN:     setGridSize(10); break;
            case TWELVE:  setGridSize(12); break;
            case FIFTEEN: setGridSize(15); break;
        }

    }

    private void setGridSize(int size){
        this.gridSize = size;

        setCapacity(size);
    }

    private void setCapacity(int amount){
        this.capacity = (amount * amount ) / 3;
    }

    private String stringValue(int value){
        return String.valueOf(value);
    }

    private int increment(int index){
        shipTypeCount[index]++;
        return shipTypeCount[index];
    }


    private boolean tooManyShips(int quantity, int shipSize){

        int space = shipSize * quantity;

        if(space > capacity)
            return true;

        capacity -= space;
     
        return false;
    }

    private void displayError(){

        Alert error = new Alert(AlertType.WARNING);
        error.setTitle(ErrorMessage.TITLE);
        error.setHeaderText(ErrorMessage.FREQUENCY);
        Optional<ButtonType> result = error.showAndWait();
        if(result.get() == ButtonType.OK){
            return;
        }
    }

    private void disableSizeButtons(){
        sizeTen.setDisable(true);
        sizeTwelve.setDisable(true);
        sizeFifteen.setDisable(true);
    }
}
