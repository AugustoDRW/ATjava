package org.example.Controller;
import com.google.gson.Gson;
import org.example.Classes.Carro;
import org.example.Classes.Corrida;
import org.example.Classes.Piloto;
import org.example.Main;
import org.example.Classes.Narrador;
import org.example.Service.CarroService;
import org.example.Service.CorridaService;
import org.example.Service.NarradorService;
import org.example.Service.PilotoService;
import spark.Request;
import spark.Response;
import spark.Route;

public class PilotoController implements Route {

    //recuperar todos
    public static Route obterLista = (req,res) -> {
        return PilotoService.ObterLista() + " \n <ul><li><a href='http://localhost:8080' style='display:block'>Voltar</a></li></ul>";
    };

    //incluir

    public static Route incluir = (req,res) -> {
        String nome = req.params("nome");
        Piloto a = new Piloto(nome);
        PilotoService.Incluir(a);
        CarroService.Incluir(a.getCarro());
        return a + " foi adicionado com sucesso! \n <ul><li><a href='http://localhost:8080' style='display:block'>Voltar</a></li></ul>";
    };
    //deletar
    public static Route deletar = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        Piloto a = PilotoService.ObterUnico(index);
        PilotoService.Deletar(index);
        return   a+ " foi deletado com sucesso  \n <ul><li><a href='http://localhost:8080' style='display:block'>Voltar</a></li></ul>\"";
    };
    //obter um
    public static Route obterUnico = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        Piloto a = PilotoService.ObterUnico(index);
        return a +  "\n <ul><li><a href='http://localhost:8080' style='display:block'>Voltar</a></li></ul>";
    };

    @Override
    public Object handle(Request request, Response response) throws Exception {
        return null;
    }
}