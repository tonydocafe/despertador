package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AlarmView extends JFrame {
    private JComboBox<String> horaCombo, minutoCombo, segundoCombo;
    private JButton botao;
    
    public AlarmView() {
        setTitle("Despertador");
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(new JLabel("Selecione a hora do alarme:"));
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
        add(horaCombo);
        add(new JLabel(":"));
        add(minutoCombo);
        add(new JLabel(":"));
        add(segundoCombo);
        add(botao);
        setVisible(true);
    }
    public String getHoraSelecionada() {
        return horaCombo.getSelectedItem() + ":" +
               minutoCombo.getSelectedItem() + ":" +
               segundoCombo.getSelectedItem();
    }
    public void adicionarAcaoBotao(ActionListener listener) {
        botao.addActionListener(listener);
    }
    public void mostrarMensagem(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }
}
