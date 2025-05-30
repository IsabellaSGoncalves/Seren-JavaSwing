/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.model;

import com.seren.util.DataUtil;
import java.util.Date;
import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

/**
 *
 * @author Pichau
 */
public class Paciente {
    @BsonId
    private ObjectId id;
    private String nome;
    private String profissao;
    private String genero;
    private String estadoCivil;
    private long telefone;
    private String email;
    private String preferenciaContato;
    private Date dataNascimento;
    private ObjectId id_usuario;

    // construtor para novo paciente
    public Paciente(String nome, String profissao, String genero, String estadoCivil, String telefone, 
    String email, String preferenciaContato, Date dataNascimento, ObjectId id_usuario) {
        this.id = new ObjectId();
        this.nome = nome;
        this.profissao = profissao;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.telefone = Long.parseLong(telefone);
        this.email = email;
        this.preferenciaContato = preferenciaContato;
        this.dataNascimento = dataNascimento;
        this.id_usuario = id_usuario;
    }
    
    // construtor para paciente vindo do banco
    public Paciente(ObjectId id, String nome, String profissao, String genero, String estadoCivil, Long telefone, 
    String email, String preferenciaContato, Date dataNascimento, ObjectId id_usuario) {
        this.id = id;
        this.nome = nome;
        this.profissao = profissao;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.telefone = telefone;
        this.email = email;
        this.preferenciaContato = preferenciaContato;
        this.dataNascimento = dataNascimento;
        this.id_usuario = id_usuario;
    }
    
    // construtor para paciente que foi recebido como documento do banco
    public static Paciente pacienteDocumento(Document doc) {
    return new Paciente(
        doc.getObjectId("_id"),              
        doc.getString("nome"),
        doc.getString("profissao"),
        doc.getString("genero"),
        doc.getString("estadoCivil"),
        doc.getLong("telefone"),
        doc.getString("email"),
        doc.getString("preferenciaContato"),
        doc.getDate("dataNascimento"),
        doc.getObjectId("id_usuario")
    );
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

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero (String genero){
        this.genero = genero;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPreferenciaContato() {
        return preferenciaContato;
    }

    public void setPreferenciaContato(String preferenciaContato) {
        this.preferenciaContato = preferenciaContato;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ObjectId getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(ObjectId id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    // método para retornar a idade com cálculo baseado na data de nascimento
    public int getIdade() {
        return DataUtil.calcularIdade(dataNascimento);
    }
    
}
