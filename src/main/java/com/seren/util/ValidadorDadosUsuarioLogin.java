/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.util;

/**
 *
 * @author Pichau
 */
public class ValidadorDadosUsuarioLogin implements Validador {
    private String email;
    private String senha;

    public ValidadorDadosUsuarioLogin(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    public String validar() {
        if (email == null || email.isEmpty() || senha == null || senha.isEmpty()) {
            return "Preencha todos os campos.";
        }

        if (!email.contains("@")) {
            return "Insira um email válido!";
        }

        return null;
    }
}