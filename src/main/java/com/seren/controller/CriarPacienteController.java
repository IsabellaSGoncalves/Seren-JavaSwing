package com.seren.controller;

import com.seren.dao.PacienteDAO;
import com.seren.model.Paciente;
import java.util.Date;
import org.bson.types.ObjectId;

// Classe controller responsável por gerenciar a lógica de criação de um novo paciente.
// Atua como intermediária entre a view TelaCadastrarPaciente e a PacienteDAO.
public class CriarPacienteController {

    // Instância da classe PacienteDAO responsável pelas operações no banco de dados para a entidade Paciente.
    private final PacienteDAO pacienteDAO;

    // Construtor da classe controller, inicializa o objeto DAO para uso no método criarPaciente.
    public CriarPacienteController() {
        this.pacienteDAO = new PacienteDAO();
    }

    // Método que executa a criação de um novo paciente.
    // Recebe como parâmetros os dados do paciente, cria um objeto do tipo Paciente e repassa para a DAO realizar o cadastro.
    // Retorna o "true"(paciente foi cadastrado)/"false"(paciente já registrado) recebido da DAO.
    public boolean criarPaciente(String nome, String profissao, String genero, String estadoCivil,
            String telefone, String email, String preferenciaContato, Date dataNascimento, ObjectId id_usuario) {
        Paciente paciente = new Paciente(nome, profissao, genero, estadoCivil, telefone, email, preferenciaContato, dataNascimento, id_usuario);
        boolean sucesso = pacienteDAO.cadastrarPaciente(paciente);
        return sucesso;
    }

}
