package com.javanauta.aprendendospring.business;

import com.javanauta.aprendendospring.infrastructure.entity.Usuario;
import com.javanauta.aprendendospring.infrastructure.exceptions.ConflictException;
import com.javanauta.aprendendospring.infrastructure.exceptions.ResourceNotFoundException;
import com.javanauta.aprendendospring.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public Usuario salvaUsuario(Usuario usuario) {
        // Valida se email já existe (lança exceção se verdadeiro)
        validaEmailNaoExiste(usuario.getEmail());

        // Codifica a senha e salva
        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        return usuarioRepository.save(usuario);
    }

    /**
     * Valida se o email já está cadastrado
     * @throws ConflictException se o email existir
     */
    public void validaEmailNaoExiste(String email) {
        if (verificaEmailExistente(email)) {
            throw new ConflictException("Email já cadastrado: " + email);
        }
    }

    public boolean verificaEmailExistente(String email) {
        return usuarioRepository.existsByEmail(email);
    }

    public Usuario buscarUsuarioPorEmail(String email){
        return usuarioRepository.findByEmail(email).orElseThrow(() -> new ResourceNotFoundException("E-mail não encontrado " + email));
    }

    public void deletaUsuarioPorEmail(String email){
        usuarioRepository.deleteByEmail(email);
    }
}