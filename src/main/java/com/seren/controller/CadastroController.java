package com.seren.controller;

import com.seren.dao.UsuarioDAO;
import com.seren.model.Usuario;

// Classe controller responsável por gerenciar a lógica de cadastro de usuários.
// Atua como intermediária entre a view Cadastro e a UsuarioDAO.
public class CadastroController {

    // Instância da classe UsuarioDAO, responsável pelas operações no banco de dados para a entidade Usuario.
    private final UsuarioDAO usuarioDAO;

    // Construtor da classe controller, inicializa o objeto DAO para uso no método cadastrarUsuario.
    public CadastroController() {
        this.usuarioDAO = new UsuarioDAO();
    }

    // Método que executa a operação de cadastro de um novo usuário.
    // Recebe os dados para cadastro de um usuário como parâmetros, cria um objeto Usuario, e repassa para a DAO.
    // Retorna o "true"(cadastro sucedido)/"false"(usuário já existente) recebido da DAO.
    public boolean cadastrarUsuario(String nome, String email, String telefone, String senha) {
        Usuario usuario = new Usuario(nome, email, telefone, senha);
        boolean sucesso = usuarioDAO.cadastrar(usuario);
        return sucesso;
    }

}
