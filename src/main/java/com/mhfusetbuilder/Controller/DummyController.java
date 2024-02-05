package com.mhfusetbuilder.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DummyController {
	@FXML
	private Label welcomeText;

	@FXML
	protected void onHelloButtonClick() {
		welcomeText.setText("Welcome to JavaFX Application!");
	}
}