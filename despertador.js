import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Despertador {

    private static JComboBox<String> horaCombo, minutoCombo, segundoCombo;
    private static Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Despertador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 120);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Selecione a hora do alarme:");
        frame.add(label);

        String[] horas = new String[24];
        String[] minutosSegundos = new String[60];
        for (int i = 0; i < 60; i++) {
            String valor = String.format("%02d", i);
            if (i < 24) horas[i] = valor;
            minutosSegundos[i] = valor;
        }

        horaCombo = new JComboBox<>(horas);
        minutoCombo = new JComboBox<>(minutosSegundos);
        segundoCombo = new JComboBox<>(minutosSegundos);

        frame.add(horaCombo);
        frame.add(new JLabel(":"));
        frame.add(minutoCombo);
        frame.add(new JLabel(":"));
        frame.add(segundoCombo);

        JButton botao = new JButton("Definir Alarme");
        frame.add(botao);

        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String horaAlarme = horaCombo.getSelectedItem() + ":" +
                                    minutoCombo.getSelectedItem() + ":" +
                                    segundoCombo.getSelectedItem();

                if (timer != null) timer.cancel();

                timer = new Timer();
                timer.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        String horaAtual = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                        if (horaAtual.equals(horaAlarme)) {
                            tocarAlarme();
                            timer.cancel();
                        }
                    }
                }, 0, 1000);
            }
        });

        frame.setVisible(true);
    }

    private static void tocarAlarme() {
        try {
            File audioFile = new File("alarm.wav");  
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            JOptionPane.showMessageDialog(null, "Alarme Disparado!");
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            ex.printStackTrace();
        }
    }
}
