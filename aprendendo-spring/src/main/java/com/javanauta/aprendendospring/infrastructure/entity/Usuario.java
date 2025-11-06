package com.javanauta.aprendendospring.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
<<<<<<< HEAD

=======
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
>>>>>>> origin/master
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "usuario")
<<<<<<< HEAD
public class Usuario {
=======
public class Usuario implements UserDetails {
>>>>>>> origin/master

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", length = 100)
    private String nome;
    @Column(name = "email", length = 100)
    private String email;
    @Column(name = "senha", length = 10)
    private String senha;
    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn (name = "usuario_id", referencedColumnName = "id")
    private List<Endereco> enderecos;
    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn (name = "usuario_id", referencedColumnName = "id")
    private List<Telefone> telefones;


<<<<<<< HEAD
=======
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
    }
>>>>>>> origin/master
}
