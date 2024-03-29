module org.example.lab06_1b_210041102 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lab06_1b_210041102 to javafx.fxml;
    exports org.example.lab06_1b_210041102;
}