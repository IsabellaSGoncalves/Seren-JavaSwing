/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.components;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;

import java.awt.*;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CustomJCalendar extends JCalendar {

    public CustomJCalendar() {
        super();
        setOpaque(true);

        estilizarComponentes();
    }

    private void estilizarComponentes() {
        JDayChooser dayChooser = getDayChooser();
        JMonthChooser monthChooser = getMonthChooser();
        JYearChooser yearChooser = getYearChooser();

        Font font = new Font("Segoe UI", Font.PLAIN, 13);
        Color fundo = Color.WHITE;
        Color texto = Color.BLUE;
        Color hojeFundo = new Color(0x0078D7); // Azul do Windows
        Color hojeTexto = Color.WHITE;

        int diaHoje = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int mesHoje = Calendar.getInstance().get(Calendar.MONTH);
        int anoHoje = Calendar.getInstance().get(Calendar.YEAR);

        Component[] dias = dayChooser.getDayPanel().getComponents();
        for (Component comp : dias) {
            if (comp instanceof JButton) {
                JButton btn = (JButton) comp;
                btn.setContentAreaFilled(false);
                btn.setFocusPainted(false);
                btn.setBorderPainted(false);
                btn.setOpaque(true);
                btn.setBackground(fundo);
                btn.setForeground(texto);
                btn.setFont(font);
                btn.setUI(new javax.swing.plaf.basic.BasicButtonUI());

                try {
                    int dia = Integer.parseInt(btn.getText());
                    Calendar cal = getCalendar();
                    int mes = cal.get(Calendar.MONTH);
                    int ano = cal.get(Calendar.YEAR);

                    if (dia == diaHoje && mes == mesHoje && ano == anoHoje) {
                        btn.setBackground(hojeFundo);
                        btn.setForeground(hojeTexto);
                    }
                } catch (NumberFormatException ignored) {
                }
            }
        }

        monthChooser.setBackground(fundo);
        monthChooser.setFont(font);
        monthChooser.getComboBox().setBackground(fundo);
        monthChooser.getComboBox().setFont(font);

        yearChooser.setBackground(fundo);
        yearChooser.setFont(font);
        yearChooser.getSpinner().setFont(font);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
