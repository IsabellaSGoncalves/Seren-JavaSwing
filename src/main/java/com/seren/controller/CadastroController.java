/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.controller;

import com.seren.dao.UsuarioDAO;
import com.seren.model.Usuario;

/**
 *
 * @author Pichau
 */
public class CadastroController {
    
    private final UsuarioDAO usuarioDAO;

    public CadastroController() {
        this.usuarioDAO = new UsuarioDAO();
    }
    
    public boolean cadastrarUsuario(String nome, String email, String telefone, String senha) {
        Usuario usuario = new Usuario( nome, email, telefone, senha);
        boolean sucesso = usuarioDAO.cadastrar(usuario);
        return sucesso;
    }
    
}
