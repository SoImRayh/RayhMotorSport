package com.ifg.rayhmotorsport.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;

@Entity
public class User {

    @Id
    private String CPF;
    @NotBlank
    private String nome;

    @NotBlank
    @NotNull
    private String senha;

    @DefaultValue("false")
    private boolean admin;

    public User(){

    }
    public User(String CPF, String nome, String senha) {
        this.CPF = CPF;
        this.nome = nome;
        this.senha = senha;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
