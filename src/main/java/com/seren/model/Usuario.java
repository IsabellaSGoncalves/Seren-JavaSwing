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
public class Usuario {

    @BsonId
    private ObjectId id;
    private String nome;
    private String email;
    private long telefone;
    private String senha;
    
    // construtor para criar novo usuário 
    public Usuario(String nome, String email, String telefone, String senha) {
        this.id = new ObjectId();
        this.nome = nome;
        this.telefone = Long.parseLong(telefone);
        this.email = email;
        this.senha = senha;
    }
    
    // construtor para usuário vindo do banco
    public Usuario(ObjectId id, String nome, String email, long telefone, String senha) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

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
