package org.example;
import org.example.Classes.Carro;
import org.example.Classes.Narrador;
import org.example.Classes.Usuario;
import org.example.Controller.*;
import spark.Route;
import spark.Spark;

import static spark.Spark.post;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Spark.port(8080);

        System.out.println(new Usuario("Augusto","asd@asd.com.br",18));
        System.out.println(new Usuario());

        Spark.get("/usuario", new UsuarioController());
        Spark.get("/", (req,res) ->{return Main.class.getResourceAsStream("/index.html");});
        Spark.get("/Respostas", (req,res) ->{return Main.class.getResourceAsStream("/Respostas.html");});
        Spark.get("/SobreMim", (req,res) ->{return Main.class.getResourceAsStream("/SobreMim.html");});



        //Corridas
        Spark.get("/corrida/listar", CorridaController.obterLista);
        Spark.post("/corrida/:local/incluir", CorridaController.incluir);
        Spark.delete("/corrida/:id/deletar", CorridaController.deletar);
        Spark.get("/corrida/:id", CorridaController.obterUnico);
        //Narrador
        Spark.get("/Narrador/listar", NarradorController.obterLista);
        Spark.post("/Narrador/:nome/incluir", NarradorController.incluir);
        Spark.delete("/Narrador/:id/deletar", NarradorController.deletar);
        Spark.get("/Narrador/:id", NarradorController.obterUnico);
        //Carro
        Spark.get("/Carro/listar", CarroController.obterLista);
        Spark.post("/Carro/:nome/incluir", CarroController.incluir);
        Spark.delete("/Carro/:id/deletar", CarroController.deletar);
        Spark.get("/Carro/:id", CarroController.obterUnico);
        //Marca
        Spark.get("/Marca/listar", MarcaController.obterLista);
        Spark.post("/Marca/:nome/incluir", MarcaController.incluir);
        Spark.delete("/Marca/:id/deletar", MarcaController.deletar);
        Spark.get("/Marca/:id", MarcaController.obterUnico);
        //Piloto
        Spark.get("/Piloto/listar", PilotoController.obterLista);
        Spark.post("/Piloto/:nome/incluir", PilotoController.incluir);
        Spark.delete("/Piloto/:id/deletar", PilotoController.deletar);
        Spark.get("/Piloto/:id", PilotoController.obterUnico);




        //ViaCep
        Spark.get("viacep/:cep", ViacepController.getEndereco);



    }
    }