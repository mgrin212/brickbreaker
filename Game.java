package brickbraker;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Game{

    private Pane gamePane;
    private Plat platform;

    public Game(Pane gamePane){
       this.gamePane = gamePane;
       this.makeGame();
       this.setUpTimeline();
    }

    private void makeGame(){
        this.gamePane.setStyle("-fx-background-color: #000000");
        this.platform = new Plat(this.gamePane);
    }

    private void setUpTimeline(){
        KeyFrame kf = new KeyFrame(Duration.seconds(Constants.DURATION), this::updateTimeline);
        Timeline timeline = new Timeline(kf);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private void updateTimeline(ActionEvent e){
        this.platform.move();
    }
}
