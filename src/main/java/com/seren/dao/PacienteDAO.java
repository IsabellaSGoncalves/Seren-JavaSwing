/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.seren.model.Paciente;
import com.seren.util.MongoConnection;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Pichau
 */
public class PacienteDAO {
    private final MongoCollection<Document> collection;

    public PacienteDAO() {
        MongoDatabase db = MongoConnection.getDatabase();
        this.collection = db.getCollection("Paciente");
    }
    
    public boolean cadastrarPaciente(Paciente paciente) {

        Document filtro = new Document("email", paciente.getEmail());

        Document resultado = collection.find(filtro).first();

        if (resultado == null) {
            Document p = new Document("nome", paciente.getNome())
                    .append("profissao", paciente.getProfissao())
                    .append("genero", paciente.getGenero())
                    .append("estadoCivil", paciente.getEstadoCivil())
                    .append("telefone", paciente.getTelefone())
                    .append("email", paciente.getEmail())
                    .append("preferenciaContato", paciente.getPreferenciaContato())
                    .append("dataNascimento", paciente.getDataNascimento())
                    .append("id_usuario", paciente.getId_usuario())
                    ;
            collection.insertOne(p);
            return true;
        }
        return false;
    }
    
    public ArrayList<Document> buscarPaciente(ObjectId id){
        Document filtro = new Document("id_usuario", id);
        
        ArrayList<Document> listaPacientes = new ArrayList<>(); 
        return listaPacientes = collection.find(filtro).into(listaPacientes);
    }
}
