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
public class LoginController {
     private final UsuarioDAO usuarioDAO;

    public LoginController() {
        this.usuarioDAO = new UsuarioDAO();
    }
    
    public Usuario loginUsuario(String email, String senha){
        Usuario sucesso = usuarioDAO.logar(email, senha);
        return sucesso;
    }
}
