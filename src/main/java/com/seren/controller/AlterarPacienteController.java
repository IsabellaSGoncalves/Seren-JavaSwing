package com.seren.controller;

import com.seren.dao.PacienteDAO;
import com.seren.model.Paciente;
import java.util.Date;
import org.bson.types.ObjectId;

// Classe controller responsável por gerenciar a lógica de alteração de dados de um paciente.
// Atua como intermediária entre a view TelaEditarPaciente e a PacienteDAO. 
public class AlterarPacienteController {

    // Instância da classe PacienteDAO responsável pelas operações no banco de dados para a entidade Paciente.
    private final PacienteDAO pacienteDAO;

    // Construtor da classe controller, inicializa o objeto DAO para uso no método alterarPaciente.
    public AlterarPacienteController() {
        this.pacienteDAO = new PacienteDAO();
    }

    // Método que executa a operação de alteração de dados de um paciente, recebe, como parâmetro, um objeto Paciente com os dados atualizados.
    // Repassa os dados para a DAO e retorna o "true"(paciente alterado)/"false"(paciente não existe ou com mesmo dados) recebido da DAO.
    public boolean alterarPaciente(Paciente paciente) {
        boolean sucesso = pacienteDAO.alterarPaciente(paciente);
        return sucesso;
    }
}
