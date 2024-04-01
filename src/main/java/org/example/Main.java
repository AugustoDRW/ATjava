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
        Spark.get("/corrida/:local/incluir", CorridaController.incluir);
        Spark.get("/corrida/:id/deletar", CorridaController.deletar);
        Spark.get("/corrida/:id", CorridaController.obterUnico);
        //Narrador
        Spark.get("/Narrador/listar", NarradorController.obterLista);
        Spark.get("/Narrador/:nome/incluir", NarradorController.incluir);
        Spark.get("/Narrador/:id/deletar", NarradorController.deletar);
        Spark.get("/Narrador/:id", NarradorController.obterUnico);
        //Carro
        Spark.get("/Carro/listar", CarroController.obterLista);
        Spark.get("/Carro/:nome/incluir", CarroController.incluir);
        Spark.get("/Carro/:id/deletar", CarroController.deletar);
        Spark.get("/Carro/:id", CarroController.obterUnico);
        //Marca
        Spark.get("/Marca/listar", MarcaController.obterLista);
        Spark.get("/Marca/:nome/incluir", MarcaController.incluir);
        Spark.get("/Marca/:id/deletar", MarcaController.deletar);
        Spark.get("/Marca/:id", MarcaController.obterUnico);
        //Piloto
        Spark.get("/Piloto/listar", PilotoController.obterLista);
        Spark.get("/Piloto/:nome/incluir", PilotoController.incluir);
        Spark.get("/Piloto/:id/deletar", PilotoController.deletar);
        Spark.get("/Piloto/:id", PilotoController.obterUnico);




        //ViaCep
        Spark.get("viacep/:cep", ViacepController.getEndereco);



    }
    }