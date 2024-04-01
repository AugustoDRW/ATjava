package org.example.Controller;

import org.example.Classes.Usuario;
import spark.Request;
import spark.Response;
import spark.Route;

public class UsuarioController implements Route {

    @Override
    public Usuario handle(Request request, Response response) throws Exception {

        return new Usuario();
    }
}
