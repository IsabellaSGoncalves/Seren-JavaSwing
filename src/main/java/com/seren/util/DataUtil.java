package com.seren.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

// Classe utilitária para cálculo de idade através da data de nascimento.
public class DataUtil {

    // Método que retorna a idade calculada ondê o parâmetro é a data de nascimento.
    public static int calcularIdade(Date dataNascimento) {
        // Verificação para caso a data venha vazia, retornando 0. 
        if (dataNascimento == null) {
            return 0;
        }

        // Converte a data para data local considerando o fuso horário do sistema.
        LocalDate nascimento = dataNascimento.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        // Obtém a data atual/hoje e armazena em um objeto do tipo data local.
        LocalDate hoje = LocalDate.now();

        // Retorna o período entre a data de nascimento e hoje, de modo que seja em ano.
        return Period.between(nascimento, hoje).getYears();
    }
}
