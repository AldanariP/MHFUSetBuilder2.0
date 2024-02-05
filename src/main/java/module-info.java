module com.mhfusetbuilder {
	requires javafx.controls;
	requires javafx.fxml;

	requires org.controlsfx.controls;
	requires net.synedra.validatorfx;
	requires org.kordamp.ikonli.javafx;
	requires org.kordamp.bootstrapfx.core;

	opens com.mhfusetbuilder to javafx.fxml;
	exports com.mhfusetbuilder;
}