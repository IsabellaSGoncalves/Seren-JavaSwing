package com.seren.controller;

import com.seren.dao.PacienteDAO;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.types.ObjectId;

// Classe controller responsável por realizar a busca de todos os pacientes vinculados a um usuário.
// Atua como intermediária entre a view TelaPacientes e a PacienteDAO.
public class BuscarPacientesController {

    // Instância protegida de PacienteDAO, permitindo o acesso pela classe filha BuscarPacienteController.
    protected final PacienteDAO pacienteDAO;

    // Construtor da classe controller, inicializa o objeto DAO para ser usado nos métodos de busca.
    public BuscarPacientesController() {
        this.pacienteDAO = new PacienteDAO();
    }

    // Método que executa a operação de busca de pacientes, recebendo como parâmetro o id do usuário.
    // Repassa o id para a DAO e retorna uma ArrayList com todos os pacientes recebidos.
    public ArrayList<Document> buscarPacientes(ObjectId id) {
        ArrayList<Document> sucesso = pacienteDAO.buscarPaciente(id);
        return sucesso;
    }

}
