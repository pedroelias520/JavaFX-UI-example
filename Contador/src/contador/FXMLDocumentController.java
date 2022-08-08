/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package contador;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Mac
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    private ImageView imageLogo;
    private ImageView imageTitleLogo;
    FXMLLoader fxmlLoader = new FXMLLoader();
    String filePath = "HomeScreen/HomeScreenFXML.fxml";
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();    
    int height = (int)size.getHeight();
    int width = (int)size.getWidth();
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        try {                        
            fxmlLoader.setLocation(getClass().getResource(filePath));            
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setMaximized(true);
            stage.setTitle("New Window");            
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println("Deu errado: " + e);
        }
    }

    @FXML
    private void CloseSystem(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void ShowImage(ActionEvent event) {
        imageLogo = new ImageView(new Image(getClass().getResourceAsStream("./images/LOGO.png")));
        imageTitleLogo = new ImageView(new Image(getClass().getResourceAsStream("./images/NAME_HORIZONTAL.png")));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void pressButton(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HomeScreenFXML.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setFullScreen(true);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
