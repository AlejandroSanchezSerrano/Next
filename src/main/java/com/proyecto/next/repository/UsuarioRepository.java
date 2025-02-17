package com.proyecto.next.repository;

import com.proyecto.next.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    List<Usuario> findByNombreContaining(String nombre);
}
