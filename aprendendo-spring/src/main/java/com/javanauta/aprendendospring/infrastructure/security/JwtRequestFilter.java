package com.javanauta.aprendendospring.infrastructure.security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

public class JwtRequestFilter extends OncePerRequestFilter {

    //Define propriedades para armazenar instancias de JwUtil e UserDetailsService
    private final JwtUtil jwtUtil;
    private final UserDetailsServiceImpl userDetailsService;

    //Construtor que inicializa as propriedades com instancias fornecidas
    public JwtRequestFilter(JwtUtil jwtUtil, UserDetailsServiceImpl userDetailsService){
        this.jwtUtil = jwtUtil;
        this.userDetailsService = userDetailsService;
    }

    //Metodo chamado uma vez por requisição para processar o filtro
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response){
        throws ServeletException, IOException{

            //Obtem o valor do cabeçalho "Authorization" da requisição
            final String authorizationHeader = request.getHeader("Authorization");

            //Verifica se o cabeçalho existe e começa com "Bearer "
            if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")){
                //Extrai o token JWT do cabeçalho
                final String token = authorizationHeader.substring(7);
                //Extrai o nome de usuario do token JWT
                final String username = jwtUtil.extractUsername(token);

                //Se o nome de usuario não for nulo e o usuario nao estiver autenticado ainda
                if (username != null && SecurityContextHolder.getContext().getAuthentication() == null){
                    //Carrega os detalhes do usuario a partir do nome de usuario
                    UserDetails userDetails = userDetailsService.loadUserByUsername(username);
                    //Valida o token JWT
                    if(jwtUtil.validateToken(token, username)){
                        //Cria um objeto de autenticacao com as informacoes do usuario
                        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                        //Define a autencicação no contexto de segurança
                        SecurityContextHolder.getContext().setAuthentication(authentication);
                        }
                    }
                }
            //Continua a cadeia de filtros, permitindo que a requisição prossiga
            chain.doFilter(request, response);

            }
        }
    }
}
