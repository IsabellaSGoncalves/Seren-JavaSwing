/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.controller;

import com.seren.dao.PacienteDAO;
import com.seren.model.Paciente;
import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author Pichau
 */
public class CriarPacienteController {

    private final PacienteDAO pacienteDAO;

    public CriarPacienteController() {
        this.pacienteDAO = new PacienteDAO();
    }

    public boolean criarPaciente(String nome, String profissao, String genero, String estadoCivil, 
        String telefone, String email, String preferenciaContato, Date dataNascimento, ObjectId id_usuario ) {
        Paciente paciente = new Paciente(nome, profissao, genero, estadoCivil, telefone, email, preferenciaContato, dataNascimento, id_usuario);
        boolean sucesso = pacienteDAO.cadastrarPaciente(paciente);
        return sucesso;
    }
    
}
