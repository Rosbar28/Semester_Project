/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojecfinal;

import javafx.application.Application;
import static javafx.application.Application.launch;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author rosybarbaro
 */
public class SemesterProjectFinal extends Application{

    
    public static void main(String[] args) {
     launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
    Parent root = FXMLLoader.load(getClass().getResource("SemesterProjectFinal.fxml"));
   
        
        Scene scn = new Scene(root,800, 300);
        stage.setScene(scn);
        stage.setTitle("Card Game Instructions");
        stage.show();


    }
    
}
    
