package modelo;


import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;


public class Bombero {
   public String name;
   public String surName;
   public String adress;
   public String dni;
   public String email;
   Button disponibilidad;
    RadioButton incluir;

    public Bombero(String name, String surName, String adress, String dni, String email, Button disponibilidad, RadioButton incluir) {
        this.name = name;
        this.surName = surName;
        this.adress = adress;
        this.dni = dni;
        this.email = email;
        this.disponibilidad = disponibilidad;
        this.incluir = incluir;
    }

    public RadioButton getIncluir() {
        return incluir;
    }

    public void setIncluir(RadioButton incluir) {
        this.incluir = incluir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Button getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Button disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
