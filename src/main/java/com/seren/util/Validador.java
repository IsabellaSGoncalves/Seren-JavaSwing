/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.util;

/**
 *
 * @author Pichau
 */

// Interface que define um contrato para as classes utilitárias que realizam a validação de dados, 
// sendo de extrema importância a implementação do método validar, de modo que retorne uma String de mensagem de erro.
public interface Validador {
    String validar();
}

