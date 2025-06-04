package com.seren.util;

import java.io.InputStream;
import java.util.Properties;

// Classe utilitária responsável por carregar propriedades de configuração recebidas da config.properties.
public class ConfigUtil {

    // Objeto Properties utilizado para armazenar as configurações carregadas.
    private static final Properties properties = new Properties();

    // Bloco estático responsável por carregar o arquivo "config.properties" assim que a classe for carregada.
    static {

        // Por estarmos trabalhando com um arquivo, é necessário a utilização de try e catch.
        try (InputStream input = ConfigUtil.class.getClassLoader().getResourceAsStream("config.properties")) {

            // Verifica se o arquivo foi encontrado no classpath.
            if (input == null) {
                throw new RuntimeException("Arquivo config.properties não encontrado no classpath.");
            }

            // Carregamento das propriedades a partir do arquivo.
            properties.load(input);

        } catch (Exception e) {
            // Em caso de erro no carregamento, é lançado uma exceção.
            throw new RuntimeException("Erro ao carregar config.properties", e);
        }
    }

    // Getter que retorna o valor da propriedade pelo seu identificador/key. 
    public static String get(String key) {
        return properties.getProperty(key);
    }
}
