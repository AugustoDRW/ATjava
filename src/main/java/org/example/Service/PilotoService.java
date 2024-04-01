package org.example.Service;

import org.example.Classes.Narrador;
import org.example.Classes.Piloto;

import javax.naming.BinaryRefAddr;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PilotoService {
    private static Map<Integer, Piloto> pilotos = new HashMap<Integer, Piloto>();
    private static Integer id = 0;

    public static void Incluir(Piloto piloto){
        piloto.setId(++id);
        pilotos.put(piloto.getId(),piloto);

    }

    public static void Deletar(Integer id){
        pilotos.remove(id);
    }

    public static Collection<Piloto> ObterLista(){
        return pilotos.values();
    }

    public static Piloto ObterUnico(Integer id){
        return pilotos.get(id);
    }
}
