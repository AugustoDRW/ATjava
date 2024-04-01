package org.example.Controller;
import com.google.gson.Gson;
import org.example.Classes.Carro;
import org.example.Classes.Corrida;
import org.example.Main;
import org.example.Classes.Narrador;
import org.example.Service.CarroService;
import org.example.Service.CorridaService;
import org.example.Service.NarradorService;
import spark.Request;
import spark.Response;
import spark.Route;

public class CorridaController implements Route {

    //recuperar todos
    public static Route obterLista = (req,res) -> {
        return CorridaService.ObterLista() + " \n <ul><li><a href='http://localhost:8080' style='display:block'>Voltar</a></li></ul>";
    };

    //incluir

    public static Route incluir = (req,res) -> {
        String local = req.params("local");
        Corrida a = new Corrida(local);
        CorridaService.Incluir(a);
        NarradorService.Incluir(a.getNarrador());
        return "inclusão realizada com sucesso! " + a +  "\n <ul><li><a href='http://localhost:8080' style='display:block'>Voltar</a></li></ul>";
    };
    //deletar
    public static Route deletar = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        Corrida a = CorridaService.ObterUnico(index);
        CorridaService.Deletar(index);
        return  "a corrida de Id "+ a.getId() + " foi deletado com sucesso \n <ul><li><a href='http://localhost:8080' style='display:block'>Voltar</a></li></ul>";
    };
    //obter um
    public static Route obterUnico = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        Corrida a = CorridaService.ObterUnico(index);
        return a +  "\n <ul><li><a href='http://localhost:8080' style='display:block'>Voltar</a></li></ul>";
    };

    @Override
    public Object handle(Request request, Response response) throws Exception {
        return null;
    }
}