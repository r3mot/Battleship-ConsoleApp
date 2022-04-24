module battleship {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens battleship.Controllers to javafx.fxml;
    exports battleship;
}
