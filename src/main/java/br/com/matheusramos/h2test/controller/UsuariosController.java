package br.com.matheusramos.h2test.controller;

import br.com.matheusramos.h2test.dto.UsuariosDTO;
import br.com.matheusramos.h2test.services.UsuariosService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuariosController {

    @Autowired
    private UsuariosService service;

    @GetMapping(value = "/usuarios")
    public ResponseEntity<List<UsuariosDTO>> getUsuarios() {
        return ResponseEntity.ok(service.getUsuarios());
    }

    @GetMapping(value = "/usuarios/{id}")
    public ResponseEntity<UsuariosDTO> getUsuarioById(@PathVariable("id") String id) {
        return ResponseEntity.ok(service.getUsuarioById(id));
    }
}
