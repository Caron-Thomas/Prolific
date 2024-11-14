package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXTosco extends Application {



    @Override
    public void start(Stage primaryStage) {
        // Criando um rótulo (label)
        Label label = new Label("Hello, JavaFX!");

        // Criando um botão
        Button button = new Button("Click Me");
        button.setOnAction(e -> label.setText("Button Clicked!"));

        // Organizando o layout
        VBox layout = new VBox(10); // Espaçamento de 10px entre os elementos
        layout.getChildren().addAll(label, button);

        // Configurando a cena (scene)
        Scene scene = new Scene(layout, 300, 200);

        // Configurando o palco (stage)
        primaryStage.setTitle("JavaFX Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Inicia a aplicação JavaFX
    }
}

