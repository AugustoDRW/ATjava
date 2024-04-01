package org.example.Classes;

import org.example.Controller.NarradorController;

public class Narrador extends Usuario{

    private int Id;
    private int Carreira;
    private int Popularidade;

    public Narrador(){
        this.setNome("Calvão");
        Carreira = 20;
        Popularidade = 10;
    }

    public Narrador(String nome){
        this.setNome(nome);
        Carreira = 20;
        Popularidade = 10;
    }

    public int getId(){
        return Id;
    }
    public int getCarreira(){
        return Carreira;
    }
    public int getPopularidade(){
        return Popularidade;
    }

    public void setId(int id){
        Id = id;
    }
    public void setCarreira(int carreira){
        Carreira = carreira;
    }
    public void setPopularidade(int popularidade){
        Popularidade = popularidade;
    }

    @Override
    public String toString(){
        return "Narrador " + getId() + " " + getNome();
    }

}
