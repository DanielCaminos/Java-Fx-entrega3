package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import modelo.Bombero;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnCancelar;

    @FXML
    private TableView<Bombero> tableView;

    @FXML
    private TableColumn<Bombero,Button> rbtnIncluir;

    @FXML
    private TableColumn<Bombero,String> colName;

    @FXML
    private TableColumn<Bombero,String> colSurName;

//    @FXML
//    private TableColumn<Bombero,String> colAdress;
//
//    @FXML
//    private TableColumn<Bombero,String> colDni;
//
//    @FXML
//    private TableColumn<Bombero,String> colEmail;

    @FXML
    private TableColumn<Bombero, Button> btnDispobilidad;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initTable();
        loadDate();

        EventHandler<MouseEvent> handler = (MouseEvent event) -> {
            Alert mensaje = new Alert(Alert.AlertType.ERROR);
            mensaje.setTitle("Error al ingresar fecha");
            mensaje.setHeaderText("Se ingreso una fecha invalida");
            mensaje.setContentText("Por favor ingrese un periodo valido para la guardia");
            mensaje.showAndWait();
        };
        btnAceptar.addEventHandler(MouseEvent.MOUSE_CLICKED,handler);

        EventHandler<MouseEvent> handler2 = (MouseEvent event) -> {
            Alert mensaje = new Alert(Alert.AlertType.ERROR);
            mensaje.setTitle("Error al ingresar bomberos");
            mensaje.setHeaderText("La cantidad de bomberos es insufiente para realizar una guardia");
            mensaje.setContentText("Por favor ingrese una canidad igual o mayor a 5 bomberos.");
            mensaje.showAndWait();
        };
//        btnCancelar.addEventHandler(MouseEvent.MOUSE_CLICKED,handler2);

        EventHandler<MouseEvent> handler3 = (MouseEvent event) -> {
            Stage stage2 = new Stage();
            Scene scene2 = null;
            try {
                scene2 = new Scene(FXMLLoader.load(getClass().getResource("/sample/disponibilidadBombero.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage2.setScene(scene2);
            stage2.setTitle("Disponibilidad Bombero");
            stage2.show();


        };
        btnCancelar.addEventHandler(MouseEvent.MOUSE_CLICKED,handler3);






    }



    private void initTable()
    {
        initCols();
    }



    private void initCols()

    {
        rbtnIncluir.setCellValueFactory(new PropertyValueFactory<>("incluir")) ;
        colName.setCellValueFactory(new PropertyValueFactory<>("name")) ;
        colSurName.setCellValueFactory(new PropertyValueFactory<>("surName")) ;
//        colAdress.setCellValueFactory(new PropertyValueFactory<>("adress")) ;
//        colDni.setCellValueFactory(new PropertyValueFactory<>("dni")) ;
//        colEmail.setCellValueFactory(new PropertyValueFactory<>("email")) ;
        btnDispobilidad.setCellValueFactory(new PropertyValueFactory<>("disponibilidad")) ;

    }
     private void loadDate()
     {
         ObservableList<Bombero> tabla = FXCollections.observableArrayList();
         tabla.add(new Bombero("Gonzalo","Ochoa","Bulevar las heras 234","38108244","saljkdha@gmail.com",new Button("Disponibilidad"), new RadioButton()));
         tabla.add(new Bombero("Pedro","Sandobal","Bulevar 150","65478214","pedro@gmail.com",new Button("Disponibilidad"), new RadioButton()));
         tabla.add(new Bombero("Marcelo","Heredia","Siempre Viva 150","95623878","maercelo@gmail.com",new Button("Disponibilidad"), new RadioButton()));
         tabla.add(new Bombero("Octavio","Santino","La callejuela 140","36145852","octavio@gmail.com",new Button("Disponibilidad"), new RadioButton()));
         tabla.add(new Bombero("Sandro","Sasia","Bulevar arcunia 789","36254121","sandro@gmail.com",new Button("Disponibilidad"), new RadioButton()));
         tabla.add(new Bombero("Benito","Gasparotto","Mitr 654","95142568","benito@gmail.com",new Button("Disponibilidad"), new RadioButton()));
         tabla.add(new Bombero("Angeles","Martinez","Bulevar las heras 639","36952899","angeles@gmail.com",new Button("Disponibilidad"), new RadioButton()));
         tabla.add(new Bombero("Dante","Perez","Recta martinioli 785","36525685","dante@gmail.com",new Button("Disponibilidad"), new RadioButton()));
         tableView.setItems(tabla);
     }
}
