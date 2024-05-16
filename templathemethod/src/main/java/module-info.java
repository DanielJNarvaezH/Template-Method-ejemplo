module co.uniquindio.edu.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.edu.javafx to javafx.fxml;
    exports co.uniquindio.edu.javafx;
}
