package com.zapatos.demo.controllers.rest;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.*;
import com.zapatos.demo.model.Usuario;

@RestController
@RequestMapping("/api/v1")
public class UsuarioRestController {

    @RequestMapping(path = "/usuarios", method = RequestMethod.GET)
    public Map<String, Object> getUserarios() {
        Usuario usuario = new Usuario(1, 2, 1, "Luis Teran",
                "1714032587", "lteran@gmail.com", "lteran");
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Usuario", usuario);
        return respuesta;
    }
}