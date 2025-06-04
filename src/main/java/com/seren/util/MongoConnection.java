package com.seren.util;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

// Classe utilitária MongoConnection onde é possível a conexão com o banco de dados.
public class MongoConnection {

    // Conseguindo o nome da nossa database e a URI guardados na config.properties com o auxílio da nossa classe utilitária ConfigUtil.
    private static final String URI = ConfigUtil.get("mongodb.uri");
    private static final String DATABASE_NOME = ConfigUtil.get("mongodb.database");

    // Instância estática usada para implementar o padrão de projeto Singleton.
    private static MongoConnection instancia;

    // Cliente Mongo utilizado para se conectar ao MongoDB usando a URI.
    private final MongoClient mongoClient;

    // Construtor da nossa conexão, que inicializa o cliente Mongo com a URI. 
    private MongoConnection() {
        mongoClient = MongoClients.create(URI);
    }

    // Método get que retorna instância única da conexão, garantindo reutilização e evitando múltiplas conexões desnecessárias com o banco de dados.
    public static synchronized MongoConnection getInstancia() {
        if (instancia == null) {
            instancia = new MongoConnection();
        }
        return instancia;
    }

    // Getter que retorna a nossa database já conectada e acessível.
    public MongoDatabase getDatabase() {
        return mongoClient.getDatabase(DATABASE_NOME);
    }
    
    // Método que encerra a conexão com o banco e limpa a instância. 
    public void close() {
        mongoClient.close();
        instancia = null;
    }
}
