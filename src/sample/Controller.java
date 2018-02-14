package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private  loginModel model = new loginModel();
    //import object from scence builder
    @FXML
    private Label dbStatus;
    @FXML
    private Label loginStatus;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button btnLogin;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (this.model.isDatabaseConnection()){
            this.dbStatus.setText("Connectec to DB");
        }else {
            this.dbStatus.setText("Not Connect to DB");
        }

    }
}//class
