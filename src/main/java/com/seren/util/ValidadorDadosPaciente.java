/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.util;

import java.util.Date;

/**
 *
 * @author Pichau
 */
public class ValidadorDadosPaciente implements Validador {

    private String nome;
    private String profissao;
    private String genero;
    private String estadoCivil;
    private String telefone;
    private String email;
    private String preferenciaContato;
    private Date dataNascimento;

    public ValidadorDadosPaciente(String nome, String profissao, String genero, String estadoCivil, String telefone, String email, String preferenciaContato, Date dataNascimento) {
        this.nome = nome;
        this.profissao = profissao;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.telefone = telefone;
        this.email = email;
        this.preferenciaContato = preferenciaContato;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String validar() {
        if (nome.isEmpty() || profissao.isEmpty() || genero.isEmpty() || estadoCivil.isEmpty()
                || telefone.isEmpty() || email.isEmpty() || preferenciaContato.isEmpty() || dataNascimento == null) {
            return "Preencha todos os campos.";
        }

        if (!email.contains("@")) {
            return "Insira um email válido!";
        }
        
        if(nome.matches(".*\\d.*")){
            return "Insira um nome que não contenha dígitos.";
        }

        telefone = telefone.replaceAll("[^\\d]", "");

        if (telefone.length() != 11) {
            return "O número de telefone deve conter 11 dígitos.";
        }

        if (telefone.length() != 11) {
            return "Insira um número de telefone válido";
        }

        int idade = DataUtil.calcularIdade(dataNascimento);
        if (idade < 18) {
            return "Paciente deve ter pelo menos 18 anos.";
        }

        return null;
    }

    public long getTelefone() {
        String telefoneNumero = telefone.replaceAll("[^\\d]", "");
        return Long.parseLong(telefoneNumero);
    }
    
}
