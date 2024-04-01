package org.example.Service;

import org.example.Classes.Carro;
import org.example.Classes.Corrida;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CorridaService {
    private static Map<Integer, Corrida> corridas = new HashMap<Integer,Corrida>();
    private static Integer id = 0;

    public static void Incluir(Corrida corrida){
        corrida.setId(++id);
        corridas.put(corrida.getId(),corrida);

    }

    public static void Deletar(Integer id){
        corridas.remove(id);
    }

    public static Collection<Corrida> ObterLista(){
        return corridas.values();
    }

    public static Corrida ObterUnico(Integer id){
        return corridas.get(id);
    }
}

