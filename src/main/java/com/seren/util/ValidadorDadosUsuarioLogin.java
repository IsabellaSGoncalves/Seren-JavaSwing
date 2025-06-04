package com.seren.util;

// Classe utilitária responsável por validar os dados antes da autenticação para a controller de Login.
// Implementa a interface Validador.
public class ValidadorDadosUsuarioLogin implements Validador {

    // Atributos essenciais para a autenticação.
    private String email;
    private String senha;

    // Construtor para inicializar os dados a serem validados.
    public ValidadorDadosUsuarioLogin(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    // Implementação do método validar da interface, utilizando sobrescrita, realizando polimorfismo.
    @Override
    public String validar() {

        // Verificação se os dados estão vazios, retornando uma String que será utilizada como mensagem de erro.
        if (email == null || email.isEmpty() || senha == null || senha.isEmpty()) {
            return "Preencha todos os campos.";
        }

        // Verificação se o email possui "@". 
        if (!email.contains("@")) {
            return "Insira um email válido!";
        }

        // Mensagem de erro não será retornada se os dados forem válidos. 
        return null;
    }
}
