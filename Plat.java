package brickbraker;

import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Plat {

    private Rectangle platform;
    private int xVel;

    public Plat(Pane gamePane){
        this.platform = new Rectangle(260,530,80,10);
        this.platform.setFill(Color.WHITE);
        gamePane.getChildren().add(platform);
        gamePane.setOnKeyPressed(this::handleKeyPress);
        gamePane.setOnKeyReleased(this::handleKeyRelease);
    }

    private void handleKeyPress(KeyEvent e){
        switch (e.getCode()) {
            case LEFT:
                this.xVel = -5;
                break;
            case RIGHT:
                this.xVel = 5;
                break;
            default:
                break;
        }
    }

    private void handleKeyRelease(KeyEvent e){
        switch (e.getCode()) {
            case LEFT:
            case RIGHT:
                this.xVel = 0;
                break;
            default:
                break;
        }
    }

    public void move(){
        this.platform.setLayoutX(this.platform.getLayoutX() + this.xVel);
    }
}
