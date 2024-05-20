package com.codedotorg;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;

public class PetSelectionScene extends PetApp {

    /** The name of the pet provided by the user */
    private String petName;

    /** The type of pet chosen by the user */
    private String petType;

    /**
     * This class represents a scene for selecting a pet. It extends the Scene class and
     * provides a constructor for initializing the pet name and type.
     */
    public PetSelectionScene(Stage window, int width, int height, String petName, String petType) {
        super(window, width, height);

        this.petName = petName;
        this.petType = petType;
    }

    /**
     * This method starts the application by creating a VBox layout for pet selection
     * and setting it as the scene to be displayed.
     */
    public void startApp() {
        VBox petSelectionLayout = createPetSelectionLayout();
        setAndShowScene(petSelectionLayout);
    }

    /**
     * Sets petName to the name entered by the user
     */
    public void setPetName() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Pet Name");
        dialog.setHeaderText("Enter your pet's name:");
        dialog.setContentText("Name:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(name -> this.petName = name);
        

    }

    /**
     * Sets petType to the type of pet chosen by the user
     */
    public void setPetType() {



    }

    /**
     * Creates the main layout for the PetSelection scene
     * 
     * @return the VBox layout for the PetSelection scene
     */
    public VBox createPetSelectionLayout() {


        return null;
    }

    /**
     * Creates a submit button that, when clicked, creates a new MainScene object with
     * the given pet name and type, and displays it.
     *
     * @return the submit button
     */
    public Button createSubmitButton() {
        Button tempButton = new Button("Submit");

        tempButton.setOnAction(event -> {
            MainScene mainScene = new MainScene(getWindow(), getWidth(), getHeight(), petName, petType);
            mainScene.showMainScene();
        });

        return tempButton;
    }

}