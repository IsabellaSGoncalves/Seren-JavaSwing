/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.model;

/**
 *
 * @author Pichau
 */
public class Usuario {

    private int id;
    private String nome;
    private String email;
    private long telefone;
    private String senha;

    public Usuario(String nome, String email, String telefone, String senha) {
        this.nome = nome;
        this.telefone = Long.parseLong(telefone);
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String email, String nome, long telefone, String senha) {
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
