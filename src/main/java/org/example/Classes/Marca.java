package org.example.Classes;

import org.example.Controller.CarroController;

import java.util.List;

public class Marca {

    private int Id;
    private String Nome;
    private Carro carro;
    private String Slogan;

    public Marca(){
        this.setNome("Red Bull");
        carro = new Carro(this);
        Slogan = "Te da asas";
    }

    public Marca(String nome){
        this.setNome(nome);
        carro = new Carro(this);
        Slogan = "";
    }

    public int getId(){
        return Id;
    }
    public String getNome(){
        return Nome;
    }

    public String getSlogan(){
        return Slogan;
    }
    public Carro getCarro(){
        return carro;
    }

    public void setNome(String nome){
        Nome = nome;
    }

    public void setSlogan(String slogan){
         Slogan = slogan;
    }


    public void setCarro(Carro carro){
        this.carro = carro;
    }

    public void setId(int id){
        Id = id;
    }




    @Override
    public String toString(){
        return "Marca " + getId() + " " + getNome();
    }
}
