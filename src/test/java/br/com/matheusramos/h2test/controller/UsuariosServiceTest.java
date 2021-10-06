package br.com.matheusramos.h2test.controller;

import br.com.matheusramos.h2test.dto.UsuariosDTO;
import br.com.matheusramos.h2test.services.UsuariosService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UsuariosServiceTest {

    @Autowired
    private UsuariosService usuariosService;

    @Test
    public void getUsuariosTest() {
        List<UsuariosDTO> usuarios = usuariosService.getUsuarios();
        assertNotNull(usuarios);
        assertEquals("0797dd3c-fc68-4802-ad5d-7b47f579d412", usuarios.get(0).getId().toString());
    }

    @Test
    public void getUsuarioIdTest() {
        String idUsuario = "1b1e3826-089c-4afb-978a-f1a39ed6a4c8";
        UsuariosDTO usuario = usuariosService.getUsuarioById(idUsuario);
        assertNotNull(usuario);
        assertEquals(idUsuario, usuario.getId().toString());
        assertEquals("José Benedito", usuario.getNome());
        assertEquals("jose.benedito@gmail.com", usuario.getEmail());
        assertEquals("47993665999", usuario.getTelefone());
    }

}
