/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.controller;

import java.util.ArrayList;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Pichau
 */
public class BuscarPacienteController extends BuscarPacientesController {
    
     public ArrayList<Document> buscarPacientes(ObjectId id, String nome){
        ArrayList<Document> sucesso = pacienteDAO.buscarPaciente(id, nome);
        return sucesso;
    }
}
