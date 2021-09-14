module converter {
    requires javafx.fxml;
    requires javafx.controls;

    opens controller;
    opens gui;

    //look up the module-info --> reason why it errors out
}