package org.example.Service;

import org.example.Classes.Narrador;

import javax.naming.BinaryRefAddr;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class NarradorService {
    private static Map<Integer, Narrador> narradores = new HashMap<Integer,Narrador>();
    private static Integer id = 0;

    public static void Incluir(Narrador narrador){
        narrador.setId(++id);
        narradores.put(narrador.getId(),narrador);

    }

    public static void Deletar(Integer id){
        narradores.remove(id);
    }

    public static Collection<Narrador> ObterLista(){
        return narradores.values();
    }

    public static Narrador ObterUnico(Integer id){
        return narradores.get(id);
    }
}
