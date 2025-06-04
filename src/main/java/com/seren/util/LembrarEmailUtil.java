package com.seren.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

// Classe utilitária responsável por guardar e recuperar o email do usuário.
// Isso é usado para que a funcionalidade "lembrar de mim" seja concretizada.
public class LembrarEmailUtil {

    // Caminho do arquivo onde as propriedades vão ser salvas.
    private static final String localArquivo = "lembrarEmail.properties";

    // Objeto Properties utilizado para armazenar as propriedades carregadas.
    private static final Properties props = new Properties();

    // Método que carrega o conteúdo do arquivo para a memória.
    // Antes de carregar, ele limpa qualquer informação anterior que possa estar guardada.
    private static void carregarArquivo() {
        props.clear(); // Limpa qualquer dado anterior que esteja na memória.

        // Cria um objeto "arquivo" apontando para o caminho definido acima.
        File arquivo = new File(localArquivo);

        // Verifica se o arquivo existe. Se existir, tenta abrir e carregar seu conteúdo.
        // Uso do try e catch por conta de estarmos trabalhando com arquivo.
        if (arquivo.exists()) {
            try (FileInputStream input = new FileInputStream(arquivo)) {
                // Carrega os dados do arquivo para o objeto props.
                props.load(input);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Método que salva o email informado no arquivo .properties.
    // Também marca que o email deve ser lembrado, salvando "lembrarEmail" como "true".
    public static void salvarEmail(String email) {
        props.setProperty("lembrarEmail", "true");
        props.setProperty("email", email);

        // Grava as informações no arquivo juntamente com um comentário.
        try (FileOutputStream emailGuardado = new FileOutputStream(localArquivo)) {
            props.store(emailGuardado, "EmailGuardado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método que retorna o email guardado, mas só se a opção "lembrarEmail" estiver marcada como "true".
    public static String getEmailGuardado() {
        // Garante que o arquivo foi carregado na memória antes de buscar.
        carregarArquivo();

        if ("true".equals(props.getProperty("lembrarEmail"))) {
            return props.getProperty("email", "");
        }
        return "";
    }

    // Método que apaga o arquivo de propriedades.
    // Também limpa a memória (o objeto props).
    public static void excluirEmail() {
        File arquivo = new File(localArquivo);
        if (arquivo.exists()) {
            arquivo.delete();
        }

        props.clear();
    }

    // Verifica se existe um email salvo e se a opção de lembrar está ativada.
    public static boolean temEmailGuardado() {
        // Garante que os dados estejam carregados.
        carregarArquivo();
        String lembrar = props.getProperty("lembrarEmail");
        String email = props.getProperty("email");

        // Retorna true se o "lembrarEmail" for true e o email não estiver vazio.
        return "true".equalsIgnoreCase(lembrar) && email != null && !email.isEmpty();
    }
}
