/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.components;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author narie
 */
public class RoundedJDateChooser extends JDateChooser {

    private int cornerRadius;

    public RoundedJDateChooser(int cornerRadius) {
        super();
        this.cornerRadius = cornerRadius;

        setOpaque(false);
        setBorder(null);
        setBackground(Color.WHITE);

        customizeDateEditor();
    }

    private void customizeDateEditor() {
        // O editor do JDateChooser é um JTextField
        if (getDateEditor() instanceof JComponent) {
            JComponent editor = (JComponent) getDateEditor();
            editor.setOpaque(false);
            editor.setBorder(new EmptyBorder(5, 10, 5, 10));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Mantém o botão de calendário visível

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Preenchimento de fundo
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        // Borda
        g2.setColor(getForeground());
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius);

        g2.dispose();
    }

    @Override
    public void updateUI() {
        super.updateUI();
        customizeDateEditor(); // Garante que as mudanças se mantenham ao trocar de LookAndFeel
    }
}
