package org.example.Classes;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private int Id;
    private String Nome;
    private Piloto piloto;
    private List<Marca> marcas;


    public Carro() {
        this.setNome("Mercedes F1 W15");
        piloto = null;
        addMarcas(null);
    }

    public Carro(String nome) {
        this.setNome(nome);
        piloto = null;
        addMarcas(null);
    }

    public Carro(Piloto piloto) {
        this.setNome("Mercedes F1 W15");
        this.piloto = piloto;
        addMarcas(null);
    }
    public Carro(Marca marca) {
        this.setNome("Mercedes F1 W15");
        this.piloto = null;
        addMarcas(marca);
    }


    public int getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public List<Marca> getMarcas() {
        return marcas;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void addMarcas(Marca marca) {
        if (marcas == null) {
            marcas = new ArrayList<Marca>(); // Inicializa a lista de marcas se ainda não foi inicializada

        }
        marcas.add(marca);
    }

    @Override
    public String toString() {
        if (getPiloto() != null) {
            return "Carro " + getId() + " de nome " + getNome() + " com o piloto " + getPiloto().getNome() + " com as marcas " + getMarcas();
        } else {
            return "Carro " + getId() + " de nome " + getNome() + " com o piloto " + getPiloto() + " com as marcas " + getMarcas();
        }
    }
}
