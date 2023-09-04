module com.thijmen.hypo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.thijmen.hypo to javafx.fxml;
    exports com.thijmen.hypo;
}