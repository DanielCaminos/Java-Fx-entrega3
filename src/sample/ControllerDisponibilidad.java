package sample;


import com.jfoenix.controls.JFXTimePicker;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import modelo.DisponibilidadBombero;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerDisponibilidad implements Initializable {

    @FXML
    private TableView<DisponibilidadBombero> tableDispobilidad;

    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnCancelar;

    @FXML
    private TableColumn<DisponibilidadBombero, String> colDias;

    @FXML
    private TableColumn<DisponibilidadBombero, String> colDesdeDisponible;

    @FXML
    private TableColumn<DisponibilidadBombero, String> colHastaDisponible;

    @FXML
    private TableColumn<DisponibilidadBombero,JFXTimePicker > colDesdeGuardia;

    @FXML
    private TableColumn<DisponibilidadBombero, JFXTimePicker> colHastaGuardia;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initTable();
        loadDate();

        EventHandler<MouseEvent> handler1 = (MouseEvent event) -> {
            Alert mensaje = new Alert(Alert.AlertType.ERROR);
            mensaje.setTitle("Error al ingresar rango");
            mensaje.setHeaderText("El rango horario ingresado no esta disponible");
            mensaje.setContentText("Por favor ingrese un rango contemplado en el intervalo .");
            mensaje.showAndWait();
        };
        btnAceptar.addEventHandler(MouseEvent.MOUSE_CLICKED,handler1);

    }




    private void initTable()
    {
        initCols();
    }



    private void initCols()
//    String dia, String horaDisponibleDesde, String horaDisponibleHasta, JFXTimePicker horaDesdeGuardia, com.jfoenix.controls.JFXTimePicker horaHastaGuardia
    {
        colDias.setCellValueFactory(new PropertyValueFactory<>("dia")) ;
        colDesdeDisponible.setCellValueFactory(new PropertyValueFactory<>("horaDisponibleDesde")) ;
        colHastaDisponible.setCellValueFactory(new PropertyValueFactory<>("horaDisponibleHasta")) ;
        colDesdeGuardia.setCellValueFactory(new PropertyValueFactory<>("horaDesdeGuardia")) ;
        colHastaGuardia.setCellValueFactory(new PropertyValueFactory<>("horaHastaGuardia")) ;


    }
      private void loadDate()
    {
        ObservableList<DisponibilidadBombero> tabla = FXCollections.observableArrayList();
        tabla.add(new DisponibilidadBombero("Lunes","8:00 am","12:00 pm",new JFXTimePicker() ,new JFXTimePicker()));
        tabla.add(new DisponibilidadBombero("Martes","10:00 am","6:00 pm",new JFXTimePicker() ,new JFXTimePicker()));
        tabla.add(new DisponibilidadBombero("Miercoles","9:00 am","1:00 am",new JFXTimePicker() ,new JFXTimePicker()));
        tabla.add(new DisponibilidadBombero("Jueves","8:00 am","12:50 pm",new JFXTimePicker() ,new JFXTimePicker()));
        tabla.add(new DisponibilidadBombero("Viernes","7:00 am","13:00 pm",new JFXTimePicker() ,new JFXTimePicker()));
        tabla.add(new DisponibilidadBombero("Sabado","4:00 am","11:00 am",new JFXTimePicker() ,new JFXTimePicker()));
        tabla.add(new DisponibilidadBombero("Domingo","6:00 am","6:00 am",new JFXTimePicker() ,new JFXTimePicker()));

        tableDispobilidad.setItems(tabla);
    }

}

