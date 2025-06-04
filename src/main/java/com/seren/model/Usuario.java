/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.model;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

/**
 *
 * @author Pichau
 */

// Classe Usuario que representa a entidade Usuário armazenada como documento no MongoDB. 
// Demonstrando encapsulamento através de atributos privados com getters e setters.
public class Usuario {
    
    // Atributos essenciais para a identificação e login do usuário.
    // Marcação que indica que este id se trata do ObjectId localizado no banco de dados.
    @BsonId
    private ObjectId id;
    private String nome;
    private String email;
    private long telefone;
    private String senha;
    
    // Construtor para criar um novo usuário, com a criação de um novo id e formatação do telefone. 
    public Usuario(String nome, String email, String telefone, String senha) {
        this.id = new ObjectId();
        this.nome = nome;
        this.telefone = Long.parseLong(telefone);
        this.email = email;
        this.senha = senha;
    }
    
    // Construtor para usuário vindo do banco.
    public Usuario(ObjectId id, String nome, String email, long telefone, String senha) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }
    
    // Getters e Setters
    public ObjectId getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
