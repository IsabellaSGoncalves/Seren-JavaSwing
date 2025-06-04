package com.seren.dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.seren.model.Usuario;
import org.bson.Document;
import com.seren.util.MongoConnection;
import org.mindrot.jbcrypt.BCrypt;

// Classe DAO(Data Access Object) responsável por gerenciar as operações de acesso ao banco de dados relacionada com a classe model Usuario.
public class UsuarioDAO {

    // Atributo privado que serve como acesso a coleção Usuario do MongoDB.
    private final MongoCollection<Document> collection;

    // Construtor da classe UsuarioDAO, inicializa a conexão com a database e coleção "Usuario". 
    public UsuarioDAO() {
        MongoDatabase db = MongoConnection.getInstancia().getDatabase();
        this.collection = db.getCollection("Usuario");
    }

    // Método que realiza o cadastro de um novo usuário no banco de dados, recebe como parâmetro um objeto do tipo Usuario. 
    public boolean cadastrar(Usuario usuario) {

        // Criação de um filtro de busca no formato BSON(usado pelo MongoDB), para encontrar um documento 
        // com o campo "email" igual ao email do usuário que entra como parâmetro.
        Document filtro = new Document("email", usuario.getEmail());

        // Realiza a busca com o filtro.
        Document resultado = collection.find(filtro).first();

        // Caso a busca não retorne um usuário com o email passado, utiliza o bcrypt para retornar um hash da senha criptografada.
        if (resultado == null) {
            String senhaCriptografada = BCrypt.hashpw(usuario.getSenha(), BCrypt.gensalt());

            // Criação de um documento com os dados do usuário.
            Document u = new Document(
                    "_id", usuario.getId())
                    .append("email", usuario.getEmail())
                    .append("username", usuario.getNome())
                    .append("senha", senhaCriptografada)
                    .append("telefone", usuario.getTelefone());

            // Inserção do documento na coleção "Usuario".
            collection.insertOne(u);

            return true;
        }
        return false;

    }

    // Método que autentifica um usuário com o email e senha fornecido.
    public Usuario logar(String email, String senha) {
        // Criação de um filtro de busca no formato BSON(usado pelo MongoDB), para encontrar um documento 
        // com o campo "email" igual ao email passado como parâmetro.
        Document filtro = new Document("email", email);

        // Realiza a busca com o filtro.
        Document resultado = collection.find(filtro).first();

        // Se for retornando um usuário, é instanciado um Usuario com os dados retornados. 
        if (resultado != null) {

            // Compara a senha fornecida com a senha criptografada armazenada
            String senhaArmazenada = resultado.getString("senha");
            if (BCrypt.checkpw(senha, senhaArmazenada)) {
                return new Usuario(
                        resultado.getObjectId("_id"),
                        resultado.getString("username"),
                        resultado.getString("email"),
                        resultado.getLong("telefone"),
                        null
                );
            }

        }
        return null;
    }

}
