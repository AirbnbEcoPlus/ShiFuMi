module fr.endide.shifumi {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.endide.shifumi to javafx.fxml;
    exports fr.endide.shifumi;
}