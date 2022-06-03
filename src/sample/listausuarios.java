package sample;
import controler.Telalogar;
import sample.user;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class listausuarios {

    ArrayList<user> usuarios = new ArrayList<>();

    public void cadastracontato(user users){
            usuarios.add(users);
        }
        public String numerocontatos(){
            return usuarios.size()+"usuarios cadastrados";
        }
}
