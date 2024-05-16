module co.uniquindio.edu.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.edu.javafx to javafx.fxml;
    exports co.uniquindio.edu.javafx;

    opens co.uniquindio.edu.javafx.Controlador;
    exports co.uniquindio.edu.javafx.Controlador;

    opens co.uniquindio.edu.javafx.Modelo;
    exports co.uniquindio.edu.javafx.Modelo;
}
