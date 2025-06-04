/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.controller;

import com.seren.dao.PacienteDAO;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Pichau
 */
public class BuscarPacientesController {
    protected final PacienteDAO pacienteDAO;

    public BuscarPacientesController() {
        this.pacienteDAO = new PacienteDAO();
    }
    
    public ArrayList<Document> buscarPacientes(ObjectId id){
        ArrayList<Document> sucesso = pacienteDAO.buscarPaciente(id);
        return sucesso;
    }

}
