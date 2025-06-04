package com.seren.dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.seren.model.Paciente;
import com.seren.util.MongoConnection;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.types.ObjectId;

// Classe DAO(Data Access Object) responsável por gerenciar as operações de acesso ao banco de dados relacionada com a classe model Paciente.
public class PacienteDAO {

    // Atributo privado que representa a coleção Paciente no MongoDB.
    private final MongoCollection<Document> collection;

    // Construtor da classe PacienteDAO. Inicializa a conexão com a base de dados e acessa a coleção "Paciente".
    public PacienteDAO() {
        MongoDatabase db = MongoConnection.getInstancia().getDatabase();
        this.collection = db.getCollection("Paciente");
    }

    // Método que realiza o cadastro de um novo paciente no banco de dados.
    public boolean cadastrarPaciente(Paciente paciente) {

        // Criação de um filtro de busca no formato BSON(usado pelo MongoDB), para encontrar um documento 
        // com o campo "email" igual ao email do paciente que entra como parâmetro.
        Document filtro = new Document("email", paciente.getEmail());

        // Realiza a busca com o filtro.
        Document resultado = collection.find(filtro).first();

        // Caso a busca não retorne um paciente com o email passado, cria um novo documento 
        // com os dados de paciente e o insere na coleção "Pacientes".
        if (resultado == null) {
            Document p = new Document("nome", paciente.getNome())
                    .append("profissao", paciente.getProfissao())
                    .append("genero", paciente.getGenero())
                    .append("estadoCivil", paciente.getEstadoCivil())
                    .append("telefone", paciente.getTelefone())
                    .append("email", paciente.getEmail())
                    .append("preferenciaContato", paciente.getPreferenciaContato())
                    .append("dataNascimento", paciente.getDataNascimento())
                    .append("id_usuario", paciente.getId_usuario());

            collection.insertOne(p);

            return true;
        }
        return false;
    }

    // Método que busca todos os pacientes associados a um determinado usuário (por ID).
    public ArrayList<Document> buscarPaciente(ObjectId id) {
        // Criação do filtro com base no campo "id_usuario" igual o id passado como parâmetro.
        Document filtro = new Document("id_usuario", id);

        // Executa a consulta e retorna os documentos/pacientes encontrados como uma ArrayList.
        ArrayList<Document> listaPacientes = new ArrayList<>();
        return listaPacientes = collection.find(filtro).into(listaPacientes);
    }

    // Sobrecarga do método buscarPaciente, agora busca também por nome além do ID do usuário.
    public ArrayList<Document> buscarPaciente(ObjectId id, String nome) {

        // Filtro com ID de usuário e nome do paciente.
        Document filtro = new Document("id_usuario", id)
                .append("nome", nome);

        ArrayList<Document> listaPacientes = new ArrayList<>();
        return listaPacientes = collection.find(filtro).into(listaPacientes);
    }

    // Método que atualiza os dados de um paciente, caso algum dado tenha sido alterado.
    public boolean alterarPaciente(Paciente paciente) {

        // Cria o filtro com base no ID do paciente registrado no banco e o id do paciente passado como parâmetro.
        Document filtro = new Document("_id", paciente.getId());

        // Realiza a busca com o filtro.
        Document resultado = collection.find(filtro).first();

        // Se não existe este paciente, nada é alterado.
        if (resultado == null) {
            return false;
        }

        // Verifica se os dados do paciente são diferentes dos armazenados.
        boolean dadosIguais
                = paciente.getNome().equals(resultado.getString("nome"))
                && paciente.getProfissao().equals(resultado.getString("profissao"))
                && paciente.getGenero().equals(resultado.getString("genero"))
                && paciente.getEstadoCivil().equals(resultado.getString("estadoCivil"))
                && paciente.getTelefone() == resultado.getLong("telefone")
                && paciente.getEmail().equals(resultado.getString("email"))
                && paciente.getPreferenciaContato().equals(resultado.getString("preferenciaContato"))
                && paciente.getDataNascimento().equals(resultado.getDate("dataNascimento"))
                && paciente.getId_usuario().equals(resultado.getObjectId("id_usuario"));

        // Nenhum dado foi alterado, então não há necessidade de atualização.
        if (dadosIguais) {
            return false;
        }

        // Criação do documento com os dados atualizados.
        Document dadosAtualizados = new Document()
                .append("nome", paciente.getNome())
                .append("profissao", paciente.getProfissao())
                .append("genero", paciente.getGenero())
                .append("estadoCivil", paciente.getEstadoCivil())
                .append("telefone", paciente.getTelefone())
                .append("email", paciente.getEmail())
                .append("preferenciaContato", paciente.getPreferenciaContato())
                .append("dataNascimento", paciente.getDataNascimento())
                .append("id_usuario", paciente.getId_usuario());

        // Atualiza os dados do paciente usando o operador $set(usado pelo MongoDB).
        Document atualizacao = new Document("$set", dadosAtualizados);

        // Atualiza na coleção "Pacientes" o paciente encontrado com os dados alterados.
        collection.updateOne(filtro, atualizacao);
        return true;
    }

    // Método que remove um paciente da coleção com base no seu ID.
    public boolean excluirPaciente(ObjectId id) {

        // Cria um filtro com base no ID do paciente registrado no banco de dados e o id passado como parâmetro.
        Document filtro = new Document("_id", id);

        // Realiza a busca com o filtro.
        Document resultado = collection.find(filtro).first();

        // Se encontrado, realiza a exclusão e verifica se exatamente um documento foi deletado com base na contagem de exclusão.
        if (resultado != null) {
            return collection.deleteOne(resultado).getDeletedCount() == 1;
        }
        return false;
    }
}
