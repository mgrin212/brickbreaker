package brickbraker;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class PaneOrganizer {

    private BorderPane root;

    public PaneOrganizer(){
        this.root = new BorderPane();
        this.makeGame();
    }

    public Pane getRoot() {
        return root;
    }

    private void makeGame(){
        Pane gamePane = new Pane();
        gamePane.setFocusTraversable(true);
        this.root.setCenter(gamePane);
        Game game = new Game(gamePane);
    }
}
