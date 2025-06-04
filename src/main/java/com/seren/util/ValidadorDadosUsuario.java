package com.seren.util;

// Classe utilitária responsável por validar os dados antes da criação de um objeto do tipo Usuário.
// Implementa a interface Validador.
public class ValidadorDadosUsuario implements Validador {

    // Atributos essenciais para o construtor de Usuário.
    private String username;
    private String email;
    private String telefone;
    private String senha;
    private String senhaConfirmar;

    // Construtor para inicializar os dados a serem validados.
    public ValidadorDadosUsuario(String username, String email, String telefone, String senha, String senhaConfirmar) {
        this.username = username;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.senhaConfirmar = senhaConfirmar;
    }

    // Implementação do método validar da interface, utilizando sobrescrita, realizando polimorfismo.
    @Override
    public String validar() {

        // Verificação se os dados estão vazios, retornando uma String que será utilizada como mensagem de erro.
        if (email == null || email.isEmpty() || senha == null || senha.isEmpty()
                || telefone == null || telefone.isEmpty() || username == null || username.isEmpty()) {
            return "Preencha todos os campos.";
        }

        // Verificação se o email possui "@". 
        if (!email.contains("@")) {
            return "Insira um email válido!";
        }

        // Verifica se as senhas coincidem
        if (!senha.equals(senhaConfirmar)) {
            return "Senhas não coincidem!";
        }

        // Verificando se a senha é segura atendendo os critérios de letra maiúscula, caractere especial e números.
        if (senha.length() < 8
                || !senha.matches(".*[A-Z].*")
                || !senha.matches(".*[!@#$%^&*()_+=|<>?{}\\[\\]~-].*")
                || !senha.matches(".*\\d.*")) {
            return "Insira uma senha com pelo menos 8 dígitos, letra maiúscula, caractere especial e números!";
        }

        // Remoção de qualquer caractere que não seja dígito do número de telefone.
        telefone = telefone.replaceAll("[^\\d]", "");

        // Valida se o telefone tem 11 dígitos, contando DDD + números. 
        if (telefone.length() != 11) {
            return "Insira um número de telefone válido";
        }

        // Mensagem de erro não será retornada se os dados forem válidos. 
        return null;
    }
}
