/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.seren.model.Usuario;
import org.bson.Document;
import com.seren.util.MongoConnection;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Pichau
 */
public class UsuarioDAO {

    private final MongoCollection<Document> collection;

    public UsuarioDAO() {
        MongoDatabase db = MongoConnection.getInstancia().getDatabase();
        this.collection = db.getCollection("Usuario");
    }

    public boolean cadastrar(Usuario usuario) {

        Document filtro = new Document("email", usuario.getEmail());

        Document resultado = collection.find(filtro).first();

        if (resultado == null) {
            String senhaCriptografada = BCrypt.hashpw(usuario.getSenha(), BCrypt.gensalt());
            Document u = new Document(
                    "_id", usuario.getId())
                    .append("email", usuario.getEmail())
                    .append("username", usuario.getNome())
                    .append("senha", senhaCriptografada)
                    .append("telefone", usuario.getTelefone());
            collection.insertOne(u);
            return true;
        }
        return false;

    }

    public Usuario logar(String email, String senha) {
        Document filtro = new Document("email", email);

        Document resultado = collection.find(filtro).first();

        if (resultado != null) {
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
