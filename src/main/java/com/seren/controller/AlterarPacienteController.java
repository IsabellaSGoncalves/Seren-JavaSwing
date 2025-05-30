package com.seren.controller;

import com.seren.dao.PacienteDAO;
import com.seren.model.Paciente;
import java.util.Date;
import org.bson.types.ObjectId;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pichau
 */
public class AlterarPacienteController {
    private final PacienteDAO pacienteDAO;

    public AlterarPacienteController() {
        this.pacienteDAO = new PacienteDAO();
    }
    
    public boolean alterarPaciente(Paciente paciente) {
        boolean sucesso = pacienteDAO.alterarPaciente(paciente);
        return sucesso;
    }
}
