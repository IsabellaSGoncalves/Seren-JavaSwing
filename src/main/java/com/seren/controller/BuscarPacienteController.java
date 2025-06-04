package com.seren.controller;

import java.util.ArrayList;
import org.bson.Document;
import org.bson.types.ObjectId;

// Classe controller que estende/herda BuscarPacientesController para especializar a lógica de busca de apenas um paciente.
// Atua como intermediária entre a view TelaBuscarPaciente e a PacienteDAO.
public class BuscarPacienteController extends BuscarPacientesController {

    // Método que executa a operação de busca de um paciente, recebe, como parâmetro, um id(do usuário) e o nome de um paciente.
    // Repassa os dados para a DAO e retorna a ArrayList com o paciente recebido. 
    public ArrayList<Document> buscarPacientes(ObjectId id, String nome) {
        ArrayList<Document> sucesso = pacienteDAO.buscarPaciente(id, nome);
        return sucesso;
    }
}
