/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.controller;

import com.seren.dao.PacienteDAO;
import org.bson.types.ObjectId;

/**
 *
 * @author Pichau
 */
public class ExcluirPacienteController {
        private final PacienteDAO pacienteDAO;

    public ExcluirPacienteController() {
        this.pacienteDAO = new PacienteDAO();
    }
    
    public boolean excluirPaciente(ObjectId id){
        boolean sucesso = pacienteDAO.excluirPaciente(id);
        return sucesso;
    }
}
