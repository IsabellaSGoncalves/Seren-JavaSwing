/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author narie
 */
public class RoundedButton extends JButton {

    private int cornerRadius;
    private Color originalBackground;

    public RoundedButton(int radius) {
        this.cornerRadius = radius;

        setOpaque(false); // Diz para o swing que o padrão não deve ser implementado aqui
        setContentAreaFilled(false); // Impede o preenchimento padrão do botão
        setFocusPainted(false); // Remove a borda de foco pontilhada (Revisar sobre rover)
        setBorderPainted(false); // Desativa borda padrão pois ira aparecer quadrada (Revisar sobre rover)

        originalBackground = getBackground(); //Guardando a cor original

        addMouseListener(new MouseAdapter() {//Adaptando mouseAdapter para implementar houver
            @Override
            public void mouseEntered(MouseEvent e) { //Quando o mouse passa por cima
                originalBackground = getBackground(); // Garante que eu armazenei a cor correta
                setBackground(darkenColor(originalBackground, 0.8f)); //passando a cor original e o factor que ela dese ser multiplicada para o metodo darkenColor
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) { //Quando o mouse sai de cima
                setBackground(originalBackground); //Seta a cor original
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        // Suaviza as bordas (Revisar sobre rover)
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Cor de fundo personalizada pega a que definimos na tela
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        g2.dispose();

        // Desenha texto e ícones
        super.paintComponent(g);
    }

    private Color darkenColor(Color color, float factor) { //metodo para escurecer a cor do background
        int r = Math.max((int) (color.getRed() * factor), 0);
        int g = Math.max((int) (color.getGreen() * factor), 0);
        int b = Math.max((int) (color.getBlue() * factor), 0);
        return new Color(r, g, b, color.getAlpha()); //retorna a cor do botão ao passar o mouse por cima
    }
}
