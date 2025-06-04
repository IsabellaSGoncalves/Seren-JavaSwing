package com.seren.util;

// Interface que define um contrato para as classes utilitárias que realizam a validação de dados, 
// sendo de extrema importância a implementação do método validar, de modo que retorne uma String de mensagem de erro.
public interface Validador {

    String validar();
}
