module com.example.applicationnote {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.applicationnote to javafx.fxml;
    exports com.example.applicationnote;
}