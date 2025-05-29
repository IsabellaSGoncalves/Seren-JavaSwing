/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.util;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Pichau
 */
public class DataUtil {
    public static int calcularIdade(Date dataNascimento) {
        if (dataNascimento == null) return 0;

        LocalDate nascimento = dataNascimento.toInstant()
                                             .atZone(ZoneId.systemDefault())
                                             .toLocalDate();

        LocalDate hoje = LocalDate.now();

         return Period.between(nascimento, hoje).getYears();
    }
}