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
    public void tocarAlarme() {
        try {
            File audioFile = new File("alarm.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            ex.printStackTrace();
        }
    }
}
