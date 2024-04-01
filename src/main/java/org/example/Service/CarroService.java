package org.example.Service;

import org.example.Classes.Carro;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CarroService {
    private static Map<Integer, Carro> carros = new HashMap<Integer,Carro>();
    private static Integer id = 0;

    public static void Incluir(Carro carro){
        carro.setId(++id);
        carros.put(carro.getId(),carro);

    }

    public static void Deletar(Integer id){
        carros.remove(id);
    }

    public static Collection<Carro> ObterLista(){
        return carros.values();
    }

    public static Carro ObterUnico(Integer id){
        return carros.get(id);
    }
}

