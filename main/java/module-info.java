module com.example.applicationnote {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.applicationnote to javafx.fxml;
    exports com.example.applicationnote;
    exports com.example.applicationnote.classes;
    opens com.example.applicationnote.classes to javafx.fxml;
}