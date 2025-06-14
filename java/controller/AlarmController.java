package controller;
import model.AlarmModel;
import view.AlarmView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class AlarmController {
    private AlarmView view;
    private AlarmModel model;
    private Timer timer;

    public AlarmController(AlarmView view, AlarmModel model) {
        this.view = view;
        this.model = model;
        this.view.adicionarAcaoBotao(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                definirAlarme();
            }
        });
    }
    private void definirAlarme() {
        model.setHoraAlarme(view.getHoraSelecionada());
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
