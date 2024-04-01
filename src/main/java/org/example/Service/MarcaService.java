package org.example.Service;

import org.example.Classes.Carro;
import org.example.Classes.Marca;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MarcaService {
    private static Map<Integer, Marca> marcas = new HashMap<Integer,Marca>();
    private static Integer id = 0;

    public static void Incluir(Marca marca){
        marca.setId(++id);
        marcas.put(marca.getId(),marca);
    }

    public static void Deletar(Integer id){
        marcas.remove(id);
    }

    public static Collection<Marca> ObterLista(){
        return marcas.values();
    }

    public static Marca ObterUnico(Integer id){
        return marcas.get(id);
    }
}

