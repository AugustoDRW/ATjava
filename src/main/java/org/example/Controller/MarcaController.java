package org.example.Controller;
import org.example.Classes.Carro;
import org.example.Classes.Marca;
import org.example.Main;
import org.example.Classes.Narrador;
import org.example.Service.CarroService;
import org.example.Service.MarcaService;
import org.example.Service.NarradorService;
import spark.Request;
import spark.Response;
import spark.Route;

public class MarcaController implements Route {

    //recuperar todos
    public static Route obterLista = (req,res) -> {
        return MarcaService.ObterLista() + " \n <ul><li><a href='http://localhost:8080' style='display:block'>Voltar</a></li></ul>";
    };

    //incluir
    public static Route incluir = (req,res) -> {
        String nome = req.params("nome");
        Marca a = new Marca(nome);
        MarcaService.Incluir(a);
        CarroService.Incluir(a.getCarro());
        return "inclusão realizada com sucesso! " + a + " \n <ul><li><a href='http://localhost:8080' style='display:block'>Voltar</a></li></ul>";
    };
    //deletar
    public static Route deletar = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        Marca a = MarcaService.ObterUnico(index);
        MarcaService.Deletar(index);
        return  a + " foi deletado com sucesso" + " \n <ul><li><a href='http://localhost:8080' style='display:block'>Voltar</a></li></ul>";
    };
    //obter um
    public static Route obterUnico = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        Marca a = MarcaService.ObterUnico(index);
        return a + " \n <ul><li><a href='http://localhost:8080' style='display:block'>Voltar</a></li></ul>";
    };

    @Override
    public Object handle(Request request, Response response) throws Exception {
        return null;
    }
}