package br.com.matheusramos.h2test.services;

import br.com.matheusramos.h2test.dto.UsuariosDTO;
import br.com.matheusramos.h2test.entity.Usuarios;
import br.com.matheusramos.h2test.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public List<UsuariosDTO> getUsuarios() {
        return UsuariosDTO.entityListToDTO(usuariosRepository.findAll());
    }

    public UsuariosDTO getUsuarioById(String id) {
        Optional<Usuarios> usuario = usuariosRepository.findById(UUID.fromString(id));
        return usuario.map(UsuariosDTO::entityToDTO).orElse(null);
    }

}
