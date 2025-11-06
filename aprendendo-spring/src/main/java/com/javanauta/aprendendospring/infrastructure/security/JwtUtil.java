package com.javanauta.aprendendospring.infrastructure.security;


import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;

@Service
public class JwtUtil {

    // Chave secreta usada para assinar e verificar tokens JWT
    private final SecretKey secretKey;

    // Construtor que gera uma chave secreta segura para assinatura usando o algoritmo HS256
    public JwtUtil(){
        // Gera uma chave secreta para o algoritmo de assinatura HS256
        this.secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    }

    // Gera um token JWT com o nome de usuario e validade de 1 hora
    public String generateToken(Sting username){
        return Jwts.builder()
                .setSubject(username) // Define o nome de usuario com o assunto do token
                .setIssuedAt(new Date()) // Define a data e hora de emissao do token
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // Define a data e hora de expiração (1 hora a partir da emissao)
                .signWith(secretKey) // Assina o token com a chave secreta
                .compact(); // Constrói o token JWT
    }

    //Extrai as claims do token JWT (informações adicionais do token)
    public Claims extactClaims(String token){
        return Jwts.parser()
                .setSigningKey(secretKey)//Define a chave secreta para validar a assinatura do token
                .build()
                .parseClaimsJws(token) //Analisa o token JWT e obtem as claims
                .getBody(); //Retorna o corpo das claims
    }

    public String extractUsername(String token){
        return extractClaims(token).getSubject();
    }

    public boolean isTokenExpired(String token){
        return extractClaims(token).getExpiration().before(new Date());
    }

    public boolean validateToken(String token, String username){
        final String extractedUsername = extractUsername(token);
        return (extractedUsername.equals(username) && !isTokenExpired(token));
    }






}