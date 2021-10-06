package br.com.matheusramos.h2test.dto;

import br.com.matheusramos.h2test.entity.Usuarios;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Data
@Builder
public class UsuariosDTO {

    private UUID id;
    private String nome;
    private String email;
    private String telefone;

    public static List<UsuariosDTO> entityListToDTO(List<Usuarios> usuarios) {
        return usuarios
                .stream()
                .map(u -> UsuariosDTO.builder()
                        .id(u.getId())
                        .nome(u.getNome())
                        .email(u.getEmail())
                        .telefone(u.getTelefone())
                        .build())
                .collect(Collectors.toList());
    }

    public static UsuariosDTO entityToDTO(Usuarios usuario) {
        return UsuariosDTO.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .email(usuario.getEmail())
                .telefone(usuario.getTelefone())
                .build();
    }

}
