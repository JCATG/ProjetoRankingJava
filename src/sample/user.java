package sample;

import controler.Telalogar;
import javafx.scene.control.TextField;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class user  {
    public String nome;
    public String email;
    public String senha;
    public String confirma;

    public user(String nome, String email, String senha, String confirma) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.confirma = confirma;
    }
    public user() {

    }

    public String getConfirma() {
        return confirma;
    }

    public void setConfirma(String confirma) {
        this.confirma = confirma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
