/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.util;

/**
 *
 * @author Pichau
 */
public class ValidadorDadosUsuario implements Validador {

    private String username;
    private String email;
    private String telefone;
    private String senha;
    private String senhaConfirmar;

    public ValidadorDadosUsuario(String username, String email, String telefone, String senha, String senhaConfirmar) {
        this.username = username;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.senhaConfirmar = senhaConfirmar;
    }
    
    @Override
    public String validar() {
        if (email == null || email.isEmpty() || senha == null || senha.isEmpty()
                || telefone == null || telefone.isEmpty() || username == null || username.isEmpty()) {
            return "Preencha todos os campos.";
        }

        if (!email.contains("@")) {
            return "Insira um email válido!";
        }

        if (!senha.equals(senhaConfirmar)) {
            return "Senhas não coincidem!";
        }

        if (senha.length() < 8
                || !senha.matches(".*[A-Z].*")
                || !senha.matches(".*[!@#$%^&*()_+=|<>?{}\\[\\]~-].*")
                || !senha.matches(".*\\d.*")) {
            return "Insira uma senha com pelo menos 8 dígitos, letra maiúscula, caractere especial e números!";
        }

        telefone = telefone.replaceAll("[^\\d]", "");
        if (telefone.length() != 11) {
            return "Insira um número de telefone válido";
        }

        return null;
    }
}
