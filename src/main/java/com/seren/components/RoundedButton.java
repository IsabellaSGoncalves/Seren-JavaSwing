/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.components;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author narie
 */
public class RoundedButton extends JButton{
    private int cornerRadius;

    public RoundedButton(int radius) {
        this.cornerRadius = radius;
        
        setOpaque(false); // Diz para o swing que o padrão não deve ser implementado aqui
        setContentAreaFilled(false); // Impede o preenchimento padrão do botão
        setFocusPainted(false); // Remove a borda de foco pontilhada (Revisar sobre rover)
        setBorderPainted(false); // Desativa borda padrão pois ira aparecer quadrada (Revisar sobre rover)
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
}