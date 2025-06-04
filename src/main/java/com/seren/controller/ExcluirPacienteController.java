package com.seren.controller;

import com.seren.dao.PacienteDAO;
import org.bson.types.ObjectId;

// Classe controller responsável por gerenciar a lógica de exclusão de pacientes.
// Atua como intermediária entre a view TelaPacientes e a PacienteDAO.
public class ExcluirPacienteController {

    // Instância da classe PacienteDAO responsável pelas operações no banco de dados para a entidade Paciente.
    private final PacienteDAO pacienteDAO;

    // Construtor da classe controller, inicializa o objeto DAO para uso no método excluirPaciente.
    public ExcluirPacienteController() {
        this.pacienteDAO = new PacienteDAO();
    }

    // Método que executa a exclusão de um paciente.
    // Recebe como parâmetro o id do paciente a ser excluído e repassa a chamada para a DAO.
    // Retorna o "true"(paciente excluído)/"false"(paciente não encontrado) recebido da DAO.
    public boolean excluirPaciente(ObjectId id) {
        boolean sucesso = pacienteDAO.excluirPaciente(id);
        return sucesso;
    }
}
