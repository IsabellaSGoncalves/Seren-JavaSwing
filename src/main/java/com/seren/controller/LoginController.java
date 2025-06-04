package com.seren.controller;

import com.seren.dao.UsuarioDAO;
import com.seren.model.Usuario;

// Classe controller responsável por gerenciar a lógica de login de usuários.
// Atua como intermediária entre a view Login e a UsuarioDAO.
public class LoginController {
    
    // Instância da classe UsuarioDAO, responsável pelas operações no banco de dados para a entidade Usuario.
    private final UsuarioDAO usuarioDAO;
    
    // Construtor da classe controller, inicializa o objeto DAO para uso no método loginUsuario.
    public LoginController() {
        this.usuarioDAO = new UsuarioDAO();
    }
    
    // Método que executa a operação de login de um usuário.
    // Recebe como parâmetros o email e a senha digitados pelo usuário.
    // Repassa os dados para a DAO, que realiza a verificação 
    // e retorna o objeto do tipo Usuario(caso dados estejam concretos) ou null(dados errados).
    public Usuario loginUsuario(String email, String senha){
        Usuario sucesso = usuarioDAO.logar(email, senha);
        return sucesso;
    }
}
