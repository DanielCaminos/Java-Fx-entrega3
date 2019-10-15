package modelo;

import com.jfoenix.controls.JFXTimePicker;

public class DisponibilidadBombero {
    public String dia;
    public String horaDisponibleDesde;
    public String horaDisponibleHasta;
    public JFXTimePicker horaDesdeGuardia;
    public JFXTimePicker horaHastaGuardia;

    public DisponibilidadBombero(String dia, String horaDisponibleDesde, String horaDisponibleHasta, JFXTimePicker horaDesdeGuardia, JFXTimePicker horaHastaGuardia) {
        this.dia = dia;
        this.horaDisponibleDesde = horaDisponibleDesde;
        this.horaDisponibleHasta = horaDisponibleHasta;
        this.horaDesdeGuardia = horaDesdeGuardia;
        this.horaHastaGuardia = horaHastaGuardia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraDisponibleDesde() {
        return horaDisponibleDesde;
    }

    public void setHoraDisponibleDesde(String horaDisponibleDesde) {
        this.horaDisponibleDesde = horaDisponibleDesde;
    }

    public String getHoraDisponibleHasta() {
        return horaDisponibleHasta;
    }

    public void setHoraDisponibleHasta(String horaDisponibleHasta) {
        this.horaDisponibleHasta = horaDisponibleHasta;
    }

    public JFXTimePicker getHoraDesdeGuardia() {
        return horaDesdeGuardia;
    }

    public void setHoraDesdeGuardia(JFXTimePicker horaDesdeGuardia) {
        this.horaDesdeGuardia = horaDesdeGuardia;
    }

    public JFXTimePicker getHoraHastaGuardia() {
        return horaHastaGuardia;
    }

    public void setHoraHastaGuardia(JFXTimePicker horaHastaGuardia) {
        this.horaHastaGuardia = horaHastaGuardia;
    }
}
