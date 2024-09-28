module com.example.logicalpractising {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.logicalpractising to javafx.fxml;
    exports com.example.logicalpractising;
}