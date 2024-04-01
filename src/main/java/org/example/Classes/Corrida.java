package org.example.Classes;

import java.util.ArrayList;
import java.util.List;

public class Corrida {

    private int Id;
    private String Local;
    private int IngressosVendidos;
    private List<Carro> Participantes;
    private Narrador narrador;

    public Corrida(String local, int IngressosVendidos, List participantes, Narrador narrador){
        this.Local = local;
        this.IngressosVendidos = IngressosVendidos;
        this.Participantes = participantes;
        this.narrador = narrador;
    }

    public Corrida(){
        this.Local = "Circuito de Albert Park";
        this.IngressosVendidos = 500;
        addParticipantes(new Carro());
        this.narrador = new Narrador();
    }

    public Corrida(String local){
        this.Local = local;
        this.IngressosVendidos = 500;
         addParticipantes(new Carro());
        this.narrador = new Narrador();
    }

    public int getId(){
        return Id;
    }
    public String getLocal(){
        return Local;
    }
    public int getIngressosVendidos(){
        return IngressosVendidos;
    }
    public List getParticipantes(){
        return Participantes;
    }

    public Narrador getNarrador(){
        return narrador;
    }
    public List<String> getParticipantesNames() {
        List<String> participantesNames = new ArrayList<>();
        if (Participantes != null) {
            for (Carro carro : Participantes) {
                participantesNames.add(carro.getNome()); // Adiciona o nome do carro à lista
            }
        }
        return participantesNames;
    }

    public void setId(int id){
        Id = id;
    }
    public void setLocal(String local){
        Local = local;
    }
    public void setIngressosVendidos(int IngressosVendidos){
        this.IngressosVendidos = IngressosVendidos;
    }
    public void addParticipantes(Carro carro) {
        if (Participantes == null) {
            Participantes = new ArrayList<>();
        }
        Participantes.add(carro);
    }
    public void setNarrador(Narrador narrador){
         this.narrador = narrador;
    }



    @Override
    public String toString(){


        return "a corrida aconteceu em " + getLocal() + " com o narrador " + getNarrador().getNome()+ " com os carros" + getParticipantesNames()
                + " e teve " + getIngressosVendidos() + " ingressos vendidos";
    }

}
