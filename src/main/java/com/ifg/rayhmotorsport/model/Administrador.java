package com.ifg.rayhmotorsport.model;


import javax.persistence.Entity;

@Entity
public class Administrador extends User{

    private boolean admin;

    public Administrador(){

    }

    public Administrador(String CPF, String nome, String senha, boolean admin) {
        super(CPF, nome, senha);
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
