import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import java.lang.Integer;
import java.lang.Double;
import javafx.scene.control.CheckBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioMenuItem;
import java.util.Random;

public class BoxFXMLController implements Initializable{
        @FXML
        private Button roll;
        @FXML
        private ImageView result;
        @FXML
        private RadioMenuItem fortnite;
        @FXML
        private RadioMenuItem r6Attack;
        @FXML
        private RadioMenuItem r6Defend;
        @FXML
        private Label textOutput;
        @FXML
        private MenuButton gameSelect;

        private int gameState = 0;

        private Random rand = new Random();

    @Override
    public void initialize(URL url, ResourceBundle rb){
        
    }  

    @FXML
    private void rollRandom(ActionEvent event){
        spin(event);

    }

    @FXML
    private void selectFortnite(ActionEvent event){
        gameState = 1;
        this.textOutput.setText("Fortnite: dropping on...");
        //this.gameSelect.setText("Fortnite");
    }
    @FXML
    private void selectR6Attack(ActionEvent event){
        gameState = 2;
        this.textOutput.setText("R6S: Attacking as...");
    }
    @FXML
    private void selectR6Defend(ActionEvent event){
        gameState = 3;
        this.textOutput.setText("R6S: Defending as...");
    }
    private int spin(ActionEvent event){
        if (gameState == 1){
            int value = rand.nextInt(6) + 1;
            System.out.println(value);
            return value;
        }
        else if (gameState == 2){
            int value = rand.nextInt(6) + 1;
            System.out.println(value);
            return value;
        }
        else if (gameState == 3){
            int value = rand.nextInt(6) + 1;
            System.out.println(value);
            return value;
        }
        else {
            this.textOutput.setText("Please select a game");
            return -1;
        }
    }
    private void showResult(){

    }
}