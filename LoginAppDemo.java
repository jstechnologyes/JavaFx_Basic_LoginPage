
package loginapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class LoginAppDemo extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       
        BorderPane pane=new BorderPane();
        pane.setMinHeight(300);
        pane.setMinWidth(500);
        
        VBox vbox = new VBox();
        vbox.setMinHeight(50);
        vbox.setMinWidth(USE_COMPUTED_SIZE);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-border-color:black; -fx-border-width: 0 0 2 0; -fx-background-color:whitesmoke;");
        Label label= new Label("JS Technologyes");
       
       
        vbox.getChildren().add(label);
        pane.setTop(vbox);
       
        
        VBox vbox1 = new VBox();
        vbox1.setMinHeight(USE_COMPUTED_SIZE);
        vbox1.setMinWidth(USE_COMPUTED_SIZE);
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setSpacing(20);
        pane.setCenter(vbox1);
        
        TextField userField = new TextField();
        TextField passwordField = new TextField();
        Button btn = new Button("Submit");
        Label label1 = new Label();
               
        
        userField.setMaxWidth(250);
        passwordField.setMaxWidth(250);
        
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String username=userField.getText();
                String password = passwordField.getText();
                
                if(username.equals("java")&& password.equals("123")){
                    label1.setText("Success");
                }else{
                     label1.setText("Wrong");
                }
                
            }
        });
        vbox1.getChildren().addAll(userField, passwordField, btn, label1);
        
        
        
        Scene scene =new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        
        
        
    }
    
    
    
}
