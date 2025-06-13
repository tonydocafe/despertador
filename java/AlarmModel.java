package model;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class AlarmModel {

    private String horaAlarme;

    public void setHoraAlarme(String hora) {
        this.horaAlarme = hora;
    }

    public String getHoraAlarme() {
        return this.horaAlarme;
    }

    public boolean deveTocar(String horaAtual) {
        return horaAtual.equals(horaAlarme);
    }
