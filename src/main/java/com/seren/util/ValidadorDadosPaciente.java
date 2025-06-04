/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seren.util;

import java.util.Date;

/**
 *
 * @author Pichau
 */

// Classe utilitária responsável por validar os dados antes da criação de um objeto do tipo Paciente.
// Implementa a interface Validador.
public class ValidadorDadosPaciente implements Validador {
    
    // Atributos essenciais para o construtor de Paciente.
    private String nome;
    private String profissao;
    private String genero;
    private String estadoCivil;
    private String telefone;
    private String email;
    private String preferenciaContato;
    private Date dataNascimento;
    
    // Construtor para inicializar os dados a serem validados.
    public ValidadorDadosPaciente(String nome, String profissao, String genero, String estadoCivil, String telefone, String email, String preferenciaContato, Date dataNascimento) {
        this.nome = nome;
        this.profissao = profissao;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.telefone = telefone;
        this.email = email;
        this.preferenciaContato = preferenciaContato;
        this.dataNascimento = dataNascimento;
    }
    
    
    // Implementação do método validar da interface, utilizando sobrescrita, realizando polimorfismo.
    @Override
    public String validar() {
        
        // Verificação se os dados estão vazios, retornando uma String que será utilizada como mensagem de erro.
        if (nome.isEmpty() || profissao.isEmpty() || genero.isEmpty() || estadoCivil.isEmpty()
                || telefone.isEmpty() || email.isEmpty() || preferenciaContato.isEmpty() || dataNascimento == null) {
            return "Preencha todos os campos.";
        }
        
        // Verificação se o email possui "@". 
        if (!email.contains("@")) {
            return "Insira um email válido!";
        }
        
        // Verificação se o nome contém números.
        if(nome.matches(".*\\d.*")){
            return "Insira um nome que não contenha dígitos.";
        }
        
        // Remoção de qualquer caractere que não seja dígito do número de telefone.
        telefone = telefone.replaceAll("[^\\d]", "");
        
        // Valida se o telefone tem 11 dígitos, contando DDD + números. 
        if (telefone.length() != 11) {
            return "O número de telefone deve conter 11 dígitos.";
        }
        
        // Idade retornada com o suporte da classe DataUtil e o seu método calcularIdade. 
        int idade = DataUtil.calcularIdade(dataNascimento);
        
        // Se a idade for menor de 18 retornará a devida String de mensagem de erro. 
        if (idade < 18) {
            return "Paciente deve ter pelo menos 18 anos.";
        }
        
        // Mensagem de erro não será retornada se os dados forem válidos. 
        return null;
    }
    
    // Retorna o número em formato numérico (long), removendo qualquer formatação. 
    public long getTelefone() {
        String telefoneNumero = telefone.replaceAll("[^\\d]", "");
        return Long.parseLong(telefoneNumero);
    }
    
}
