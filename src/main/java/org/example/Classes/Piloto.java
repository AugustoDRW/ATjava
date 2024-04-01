package org.example.Classes;

public class Piloto extends Usuario{

    private int Id;
    private Carro carro;
    private int Vitorias;
    private int Derrotas;

    public Piloto(){
        super("Ayrton Senna");
        carro = new Carro(this);
        Vitorias = 100;
        Derrotas = 0;
    }


    public Piloto(String nome){
        setNome(nome);
        carro = new Carro(this);
        Vitorias = 100;
        Derrotas = 0;
    }


    public int getId(){
        return Id;
    }

    public Carro getCarro(){
        return carro;
    }

    public int getVitorias(){return Vitorias;}
    public int getDerrotas(){return Derrotas;}


    public void setId(int id){
        Id = id;
    }

    public void setCarro(Carro carro){
         this.carro = carro;
    }

    public void setVitorias(int vitorias){ Vitorias = vitorias;}
    public void setDerrotas(int derrotas){ Derrotas = derrotas;}

    @Override
    public String toString(){
        return "o piloto " + getNome() + " com o carro "+ carro.getNome() + " com uma quantia de vitorias de " + Vitorias;
    }
}
