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


