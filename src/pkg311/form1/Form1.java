/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311.form1;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Test
 */
public class Form1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      StackPane root = new StackPane();
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        Text scenetile = new Text("Welcome");
        scenetile.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
        grid.add(scenetile,0,0,2,1);
        Label userName = new Label("User Name: ");
        grid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        Label pw = new Label("Password");
        grid.add(pw, 0, 2);
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
       // grid.setGridLinesVisible(true);
        
        //button control
        Button btn = new Button("Sign In");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        //text control
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        btn.setOnAction((ActionEvent e) -> {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign In button pressed");
         });
            
        
        
     
        Scene scene = new Scene(grid, 300, 275);
        scene.getStylesheets().add(Form1.class.getResource("styles.css").toExternalForm());
        primaryStage.setTitle("IST 311 FORM 1");
        primaryStage.show(); 
        primaryStage.setScene(scene);
        
        
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
